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
 * The base condition-query of country_recruitment_detail.
 * @author DBFlute(AutoGenerator)
 */
public class BsCountryRecruitmentDetailCQ extends AbstractBsCountryRecruitmentDetailCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CountryRecruitmentDetailCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCountryRecruitmentDetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from country_recruitment_detail) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CountryRecruitmentDetailCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CountryRecruitmentDetailCIQ xcreateCIQ() {
        CountryRecruitmentDetailCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CountryRecruitmentDetailCIQ xnewCIQ() {
        return new CountryRecruitmentDetailCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join country_recruitment_detail on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CountryRecruitmentDetailCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CountryRecruitmentDetailCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _countryRecruitmentDetailId;
    public ConditionValue xdfgetCountryRecruitmentDetailId()
    { if (_countryRecruitmentDetailId == null) { _countryRecruitmentDetailId = nCV(); }
      return _countryRecruitmentDetailId; }
    protected ConditionValue xgetCValueCountryRecruitmentDetailId() { return xdfgetCountryRecruitmentDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_RECRUITMENT_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentDetailCQ addOrderBy_CountryRecruitmentDetailId_Asc() { regOBA("COUNTRY_RECRUITMENT_DETAIL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_RECRUITMENT_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentDetailCQ addOrderBy_CountryRecruitmentDetailId_Desc() { regOBD("COUNTRY_RECRUITMENT_DETAIL_ID"); return this; }

    protected ConditionValue _countryRecruitmentId;
    public ConditionValue xdfgetCountryRecruitmentId()
    { if (_countryRecruitmentId == null) { _countryRecruitmentId = nCV(); }
      return _countryRecruitmentId; }
    protected ConditionValue xgetCValueCountryRecruitmentId() { return xdfgetCountryRecruitmentId(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_RECRUITMENT_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_recruitment}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentDetailCQ addOrderBy_CountryRecruitmentId_Asc() { regOBA("COUNTRY_RECRUITMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_RECRUITMENT_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_recruitment}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentDetailCQ addOrderBy_CountryRecruitmentId_Desc() { regOBD("COUNTRY_RECRUITMENT_ID"); return this; }

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
    public BsCountryRecruitmentDetailCQ addOrderBy_ItemName_Asc() { regOBA("ITEM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentDetailCQ addOrderBy_ItemName_Desc() { regOBD("ITEM_NAME"); return this; }

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
    public BsCountryRecruitmentDetailCQ addOrderBy_ItemValue_Asc() { regOBA("ITEM_VALUE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentDetailCQ addOrderBy_ItemValue_Desc() { regOBD("ITEM_VALUE"); return this; }

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
    public BsCountryRecruitmentDetailCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCountryRecruitmentDetailCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CountryRecruitmentDetailCQ bq = (CountryRecruitmentDetailCQ)bqs;
        CountryRecruitmentDetailCQ uq = (CountryRecruitmentDetailCQ)uqs;
        if (bq.hasConditionQueryCountryRecruitment()) {
            uq.queryCountryRecruitment().reflectRelationOnUnionQuery(bq.queryCountryRecruitment(), uq.queryCountryRecruitment());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * COUNTRY_RECRUITMENT by my COUNTRY_RECRUITMENT_ID, named 'countryRecruitment'.
     * @return The instance of condition-query. (NotNull)
     */
    public CountryRecruitmentCQ queryCountryRecruitment() {
        return xdfgetConditionQueryCountryRecruitment();
    }
    public CountryRecruitmentCQ xdfgetConditionQueryCountryRecruitment() {
        String prop = "countryRecruitment";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCountryRecruitment()); xsetupOuterJoinCountryRecruitment(); }
        return xgetQueRlMap(prop);
    }
    protected CountryRecruitmentCQ xcreateQueryCountryRecruitment() {
        String nrp = xresolveNRP("country_recruitment_detail", "countryRecruitment"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CountryRecruitmentCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "countryRecruitment", nrp);
    }
    protected void xsetupOuterJoinCountryRecruitment() { xregOutJo("countryRecruitment"); }
    public boolean hasConditionQueryCountryRecruitment() { return xhasQueRlMap("countryRecruitment"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CountryRecruitmentDetailCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CountryRecruitmentDetailCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CountryRecruitmentDetailCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CountryRecruitmentDetailCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CountryRecruitmentDetailCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CountryRecruitmentDetailCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CountryRecruitmentDetailCQ> _myselfExistsMap;
    public Map<String, CountryRecruitmentDetailCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CountryRecruitmentDetailCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CountryRecruitmentDetailCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CountryRecruitmentDetailCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CountryRecruitmentDetailCB.class.getName(); }
    protected String xCQ() { return CountryRecruitmentDetailCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
