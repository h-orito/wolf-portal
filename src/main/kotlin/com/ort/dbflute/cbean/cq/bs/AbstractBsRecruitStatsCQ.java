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
 * The abstract condition-query of recruit_stats.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRecruitStatsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRecruitStatsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "recruit_stats";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsId The value of recruitStatsId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecruitStatsId_Equal(Integer recruitStatsId) {
        doSetRecruitStatsId_Equal(recruitStatsId);
    }

    protected void doSetRecruitStatsId_Equal(Integer recruitStatsId) {
        regRecruitStatsId(CK_EQ, recruitStatsId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsId The value of recruitStatsId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecruitStatsId_NotEqual(Integer recruitStatsId) {
        doSetRecruitStatsId_NotEqual(recruitStatsId);
    }

    protected void doSetRecruitStatsId_NotEqual(Integer recruitStatsId) {
        regRecruitStatsId(CK_NES, recruitStatsId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsId The value of recruitStatsId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecruitStatsId_GreaterThan(Integer recruitStatsId) {
        regRecruitStatsId(CK_GT, recruitStatsId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsId The value of recruitStatsId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecruitStatsId_LessThan(Integer recruitStatsId) {
        regRecruitStatsId(CK_LT, recruitStatsId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsId The value of recruitStatsId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecruitStatsId_GreaterEqual(Integer recruitStatsId) {
        regRecruitStatsId(CK_GE, recruitStatsId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsId The value of recruitStatsId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecruitStatsId_LessEqual(Integer recruitStatsId) {
        regRecruitStatsId(CK_LE, recruitStatsId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of recruitStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of recruitStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRecruitStatsId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRecruitStatsId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of recruitStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of recruitStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRecruitStatsId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRecruitStatsId(), "RECRUIT_STATS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsIdList The collection of recruitStatsId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecruitStatsId_InScope(Collection<Integer> recruitStatsIdList) {
        doSetRecruitStatsId_InScope(recruitStatsIdList);
    }

    protected void doSetRecruitStatsId_InScope(Collection<Integer> recruitStatsIdList) {
        regINS(CK_INS, cTL(recruitStatsIdList), xgetCValueRecruitStatsId(), "RECRUIT_STATS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param recruitStatsIdList The collection of recruitStatsId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecruitStatsId_NotInScope(Collection<Integer> recruitStatsIdList) {
        doSetRecruitStatsId_NotInScope(recruitStatsIdList);
    }

    protected void doSetRecruitStatsId_NotInScope(Collection<Integer> recruitStatsIdList) {
        regINS(CK_NINS, cTL(recruitStatsIdList), xgetCValueRecruitStatsId(), "RECRUIT_STATS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setRecruitStatsId_IsNull() { regRecruitStatsId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setRecruitStatsId_IsNotNull() { regRecruitStatsId(CK_ISNN, DOBJ); }

    protected void regRecruitStatsId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecruitStatsId(), "RECRUIT_STATS_ID"); }
    protected abstract ConditionValue xgetCValueRecruitStatsId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @param statsDatetime The value of statsDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatsDatetime_Equal(java.time.LocalDateTime statsDatetime) {
        regStatsDatetime(CK_EQ,  statsDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @param statsDatetime The value of statsDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatsDatetime_GreaterThan(java.time.LocalDateTime statsDatetime) {
        regStatsDatetime(CK_GT,  statsDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @param statsDatetime The value of statsDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatsDatetime_LessThan(java.time.LocalDateTime statsDatetime) {
        regStatsDatetime(CK_LT,  statsDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @param statsDatetime The value of statsDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatsDatetime_GreaterEqual(java.time.LocalDateTime statsDatetime) {
        regStatsDatetime(CK_GE,  statsDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * @param statsDatetime The value of statsDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStatsDatetime_LessEqual(java.time.LocalDateTime statsDatetime) {
        regStatsDatetime(CK_LE, statsDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setStatsDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statsDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statsDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setStatsDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setStatsDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATS_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setStatsDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statsDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statsDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setStatsDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "STATS_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueStatsDatetime(), nm, op);
    }

    protected void regStatsDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatsDatetime(), "STATS_DATETIME"); }
    protected abstract ConditionValue xgetCValueStatsDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNum The value of villageNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNum_Equal(Integer villageNum) {
        doSetVillageNum_Equal(villageNum);
    }

    protected void doSetVillageNum_Equal(Integer villageNum) {
        regVillageNum(CK_EQ, villageNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNum The value of villageNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNum_NotEqual(Integer villageNum) {
        doSetVillageNum_NotEqual(villageNum);
    }

    protected void doSetVillageNum_NotEqual(Integer villageNum) {
        regVillageNum(CK_NES, villageNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNum The value of villageNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNum_GreaterThan(Integer villageNum) {
        regVillageNum(CK_GT, villageNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNum The value of villageNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNum_LessThan(Integer villageNum) {
        regVillageNum(CK_LT, villageNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNum The value of villageNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNum_GreaterEqual(Integer villageNum) {
        regVillageNum(CK_GE, villageNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNum The value of villageNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNum_LessEqual(Integer villageNum) {
        regVillageNum(CK_LE, villageNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villageNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVillageNum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVillageNum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villageNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVillageNum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVillageNum(), "VILLAGE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNumList The collection of villageNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageNum_InScope(Collection<Integer> villageNumList) {
        doSetVillageNum_InScope(villageNumList);
    }

    protected void doSetVillageNum_InScope(Collection<Integer> villageNumList) {
        regINS(CK_INS, cTL(villageNumList), xgetCValueVillageNum(), "VILLAGE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param villageNumList The collection of villageNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageNum_NotInScope(Collection<Integer> villageNumList) {
        doSetVillageNum_NotInScope(villageNumList);
    }

    protected void doSetVillageNum_NotInScope(Collection<Integer> villageNumList) {
        regINS(CK_NINS, cTL(villageNumList), xgetCValueVillageNum(), "VILLAGE_NUM");
    }

    protected void regVillageNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageNum(), "VILLAGE_NUM"); }
    protected abstract ConditionValue xgetCValueVillageNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNum The value of participateNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateNum_Equal(Integer participateNum) {
        doSetParticipateNum_Equal(participateNum);
    }

    protected void doSetParticipateNum_Equal(Integer participateNum) {
        regParticipateNum(CK_EQ, participateNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNum The value of participateNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateNum_NotEqual(Integer participateNum) {
        doSetParticipateNum_NotEqual(participateNum);
    }

    protected void doSetParticipateNum_NotEqual(Integer participateNum) {
        regParticipateNum(CK_NES, participateNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNum The value of participateNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateNum_GreaterThan(Integer participateNum) {
        regParticipateNum(CK_GT, participateNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNum The value of participateNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateNum_LessThan(Integer participateNum) {
        regParticipateNum(CK_LT, participateNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNum The value of participateNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateNum_GreaterEqual(Integer participateNum) {
        regParticipateNum(CK_GE, participateNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNum The value of participateNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParticipateNum_LessEqual(Integer participateNum) {
        regParticipateNum(CK_LE, participateNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of participateNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of participateNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParticipateNum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParticipateNum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of participateNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of participateNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParticipateNum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParticipateNum(), "PARTICIPATE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNumList The collection of participateNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParticipateNum_InScope(Collection<Integer> participateNumList) {
        doSetParticipateNum_InScope(participateNumList);
    }

    protected void doSetParticipateNum_InScope(Collection<Integer> participateNumList) {
        regINS(CK_INS, cTL(participateNumList), xgetCValueParticipateNum(), "PARTICIPATE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)}
     * @param participateNumList The collection of participateNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParticipateNum_NotInScope(Collection<Integer> participateNumList) {
        doSetParticipateNum_NotInScope(participateNumList);
    }

    protected void doSetParticipateNum_NotInScope(Collection<Integer> participateNumList) {
        regINS(CK_NINS, cTL(participateNumList), xgetCValueParticipateNum(), "PARTICIPATE_NUM");
    }

    protected void regParticipateNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParticipateNum(), "PARTICIPATE_NUM"); }
    protected abstract ConditionValue xgetCValueParticipateNum();

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
    public HpSLCFunction<RecruitStatsCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, RecruitStatsCB.class);
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
    public HpSLCFunction<RecruitStatsCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, RecruitStatsCB.class);
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
    public HpSLCFunction<RecruitStatsCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, RecruitStatsCB.class);
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
    public HpSLCFunction<RecruitStatsCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, RecruitStatsCB.class);
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
    public HpSLCFunction<RecruitStatsCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, RecruitStatsCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RecruitStatsCB&gt;() {
     *     public void query(RecruitStatsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<RecruitStatsCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, RecruitStatsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        RecruitStatsCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(RecruitStatsCQ sq);

    protected RecruitStatsCB xcreateScalarConditionCB() {
        RecruitStatsCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected RecruitStatsCB xcreateScalarConditionPartitionByCB() {
        RecruitStatsCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<RecruitStatsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecruitStatsCB cb = new RecruitStatsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECRUIT_STATS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(RecruitStatsCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RecruitStatsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(RecruitStatsCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RecruitStatsCB cb = new RecruitStatsCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECRUIT_STATS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(RecruitStatsCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<RecruitStatsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RecruitStatsCB cb = new RecruitStatsCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(RecruitStatsCQ sq);

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
    protected RecruitStatsCB newMyCB() {
        return new RecruitStatsCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return RecruitStatsCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
