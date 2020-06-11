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
 * The DB meta of winlose. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WinloseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WinloseDbm _instance = new WinloseDbm();
    private WinloseDbm() {}
    public static WinloseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Winlose)et).getWinloseCode(), (et, vl) -> {
            CDef.WinLose cls = (CDef.WinLose)gcls(et, columnWinloseCode(), vl);
            if (cls != null) {
                ((Winlose)et).setWinloseCodeAsWinLose(cls);
            } else {
                ((Winlose)et).mynativeMappingWinloseCode((String)vl);
            }
        }, "winloseCode");
        setupEpg(_epgMap, et -> ((Winlose)et).getWinloseName(), (et, vl) -> ((Winlose)et).setWinloseName((String)vl), "winloseName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "winlose";
    protected final String _tableDispName = "WINLOSE";
    protected final String _tablePropertyName = "winlose";
    protected final TableSqlName _tableSqlName = new TableSqlName("WINLOSE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWinloseCode = cci("WINLOSE_CODE", "WINLOSE_CODE", null, null, String.class, "winloseCode", null, true, false, true, "VARCHAR", 20, 0, null, null, false, null, null, null, "villagePlayerStatsList", CDef.DefMeta.WinLose, false);
    protected final ColumnInfo _columnWinloseName = cci("WINLOSE_NAME", "WINLOSE_NAME", null, null, String.class, "winloseName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);

    /**
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWinloseCode() { return _columnWinloseCode; }
    /**
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWinloseName() { return _columnWinloseName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWinloseCode());
        ls.add(columnWinloseName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWinloseCode()); }
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
     * VILLAGE_PLAYER_STATS by WINLOSE_CODE, named 'villagePlayerStatsList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVillagePlayerStatsList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWinloseCode(), VillagePlayerStatsDbm.getInstance().columnWinloseCode());
        return cri("FK_VILLAGE_PLAYER_STATS_WINLOSE", "villagePlayerStatsList", this, VillagePlayerStatsDbm.getInstance(), mp, false, "winlose");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.Winlose"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.WinloseCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.WinloseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Winlose> getEntityType() { return Winlose.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Winlose newEntity() { return new Winlose(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Winlose)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Winlose)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
