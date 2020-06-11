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
 * The DB meta of country_recruitment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CountryRecruitmentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CountryRecruitmentDbm _instance = new CountryRecruitmentDbm();
    private CountryRecruitmentDbm() {}
    public static CountryRecruitmentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getCountryRecruitmentId(), (et, vl) -> ((CountryRecruitment)et).setCountryRecruitmentId(cti(vl)), "countryRecruitmentId");
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getCountryId(), (et, vl) -> ((CountryRecruitment)et).setCountryId(cti(vl)), "countryId");
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getDisplayOrder(), (et, vl) -> ((CountryRecruitment)et).setDisplayOrder(cti(vl)), "displayOrder");
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getRegisterDatetime(), (et, vl) -> ((CountryRecruitment)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getRegisterTrace(), (et, vl) -> ((CountryRecruitment)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getUpdateDatetime(), (et, vl) -> ((CountryRecruitment)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((CountryRecruitment)et).getUpdateTrace(), (et, vl) -> ((CountryRecruitment)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((CountryRecruitment)et).getCountry(), (et, vl) -> ((CountryRecruitment)et).setCountry((OptionalEntity<Country>)vl), "country");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "country_recruitment";
    protected final String _tableDispName = "COUNTRY_RECRUITMENT";
    protected final String _tablePropertyName = "countryRecruitment";
    protected final TableSqlName _tableSqlName = new TableSqlName("COUNTRY_RECRUITMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCountryRecruitmentId = cci("COUNTRY_RECRUITMENT_ID", "COUNTRY_RECRUITMENT_ID", null, null, Integer.class, "countryRecruitmentId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "countryRecruitmentDetailList", null, false);
    protected final ColumnInfo _columnCountryId = cci("COUNTRY_ID", "COUNTRY_ID", null, null, Integer.class, "countryId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "country", null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("REGISTER_TRACE", "REGISTER_TRACE", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("UPDATE_TRACE", "UPDATE_TRACE", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * COUNTRY_RECRUITMENT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryRecruitmentId() { return _columnCountryRecruitmentId; }
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
        ls.add(columnCountryRecruitmentId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCountryRecruitmentId()); }
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
        return cfi("FK_COUNTRY_RECRUITMENT_HEADER_COUNTRY", "country", this, CountryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "countryRecruitmentList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COUNTRY_RECRUITMENT_DETAIL by COUNTRY_RECRUITMENT_ID, named 'countryRecruitmentDetailList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCountryRecruitmentDetailList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryRecruitmentId(), CountryRecruitmentDetailDbm.getInstance().columnCountryRecruitmentId());
        return cri("FK_COUNTRY_RECRUITMENT_DETAIL_COUNTRY_RECRUITMENT", "countryRecruitmentDetailList", this, CountryRecruitmentDetailDbm.getInstance(), mp, false, "countryRecruitment");
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
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.CountryRecruitment"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.CountryRecruitmentCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.CountryRecruitmentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CountryRecruitment> getEntityType() { return CountryRecruitment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CountryRecruitment newEntity() { return new CountryRecruitment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CountryRecruitment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CountryRecruitment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
