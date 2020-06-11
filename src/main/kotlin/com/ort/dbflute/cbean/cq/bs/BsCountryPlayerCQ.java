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
 * The base condition-query of country_player.
 * @author DBFlute(AutoGenerator)
 */
public class BsCountryPlayerCQ extends AbstractBsCountryPlayerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CountryPlayerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCountryPlayerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from country_player) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CountryPlayerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CountryPlayerCIQ xcreateCIQ() {
        CountryPlayerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CountryPlayerCIQ xnewCIQ() {
        return new CountryPlayerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join country_player on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CountryPlayerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CountryPlayerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _countryPlayerId;
    public ConditionValue xdfgetCountryPlayerId()
    { if (_countryPlayerId == null) { _countryPlayerId = nCV(); }
      return _countryPlayerId; }
    protected ConditionValue xgetCValueCountryPlayerId() { return xdfgetCountryPlayerId(); }

    public Map<String, VillagePlayerStatsCQ> xdfgetCountryPlayerId_ExistsReferrer_VillagePlayerStatsList() { return xgetSQueMap("countryPlayerId_ExistsReferrer_VillagePlayerStatsList"); }
    public String keepCountryPlayerId_ExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("countryPlayerId_ExistsReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetCountryPlayerId_NotExistsReferrer_VillagePlayerStatsList() { return xgetSQueMap("countryPlayerId_NotExistsReferrer_VillagePlayerStatsList"); }
    public String keepCountryPlayerId_NotExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("countryPlayerId_NotExistsReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetCountryPlayerId_SpecifyDerivedReferrer_VillagePlayerStatsList() { return xgetSQueMap("countryPlayerId_SpecifyDerivedReferrer_VillagePlayerStatsList"); }
    public String keepCountryPlayerId_SpecifyDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("countryPlayerId_SpecifyDerivedReferrer_VillagePlayerStatsList", sq); }

    public Map<String, VillagePlayerStatsCQ> xdfgetCountryPlayerId_QueryDerivedReferrer_VillagePlayerStatsList() { return xgetSQueMap("countryPlayerId_QueryDerivedReferrer_VillagePlayerStatsList"); }
    public String keepCountryPlayerId_QueryDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq) { return xkeepSQue("countryPlayerId_QueryDerivedReferrer_VillagePlayerStatsList", sq); }
    public Map<String, Object> xdfgetCountryPlayerId_QueryDerivedReferrer_VillagePlayerStatsListParameter() { return xgetSQuePmMap("countryPlayerId_QueryDerivedReferrer_VillagePlayerStatsList"); }
    public String keepCountryPlayerId_QueryDerivedReferrer_VillagePlayerStatsListParameter(Object pm) { return xkeepSQuePm("countryPlayerId_QueryDerivedReferrer_VillagePlayerStatsList", pm); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_PLAYER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_CountryPlayerId_Asc() { regOBA("COUNTRY_PLAYER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_PLAYER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_CountryPlayerId_Desc() { regOBD("COUNTRY_PLAYER_ID"); return this; }

    protected ConditionValue _countryId;
    public ConditionValue xdfgetCountryId()
    { if (_countryId == null) { _countryId = nCV(); }
      return _countryId; }
    protected ConditionValue xgetCValueCountryId() { return xdfgetCountryId(); }

    /**
     * Add order-by as ascend. <br>
     * COUNTRY_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_CountryId_Asc() { regOBA("COUNTRY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNTRY_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_CountryId_Desc() { regOBD("COUNTRY_ID"); return this; }

    protected ConditionValue _playerId;
    public ConditionValue xdfgetPlayerId()
    { if (_playerId == null) { _playerId = nCV(); }
      return _playerId; }
    protected ConditionValue xgetCValuePlayerId() { return xdfgetPlayerId(); }

    /**
     * Add order-by as ascend. <br>
     * PLAYER_ID: {IX, NotNull, INT UNSIGNED(10), FK to player}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_PlayerId_Asc() { regOBA("PLAYER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAYER_ID: {IX, NotNull, INT UNSIGNED(10), FK to player}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_PlayerId_Desc() { regOBD("PLAYER_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {+UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {+UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

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
    public BsCountryPlayerCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsCountryPlayerCQ addOrderBy_RegisterTrace_Asc() { regOBA("REGISTER_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_RegisterTrace_Desc() { regOBD("REGISTER_TRACE"); return this; }

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
    public BsCountryPlayerCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsCountryPlayerCQ addOrderBy_UpdateTrace_Asc() { regOBA("UPDATE_TRACE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsCountryPlayerCQ addOrderBy_UpdateTrace_Desc() { regOBD("UPDATE_TRACE"); return this; }

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
    public BsCountryPlayerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCountryPlayerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CountryPlayerCQ bq = (CountryPlayerCQ)bqs;
        CountryPlayerCQ uq = (CountryPlayerCQ)uqs;
        if (bq.hasConditionQueryCountry()) {
            uq.queryCountry().reflectRelationOnUnionQuery(bq.queryCountry(), uq.queryCountry());
        }
        if (bq.hasConditionQueryPlayer()) {
            uq.queryPlayer().reflectRelationOnUnionQuery(bq.queryPlayer(), uq.queryPlayer());
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
        String nrp = xresolveNRP("country_player", "country"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CountryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "country", nrp);
    }
    protected void xsetupOuterJoinCountry() { xregOutJo("country"); }
    public boolean hasConditionQueryCountry() { return xhasQueRlMap("country"); }

    /**
     * Get the condition-query for relation table. <br>
     * PLAYER by my PLAYER_ID, named 'player'.
     * @return The instance of condition-query. (NotNull)
     */
    public PlayerCQ queryPlayer() {
        return xdfgetConditionQueryPlayer();
    }
    public PlayerCQ xdfgetConditionQueryPlayer() {
        String prop = "player";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPlayer()); xsetupOuterJoinPlayer(); }
        return xgetQueRlMap(prop);
    }
    protected PlayerCQ xcreateQueryPlayer() {
        String nrp = xresolveNRP("country_player", "player"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PlayerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "player", nrp);
    }
    protected void xsetupOuterJoinPlayer() { xregOutJo("player"); }
    public boolean hasConditionQueryPlayer() { return xhasQueRlMap("player"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CountryPlayerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CountryPlayerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CountryPlayerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CountryPlayerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CountryPlayerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CountryPlayerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CountryPlayerCQ> _myselfExistsMap;
    public Map<String, CountryPlayerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CountryPlayerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CountryPlayerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CountryPlayerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CountryPlayerCB.class.getName(); }
    protected String xCQ() { return CountryPlayerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
