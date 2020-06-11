package com.ort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.ort.dbflute.allcommon.*;
import com.ort.dbflute.exentity.*;

/**
 * The DB meta of country. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CountryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CountryDbm _instance = new CountryDbm();
    private CountryDbm() {}
    public static CountryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Country)et).getCountryId(), (et, vl) -> ((Country)et).setCountryId(cti(vl)), "countryId");
        setupEpg(_epgMap, et -> ((Country)et).getCountryName(), (et, vl) -> ((Country)et).setCountryName((String)vl), "countryName");
        setupEpg(_epgMap, et -> ((Country)et).getCountryTopPageUrl(), (et, vl) -> ((Country)et).setCountryTopPageUrl((String)vl), "countryTopPageUrl");
        setupEpg(_epgMap, et -> ((Country)et).getDisplayOrder(), (et, vl) -> ((Country)et).setDisplayOrder(cti(vl)), "displayOrder");
        setupEpg(_epgMap, et -> ((Country)et).getIsCrawlFail(), (et, vl) -> ((Country)et).setIsCrawlFail((Boolean)vl), "isCrawlFail");
        setupEpg(_epgMap, et -> ((Country)et).getIsDisplay(), (et, vl) -> ((Country)et).setIsDisplay((Boolean)vl), "isDisplay");
        setupEpg(_epgMap, et -> ((Country)et).getLastUpdateDatetime(), (et, vl) -> ((Country)et).setLastUpdateDatetime(ctldt(vl)), "lastUpdateDatetime");
        setupEpg(_epgMap, et -> ((Country)et).getRegisterDatetime(), (et, vl) -> ((Country)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Country)et).getRegisterTrace(), (et, vl) -> ((Country)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((Country)et).getUpdateDatetime(), (et, vl) -> ((Country)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Country)et).getUpdateTrace(), (et, vl) -> ((Country)et).setUpdateTrace((String)vl), "updateTrace");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "country";
    protected final String _tableDispName = "COUNTRY";
    protected final String _tablePropertyName = "country";
    protected final TableSqlName _tableSqlName = new TableSqlName("COUNTRY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCountryId = cci("COUNTRY_ID", "COUNTRY_ID", null, null, Integer.class, "countryId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "countryPlayerList,countryProgressList,countryRecruitmentList,villageList", null, false);
    protected final ColumnInfo _columnCountryName = cci("COUNTRY_NAME", "COUNTRY_NAME", null, null, String.class, "countryName", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountryTopPageUrl = cci("COUNTRY_TOP_PAGE_URL", "COUNTRY_TOP_PAGE_URL", null, null, String.class, "countryTopPageUrl", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsCrawlFail = cci("IS_CRAWL_FAIL", "IS_CRAWL_FAIL", null, null, Boolean.class, "isCrawlFail", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsDisplay = cci("IS_DISPLAY", "IS_DISPLAY", null, null, Boolean.class, "isDisplay", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastUpdateDatetime = cci("LAST_UPDATE_DATETIME", "LAST_UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "lastUpdateDatetime", null, false, false, false, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("REGISTER_TRACE", "REGISTER_TRACE", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("UPDATE_TRACE", "UPDATE_TRACE", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryId() { return _columnCountryId; }
    /**
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryName() { return _columnCountryName; }
    /**
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryTopPageUrl() { return _columnCountryTopPageUrl; }
    /**
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }
    /**
     * IS_CRAWL_FAIL: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsCrawlFail() { return _columnIsCrawlFail; }
    /**
     * IS_DISPLAY: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsDisplay() { return _columnIsDisplay; }
    /**
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastUpdateDatetime() { return _columnLastUpdateDatetime; }
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
        ls.add(columnCountryId());
        ls.add(columnCountryName());
        ls.add(columnCountryTopPageUrl());
        ls.add(columnDisplayOrder());
        ls.add(columnIsCrawlFail());
        ls.add(columnIsDisplay());
        ls.add(columnLastUpdateDatetime());
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
    protected UniqueInfo cpui() { return hpcpui(columnCountryId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COUNTRY_PLAYER by COUNTRY_ID, named 'countryPlayerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCountryPlayerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryId(), CountryPlayerDbm.getInstance().columnCountryId());
        return cri("FK_COUNTRY_PLAYER_COUNTRY", "countryPlayerList", this, CountryPlayerDbm.getInstance(), mp, false, "country");
    }
    /**
     * COUNTRY_PROGRESS by COUNTRY_ID, named 'countryProgressList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCountryProgressList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryId(), CountryProgressDbm.getInstance().columnCountryId());
        return cri("FK_COUNTRY_PROGRESS_COUNTRY", "countryProgressList", this, CountryProgressDbm.getInstance(), mp, false, "country");
    }
    /**
     * COUNTRY_RECRUITMENT by COUNTRY_ID, named 'countryRecruitmentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCountryRecruitmentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryId(), CountryRecruitmentDbm.getInstance().columnCountryId());
        return cri("FK_COUNTRY_RECRUITMENT_HEADER_COUNTRY", "countryRecruitmentList", this, CountryRecruitmentDbm.getInstance(), mp, false, "country");
    }
    /**
     * VILLAGE by COUNTRY_ID, named 'villageList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVillageList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryId(), VillageDbm.getInstance().columnCountryId());
        return cri("FK_VILLAGE_COUNTRY", "villageList", this, VillageDbm.getInstance(), mp, false, "country");
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
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.Country"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.CountryCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.CountryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Country> getEntityType() { return Country.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Country newEntity() { return new Country(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Country)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Country)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
