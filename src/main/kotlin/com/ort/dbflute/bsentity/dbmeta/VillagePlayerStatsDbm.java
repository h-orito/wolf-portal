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
 * The DB meta of village_player_stats. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VillagePlayerStatsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VillagePlayerStatsDbm _instance = new VillagePlayerStatsDbm();
    private VillagePlayerStatsDbm() {}
    public static VillagePlayerStatsDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getVillagePlayerStatsId(), (et, vl) -> ((VillagePlayerStats)et).setVillagePlayerStatsId(cti(vl)), "villagePlayerStatsId");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getCountryPlayerId(), (et, vl) -> ((VillagePlayerStats)et).setCountryPlayerId(cti(vl)), "countryPlayerId");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getVillageId(), (et, vl) -> ((VillagePlayerStats)et).setVillageId(cti(vl)), "villageId");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getCharacterName(), (et, vl) -> ((VillagePlayerStats)et).setCharacterName((String)vl), "characterName");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getSkillName(), (et, vl) -> ((VillagePlayerStats)et).setSkillName((String)vl), "skillName");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getWinloseCode(), (et, vl) -> {
            CDef.WinLose cls = (CDef.WinLose)gcls(et, columnWinloseCode(), vl);
            if (cls != null) {
                ((VillagePlayerStats)et).setWinloseCodeAsWinLose(cls);
            } else {
                ((VillagePlayerStats)et).mynativeMappingWinloseCode((String)vl);
            }
        }, "winloseCode");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getLife(), (et, vl) -> ((VillagePlayerStats)et).setLife((String)vl), "life");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getRegisterDatetime(), (et, vl) -> ((VillagePlayerStats)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getRegisterTrace(), (et, vl) -> ((VillagePlayerStats)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getUpdateDatetime(), (et, vl) -> ((VillagePlayerStats)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((VillagePlayerStats)et).getUpdateTrace(), (et, vl) -> ((VillagePlayerStats)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((VillagePlayerStats)et).getCountryPlayer(), (et, vl) -> ((VillagePlayerStats)et).setCountryPlayer((OptionalEntity<CountryPlayer>)vl), "countryPlayer");
        setupEfpg(_efpgMap, et -> ((VillagePlayerStats)et).getVillage(), (et, vl) -> ((VillagePlayerStats)et).setVillage((OptionalEntity<Village>)vl), "village");
        setupEfpg(_efpgMap, et -> ((VillagePlayerStats)et).getWinlose(), (et, vl) -> ((VillagePlayerStats)et).setWinlose((OptionalEntity<Winlose>)vl), "winlose");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "village_player_stats";
    protected final String _tableDispName = "VILLAGE_PLAYER_STATS";
    protected final String _tablePropertyName = "villagePlayerStats";
    protected final TableSqlName _tableSqlName = new TableSqlName("VILLAGE_PLAYER_STATS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVillagePlayerStatsId = cci("VILLAGE_PLAYER_STATS_ID", "VILLAGE_PLAYER_STATS_ID", null, null, Integer.class, "villagePlayerStatsId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountryPlayerId = cci("COUNTRY_PLAYER_ID", "COUNTRY_PLAYER_ID", null, null, Integer.class, "countryPlayerId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "countryPlayer", null, null, false);
    protected final ColumnInfo _columnVillageId = cci("VILLAGE_ID", "VILLAGE_ID", null, null, Integer.class, "villageId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "village", null, null, false);
    protected final ColumnInfo _columnCharacterName = cci("CHARACTER_NAME", "CHARACTER_NAME", null, null, String.class, "characterName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkillName = cci("SKILL_NAME", "SKILL_NAME", null, null, String.class, "skillName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWinloseCode = cci("WINLOSE_CODE", "WINLOSE_CODE", null, null, String.class, "winloseCode", null, false, false, false, "VARCHAR", 20, 0, null, null, false, null, null, "winlose", null, CDef.DefMeta.WinLose, false);
    protected final ColumnInfo _columnLife = cci("LIFE", "LIFE", null, null, String.class, "life", null, false, false, false, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("REGISTER_TRACE", "REGISTER_TRACE", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("UPDATE_TRACE", "UPDATE_TRACE", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillagePlayerStatsId() { return _columnVillagePlayerStatsId; }
    /**
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryPlayerId() { return _columnCountryPlayerId; }
    /**
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageId() { return _columnVillageId; }
    /**
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCharacterName() { return _columnCharacterName; }
    /**
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkillName() { return _columnSkillName; }
    /**
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWinloseCode() { return _columnWinloseCode; }
    /**
     * LIFE: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLife() { return _columnLife; }
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
        ls.add(columnVillagePlayerStatsId());
        ls.add(columnCountryPlayerId());
        ls.add(columnVillageId());
        ls.add(columnCharacterName());
        ls.add(columnSkillName());
        ls.add(columnWinloseCode());
        ls.add(columnLife());
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
    protected UniqueInfo cpui() { return hpcpui(columnVillagePlayerStatsId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCountryPlayerId());
        ls.add(columnVillageId());
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
     * COUNTRY_PLAYER by my COUNTRY_PLAYER_ID, named 'countryPlayer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCountryPlayer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryPlayerId(), CountryPlayerDbm.getInstance().columnCountryPlayerId());
        return cfi("FK_VILLAGE_PLAYER_STATS_COUNTRY_PLAYER", "countryPlayer", this, CountryPlayerDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "villagePlayerStatsList", false);
    }
    /**
     * VILLAGE by my VILLAGE_ID, named 'village'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVillage() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVillageId(), VillageDbm.getInstance().columnVillageId());
        return cfi("FK_VILLAGE_PLAYER_STATS_VILLAGE", "village", this, VillageDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "villagePlayerStatsList", false);
    }
    /**
     * WINLOSE by my WINLOSE_CODE, named 'winlose'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWinlose() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWinloseCode(), WinloseDbm.getInstance().columnWinloseCode());
        return cfi("FK_VILLAGE_PLAYER_STATS_WINLOSE", "winlose", this, WinloseDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "villagePlayerStatsList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.VillagePlayerStats"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.VillagePlayerStatsCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.VillagePlayerStatsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VillagePlayerStats> getEntityType() { return VillagePlayerStats.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VillagePlayerStats newEntity() { return new VillagePlayerStats(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VillagePlayerStats)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VillagePlayerStats)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
