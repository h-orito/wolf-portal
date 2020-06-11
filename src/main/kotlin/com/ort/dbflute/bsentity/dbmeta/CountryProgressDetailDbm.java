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
 * The DB meta of country_progress_detail. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CountryProgressDetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CountryProgressDetailDbm _instance = new CountryProgressDetailDbm();
    private CountryProgressDetailDbm() {}
    public static CountryProgressDetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CountryProgressDetail)et).getCountryProgressDetailId(), (et, vl) -> ((CountryProgressDetail)et).setCountryProgressDetailId(cti(vl)), "countryProgressDetailId");
        setupEpg(_epgMap, et -> ((CountryProgressDetail)et).getCountryProgressId(), (et, vl) -> ((CountryProgressDetail)et).setCountryProgressId(cti(vl)), "countryProgressId");
        setupEpg(_epgMap, et -> ((CountryProgressDetail)et).getItemName(), (et, vl) -> ((CountryProgressDetail)et).setItemName((String)vl), "itemName");
        setupEpg(_epgMap, et -> ((CountryProgressDetail)et).getItemValue(), (et, vl) -> ((CountryProgressDetail)et).setItemValue((String)vl), "itemValue");
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
        setupEfpg(_efpgMap, et -> ((CountryProgressDetail)et).getCountryProgress(), (et, vl) -> ((CountryProgressDetail)et).setCountryProgress((OptionalEntity<CountryProgress>)vl), "countryProgress");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "country_progress_detail";
    protected final String _tableDispName = "COUNTRY_PROGRESS_DETAIL";
    protected final String _tablePropertyName = "countryProgressDetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("COUNTRY_PROGRESS_DETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCountryProgressDetailId = cci("COUNTRY_PROGRESS_DETAIL_ID", "COUNTRY_PROGRESS_DETAIL_ID", null, null, Integer.class, "countryProgressDetailId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountryProgressId = cci("COUNTRY_PROGRESS_ID", "COUNTRY_PROGRESS_ID", null, null, Integer.class, "countryProgressId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "countryProgress", null, null, false);
    protected final ColumnInfo _columnItemName = cci("ITEM_NAME", "ITEM_NAME", null, null, String.class, "itemName", null, false, false, true, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemValue = cci("ITEM_VALUE", "ITEM_VALUE", null, null, String.class, "itemValue", null, false, false, true, "VARCHAR", 1000, 0, null, null, false, null, null, null, null, null, false);

    /**
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryProgressDetailId() { return _columnCountryProgressDetailId; }
    /**
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryProgressId() { return _columnCountryProgressId; }
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
        ls.add(columnCountryProgressDetailId());
        ls.add(columnCountryProgressId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCountryProgressDetailId()); }
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
     * COUNTRY_PROGRESS by my COUNTRY_PROGRESS_ID, named 'countryProgress'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCountryProgress() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCountryProgressId(), CountryProgressDbm.getInstance().columnCountryProgressId());
        return cfi("FK_COUNTRY_PROGRESS_DETAIL_COUNTRY_PROGRESS", "countryProgress", this, CountryProgressDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "countryProgressDetailList", false);
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
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.CountryProgressDetail"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.CountryProgressDetailCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.CountryProgressDetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CountryProgressDetail> getEntityType() { return CountryProgressDetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CountryProgressDetail newEntity() { return new CountryProgressDetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CountryProgressDetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CountryProgressDetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
