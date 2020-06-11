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
 * The base condition-query of country_progress.
 * @author DBFlute(AutoGenerator)
 */
public class BsCountryProgressCQ extends AbstractBsCountryProgressCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CountryProgressCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCountryProgressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from country_progress) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CountryProgressCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CountryProgressCIQ xcreateCIQ() {
        CountryProgressCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CountryProgressCIQ xnewCIQ() {
        return new CountryProgressCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join country_progress on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CountryProgressCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CountryProgressCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _countryProgressId;
    public ConditionValue xdfgetCountryProgressId()
    { if (_countryProgressId == null) { _countryProgressId = nCV(); }
      return _countryProgressId; }
    protected ConditionValue xgetCValueCountryProgressId() { return xdfgetCountryProgressId(); }

    public Map<String, CountryProgressDetailCQ> xdfgetCountryProgressId_ExistsReferrer_CountryProgressDetailList() { return xgetSQueMap("countryProgressId_ExistsReferrer_CountryProgressDetailList"); }
    public String keepCountryProgressId_ExistsReferrer_CountryProgressDetailList(CountryProgressDetailCQ sq) { return xkeepSQue("countryProgressId_ExistsReferrer_CountryProgressDetailList", sq); }

    public Map<String, CountryProgressDetailCQ> xdfgetCountryProgressId_NotExistsReferrer_CountryProgressDetailList() { return xgetSQueMap("countryProgressId_NotExistsReferrer_CountryProgressDetailList"); }
    public String keepCountryProgressId_NotExistsReferrer_CountryProgressDetailList(CountryProgressDetailCQ sq) { return xkeepSQue("countryProgressId_NotExistsReferrer_CountryProgressDetailList", sq); }

    public Map<String, CountryProgressDetailCQ> xdfgetCountryProgressId_SpecifyDerivedReferrer_CountryProgressDetailList() { return xgetSQueMap("countryProgressId_SpecifyDerivedReferrer_CountryProgressDetailList"); }
    public String keepCountryProgressId_SpecifyDerivedReferrer_CountryProgressDetailList(CountryProgressDetailCQ sq) { return xkeepSQue("countryProgressId_SpecifyDerivedReferrer_CountryProgressDetailList", sq); }

    public Map<String, CountryProgressDetailCQ> xdfgetCountryProgressId_QueryDerivedReferrer_CountryProgressDetailList() { return xgetSQueMap("countryProgressId_QueryDerivedReferrer_CountryProgressDetailList"); }
    public String keepCountryProgressId_QueryDerivedReferrer_CountryProgressDetailList(CountryProgressDetailCQ sq) { return xkeepSQue("countryProgressId_QueryDerivedReferrer_CountryProgressDetailList", sq); }
    public Map<String, Object> xdfgetCountryProgressId_QueryDerivedReferrer_CountryProgressDetailListParameter() { return xgetSQuePmMap("countryProgressId_QueryDerivedReferrer_CountryProgressDetailList"); }
    public String keepCountryProgressId_QueryDerivedReferrer_CountryProgressDetailListParameter(Object pm) { return xkeepSQuePm("countryProgressId_QueryDerivedReferrer_CountryProgressDetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_PROGRESS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_CountryProgressId_Asc() { regOBA("COUNTRY_PROGRESS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_PROGRESS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_CountryProgressId_Desc() { regOBD("COUNTRY_PROGRESS_ID"); return this; }

    protected ConditionValue _countryId;
    public ConditionValue xdfgetCountryId()
    { if (_countryId == null) { _countryId = nCV(); }
      return _countryId; }
    protected ConditionValue xgetCValueCountryId() { return xdfgetCountryId(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_CountryId_Asc() { regOBA("COUNTRY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_CountryId_Desc() { regOBD("COUNTRY_ID"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /**
     * Add order-by as ascend. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerTrace;
    public ConditionValue xdfgetRegisterTrace()
    { if (_registerTrace == null) { _registerTrace = nCV(); }
      return _registerTrace; }
    protected ConditionValue xgetCValueRegisterTrace() { return xdfgetRegisterTrace(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_RegisterTrace_Asc() { regOBA("REGISTER_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_RegisterTrace_Desc() { regOBD("REGISTER_TRACE"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateTrace;
    public ConditionValue xdfgetUpdateTrace()
    { if (_updateTrace == null) { _updateTrace = nCV(); }
      return _updateTrace; }
    protected ConditionValue xgetCValueUpdateTrace() { return xdfgetUpdateTrace(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_UpdateTrace_Asc() { regOBA("UPDATE_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryProgressCQ addOrderBy_UpdateTrace_Desc() { regOBD("UPDATE_TRACE"); return this; }

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
    public BsCountryProgressCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCountryProgressCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CountryProgressCQ bq = (CountryProgressCQ)bqs;
        CountryProgressCQ uq = (CountryProgressCQ)uqs;
        if (bq.hasConditionQueryCountry()) {
            uq.queryCountry().reflectRelationOnUnionQuery(bq.queryCountry(), uq.queryCountry());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * COUNTRY by my COUNTRY_ID, named 'country'.
     * @return The instance of condition-query. (NotNull)
     */
    public CountryCQ queryCountry() {
        return xdfgetConditionQueryCountry();
    }
    public CountryCQ xdfgetConditionQueryCountry() {
        String prop = "country";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCountry()); xsetupOuterJoinCountry(); }
        return xgetQueRlMap(prop);
    }
    protected CountryCQ xcreateQueryCountry() {
        String nrp = xresolveNRP("country_progress", "country"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CountryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "country", nrp);
    }
    protected void xsetupOuterJoinCountry() { xregOutJo("country"); }
    public boolean hasConditionQueryCountry() { return xhasQueRlMap("country"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CountryProgressCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CountryProgressCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CountryProgressCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CountryProgressCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CountryProgressCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CountryProgressCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CountryProgressCQ> _myselfExistsMap;
    public Map<String, CountryProgressCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CountryProgressCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CountryProgressCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CountryProgressCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CountryProgressCB.class.getName(); }
    protected String xCQ() { return CountryProgressCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
