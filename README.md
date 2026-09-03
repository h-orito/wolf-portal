# wolf-portal

オンライン人狼ポータル (Spring Boot / Kotlin 版)

> **このリポジトリはアーカイブ済みです。**
> 2026-09 に Go 版 [h-orito/wolf-portal-go](https://github.com/h-orito/wolf-portal-go) へ移行し、本番 (`https://wolfort.dev/wolf-portal/`) も Go 版に切り替え済みです。
> 今後の開発・修正は wolf-portal-go で行います。本リポジトリは参照用として残しています。

## 移行の経緯

OCI 無料枠の縮小により k8s クラスタのリソースが逼迫したため、常駐コストの大きい Spring Boot (JVM) から Go に置き換え、クローラを CronJob に分離しました。
詳細は [MIGRATION_PLAN.md](MIGRATION_PLAN.md) を参照してください。

## 旧構成 (参考)

| 項目 | 内容 |
|---|---|
| スタック | Spring Boot 2.3 / Kotlin 1.3 / JDK 11 / Thymeleaf / DBFlute / MySQL |
| デプロイ | Jib → GHCR → k8s |
| コンテキストパス | `/wolf-portal` |

### ローカル起動

JDK 11 と MySQL が必要です。

```
./gradlew bootRun
```

DB スキーマは `dbflute_wportaldb/` (DBFlute) で管理しています。
