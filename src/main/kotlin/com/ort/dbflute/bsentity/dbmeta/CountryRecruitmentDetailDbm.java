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
 * The DB meta of country_recruitment_detail. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CountryRecruitmentDetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CountryRecruitmentDetailDbm _instance = new CountryRecruitmentDetailDbm();
    private CountryRecruitmentDetailDbm() {}
    public static CountryRecruitmentDetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CountryRecruitmentDetail)et).getCountryRecruitmentDetailId(), (et, vl) -> ((CountryRecruitmentDetail)et).setCountryRecruitmentDetailId(cti(vl)), "countryRecruitmentDetailId");
        setupEpg(_epgMap, et -> ((CountryRecruitmentDetail)et).getCountryRecruitmentId(), (et, vl) -> ((CountryRecruitmentDetail)et).setCountryRecruitmentId(cti(vl)), "countryRecruitmentId");
        setupEpg(_epgMap, et -> ((CountryRecruitmentDetail)et).getItemName(), (et, vl) -> ((CountryRecruitmentDetail)et).setItemName((String)vl), "itemName");
        setupEpg(_epgMap, et -> ((CountryRecruitmentDetail)et).getItemValue(), (et, vl) -> ((CountryRecruitmentDetail)et).setItemValue((String)vl), "itemValue");
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
        setupEfpg(_efpgMap, et -> ((CountryRecruitmentDetail)et).getCountryRecruitment(), (et, vl) -> ((CountryRecruitmentDetail)et).setCountryRecruitment((OptionalEntity<CountryRecruitment>)vl), "countryRecruitment");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "country_recruitment_detail";
    protected final String _tableDispName = "COUNTRY_RECRUITMENT_DETAIL";
    protected final String _tablePropertyName = "countryRecruitmentDetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("COUNTRY_RECRUITMENT_DETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCountryRecruitmentDetailId = cci("COUNTRY_RECRUITMENT_DETAIL_ID", "COUNTRY_RECRUITMENT_DETAIL_ID", null, null, Integer.class, "countryRecruitmentDetailId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountryRecruitmentId = cci("COUNTRY_RECRUITMENT_ID", "COUNTRY_RECRUITMENT_ID", null, null, Integer.class, "countryRecruitmentId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "countryRecruitment", null, null, false);
    protected final ColumnInfo _columnItemName = cci("ITEM_NAME", "ITEM_NAME", null, null, String.class, "itemName", null, false, false, true, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemValue = cci("ITEM_VALUE", "ITEM_VALUE", null, null, String.class, "itemValue", null, false, false, true, "VARCHAR", 1000, 0, null, null, false, null, null, null, null, null, false);

    /**
     * COUNTRY_RECRUITMENT_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryRecruitmentDetailId() { return _columnCountryRecruitmentDetailId; }
    /**
     * COUNTRY_RECRUITMENT_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_recruitment}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryRecruitmentId() { return _columnCountryRecruitmentId; }
    /**
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemName() { return _columnItemName; }
    /**
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemValue() { return _columnItemValue; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCountryRecruitmentDetailId());
        ls.add(columnCountryRecruitmentId());
        ls.add(columnItemName());
        ls.add(columnItemValue());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCountryRecruitmentDetailId()); }
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
     * COUNTRY_RECRUITMENT by my COUNTRY_RECRUITMENT_ID, named 'countryRecruitment'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCountryRecruitment() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryRecruitmentId(), CountryRecruitmentDbm.getInstance().columnCountryRecruitmentId());
        return cfi("FK_COUNTRY_RECRUITMENT_DETAIL_COUNTRY_RECRUITMENT", "countryRecruitment", this, CountryRecruitmentDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "countryRecruitmentDetailList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.CountryRecruitmentDetail"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.CountryRecruitmentDetailCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.CountryRecruitmentDetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CountryRecruitmentDetail> getEntityType() { return CountryRecruitmentDetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CountryRecruitmentDetail newEntity() { return new CountryRecruitmentDetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CountryRecruitmentDetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CountryRecruitmentDetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
