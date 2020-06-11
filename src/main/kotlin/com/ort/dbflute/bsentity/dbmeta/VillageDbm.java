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
 * The DB meta of village. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VillageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VillageDbm _instance = new VillageDbm();
    private VillageDbm() {}
    public static VillageDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Village)et).getVillageId(), (et, vl) -> ((Village)et).setVillageId(cti(vl)), "villageId");
        setupEpg(_epgMap, et -> ((Village)et).getCountryId(), (et, vl) -> ((Village)et).setCountryId(cti(vl)), "countryId");
        setupEpg(_epgMap, et -> ((Village)et).getVillageName(), (et, vl) -> ((Village)et).setVillageName((String)vl), "villageName");
        setupEpg(_epgMap, et -> ((Village)et).getVillageNo(), (et, vl) -> ((Village)et).setVillageNo(cti(vl)), "villageNo");
        setupEpg(_epgMap, et -> ((Village)et).getVillageUrl(), (et, vl) -> ((Village)et).setVillageUrl((String)vl), "villageUrl");
        setupEpg(_epgMap, et -> ((Village)et).getVillageStartDatetime(), (et, vl) -> ((Village)et).setVillageStartDatetime(ctldt(vl)), "villageStartDatetime");
        setupEpg(_epgMap, et -> ((Village)et).getVillageEndDatetime(), (et, vl) -> ((Village)et).setVillageEndDatetime(ctldt(vl)), "villageEndDatetime");
        setupEpg(_epgMap, et -> ((Village)et).getWinCampName(), (et, vl) -> ((Village)et).setWinCampName((String)vl), "winCampName");
        setupEpg(_epgMap, et -> ((Village)et).getRegisterDatetime(), (et, vl) -> ((Village)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Village)et).getRegisterTrace(), (et, vl) -> ((Village)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((Village)et).getUpdateDatetime(), (et, vl) -> ((Village)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Village)et).getUpdateTrace(), (et, vl) -> ((Village)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((Village)et).getCountry(), (et, vl) -> ((Village)et).setCountry((OptionalEntity<Country>)vl), "country");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "village";
    protected final String _tableDispName = "VILLAGE";
    protected final String _tablePropertyName = "village";
    protected final TableSqlName _tableSqlName = new TableSqlName("VILLAGE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVillageId = cci("VILLAGE_ID", "VILLAGE_ID", null, null, Integer.class, "villageId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "villagePlayerStatsList", null, false);
    protected final ColumnInfo _columnCountryId = cci("COUNTRY_ID", "COUNTRY_ID", null, null, Integer.class, "countryId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "country", null, null, false);
    protected final ColumnInfo _columnVillageName = cci("VILLAGE_NAME", "VILLAGE_NAME", null, null, String.class, "villageName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVillageNo = cci("VILLAGE_NO", "VILLAGE_NO", null, null, Integer.class, "villageNo", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVillageUrl = cci("VILLAGE_URL", "VILLAGE_URL", null, null, String.class, "villageUrl", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVillageStartDatetime = cci("VILLAGE_START_DATETIME", "VILLAGE_START_DATETIME", null, null, java.time.LocalDateTime.class, "villageStartDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVillageEndDatetime = cci("VILLAGE_END_DATETIME", "VILLAGE_END_DATETIME", null, null, java.time.LocalDateTime.class, "villageEndDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWinCampName = cci("WIN_CAMP_NAME", "WIN_CAMP_NAME", null, null, String.class, "winCampName", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("REGISTER_TRACE", "REGISTER_TRACE", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("UPDATE_TRACE", "UPDATE_TRACE", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageId() { return _columnVillageId; }
    /**
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryId() { return _columnCountryId; }
    /**
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageName() { return _columnVillageName; }
    /**
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageNo() { return _columnVillageNo; }
    /**
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageUrl() { return _columnVillageUrl; }
    /**
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageStartDatetime() { return _columnVillageStartDatetime; }
    /**
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageEndDatetime() { return _columnVillageEndDatetime; }
    /**
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWinCampName() { return _columnWinCampName; }
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
        ls.add(columnVillageId());
        ls.add(columnCountryId());
        ls.add(columnVillageName());
        ls.add(columnVillageNo());
        ls.add(columnVillageUrl());
        ls.add(columnVillageStartDatetime());
        ls.add(columnVillageEndDatetime());
        ls.add(columnWinCampName());
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
    protected UniqueInfo cpui() { return hpcpui(columnVillageId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

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
        return cfi("FK_VILLAGE_COUNTRY", "country", this, CountryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "villageList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * VILLAGE_PLAYER_STATS by VILLAGE_ID, named 'villagePlayerStatsList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVillagePlayerStatsList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVillageId(), VillagePlayerStatsDbm.getInstance().columnVillageId());
        return cri("FK_VILLAGE_PLAYER_STATS_VILLAGE", "villagePlayerStatsList", this, VillagePlayerStatsDbm.getInstance(), mp, false, "village");
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
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.Village"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.VillageCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.VillageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Village> getEntityType() { return Village.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Village newEntity() { return new Village(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Village)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Village)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
