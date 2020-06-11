package com.ort.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.ort.dbflute.cbean.cq.ciq.*;
import com.ort.dbflute.cbean.*;
import com.ort.dbflute.cbean.cq.*;

/**
 * The base condition-query of recruit_stats.
 * @author DBFlute(AutoGenerator)
 */
public class BsRecruitStatsCQ extends AbstractBsRecruitStatsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RecruitStatsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRecruitStatsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from recruit_stats) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RecruitStatsCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RecruitStatsCIQ xcreateCIQ() {
        RecruitStatsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RecruitStatsCIQ xnewCIQ() {
        return new RecruitStatsCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join recruit_stats on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RecruitStatsCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RecruitStatsCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _recruitStatsId;
    public ConditionValue xdfgetRecruitStatsId()
    { if (_recruitStatsId == null) { _recruitStatsId = nCV(); }
      return _recruitStatsId; }
    protected ConditionValue xgetCValueRecruitStatsId() { return xdfgetRecruitStatsId(); }

    /**
     * Add order-by as ascend. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_RecruitStatsId_Asc() { regOBA("RECRUIT_STATS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_RecruitStatsId_Desc() { regOBD("RECRUIT_STATS_ID"); return this; }

    protected ConditionValue _statsDatetime;
    public ConditionValue xdfgetStatsDatetime()
    { if (_statsDatetime == null) { _statsDatetime = nCV(); }
      return _statsDatetime; }
    protected ConditionValue xgetCValueStatsDatetime() { return xdfgetStatsDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_StatsDatetime_Asc() { regOBA("STATS_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_StatsDatetime_Desc() { regOBD("STATS_DATETIME"); return this; }

    protected ConditionValue _villageNum;
    public ConditionValue xdfgetVillageNum()
    { if (_villageNum == null) { _villageNum = nCV(); }
      return _villageNum; }
    protected ConditionValue xgetCValueVillageNum() { return xdfgetVillageNum(); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_VillageNum_Asc() { regOBA("VILLAGE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_VillageNum_Desc() { regOBD("VILLAGE_NUM"); return this; }

    protected ConditionValue _participateNum;
    public ConditionValue xdfgetParticipateNum()
    { if (_participateNum == null) { _participateNum = nCV(); }
      return _participateNum; }
    protected ConditionValue xgetCValueParticipateNum() { return xdfgetParticipateNum(); }

    /**
     * Add order-by as ascend. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_ParticipateNum_Asc() { regOBA("PARTICIPATE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addOrderBy_ParticipateNum_Desc() { regOBD("PARTICIPATE_NUM"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsRecruitStatsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RecruitStatsCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RecruitStatsCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RecruitStatsCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RecruitStatsCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RecruitStatsCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RecruitStatsCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RecruitStatsCQ> _myselfExistsMap;
    public Map<String, RecruitStatsCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RecruitStatsCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RecruitStatsCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RecruitStatsCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RecruitStatsCB.class.getName(); }
    protected String xCQ() { return RecruitStatsCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
