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
 * The base condition-query of country_recruitment.
 * @author DBFlute(AutoGenerator)
 */
public class BsCountryRecruitmentCQ extends AbstractBsCountryRecruitmentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CountryRecruitmentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCountryRecruitmentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from country_recruitment) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CountryRecruitmentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CountryRecruitmentCIQ xcreateCIQ() {
        CountryRecruitmentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CountryRecruitmentCIQ xnewCIQ() {
        return new CountryRecruitmentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join country_recruitment on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CountryRecruitmentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CountryRecruitmentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _countryRecruitmentId;
    public ConditionValue xdfgetCountryRecruitmentId()
    { if (_countryRecruitmentId == null) { _countryRecruitmentId = nCV(); }
      return _countryRecruitmentId; }
    protected ConditionValue xgetCValueCountryRecruitmentId() { return xdfgetCountryRecruitmentId(); }

    public Map<String, CountryRecruitmentDetailCQ> xdfgetCountryRecruitmentId_ExistsReferrer_CountryRecruitmentDetailList() { return xgetSQueMap("countryRecruitmentId_ExistsReferrer_CountryRecruitmentDetailList"); }
    public String keepCountryRecruitmentId_ExistsReferrer_CountryRecruitmentDetailList(CountryRecruitmentDetailCQ sq) { return xkeepSQue("countryRecruitmentId_ExistsReferrer_CountryRecruitmentDetailList", sq); }

    public Map<String, CountryRecruitmentDetailCQ> xdfgetCountryRecruitmentId_NotExistsReferrer_CountryRecruitmentDetailList() { return xgetSQueMap("countryRecruitmentId_NotExistsReferrer_CountryRecruitmentDetailList"); }
    public String keepCountryRecruitmentId_NotExistsReferrer_CountryRecruitmentDetailList(CountryRecruitmentDetailCQ sq) { return xkeepSQue("countryRecruitmentId_NotExistsReferrer_CountryRecruitmentDetailList", sq); }

    public Map<String, CountryRecruitmentDetailCQ> xdfgetCountryRecruitmentId_SpecifyDerivedReferrer_CountryRecruitmentDetailList() { return xgetSQueMap("countryRecruitmentId_SpecifyDerivedReferrer_CountryRecruitmentDetailList"); }
    public String keepCountryRecruitmentId_SpecifyDerivedReferrer_CountryRecruitmentDetailList(CountryRecruitmentDetailCQ sq) { return xkeepSQue("countryRecruitmentId_SpecifyDerivedReferrer_CountryRecruitmentDetailList", sq); }

    public Map<String, CountryRecruitmentDetailCQ> xdfgetCountryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailList() { return xgetSQueMap("countryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailList"); }
    public String keepCountryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailList(CountryRecruitmentDetailCQ sq) { return xkeepSQue("countryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailList", sq); }
    public Map<String, Object> xdfgetCountryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailListParameter() { return xgetSQuePmMap("countryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailList"); }
    public String keepCountryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailListParameter(Object pm) { return xkeepSQuePm("countryRecruitmentId_QueryDerivedReferrer_CountryRecruitmentDetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_RECRUITMENT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_CountryRecruitmentId_Asc() { regOBA("COUNTRY_RECRUITMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_RECRUITMENT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_CountryRecruitmentId_Desc() { regOBD("COUNTRY_RECRUITMENT_ID"); return this; }

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
    public BsCountryRecruitmentCQ addOrderBy_CountryId_Asc() { regOBA("COUNTRY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_CountryId_Desc() { regOBD("COUNTRY_ID"); return this; }

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
    public BsCountryRecruitmentCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsCountryRecruitmentCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsCountryRecruitmentCQ addOrderBy_RegisterTrace_Asc() { regOBA("REGISTER_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_RegisterTrace_Desc() { regOBD("REGISTER_TRACE"); return this; }

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
    public BsCountryRecruitmentCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsCountryRecruitmentCQ addOrderBy_UpdateTrace_Asc() { regOBA("UPDATE_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryRecruitmentCQ addOrderBy_UpdateTrace_Desc() { regOBD("UPDATE_TRACE"); return this; }

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
    public BsCountryRecruitmentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCountryRecruitmentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CountryRecruitmentCQ bq = (CountryRecruitmentCQ)bqs;
        CountryRecruitmentCQ uq = (CountryRecruitmentCQ)uqs;
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
        String nrp = xresolveNRP("country_recruitment", "country"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, CountryRecruitmentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CountryRecruitmentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CountryRecruitmentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CountryRecruitmentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CountryRecruitmentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CountryRecruitmentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CountryRecruitmentCQ> _myselfExistsMap;
    public Map<String, CountryRecruitmentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CountryRecruitmentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CountryRecruitmentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CountryRecruitmentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CountryRecruitmentCB.class.getName(); }
    protected String xCQ() { return CountryRecruitmentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
