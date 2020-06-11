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
 * The base condition-query of country_progress_detail.
 * @author DBFlute(AutoGenerator)
 */
public class BsCountryProgressDetailCQ extends AbstractBsCountryProgressDetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CountryProgressDetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCountryProgressDetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from country_progress_detail) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CountryProgressDetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CountryProgressDetailCIQ xcreateCIQ() {
        CountryProgressDetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CountryProgressDetailCIQ xnewCIQ() {
        return new CountryProgressDetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join country_progress_detail on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CountryProgressDetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CountryProgressDetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _countryProgressDetailId;
    public ConditionValue xdfgetCountryProgressDetailId()
    { if (_countryProgressDetailId == null) { _countryProgressDetailId = nCV(); }
      return _countryProgressDetailId; }
    protected ConditionValue xgetCValueCountryProgressDetailId() { return xdfgetCountryProgressDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_CountryProgressDetailId_Asc() { regOBA("COUNTRY_PROGRESS_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_CountryProgressDetailId_Desc() { regOBD("COUNTRY_PROGRESS_DETAIL_ID"); return this; }

    protected ConditionValue _countryProgressId;
    public ConditionValue xdfgetCountryProgressId()
    { if (_countryProgressId == null) { _countryProgressId = nCV(); }
      return _countryProgressId; }
    protected ConditionValue xgetCValueCountryProgressId() { return xdfgetCountryProgressId(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_CountryProgressId_Asc() { regOBA("COUNTRY_PROGRESS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_CountryProgressId_Desc() { regOBD("COUNTRY_PROGRESS_ID"); return this; }

    protected ConditionValue _itemName;
    public ConditionValue xdfgetItemName()
    { if (_itemName == null) { _itemName = nCV(); }
      return _itemName; }
    protected ConditionValue xgetCValueItemName() { return xdfgetItemName(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_ItemName_Asc() { regOBA("ITEM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_ItemName_Desc() { regOBD("ITEM_NAME"); return this; }

    protected ConditionValue _itemValue;
    public ConditionValue xdfgetItemValue()
    { if (_itemValue == null) { _itemValue = nCV(); }
      return _itemValue; }
    protected ConditionValue xgetCValueItemValue() { return xdfgetItemValue(); }

    /**
     * Add order-by as ascend. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_ItemValue_Asc() { regOBA("ITEM_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsCountryProgressDetailCQ addOrderBy_ItemValue_Desc() { regOBD("ITEM_VALUE"); return this; }

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
    public BsCountryProgressDetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCountryProgressDetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CountryProgressDetailCQ bq = (CountryProgressDetailCQ)bqs;
        CountryProgressDetailCQ uq = (CountryProgressDetailCQ)uqs;
        if (bq.hasConditionQueryCountryProgress()) {
            uq.queryCountryProgress().reflectRelationOnUnionQuery(bq.queryCountryProgress(), uq.queryCountryProgress());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * COUNTRY_PROGRESS by my COUNTRY_PROGRESS_ID, named 'countryProgress'.
     * @return The instance of condition-query. (NotNull)
     */
    public CountryProgressCQ queryCountryProgress() {
        return xdfgetConditionQueryCountryProgress();
    }
    public CountryProgressCQ xdfgetConditionQueryCountryProgress() {
        String prop = "countryProgress";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCountryProgress()); xsetupOuterJoinCountryProgress(); }
        return xgetQueRlMap(prop);
    }
    protected CountryProgressCQ xcreateQueryCountryProgress() {
        String nrp = xresolveNRP("country_progress_detail", "countryProgress"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CountryProgressCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "countryProgress", nrp);
    }
    protected void xsetupOuterJoinCountryProgress() { xregOutJo("countryProgress"); }
    public boolean hasConditionQueryCountryProgress() { return xhasQueRlMap("countryProgress"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CountryProgressDetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CountryProgressDetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CountryProgressDetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CountryProgressDetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CountryProgressDetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CountryProgressDetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CountryProgressDetailCQ> _myselfExistsMap;
    public Map<String, CountryProgressDetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CountryProgressDetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CountryProgressDetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CountryProgressDetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CountryProgressDetailCB.class.getName(); }
    protected String xCQ() { return CountryProgressDetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
