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
 * The base condition-query of village.
 * @author DBFlute(AutoGenerator)
 */
public class BsVillageCQ extends AbstractBsVillageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VillageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVillageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from village) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VillageCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VillageCIQ xcreateCIQ() {
        VillageCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VillageCIQ xnewCIQ() {
        return new VillageCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join village on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VillageCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VillageCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _villageId;
    public ConditionValue xdfgetVillageId()
    { if (_villageId == null) { _villageId = nCV(); }
      return _villageId; }
    protected ConditionValue xgetCValueVillageId() { return xdfgetVillageId(); }

    public Map<String, VillagePlayerStatsCQ> xdfgetVillageId_ExistsReferrer_VillagePlayerStatsList() { return xgetSQueMap("villageId_ExistsReferrer_VillagePlayerStatsList"); }
    public String keepVillageId_ExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("villageId_ExistsReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetVillageId_NotExistsReferrer_VillagePlayerStatsList() { return xgetSQueMap("villageId_NotExistsReferrer_VillagePlayerStatsList"); }
    public String keepVillageId_NotExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("villageId_NotExistsReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetVillageId_SpecifyDerivedReferrer_VillagePlayerStatsList() { return xgetSQueMap("villageId_SpecifyDerivedReferrer_VillagePlayerStatsList"); }
    public String keepVillageId_SpecifyDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("villageId_SpecifyDerivedReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetVillageId_QueryDerivedReferrer_VillagePlayerStatsList() { return xgetSQueMap("villageId_QueryDerivedReferrer_VillagePlayerStatsList"); }
    public String keepVillageId_QueryDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("villageId_QueryDerivedReferrer_VillagePlayerStatsList", sq); }
    public Map<String, Object> xdfgetVillageId_QueryDerivedReferrer_VillagePlayerStatsListParameter() { return xgetSQuePmMap("villageId_QueryDerivedReferrer_VillagePlayerStatsList"); }
    public String keepVillageId_QueryDerivedReferrer_VillagePlayerStatsListParameter(Object pm) { return xkeepSQuePm("villageId_QueryDerivedReferrer_VillagePlayerStatsList", pm); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageId_Asc() { regOBA("VILLAGE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageId_Desc() { regOBD("VILLAGE_ID"); return this; }

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
    public BsVillageCQ addOrderBy_CountryId_Asc() { regOBA("COUNTRY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_CountryId_Desc() { regOBD("COUNTRY_ID"); return this; }

    protected ConditionValue _villageName;
    public ConditionValue xdfgetVillageName()
    { if (_villageName == null) { _villageName = nCV(); }
      return _villageName; }
    protected ConditionValue xgetCValueVillageName() { return xdfgetVillageName(); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageName_Asc() { regOBA("VILLAGE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageName_Desc() { regOBD("VILLAGE_NAME"); return this; }

    protected ConditionValue _villageNo;
    public ConditionValue xdfgetVillageNo()
    { if (_villageNo == null) { _villageNo = nCV(); }
      return _villageNo; }
    protected ConditionValue xgetCValueVillageNo() { return xdfgetVillageNo(); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageNo_Asc() { regOBA("VILLAGE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageNo_Desc() { regOBD("VILLAGE_NO"); return this; }

    protected ConditionValue _villageUrl;
    public ConditionValue xdfgetVillageUrl()
    { if (_villageUrl == null) { _villageUrl = nCV(); }
      return _villageUrl; }
    protected ConditionValue xgetCValueVillageUrl() { return xdfgetVillageUrl(); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageUrl_Asc() { regOBA("VILLAGE_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageUrl_Desc() { regOBD("VILLAGE_URL"); return this; }

    protected ConditionValue _villageStartDatetime;
    public ConditionValue xdfgetVillageStartDatetime()
    { if (_villageStartDatetime == null) { _villageStartDatetime = nCV(); }
      return _villageStartDatetime; }
    protected ConditionValue xgetCValueVillageStartDatetime() { return xdfgetVillageStartDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageStartDatetime_Asc() { regOBA("VILLAGE_START_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageStartDatetime_Desc() { regOBD("VILLAGE_START_DATETIME"); return this; }

    protected ConditionValue _villageEndDatetime;
    public ConditionValue xdfgetVillageEndDatetime()
    { if (_villageEndDatetime == null) { _villageEndDatetime = nCV(); }
      return _villageEndDatetime; }
    protected ConditionValue xgetCValueVillageEndDatetime() { return xdfgetVillageEndDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageEndDatetime_Asc() { regOBA("VILLAGE_END_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_VillageEndDatetime_Desc() { regOBD("VILLAGE_END_DATETIME"); return this; }

    protected ConditionValue _winCampName;
    public ConditionValue xdfgetWinCampName()
    { if (_winCampName == null) { _winCampName = nCV(); }
      return _winCampName; }
    protected ConditionValue xgetCValueWinCampName() { return xdfgetWinCampName(); }

    /**
     * Add order-by as ascend. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_WinCampName_Asc() { regOBA("WIN_CAMP_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_WinCampName_Desc() { regOBD("WIN_CAMP_NAME"); return this; }

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
    public BsVillageCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsVillageCQ addOrderBy_RegisterTrace_Asc() { regOBA("REGISTER_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_RegisterTrace_Desc() { regOBD("REGISTER_TRACE"); return this; }

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
    public BsVillageCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsVillageCQ addOrderBy_UpdateTrace_Asc() { regOBA("UPDATE_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsVillageCQ addOrderBy_UpdateTrace_Desc() { regOBD("UPDATE_TRACE"); return this; }

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
    public BsVillageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVillageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VillageCQ bq = (VillageCQ)bqs;
        VillageCQ uq = (VillageCQ)uqs;
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
        String nrp = xresolveNRP("village", "country"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, VillageCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VillageCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VillageCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VillageCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VillageCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VillageCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VillageCQ> _myselfExistsMap;
    public Map<String, VillageCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VillageCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VillageCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VillageCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VillageCB.class.getName(); }
    protected String xCQ() { return VillageCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
