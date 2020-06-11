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
 * The base condition-query of winlose.
 * @author DBFlute(AutoGenerator)
 */
public class BsWinloseCQ extends AbstractBsWinloseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WinloseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWinloseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from winlose) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WinloseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WinloseCIQ xcreateCIQ() {
        WinloseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WinloseCIQ xnewCIQ() {
        return new WinloseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join winlose on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WinloseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WinloseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _winloseCode;
    public ConditionValue xdfgetWinloseCode()
    { if (_winloseCode == null) { _winloseCode = nCV(); }
      return _winloseCode; }
    protected ConditionValue xgetCValueWinloseCode() { return xdfgetWinloseCode(); }

    public Map<String, VillagePlayerStatsCQ> xdfgetWinloseCode_ExistsReferrer_VillagePlayerStatsList() { return xgetSQueMap("winloseCode_ExistsReferrer_VillagePlayerStatsList"); }
    public String keepWinloseCode_ExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("winloseCode_ExistsReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetWinloseCode_NotExistsReferrer_VillagePlayerStatsList() { return xgetSQueMap("winloseCode_NotExistsReferrer_VillagePlayerStatsList"); }
    public String keepWinloseCode_NotExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("winloseCode_NotExistsReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetWinloseCode_SpecifyDerivedReferrer_VillagePlayerStatsList() { return xgetSQueMap("winloseCode_SpecifyDerivedReferrer_VillagePlayerStatsList"); }
    public String keepWinloseCode_SpecifyDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("winloseCode_SpecifyDerivedReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetWinloseCode_QueryDerivedReferrer_VillagePlayerStatsList() { return xgetSQueMap("winloseCode_QueryDerivedReferrer_VillagePlayerStatsList"); }
    public String keepWinloseCode_QueryDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("winloseCode_QueryDerivedReferrer_VillagePlayerStatsList", sq); }
    public Map<String, Object> xdfgetWinloseCode_QueryDerivedReferrer_VillagePlayerStatsListParameter() { return xgetSQuePmMap("winloseCode_QueryDerivedReferrer_VillagePlayerStatsList"); }
    public String keepWinloseCode_QueryDerivedReferrer_VillagePlayerStatsListParameter(Object pm) { return xkeepSQuePm("winloseCode_QueryDerivedReferrer_VillagePlayerStatsList", pm); }

    /**
     * Add order-by as ascend. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @return this. (NotNull)
     */
    public BsWinloseCQ addOrderBy_WinloseCode_Asc() { regOBA("WINLOSE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @return this. (NotNull)
     */
    public BsWinloseCQ addOrderBy_WinloseCode_Desc() { regOBD("WINLOSE_CODE"); return this; }

    protected ConditionValue _winloseName;
    public ConditionValue xdfgetWinloseName()
    { if (_winloseName == null) { _winloseName = nCV(); }
      return _winloseName; }
    protected ConditionValue xgetCValueWinloseName() { return xdfgetWinloseName(); }

    /**
     * Add order-by as ascend. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWinloseCQ addOrderBy_WinloseName_Asc() { regOBA("WINLOSE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWinloseCQ addOrderBy_WinloseName_Desc() { regOBD("WINLOSE_NAME"); return this; }

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
    public BsWinloseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWinloseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WinloseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WinloseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WinloseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WinloseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WinloseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WinloseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WinloseCQ> _myselfExistsMap;
    public Map<String, WinloseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WinloseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WinloseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WinloseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WinloseCB.class.getName(); }
    protected String xCQ() { return WinloseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
