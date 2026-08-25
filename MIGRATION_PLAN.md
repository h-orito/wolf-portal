# wolf-portal Go 移行計画

## 背景

OCI 無料枠の縮小により k8s クラスタの CPU / メモリが半減し、リソースが逼迫している。
本アプリは Spring Boot (JVM) の常駐が主なコストであり、機能自体は軽い。
Go に置き換え、クローラを CronJob に分離することで常駐リソースを大幅に削減する。

## 現状

| 項目 | 内容 |
|---|---|
| スタック | Spring Boot 2.3 / Kotlin 1.3 / JDK 11 / Thymeleaf / DBFlute / MySQL |
| デプロイ | Jib → GHCR → k8s `deployment/wolf-portal` (namespace `default`) |
| Pod リソース | requests 320Mi / limits 640Mi |
| コンテキストパス | `/wolf-portal` (`https://wolfort.dev/wolf-portal/`) |
| クローラ起動 | さくら VPS の cron から curl で `POST` |
| Slack 通知 | 使用停止済み。移行対象外 |

### 機能

| 機能 | エンドポイント | 性質 |
|---|---|---|
| 静的ページ | `GET /`, `/beginner`, `/site-list`, `/link` | DB 不要 |
| 開催状況表示 | `GET /recruitment`, `GET /recruitment-graph` | DB 読み取り |
| 開催状況クローラ | `POST /recruitment?[countryId=N][&store=true]` | 26 国をスクレイピング / REST 取得し delete-insert。`store=true` で RECRUIT_STATS に集計を追加 |
| 戦績表示 | `GET /stats/**`, `GET /village-list` | 検索・ページング付き DB 読み取り |
| 戦績クローラ | `POST /stats/country/{id}?[villageNo=N\|villageId=N\|ignoreExistsVillage=true]` | 10 国分の戦績取得 |
| 死活 | `GET /ping` | |

### データ量 (2026-08 時点)

- `village`: 5,979 件
- `village_player_stats`: 98,380 件

MySQL のまま継続する。

### 現在の cron (さくら VPS)

```
15,45 * * * *   GET  /ping
0 */2 * * *     POST /recruitment?store=true   # 偶数時
0 1-23/2 * * *  POST /recruitment              # 奇数時
30 * * * *      POST /recruitment              # 毎時30分
25 4 * * *      POST /stats/country/1          # 人狼物語
10 5 * * *      POST /stats/country/7          # 三日月
5 0,7 * * *     POST /stats/country/23         # Howling Wolf
6 0,7 * * *     POST /stats/country/24         # Fire Wolf
6 0,7 * * *     POST /stats/country/26         # Star Hunter
```

## 目標

| 項目 | 現在 | 目標 |
|---|---|---|
| Web Pod requests / limits | 320Mi / 640Mi | 32Mi / 128Mi |
| クローラ | Web プロセスに同居 | CronJob。待機時ゼロ |
| cron | さくら VPS | k8s CronJob |
| 公開 URL | `https://wolfort.dev/wolf-portal/**` | 変更なし |
| 画面 | | 既存と同一の見た目 (スクリーンショット比較で確認) |

## 技術選定

| 項目 | 選定 | 理由 |
|---|---|---|
| HTTP | 標準 `net/http` (Go 1.22+ の `ServeMux`) | 依存ゼロ。ルート数が少ない |
| テンプレート | `html/template` + `embed` | Thymeleaf の layout / fragment を `{{template}}` に 1:1 で移植 |
| DB | `database/sql` + `go-sql-driver/mysql` | 追加ツール不要。クエリ数が少ない |
| スクレイピング | `goquery` + `golang.org/x/text/encoding/japanese` | jsoup 相当。sow.cgi 系の Shift_JIS / EUC-JP 対応 |
| 静的アセット | `embed` で同梱。Bootstrap 3 / jQuery / Chart.js はそのまま | JS がほぼ無いため触らない |
| コンテナ | multi-stage build → `gcr.io/distroless/static`、arm64 | イメージ 10〜15MB |
| リポジトリ | 新規 [`h-orito/wolf-portal-go`](https://github.com/h-orito/wolf-portal-go) (private) | Gradle / DBFlute 資産と分離。移行完了後に本リポジトリをアーカイブ |

## リポジトリ構成

```
wolf-portal-go/
  cmd/
    server/main.go       # Web サーバ
    crawler/main.go      # CronJob 用: recruitment | stats サブコマンド
  internal/
    db/                  # 接続、クエリ
    recruitment/         # 開催状況クローラ (国ごとに 1 ファイル)
    stats/               # 戦績クローラ (国ごとに 1 ファイル)
    web/                 # handler、テンプレート描画
  templates/             # html/template
  static/                # css / js / images / lib
  deploy/                # k8s マニフェスト (Deployment, Service, CronJob)
  tools/screenshot/      # 画面比較スクリプト
  Dockerfile
  .github/workflows/deploy.yml
```

Web とクローラは同じ module・同じイメージとし、`args` のみ変える。

## フェーズ

### Phase 0: 雛形

- module 作成、Dockerfile、GitHub Actions、k8s マニフェスト
- DB 接続 (環境変数 `MYSQL_HOST` / `WOLF_PORTAL_DB_NAME` / `WOLF_PORTAL_DB_USERNAME` / `WOLF_PORTAL_DB_PASSWORD` は既存と同じ)
- 画面比較スクリプトの整備 (後述)

### Phase 1: クローラ分離

先に実施する。効果が最も大きく、Web 側と独立して切り替えられる。

進捗 (2026-08-25): 1〜2 の移植完了。`--dry-run` で全国を取得し、成否・項目の形式が本番と一致することを確認済み。
Kotlin 版と異なる点: 戦績クローラは村ごとの失敗で止まらず次の村へ進み、最後に失敗をまとめて終了コード 1 で返す。

1. `crawler recruitment [--country N] [--store]` を実装
   - 共通処理: 国ごとの delete-insert、`COUNTRY.IS_CRAWL_FAIL` / `LAST_UPDATE_DATETIME` 更新、サロゲートペア除去
   - `--store`: 募集中 + 進行中の村数と参加者数 (`participate_status` の `/` 前の数値合計) を `RECRUIT_STATS` に追加
   - 26 国分の取得ロジックを移植 (対応表は下記)
2. `crawler stats --country N [--village-no N | --ignore-exists]` を実装
   - 10 国分の戦績取得ロジックを移植
3. CronJob を適用し、さくら VPS の cron を停止 (手順は wolf-portal-go の `deploy/README.md`)
   - Kotlin 側の `POST` エンドポイントは Phase 3 まで残す (手動再実行用)
4. 1 国ずつ、Kotlin が書いたレコードと Go が書いたレコードを `COUNTRY_RECRUITMENT_DETAIL` / `COUNTRY_PROGRESS_DETAIL` で突き合わせて差分がないことを確認する

#### 開催状況クローラ 国一覧

| countryId | 国 | 取得方式 |
|---|---|---|
| 1 | 人狼物語 | REST (`wolfort.net/wolf-mansion/recruiting`) |
| 3 | うりか | sow.cgi スクレイピング |
| 4 / 5 / 6 | 月狼 M / H / E | sow.cgi (`GetsurouScrapingLogic`) |
| 7 | 三日月 | sow.cgi |
| 8 / 9 / 10 / 11 | 偽 perjury / xebec / dais / ciel | sow.cgi (`GijiScrapingLogic`) |
| 13 | 薔薇 | sow.cgi |
| 21 | 人狼オンライン | スクレイピング |
| 23 | Howling Wolf | REST (`wolfort.dev/howling-wolf`) |
| 24 | Fire Wolf | REST (`wolfort.dev/firewolf-api`) |
| 25 | Last Wolf | REST (`wolfort.dev/lastwolf`) |
| 26 / 27 | Star Hunter / 暁 | sow.cgi |
| 28 | 赤ずきんちゃんご用心 | REST (`garuneko.com/akazukin/villages.json`) |

2 (人狼BBS)、14 (象牙国) は取得対象外。12 (執事)、15 (千夜)、16 / 17 (深海)、19 (JinroLite)、20 (人狼オンライン X)、22 (るる鯖) はサイトが消滅、18 (リア充) は新規村が作成されなくなったため移植せず、`COUNTRY.IS_DISPLAY = false` にして表示からも外す。人狼BBS G の戦績 (countryId 2) も新規村が増えないため移植しない。

#### 戦績クローラ 国一覧

| countryId | 国 | cron 対象 |
|---|---|---|
| 1 | 人狼物語 | ○ |
| 4 / 5 / 6 | 月狼 M / H / E | 手動のみ |
| 7 | 三日月 | ○ |
| 23 | Howling Wolf | ○ |
| 24 | Fire Wolf | ○ |
| 26 | Star Hunter | ○ |
| 27 | Star Hunter 暁 | 手動のみ |

#### CronJob 設計

| 名前 | schedule (Asia/Tokyo) | args |
|---|---|---|
| `wolf-portal-recruitment-store` | `0 */2 * * *` | `recruitment --store` |
| `wolf-portal-recruitment-odd` | `0 1-23/2 * * *` | `recruitment` |
| `wolf-portal-recruitment-half` | `30 * * * *` | `recruitment` |
| `wolf-portal-stats-1` | `25 4 * * *` | `stats --country 1` |
| `wolf-portal-stats-7` | `10 5 * * *` | `stats --country 7` |
| `wolf-portal-stats-23` | `5 0,7 * * *` | `stats --country 23` |
| `wolf-portal-stats-24` | `6 0,7 * * *` | `stats --country 24` |
| `wolf-portal-stats-26` | `6 0,7 * * *` | `stats --country 26` |

- `timeZone: Asia/Tokyo` (cluster が 1.27 未満なら UTC に換算して記載)
- `concurrencyPolicy: Forbid`、`startingDeadlineSeconds: 600`、`activeDeadlineSeconds: 1200`
- `successfulJobsHistoryLimit: 1`、`failedJobsHistoryLimit: 3`
- resources: requests 16Mi / limits 64Mi
- 国ごとにエラーを握って次の国へ進み、終了コードで失敗を通知する

`/ping` の死活 cron は liveness / readiness probe で代替する。

### Phase 2: Web サーバ移植

1. レイアウト (`layout.html` / `header.html` / `footer.html`) と静的ページ 4 本
2. `/recruitment`、`/recruitment-graph`
3. `/stats/**`、`/village-list`
4. `contextPath=/wolf-portal`、`X-Forwarded-*`、アクセスログ、`/ping`、エラーページ
5. ページごとにスクリーンショット比較を実施し、差分ゼロになるまで修正する (後述)

### Phase 3: 切替

1. Deployment のイメージを Go 版に差し替え、requests / limits を縮小
2. GitHub Actions を Jib から `docker/build-push-action` (arm64) + `kubectl rollout restart` に変更
3. 本番でスクリーンショット比較を再実施 (切替前の本番 vs 切替後の本番)
4. 数日様子を見て `wolf-portal-kotlin` をアーカイブ

## 画面比較 (スクリーンショット)

過去の移行で見た目の崩れが多発しているため、**Phase 2 の各ページ完了条件、および Phase 3 の切替完了条件をスクリーンショット比較の差分ゼロとする**。

### 方式

- Playwright (Node) で基準環境と対象環境の同一 URL を同一 viewport で撮影し、`pixelmatch` で差分画像と差分ピクセル数を出力する
- `tools/screenshot/` に配置。`npm run compare -- --base https://wolfort.dev/wolf-portal --target http://localhost:8080/wolf-portal`
- 出力: `tools/screenshot/out/<page>/{base,target,diff}.png` と `report.md` (ページごとの差分ピクセル数・割合)

### 対象ページ

| ページ | パス | 備考 |
|---|---|---|
| トップ | `/` | |
| 初心者向け | `/beginner` | |
| サイト一覧 | `/site-list` | 652 行の大きな静的ページ |
| リンク | `/link` | |
| 開催状況 | `/recruitment` | 動的。Chart.js 描画後に撮影 |
| 戦績トップ | `/stats` | |
| 村一覧 | `/stats/country/1/village-list` | ページング |
| 村詳細 | `/stats/country/1/village/{villageId}` | 固定 ID を使う |
| 村番号指定 | `/stats/country/1/village-no/{villageNo}` | リダイレクト先を確認 |
| プレイヤー | `/stats/player/{playerId}` | 固定 ID |
| 国プレイヤー | `/stats/country/1/country-player/{countryPlayerId}` | 固定 ID |
| 国プレイヤー一覧 | `/stats/country/1/player-list?userId=xxx` | |
| 村検索 | `/village-list?villageName=xxx` | |
| エラー | `/stats/country/999/village/1` | |

### 撮影条件

- viewport: 1280×900 (PC) と 375×812 (スマホ) の 2 種
- `fullPage: true`
- 外部依存で差分が出る要素はマスクする: AdSense 枠、GA、Chart.js の描画領域 (データが時刻で変わるため。グラフは別途目視)
- 動的データの差分を避けるため、Phase 2 ではローカルの Kotlin 版とローカルの Go 版を**同一 DB** に向けて比較する
- Phase 3 では切替直前に本番 (Kotlin) を撮影して保存し、切替後の本番 (Go) と比較する

### 合格基準

- 差分ピクセル 0 を原則とする
- フォントレンダリング差等で 0 にならない場合は、差分画像を目視して原因を特定し、レイアウト起因でないことを確認した上で許容する。その判断は `report.md` に残す

## Web サーバ設計メモ

- 開催状況のキャッシュ: Kotlin 版はメモリキャッシュ + クローラ側で evict していたが、プロセスが分かれるため evict できない。クエリは軽いので毎回 DB 読み取りとする。負荷が問題になれば TTL 1 分のキャッシュを追加する
- Thymeleaf の `th:each` / `th:if` / `#strings.substring` 等は `html/template` の `range` / `if` / カスタム関数に置換する
- `village-list` / `stats` のページングは既存の `PagingModel` と同じ計算で実装する
- `use-relative-redirects` 相当: リダイレクトは相対パスで返す

## 移行後のリソース (見込み)

| 対象 | requests | limits |
|---|---|---|
| Web (常駐) | 32Mi / 50m | 128Mi / 500m |
| CronJob (実行時のみ) | 16Mi / 50m | 64Mi / 500m |
