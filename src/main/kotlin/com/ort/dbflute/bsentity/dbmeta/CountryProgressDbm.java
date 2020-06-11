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
 * The DB meta of country_progress. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CountryProgressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CountryProgressDbm _instance = new CountryProgressDbm();
    private CountryProgressDbm() {}
    public static CountryProgressDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CountryProgress)et).getCountryProgressId(), (et, vl) -> ((CountryProgress)et).setCountryProgressId(cti(vl)), "countryProgressId");
        setupEpg(_epgMap, et -> ((CountryProgress)et).getCountryId(), (et, vl) -> ((CountryProgress)et).setCountryId(cti(vl)), "countryId");
        setupEpg(_epgMap, et -> ((CountryProgress)et).getDisplayOrder(), (et, vl) -> ((CountryProgress)et).setDisplayOrder(cti(vl)), "displayOrder");
        setupEpg(_epgMap, et -> ((CountryProgress)et).getRegisterDatetime(), (et, vl) -> ((CountryProgress)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((CountryProgress)et).getRegisterTrace(), (et, vl) -> ((CountryProgress)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((CountryProgress)et).getUpdateDatetime(), (et, vl) -> ((CountryProgress)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((CountryProgress)et).getUpdateTrace(), (et, vl) -> ((CountryProgress)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((CountryProgress)et).getCountry(), (et, vl) -> ((CountryProgress)et).setCountry((OptionalEntity<Country>)vl), "country");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "country_progress";
    protected final String _tableDispName = "COUNTRY_PROGRESS";
    protected final String _tablePropertyName = "countryProgress";
    protected final TableSqlName _tableSqlName = new TableSqlName("COUNTRY_PROGRESS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCountryProgressId = cci("COUNTRY_PROGRESS_ID", "COUNTRY_PROGRESS_ID", null, null, Integer.class, "countryProgressId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "countryProgressDetailList", null, false);
    protected final ColumnInfo _columnCountryId = cci("COUNTRY_ID", "COUNTRY_ID", null, null, Integer.class, "countryId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "country", null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("REGISTER_TRACE", "REGISTER_TRACE", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("UPDATE_TRACE", "UPDATE_TRACE", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * COUNTRY_PROGRESS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryProgressId() { return _columnCountryProgressId; }
    /**
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryId() { return _columnCountryId; }
    /**
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }
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
        ls.add(columnCountryProgressId());
        ls.add(columnCountryId());
        ls.add(columnDisplayOrder());
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
    protected UniqueInfo cpui() { return hpcpui(columnCountryProgressId()); }
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
        return cfi("FK_COUNTRY_PROGRESS_COUNTRY", "country", this, CountryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "countryProgressList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COUNTRY_PROGRESS_DETAIL by COUNTRY_PROGRESS_ID, named 'countryProgressDetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCountryProgressDetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryProgressId(), CountryProgressDetailDbm.getInstance().columnCountryProgressId());
        return cri("FK_COUNTRY_PROGRESS_DETAIL_COUNTRY_PROGRESS", "countryProgressDetailList", this, CountryProgressDetailDbm.getInstance(), mp, false, "countryProgress");
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
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.CountryProgress"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.CountryProgressCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.CountryProgressBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CountryProgress> getEntityType() { return CountryProgress.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CountryProgress newEntity() { return new CountryProgress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CountryProgress)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CountryProgress)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
