package com.ort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.ort.dbflute.allcommon.*;
import com.ort.dbflute.exentity.*;

/**
 * The DB meta of country_player. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CountryPlayerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CountryPlayerDbm _instance = new CountryPlayerDbm();
    private CountryPlayerDbm() {}
    public static CountryPlayerDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getCountryPlayerId(), (et, vl) -> ((CountryPlayer)et).setCountryPlayerId(cti(vl)), "countryPlayerId");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getCountryId(), (et, vl) -> ((CountryPlayer)et).setCountryId(cti(vl)), "countryId");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getPlayerId(), (et, vl) -> ((CountryPlayer)et).setPlayerId(cti(vl)), "playerId");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getUserId(), (et, vl) -> ((CountryPlayer)et).setUserId((String)vl), "userId");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getRegisterDatetime(), (et, vl) -> ((CountryPlayer)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getRegisterTrace(), (et, vl) -> ((CountryPlayer)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getUpdateDatetime(), (et, vl) -> ((CountryPlayer)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((CountryPlayer)et).getUpdateTrace(), (et, vl) -> ((CountryPlayer)et).setUpdateTrace((String)vl), "updateTrace");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((CountryPlayer)et).getCountry(), (et, vl) -> ((CountryPlayer)et).setCountry((OptionalEntity<Country>)vl), "country");
        setupEfpg(_efpgMap, et -> ((CountryPlayer)et).getPlayer(), (et, vl) -> ((CountryPlayer)et).setPlayer((OptionalEntity<Player>)vl), "player");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "country_player";
    protected final String _tableDispName = "COUNTRY_PLAYER";
    protected final String _tablePropertyName = "countryPlayer";
    protected final TableSqlName _tableSqlName = new TableSqlName("COUNTRY_PLAYER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCountryPlayerId = cci("COUNTRY_PLAYER_ID", "COUNTRY_PLAYER_ID", null, null, Integer.class, "countryPlayerId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "villagePlayerStatsList", null, false);
    protected final ColumnInfo _columnCountryId = cci("COUNTRY_ID", "COUNTRY_ID", null, null, Integer.class, "countryId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "country", null, null, false);
    protected final ColumnInfo _columnPlayerId = cci("PLAYER_ID", "PLAYER_ID", null, null, Integer.class, "playerId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "player", null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, String.class, "userId", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("REGISTER_TRACE", "REGISTER_TRACE", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("UPDATE_TRACE", "UPDATE_TRACE", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * COUNTRY_PLAYER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryPlayerId() { return _columnCountryPlayerId; }
    /**
     * COUNTRY_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryId() { return _columnCountryId; }
    /**
     * PLAYER_ID: {IX, NotNull, INT UNSIGNED(10), FK to player}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayerId() { return _columnPlayerId; }
    /**
     * USER_ID: {+UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterTrace() { return _columnRegisterTrace; }
    /**
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateTrace() { return _columnUpdateTrace; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCountryPlayerId());
        ls.add(columnCountryId());
        ls.add(columnPlayerId());
        ls.add(columnUserId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterTrace());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateTrace());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCountryPlayerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCountryId());
        ls.add(columnUserId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * COUNTRY by my COUNTRY_ID, named 'country'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCountry() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryId(), CountryDbm.getInstance().columnCountryId());
        return cfi("FK_COUNTRY_PLAYER_COUNTRY", "country", this, CountryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "countryPlayerList", false);
    }
    /**
     * PLAYER by my PLAYER_ID, named 'player'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlayerId(), PlayerDbm.getInstance().columnPlayerId());
        return cfi("FK_COUNTRY_PLAYER_PLAYER", "player", this, PlayerDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "countryPlayerList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * VILLAGE_PLAYER_STATS by COUNTRY_PLAYER_ID, named 'villagePlayerStatsList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVillagePlayerStatsList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryPlayerId(), VillagePlayerStatsDbm.getInstance().columnCountryPlayerId());
        return cri("FK_VILLAGE_PLAYER_STATS_COUNTRY_PLAYER", "villagePlayerStatsList", this, VillagePlayerStatsDbm.getInstance(), mp, false, "countryPlayer");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateTrace()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.CountryPlayer"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.CountryPlayerCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.CountryPlayerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CountryPlayer> getEntityType() { return CountryPlayer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CountryPlayer newEntity() { return new CountryPlayer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CountryPlayer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CountryPlayer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
