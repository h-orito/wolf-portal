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
 * The base condition-query of country.
 * @author DBFlute(AutoGenerator)
 */
public class BsCountryCQ extends AbstractBsCountryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CountryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCountryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from country) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CountryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CountryCIQ xcreateCIQ() {
        CountryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CountryCIQ xnewCIQ() {
        return new CountryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join country on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CountryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CountryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _countryId;
    public ConditionValue xdfgetCountryId()
    { if (_countryId == null) { _countryId = nCV(); }
      return _countryId; }
    protected ConditionValue xgetCValueCountryId() { return xdfgetCountryId(); }

    public Map<String, CountryPlayerCQ> xdfgetCountryId_ExistsReferrer_CountryPlayerList() { return xgetSQueMap("countryId_ExistsReferrer_CountryPlayerList"); }
    public String keepCountryId_ExistsReferrer_CountryPlayerList(CountryPlayerCQ sq) { return xkeepSQue("countryId_ExistsReferrer_CountryPlayerList", sq); }

    public Map<String, CountryProgressCQ> xdfgetCountryId_ExistsReferrer_CountryProgressList() { return xgetSQueMap("countryId_ExistsReferrer_CountryProgressList"); }
    public String keepCountryId_ExistsReferrer_CountryProgressList(CountryProgressCQ sq) { return xkeepSQue("countryId_ExistsReferrer_CountryProgressList", sq); }

    public Map<String, CountryRecruitmentCQ> xdfgetCountryId_ExistsReferrer_CountryRecruitmentList() { return xgetSQueMap("countryId_ExistsReferrer_CountryRecruitmentList"); }
    public String keepCountryId_ExistsReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq) { return xkeepSQue("countryId_ExistsReferrer_CountryRecruitmentList", sq); }

    public Map<String, VillageCQ> xdfgetCountryId_ExistsReferrer_VillageList() { return xgetSQueMap("countryId_ExistsReferrer_VillageList"); }
    public String keepCountryId_ExistsReferrer_VillageList(VillageCQ sq) { return xkeepSQue("countryId_ExistsReferrer_VillageList", sq); }

    public Map<String, CountryPlayerCQ> xdfgetCountryId_NotExistsReferrer_CountryPlayerList() { return xgetSQueMap("countryId_NotExistsReferrer_CountryPlayerList"); }
    public String keepCountryId_NotExistsReferrer_CountryPlayerList(CountryPlayerCQ sq) { return xkeepSQue("countryId_NotExistsReferrer_CountryPlayerList", sq); }

    public Map<String, CountryProgressCQ> xdfgetCountryId_NotExistsReferrer_CountryProgressList() { return xgetSQueMap("countryId_NotExistsReferrer_CountryProgressList"); }
    public String keepCountryId_NotExistsReferrer_CountryProgressList(CountryProgressCQ sq) { return xkeepSQue("countryId_NotExistsReferrer_CountryProgressList", sq); }

    public Map<String, CountryRecruitmentCQ> xdfgetCountryId_NotExistsReferrer_CountryRecruitmentList() { return xgetSQueMap("countryId_NotExistsReferrer_CountryRecruitmentList"); }
    public String keepCountryId_NotExistsReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq) { return xkeepSQue("countryId_NotExistsReferrer_CountryRecruitmentList", sq); }

    public Map<String, VillageCQ> xdfgetCountryId_NotExistsReferrer_VillageList() { return xgetSQueMap("countryId_NotExistsReferrer_VillageList"); }
    public String keepCountryId_NotExistsReferrer_VillageList(VillageCQ sq) { return xkeepSQue("countryId_NotExistsReferrer_VillageList", sq); }

    public Map<String, CountryPlayerCQ> xdfgetCountryId_SpecifyDerivedReferrer_CountryPlayerList() { return xgetSQueMap("countryId_SpecifyDerivedReferrer_CountryPlayerList"); }
    public String keepCountryId_SpecifyDerivedReferrer_CountryPlayerList(CountryPlayerCQ sq) { return xkeepSQue("countryId_SpecifyDerivedReferrer_CountryPlayerList", sq); }

    public Map<String, CountryProgressCQ> xdfgetCountryId_SpecifyDerivedReferrer_CountryProgressList() { return xgetSQueMap("countryId_SpecifyDerivedReferrer_CountryProgressList"); }
    public String keepCountryId_SpecifyDerivedReferrer_CountryProgressList(CountryProgressCQ sq) { return xkeepSQue("countryId_SpecifyDerivedReferrer_CountryProgressList", sq); }

    public Map<String, CountryRecruitmentCQ> xdfgetCountryId_SpecifyDerivedReferrer_CountryRecruitmentList() { return xgetSQueMap("countryId_SpecifyDerivedReferrer_CountryRecruitmentList"); }
    public String keepCountryId_SpecifyDerivedReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq) { return xkeepSQue("countryId_SpecifyDerivedReferrer_CountryRecruitmentList", sq); }

    public Map<String, VillageCQ> xdfgetCountryId_SpecifyDerivedReferrer_VillageList() { return xgetSQueMap("countryId_SpecifyDerivedReferrer_VillageList"); }
    public String keepCountryId_SpecifyDerivedReferrer_VillageList(VillageCQ sq) { return xkeepSQue("countryId_SpecifyDerivedReferrer_VillageList", sq); }

    public Map<String, CountryPlayerCQ> xdfgetCountryId_QueryDerivedReferrer_CountryPlayerList() { return xgetSQueMap("countryId_QueryDerivedReferrer_CountryPlayerList"); }
    public String keepCountryId_QueryDerivedReferrer_CountryPlayerList(CountryPlayerCQ sq) { return xkeepSQue("countryId_QueryDerivedReferrer_CountryPlayerList", sq); }
    public Map<String, Object> xdfgetCountryId_QueryDerivedReferrer_CountryPlayerListParameter() { return xgetSQuePmMap("countryId_QueryDerivedReferrer_CountryPlayerList"); }
    public String keepCountryId_QueryDerivedReferrer_CountryPlayerListParameter(Object pm) { return xkeepSQuePm("countryId_QueryDerivedReferrer_CountryPlayerList", pm); }

    public Map<String, CountryProgressCQ> xdfgetCountryId_QueryDerivedReferrer_CountryProgressList() { return xgetSQueMap("countryId_QueryDerivedReferrer_CountryProgressList"); }
    public String keepCountryId_QueryDerivedReferrer_CountryProgressList(CountryProgressCQ sq) { return xkeepSQue("countryId_QueryDerivedReferrer_CountryProgressList", sq); }
    public Map<String, Object> xdfgetCountryId_QueryDerivedReferrer_CountryProgressListParameter() { return xgetSQuePmMap("countryId_QueryDerivedReferrer_CountryProgressList"); }
    public String keepCountryId_QueryDerivedReferrer_CountryProgressListParameter(Object pm) { return xkeepSQuePm("countryId_QueryDerivedReferrer_CountryProgressList", pm); }

    public Map<String, CountryRecruitmentCQ> xdfgetCountryId_QueryDerivedReferrer_CountryRecruitmentList() { return xgetSQueMap("countryId_QueryDerivedReferrer_CountryRecruitmentList"); }
    public String keepCountryId_QueryDerivedReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq) { return xkeepSQue("countryId_QueryDerivedReferrer_CountryRecruitmentList", sq); }
    public Map<String, Object> xdfgetCountryId_QueryDerivedReferrer_CountryRecruitmentListParameter() { return xgetSQuePmMap("countryId_QueryDerivedReferrer_CountryRecruitmentList"); }
    public String keepCountryId_QueryDerivedReferrer_CountryRecruitmentListParameter(Object pm) { return xkeepSQuePm("countryId_QueryDerivedReferrer_CountryRecruitmentList", pm); }

    public Map<String, VillageCQ> xdfgetCountryId_QueryDerivedReferrer_VillageList() { return xgetSQueMap("countryId_QueryDerivedReferrer_VillageList"); }
    public String keepCountryId_QueryDerivedReferrer_VillageList(VillageCQ sq) { return xkeepSQue("countryId_QueryDerivedReferrer_VillageList", sq); }
    public Map<String, Object> xdfgetCountryId_QueryDerivedReferrer_VillageListParameter() { return xgetSQuePmMap("countryId_QueryDerivedReferrer_VillageList"); }
    public String keepCountryId_QueryDerivedReferrer_VillageListParameter(Object pm) { return xkeepSQuePm("countryId_QueryDerivedReferrer_VillageList", pm); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_CountryId_Asc() { regOBA("COUNTRY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_CountryId_Desc() { regOBD("COUNTRY_ID"); return this; }

    protected ConditionValue _countryName;
    public ConditionValue xdfgetCountryName()
    { if (_countryName == null) { _countryName = nCV(); }
      return _countryName; }
    protected ConditionValue xgetCValueCountryName() { return xdfgetCountryName(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_CountryName_Asc() { regOBA("COUNTRY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_CountryName_Desc() { regOBD("COUNTRY_NAME"); return this; }

    protected ConditionValue _countryTopPageUrl;
    public ConditionValue xdfgetCountryTopPageUrl()
    { if (_countryTopPageUrl == null) { _countryTopPageUrl = nCV(); }
      return _countryTopPageUrl; }
    protected ConditionValue xgetCValueCountryTopPageUrl() { return xdfgetCountryTopPageUrl(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_CountryTopPageUrl_Asc() { regOBA("COUNTRY_TOP_PAGE_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_CountryTopPageUrl_Desc() { regOBD("COUNTRY_TOP_PAGE_URL"); return this; }

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
    public BsCountryCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

    protected ConditionValue _isCrawlFail;
    public ConditionValue xdfgetIsCrawlFail()
    { if (_isCrawlFail == null) { _isCrawlFail = nCV(); }
      return _isCrawlFail; }
    protected ConditionValue xgetCValueIsCrawlFail() { return xdfgetIsCrawlFail(); }

    /**
     * Add order-by as ascend. <br>
     * IS_CRAWL_FAIL: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_IsCrawlFail_Asc() { regOBA("IS_CRAWL_FAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * IS_CRAWL_FAIL: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_IsCrawlFail_Desc() { regOBD("IS_CRAWL_FAIL"); return this; }

    protected ConditionValue _isDisplay;
    public ConditionValue xdfgetIsDisplay()
    { if (_isDisplay == null) { _isDisplay = nCV(); }
      return _isDisplay; }
    protected ConditionValue xgetCValueIsDisplay() { return xdfgetIsDisplay(); }

    /**
     * Add order-by as ascend. <br>
     * IS_DISPLAY: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_IsDisplay_Asc() { regOBA("IS_DISPLAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * IS_DISPLAY: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_IsDisplay_Desc() { regOBD("IS_DISPLAY"); return this; }

    protected ConditionValue _lastUpdateDatetime;
    public ConditionValue xdfgetLastUpdateDatetime()
    { if (_lastUpdateDatetime == null) { _lastUpdateDatetime = nCV(); }
      return _lastUpdateDatetime; }
    protected ConditionValue xgetCValueLastUpdateDatetime() { return xdfgetLastUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_LastUpdateDatetime_Asc() { regOBA("LAST_UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_LastUpdateDatetime_Desc() { regOBD("LAST_UPDATE_DATETIME"); return this; }

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
    public BsCountryCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsCountryCQ addOrderBy_RegisterTrace_Asc() { regOBA("REGISTER_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_RegisterTrace_Desc() { regOBD("REGISTER_TRACE"); return this; }

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
    public BsCountryCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsCountryCQ addOrderBy_UpdateTrace_Asc() { regOBA("UPDATE_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryCQ addOrderBy_UpdateTrace_Desc() { regOBD("UPDATE_TRACE"); return this; }

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
    public BsCountryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCountryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, CountryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CountryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CountryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CountryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CountryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CountryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CountryCQ> _myselfExistsMap;
    public Map<String, CountryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CountryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CountryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CountryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CountryCB.class.getName(); }
    protected String xCQ() { return CountryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
