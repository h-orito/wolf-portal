package com.ort.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.ort.dbflute.allcommon.*;
import com.ort.dbflute.cbean.*;
import com.ort.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of winlose.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWinloseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWinloseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "winlose";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @param winloseCode The value of winloseCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_Equal(String winloseCode) {
        doSetWinloseCode_Equal(fRES(winloseCode));
    }

    /**
     * Equal(=). As WinLose. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setWinloseCode_Equal_AsWinLose(CDef.WinLose cdef) {
        doSetWinloseCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 引分 (DRAW). And OnlyOnceRegistered. <br>
     * 引分
     */
    public void setWinloseCode_Equal_引分() {
        setWinloseCode_Equal_AsWinLose(CDef.WinLose.引分);
    }

    /**
     * Equal(=). As 敗北 (LOSE). And OnlyOnceRegistered. <br>
     * 敗北
     */
    public void setWinloseCode_Equal_敗北() {
        setWinloseCode_Equal_AsWinLose(CDef.WinLose.敗北);
    }

    /**
     * Equal(=). As 勝利 (WIN). And OnlyOnceRegistered. <br>
     * 勝利
     */
    public void setWinloseCode_Equal_勝利() {
        setWinloseCode_Equal_AsWinLose(CDef.WinLose.勝利);
    }

    protected void doSetWinloseCode_Equal(String winloseCode) {
        regWinloseCode(CK_EQ, winloseCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @param winloseCode The value of winloseCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_NotEqual(String winloseCode) {
        doSetWinloseCode_NotEqual(fRES(winloseCode));
    }

    /**
     * NotEqual(&lt;&gt;). As WinLose. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setWinloseCode_NotEqual_AsWinLose(CDef.WinLose cdef) {
        doSetWinloseCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 引分 (DRAW). And OnlyOnceRegistered. <br>
     * 引分
     */
    public void setWinloseCode_NotEqual_引分() {
        setWinloseCode_NotEqual_AsWinLose(CDef.WinLose.引分);
    }

    /**
     * NotEqual(&lt;&gt;). As 敗北 (LOSE). And OnlyOnceRegistered. <br>
     * 敗北
     */
    public void setWinloseCode_NotEqual_敗北() {
        setWinloseCode_NotEqual_AsWinLose(CDef.WinLose.敗北);
    }

    /**
     * NotEqual(&lt;&gt;). As 勝利 (WIN). And OnlyOnceRegistered. <br>
     * 勝利
     */
    public void setWinloseCode_NotEqual_勝利() {
        setWinloseCode_NotEqual_AsWinLose(CDef.WinLose.勝利);
    }

    protected void doSetWinloseCode_NotEqual(String winloseCode) {
        regWinloseCode(CK_NES, winloseCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @param winloseCodeList The collection of winloseCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_InScope(Collection<String> winloseCodeList) {
        doSetWinloseCode_InScope(winloseCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As WinLose. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseCode_InScope_AsWinLose(Collection<CDef.WinLose> cdefList) {
        doSetWinloseCode_InScope(cTStrL(cdefList));
    }

    protected void doSetWinloseCode_InScope(Collection<String> winloseCodeList) {
        regINS(CK_INS, cTL(winloseCodeList), xgetCValueWinloseCode(), "WINLOSE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     * @param winloseCodeList The collection of winloseCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_NotInScope(Collection<String> winloseCodeList) {
        doSetWinloseCode_NotInScope(winloseCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As WinLose. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseCode_NotInScope_AsWinLose(Collection<CDef.WinLose> cdefList) {
        doSetWinloseCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetWinloseCode_NotInScope(Collection<String> winloseCodeList) {
        regINS(CK_NINS, cTL(winloseCodeList), xgetCValueWinloseCode(), "WINLOSE_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select WINLOSE_CODE from village_player_stats where ...)} <br>
     * village_player_stats by WINLOSE_CODE, named 'villagePlayerStatsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVillagePlayerStats</span>(statsCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statsCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VillagePlayerStatsList for 'exists'. (NotNull)
     */
    public void existsVillagePlayerStats(SubQuery<VillagePlayerStatsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepWinloseCode_ExistsReferrer_VillagePlayerStatsList(cb.query());
        registerExistsReferrer(cb.query(), "WINLOSE_CODE", "WINLOSE_CODE", pp, "villagePlayerStatsList");
    }
    public abstract String keepWinloseCode_ExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select WINLOSE_CODE from village_player_stats where ...)} <br>
     * village_player_stats by WINLOSE_CODE, named 'villagePlayerStatsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVillagePlayerStats</span>(statsCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statsCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WinloseCode_NotExistsReferrer_VillagePlayerStatsList for 'not exists'. (NotNull)
     */
    public void notExistsVillagePlayerStats(SubQuery<VillagePlayerStatsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepWinloseCode_NotExistsReferrer_VillagePlayerStatsList(cb.query());
        registerNotExistsReferrer(cb.query(), "WINLOSE_CODE", "WINLOSE_CODE", pp, "villagePlayerStatsList");
    }
    public abstract String keepWinloseCode_NotExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);

    public void xsderiveVillagePlayerStatsList(String fn, SubQuery<VillagePlayerStatsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepWinloseCode_SpecifyDerivedReferrer_VillagePlayerStatsList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "WINLOSE_CODE", "WINLOSE_CODE", pp, "villagePlayerStatsList", al, op);
    }
    public abstract String keepWinloseCode_SpecifyDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from village_player_stats where ...)} <br>
     * village_player_stats by WINLOSE_CODE, named 'villagePlayerStatsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVillagePlayerStats()</span>.<span style="color: #CC4747">max</span>(statsCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statsCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     statsCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VillagePlayerStatsCB> derivedVillagePlayerStats() {
        return xcreateQDRFunctionVillagePlayerStatsList();
    }
    protected HpQDRFunction<VillagePlayerStatsCB> xcreateQDRFunctionVillagePlayerStatsList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVillagePlayerStatsList(fn, sq, rd, vl, op));
    }
    public void xqderiveVillagePlayerStatsList(String fn, SubQuery<VillagePlayerStatsCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepWinloseCode_QueryDerivedReferrer_VillagePlayerStatsList(cb.query()); String prpp = keepWinloseCode_QueryDerivedReferrer_VillagePlayerStatsListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "WINLOSE_CODE", "WINLOSE_CODE", sqpp, "villagePlayerStatsList", rd, vl, prpp, op);
    }
    public abstract String keepWinloseCode_QueryDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);
    public abstract String keepWinloseCode_QueryDerivedReferrer_VillagePlayerStatsListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     */
    public void setWinloseCode_IsNull() { regWinloseCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose}
     */
    public void setWinloseCode_IsNotNull() { regWinloseCode(CK_ISNN, DOBJ); }

    protected void regWinloseCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWinloseCode(), "WINLOSE_CODE"); }
    protected abstract ConditionValue xgetCValueWinloseCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_Equal(String winloseName) {
        doSetWinloseName_Equal(fRES(winloseName));
    }

    protected void doSetWinloseName_Equal(String winloseName) {
        regWinloseName(CK_EQ, winloseName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_NotEqual(String winloseName) {
        doSetWinloseName_NotEqual(fRES(winloseName));
    }

    protected void doSetWinloseName_NotEqual(String winloseName) {
        regWinloseName(CK_NES, winloseName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_GreaterThan(String winloseName) {
        regWinloseName(CK_GT, fRES(winloseName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_LessThan(String winloseName) {
        regWinloseName(CK_LT, fRES(winloseName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_GreaterEqual(String winloseName) {
        regWinloseName(CK_GE, fRES(winloseName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_LessEqual(String winloseName) {
        regWinloseName(CK_LE, fRES(winloseName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseNameList The collection of winloseName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_InScope(Collection<String> winloseNameList) {
        doSetWinloseName_InScope(winloseNameList);
    }

    protected void doSetWinloseName_InScope(Collection<String> winloseNameList) {
        regINS(CK_INS, cTL(winloseNameList), xgetCValueWinloseName(), "WINLOSE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseNameList The collection of winloseName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinloseName_NotInScope(Collection<String> winloseNameList) {
        doSetWinloseName_NotInScope(winloseNameList);
    }

    protected void doSetWinloseName_NotInScope(Collection<String> winloseNameList) {
        regINS(CK_NINS, cTL(winloseNameList), xgetCValueWinloseName(), "WINLOSE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setWinloseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param winloseName The value of winloseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWinloseName_LikeSearch(String winloseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWinloseName_LikeSearch(winloseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setWinloseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param winloseName The value of winloseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setWinloseName_LikeSearch(String winloseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(winloseName), xgetCValueWinloseName(), "WINLOSE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWinloseName_NotLikeSearch(String winloseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWinloseName_NotLikeSearch(winloseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WINLOSE_NAME: {NotNull, VARCHAR(255)}
     * @param winloseName The value of winloseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setWinloseName_NotLikeSearch(String winloseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(winloseName), xgetCValueWinloseName(), "WINLOSE_NAME", likeSearchOption);
    }

    protected void regWinloseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWinloseName(), "WINLOSE_NAME"); }
    protected abstract ConditionValue xgetCValueWinloseName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WinloseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WinloseCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WinloseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WinloseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WinloseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WinloseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WinloseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WinloseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WinloseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WinloseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WinloseCB&gt;() {
     *     public void query(WinloseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WinloseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WinloseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WinloseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WinloseCQ sq);

    protected WinloseCB xcreateScalarConditionCB() {
        WinloseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WinloseCB xcreateScalarConditionPartitionByCB() {
        WinloseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WinloseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WinloseCB cb = new WinloseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WINLOSE_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WinloseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WinloseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WinloseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WinloseCB cb = new WinloseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WINLOSE_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WinloseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WinloseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WinloseCB cb = new WinloseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WinloseCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WinloseCB newMyCB() {
        return new WinloseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WinloseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
