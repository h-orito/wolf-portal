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
 * The DB meta of recruit_stats. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RecruitStatsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RecruitStatsDbm _instance = new RecruitStatsDbm();
    private RecruitStatsDbm() {}
    public static RecruitStatsDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RecruitStats)et).getRecruitStatsId(), (et, vl) -> ((RecruitStats)et).setRecruitStatsId(cti(vl)), "recruitStatsId");
        setupEpg(_epgMap, et -> ((RecruitStats)et).getStatsDatetime(), (et, vl) -> ((RecruitStats)et).setStatsDatetime(ctldt(vl)), "statsDatetime");
        setupEpg(_epgMap, et -> ((RecruitStats)et).getVillageNum(), (et, vl) -> ((RecruitStats)et).setVillageNum(cti(vl)), "villageNum");
        setupEpg(_epgMap, et -> ((RecruitStats)et).getParticipateNum(), (et, vl) -> ((RecruitStats)et).setParticipateNum(cti(vl)), "participateNum");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "recruit_stats";
    protected final String _tableDispName = "RECRUIT_STATS";
    protected final String _tablePropertyName = "recruitStats";
    protected final TableSqlName _tableSqlName = new TableSqlName("RECRUIT_STATS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRecruitStatsId = cci("RECRUIT_STATS_ID", "RECRUIT_STATS_ID", null, null, Integer.class, "recruitStatsId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatsDatetime = cci("STATS_DATETIME", "STATS_DATETIME", null, null, java.time.LocalDateTime.class, "statsDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVillageNum = cci("VILLAGE_NUM", "VILLAGE_NUM", null, null, Integer.class, "villageNum", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParticipateNum = cci("PARTICIPATE_NUM", "PARTICIPATE_NUM", null, null, Integer.class, "participateNum", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecruitStatsId() { return _columnRecruitStatsId; }
    /**
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatsDatetime() { return _columnStatsDatetime; }
    /**
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVillageNum() { return _columnVillageNum; }
    /**
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateNum() { return _columnParticipateNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRecruitStatsId());
        ls.add(columnStatsDatetime());
        ls.add(columnVillageNum());
        ls.add(columnParticipateNum());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRecruitStatsId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.ort.dbflute.exentity.RecruitStats"; }
    public String getConditionBeanTypeName() { return "com.ort.dbflute.cbean.RecruitStatsCB"; }
    public String getBehaviorTypeName() { return "com.ort.dbflute.exbhv.RecruitStatsBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RecruitStats> getEntityType() { return RecruitStats.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RecruitStats newEntity() { return new RecruitStats(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RecruitStats)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RecruitStats)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
