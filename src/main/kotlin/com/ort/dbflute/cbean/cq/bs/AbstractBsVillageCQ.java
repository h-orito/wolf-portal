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
 * The abstract condition-query of village.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVillageCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVillageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "village";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageId The value of villageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_Equal(Integer villageId) {
        doSetVillageId_Equal(villageId);
    }

    protected void doSetVillageId_Equal(Integer villageId) {
        regVillageId(CK_EQ, villageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageId The value of villageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_NotEqual(Integer villageId) {
        doSetVillageId_NotEqual(villageId);
    }

    protected void doSetVillageId_NotEqual(Integer villageId) {
        regVillageId(CK_NES, villageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageId The value of villageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_GreaterThan(Integer villageId) {
        regVillageId(CK_GT, villageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageId The value of villageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_LessThan(Integer villageId) {
        regVillageId(CK_LT, villageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageId The value of villageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_GreaterEqual(Integer villageId) {
        regVillageId(CK_GE, villageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageId The value of villageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_LessEqual(Integer villageId) {
        regVillageId(CK_LE, villageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVillageId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVillageId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVillageId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVillageId(), "VILLAGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageIdList The collection of villageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageId_InScope(Collection<Integer> villageIdList) {
        doSetVillageId_InScope(villageIdList);
    }

    protected void doSetVillageId_InScope(Collection<Integer> villageIdList) {
        regINS(CK_INS, cTL(villageIdList), xgetCValueVillageId(), "VILLAGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villageIdList The collection of villageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageId_NotInScope(Collection<Integer> villageIdList) {
        doSetVillageId_NotInScope(villageIdList);
    }

    protected void doSetVillageId_NotInScope(Collection<Integer> villageIdList) {
        regINS(CK_NINS, cTL(villageIdList), xgetCValueVillageId(), "VILLAGE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select VILLAGE_ID from village_player_stats where ...)} <br>
     * village_player_stats by VILLAGE_ID, named 'villagePlayerStatsAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepVillageId_ExistsReferrer_VillagePlayerStatsList(cb.query());
        registerExistsReferrer(cb.query(), "VILLAGE_ID", "VILLAGE_ID", pp, "villagePlayerStatsList");
    }
    public abstract String keepVillageId_ExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select VILLAGE_ID from village_player_stats where ...)} <br>
     * village_player_stats by VILLAGE_ID, named 'villagePlayerStatsAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVillagePlayerStats</span>(statsCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statsCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VillageId_NotExistsReferrer_VillagePlayerStatsList for 'not exists'. (NotNull)
     */
    public void notExistsVillagePlayerStats(SubQuery<VillagePlayerStatsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepVillageId_NotExistsReferrer_VillagePlayerStatsList(cb.query());
        registerNotExistsReferrer(cb.query(), "VILLAGE_ID", "VILLAGE_ID", pp, "villagePlayerStatsList");
    }
    public abstract String keepVillageId_NotExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);

    public void xsderiveVillagePlayerStatsList(String fn, SubQuery<VillagePlayerStatsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepVillageId_SpecifyDerivedReferrer_VillagePlayerStatsList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "VILLAGE_ID", "VILLAGE_ID", pp, "villagePlayerStatsList", al, op);
    }
    public abstract String keepVillageId_SpecifyDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from village_player_stats where ...)} <br>
     * village_player_stats by VILLAGE_ID, named 'villagePlayerStatsAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepVillageId_QueryDerivedReferrer_VillagePlayerStatsList(cb.query()); String prpp = keepVillageId_QueryDerivedReferrer_VillagePlayerStatsListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "VILLAGE_ID", "VILLAGE_ID", sqpp, "villagePlayerStatsList", rd, vl, prpp, op);
    }
    public abstract String keepVillageId_QueryDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq);
    public abstract String keepVillageId_QueryDerivedReferrer_VillagePlayerStatsListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setVillageId_IsNull() { regVillageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setVillageId_IsNotNull() { regVillageId(CK_ISNN, DOBJ); }

    protected void regVillageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageId(), "VILLAGE_ID"); }
    protected abstract ConditionValue xgetCValueVillageId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryId The value of countryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_Equal(Integer countryId) {
        doSetCountryId_Equal(countryId);
    }

    protected void doSetCountryId_Equal(Integer countryId) {
        regCountryId(CK_EQ, countryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryId The value of countryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_NotEqual(Integer countryId) {
        doSetCountryId_NotEqual(countryId);
    }

    protected void doSetCountryId_NotEqual(Integer countryId) {
        regCountryId(CK_NES, countryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryId The value of countryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_GreaterThan(Integer countryId) {
        regCountryId(CK_GT, countryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryId The value of countryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_LessThan(Integer countryId) {
        regCountryId(CK_LT, countryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryId The value of countryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_GreaterEqual(Integer countryId) {
        regCountryId(CK_GE, countryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryId The value of countryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_LessEqual(Integer countryId) {
        regCountryId(CK_LE, countryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param minNumber The min number of countryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCountryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCountryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param minNumber The min number of countryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCountryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCountryId(), "COUNTRY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryIdList The collection of countryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryId_InScope(Collection<Integer> countryIdList) {
        doSetCountryId_InScope(countryIdList);
    }

    protected void doSetCountryId_InScope(Collection<Integer> countryIdList) {
        regINS(CK_INS, cTL(countryIdList), xgetCValueCountryId(), "COUNTRY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country}
     * @param countryIdList The collection of countryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryId_NotInScope(Collection<Integer> countryIdList) {
        doSetCountryId_NotInScope(countryIdList);
    }

    protected void doSetCountryId_NotInScope(Collection<Integer> countryIdList) {
        regINS(CK_NINS, cTL(countryIdList), xgetCValueCountryId(), "COUNTRY_ID");
    }

    protected void regCountryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryId(), "COUNTRY_ID"); }
    protected abstract ConditionValue xgetCValueCountryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_Equal(String villageName) {
        doSetVillageName_Equal(fRES(villageName));
    }

    protected void doSetVillageName_Equal(String villageName) {
        regVillageName(CK_EQ, villageName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_NotEqual(String villageName) {
        doSetVillageName_NotEqual(fRES(villageName));
    }

    protected void doSetVillageName_NotEqual(String villageName) {
        regVillageName(CK_NES, villageName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_GreaterThan(String villageName) {
        regVillageName(CK_GT, fRES(villageName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_LessThan(String villageName) {
        regVillageName(CK_LT, fRES(villageName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_GreaterEqual(String villageName) {
        regVillageName(CK_GE, fRES(villageName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_LessEqual(String villageName) {
        regVillageName(CK_LE, fRES(villageName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageNameList The collection of villageName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_InScope(Collection<String> villageNameList) {
        doSetVillageName_InScope(villageNameList);
    }

    protected void doSetVillageName_InScope(Collection<String> villageNameList) {
        regINS(CK_INS, cTL(villageNameList), xgetCValueVillageName(), "VILLAGE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageNameList The collection of villageName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageName_NotInScope(Collection<String> villageNameList) {
        doSetVillageName_NotInScope(villageNameList);
    }

    protected void doSetVillageName_NotInScope(Collection<String> villageNameList) {
        regINS(CK_NINS, cTL(villageNameList), xgetCValueVillageName(), "VILLAGE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setVillageName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param villageName The value of villageName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVillageName_LikeSearch(String villageName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVillageName_LikeSearch(villageName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setVillageName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param villageName The value of villageName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setVillageName_LikeSearch(String villageName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(villageName), xgetCValueVillageName(), "VILLAGE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVillageName_NotLikeSearch(String villageName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVillageName_NotLikeSearch(villageName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_NAME: {NotNull, VARCHAR(255)}
     * @param villageName The value of villageName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setVillageName_NotLikeSearch(String villageName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(villageName), xgetCValueVillageName(), "VILLAGE_NAME", likeSearchOption);
    }

    protected void regVillageName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageName(), "VILLAGE_NAME"); }
    protected abstract ConditionValue xgetCValueVillageName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNo The value of villageNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNo_Equal(Integer villageNo) {
        doSetVillageNo_Equal(villageNo);
    }

    protected void doSetVillageNo_Equal(Integer villageNo) {
        regVillageNo(CK_EQ, villageNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNo The value of villageNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNo_NotEqual(Integer villageNo) {
        doSetVillageNo_NotEqual(villageNo);
    }

    protected void doSetVillageNo_NotEqual(Integer villageNo) {
        regVillageNo(CK_NES, villageNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNo The value of villageNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNo_GreaterThan(Integer villageNo) {
        regVillageNo(CK_GT, villageNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNo The value of villageNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNo_LessThan(Integer villageNo) {
        regVillageNo(CK_LT, villageNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNo The value of villageNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNo_GreaterEqual(Integer villageNo) {
        regVillageNo(CK_GE, villageNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNo The value of villageNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageNo_LessEqual(Integer villageNo) {
        regVillageNo(CK_LE, villageNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villageNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVillageNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVillageNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villageNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVillageNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVillageNo(), "VILLAGE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNoList The collection of villageNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageNo_InScope(Collection<Integer> villageNoList) {
        doSetVillageNo_InScope(villageNoList);
    }

    protected void doSetVillageNo_InScope(Collection<Integer> villageNoList) {
        regINS(CK_INS, cTL(villageNoList), xgetCValueVillageNo(), "VILLAGE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_NO: {NotNull, INT UNSIGNED(10)}
     * @param villageNoList The collection of villageNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageNo_NotInScope(Collection<Integer> villageNoList) {
        doSetVillageNo_NotInScope(villageNoList);
    }

    protected void doSetVillageNo_NotInScope(Collection<Integer> villageNoList) {
        regINS(CK_NINS, cTL(villageNoList), xgetCValueVillageNo(), "VILLAGE_NO");
    }

    protected void regVillageNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageNo(), "VILLAGE_NO"); }
    protected abstract ConditionValue xgetCValueVillageNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_Equal(String villageUrl) {
        doSetVillageUrl_Equal(fRES(villageUrl));
    }

    protected void doSetVillageUrl_Equal(String villageUrl) {
        regVillageUrl(CK_EQ, villageUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_NotEqual(String villageUrl) {
        doSetVillageUrl_NotEqual(fRES(villageUrl));
    }

    protected void doSetVillageUrl_NotEqual(String villageUrl) {
        regVillageUrl(CK_NES, villageUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_GreaterThan(String villageUrl) {
        regVillageUrl(CK_GT, fRES(villageUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_LessThan(String villageUrl) {
        regVillageUrl(CK_LT, fRES(villageUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_GreaterEqual(String villageUrl) {
        regVillageUrl(CK_GE, fRES(villageUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_LessEqual(String villageUrl) {
        regVillageUrl(CK_LE, fRES(villageUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrlList The collection of villageUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_InScope(Collection<String> villageUrlList) {
        doSetVillageUrl_InScope(villageUrlList);
    }

    protected void doSetVillageUrl_InScope(Collection<String> villageUrlList) {
        regINS(CK_INS, cTL(villageUrlList), xgetCValueVillageUrl(), "VILLAGE_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrlList The collection of villageUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageUrl_NotInScope(Collection<String> villageUrlList) {
        doSetVillageUrl_NotInScope(villageUrlList);
    }

    protected void doSetVillageUrl_NotInScope(Collection<String> villageUrlList) {
        regINS(CK_NINS, cTL(villageUrlList), xgetCValueVillageUrl(), "VILLAGE_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setVillageUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param villageUrl The value of villageUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVillageUrl_LikeSearch(String villageUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVillageUrl_LikeSearch(villageUrl, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setVillageUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param villageUrl The value of villageUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setVillageUrl_LikeSearch(String villageUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(villageUrl), xgetCValueVillageUrl(), "VILLAGE_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVillageUrl_NotLikeSearch(String villageUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVillageUrl_NotLikeSearch(villageUrl, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VILLAGE_URL: {NotNull, VARCHAR(255)}
     * @param villageUrl The value of villageUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setVillageUrl_NotLikeSearch(String villageUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(villageUrl), xgetCValueVillageUrl(), "VILLAGE_URL", likeSearchOption);
    }

    protected void regVillageUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageUrl(), "VILLAGE_URL"); }
    protected abstract ConditionValue xgetCValueVillageUrl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @param villageStartDatetime The value of villageStartDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageStartDatetime_Equal(java.time.LocalDateTime villageStartDatetime) {
        regVillageStartDatetime(CK_EQ,  villageStartDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @param villageStartDatetime The value of villageStartDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageStartDatetime_GreaterThan(java.time.LocalDateTime villageStartDatetime) {
        regVillageStartDatetime(CK_GT,  villageStartDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @param villageStartDatetime The value of villageStartDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageStartDatetime_LessThan(java.time.LocalDateTime villageStartDatetime) {
        regVillageStartDatetime(CK_LT,  villageStartDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @param villageStartDatetime The value of villageStartDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageStartDatetime_GreaterEqual(java.time.LocalDateTime villageStartDatetime) {
        regVillageStartDatetime(CK_GE,  villageStartDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * @param villageStartDatetime The value of villageStartDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageStartDatetime_LessEqual(java.time.LocalDateTime villageStartDatetime) {
        regVillageStartDatetime(CK_LE, villageStartDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * <pre>e.g. setVillageStartDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setVillageStartDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setVillageStartDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     * <pre>e.g. setVillageStartDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setVillageStartDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "VILLAGE_START_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueVillageStartDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     */
    public void setVillageStartDatetime_IsNull() { regVillageStartDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VILLAGE_START_DATETIME: {DATETIME(19)}
     */
    public void setVillageStartDatetime_IsNotNull() { regVillageStartDatetime(CK_ISNN, DOBJ); }

    protected void regVillageStartDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageStartDatetime(), "VILLAGE_START_DATETIME"); }
    protected abstract ConditionValue xgetCValueVillageStartDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @param villageEndDatetime The value of villageEndDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageEndDatetime_Equal(java.time.LocalDateTime villageEndDatetime) {
        regVillageEndDatetime(CK_EQ,  villageEndDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @param villageEndDatetime The value of villageEndDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageEndDatetime_GreaterThan(java.time.LocalDateTime villageEndDatetime) {
        regVillageEndDatetime(CK_GT,  villageEndDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @param villageEndDatetime The value of villageEndDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageEndDatetime_LessThan(java.time.LocalDateTime villageEndDatetime) {
        regVillageEndDatetime(CK_LT,  villageEndDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @param villageEndDatetime The value of villageEndDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageEndDatetime_GreaterEqual(java.time.LocalDateTime villageEndDatetime) {
        regVillageEndDatetime(CK_GE,  villageEndDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * @param villageEndDatetime The value of villageEndDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageEndDatetime_LessEqual(java.time.LocalDateTime villageEndDatetime) {
        regVillageEndDatetime(CK_LE, villageEndDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * <pre>e.g. setVillageEndDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setVillageEndDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setVillageEndDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     * <pre>e.g. setVillageEndDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of villageEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setVillageEndDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "VILLAGE_END_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueVillageEndDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     */
    public void setVillageEndDatetime_IsNull() { regVillageEndDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VILLAGE_END_DATETIME: {DATETIME(19)}
     */
    public void setVillageEndDatetime_IsNotNull() { regVillageEndDatetime(CK_ISNN, DOBJ); }

    protected void regVillageEndDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageEndDatetime(), "VILLAGE_END_DATETIME"); }
    protected abstract ConditionValue xgetCValueVillageEndDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_Equal(String winCampName) {
        doSetWinCampName_Equal(fRES(winCampName));
    }

    protected void doSetWinCampName_Equal(String winCampName) {
        regWinCampName(CK_EQ, winCampName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_NotEqual(String winCampName) {
        doSetWinCampName_NotEqual(fRES(winCampName));
    }

    protected void doSetWinCampName_NotEqual(String winCampName) {
        regWinCampName(CK_NES, winCampName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_GreaterThan(String winCampName) {
        regWinCampName(CK_GT, fRES(winCampName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_LessThan(String winCampName) {
        regWinCampName(CK_LT, fRES(winCampName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_GreaterEqual(String winCampName) {
        regWinCampName(CK_GE, fRES(winCampName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_LessEqual(String winCampName) {
        regWinCampName(CK_LE, fRES(winCampName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampNameList The collection of winCampName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_InScope(Collection<String> winCampNameList) {
        doSetWinCampName_InScope(winCampNameList);
    }

    protected void doSetWinCampName_InScope(Collection<String> winCampNameList) {
        regINS(CK_INS, cTL(winCampNameList), xgetCValueWinCampName(), "WIN_CAMP_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampNameList The collection of winCampName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWinCampName_NotInScope(Collection<String> winCampNameList) {
        doSetWinCampName_NotInScope(winCampNameList);
    }

    protected void doSetWinCampName_NotInScope(Collection<String> winCampNameList) {
        regINS(CK_NINS, cTL(winCampNameList), xgetCValueWinCampName(), "WIN_CAMP_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)} <br>
     * <pre>e.g. setWinCampName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param winCampName The value of winCampName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWinCampName_LikeSearch(String winCampName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWinCampName_LikeSearch(winCampName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)} <br>
     * <pre>e.g. setWinCampName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param winCampName The value of winCampName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setWinCampName_LikeSearch(String winCampName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(winCampName), xgetCValueWinCampName(), "WIN_CAMP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWinCampName_NotLikeSearch(String winCampName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWinCampName_NotLikeSearch(winCampName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     * @param winCampName The value of winCampName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setWinCampName_NotLikeSearch(String winCampName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(winCampName), xgetCValueWinCampName(), "WIN_CAMP_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     */
    public void setWinCampName_IsNull() { regWinCampName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     */
    public void setWinCampName_IsNullOrEmpty() { regWinCampName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIN_CAMP_NAME: {VARCHAR(255)}
     */
    public void setWinCampName_IsNotNull() { regWinCampName(CK_ISNN, DOBJ); }

    protected void regWinCampName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWinCampName(), "WIN_CAMP_NAME"); }
    protected abstract ConditionValue xgetCValueWinCampName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_Equal(String registerTrace) {
        doSetRegisterTrace_Equal(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_Equal(String registerTrace) {
        regRegisterTrace(CK_EQ, registerTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotEqual(String registerTrace) {
        doSetRegisterTrace_NotEqual(fRES(registerTrace));
    }

    protected void doSetRegisterTrace_NotEqual(String registerTrace) {
        regRegisterTrace(CK_NES, registerTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterThan(String registerTrace) {
        regRegisterTrace(CK_GT, fRES(registerTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessThan(String registerTrace) {
        regRegisterTrace(CK_LT, fRES(registerTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_GreaterEqual(String registerTrace) {
        regRegisterTrace(CK_GE, fRES(registerTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_LessEqual(String registerTrace) {
        regRegisterTrace(CK_LE, fRES(registerTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_InScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_InScope(registerTraceList);
    }

    protected void doSetRegisterTrace_InScope(Collection<String> registerTraceList) {
        regINS(CK_INS, cTL(registerTraceList), xgetCValueRegisterTrace(), "REGISTER_TRACE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTraceList The collection of registerTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        doSetRegisterTrace_NotInScope(registerTraceList);
    }

    protected void doSetRegisterTrace_NotInScope(Collection<String> registerTraceList) {
        regINS(CK_NINS, cTL(registerTraceList), xgetCValueRegisterTrace(), "REGISTER_TRACE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_LikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_LikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setRegisterTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerTrace The value of registerTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterTrace_LikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerTrace), xgetCValueRegisterTrace(), "REGISTER_TRACE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterTrace_NotLikeSearch(String registerTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterTrace_NotLikeSearch(registerTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REGISTER_TRACE: {NotNull, VARCHAR(64)}
     * @param registerTrace The value of registerTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterTrace_NotLikeSearch(String registerTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerTrace), xgetCValueRegisterTrace(), "REGISTER_TRACE", likeSearchOption);
    }

    protected void regRegisterTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterTrace(), "REGISTER_TRACE"); }
    protected abstract ConditionValue xgetCValueRegisterTrace();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_Equal(String updateTrace) {
        doSetUpdateTrace_Equal(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_Equal(String updateTrace) {
        regUpdateTrace(CK_EQ, updateTrace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotEqual(String updateTrace) {
        doSetUpdateTrace_NotEqual(fRES(updateTrace));
    }

    protected void doSetUpdateTrace_NotEqual(String updateTrace) {
        regUpdateTrace(CK_NES, updateTrace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterThan(String updateTrace) {
        regUpdateTrace(CK_GT, fRES(updateTrace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessThan(String updateTrace) {
        regUpdateTrace(CK_LT, fRES(updateTrace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_GreaterEqual(String updateTrace) {
        regUpdateTrace(CK_GE, fRES(updateTrace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_LessEqual(String updateTrace) {
        regUpdateTrace(CK_LE, fRES(updateTrace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_InScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_InScope(updateTraceList);
    }

    protected void doSetUpdateTrace_InScope(Collection<String> updateTraceList) {
        regINS(CK_INS, cTL(updateTraceList), xgetCValueUpdateTrace(), "UPDATE_TRACE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTraceList The collection of updateTrace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        doSetUpdateTrace_NotInScope(updateTraceList);
    }

    protected void doSetUpdateTrace_NotInScope(Collection<String> updateTraceList) {
        regINS(CK_NINS, cTL(updateTraceList), xgetCValueUpdateTrace(), "UPDATE_TRACE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_LikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_LikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUpdateTrace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateTrace The value of updateTrace as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateTrace_LikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateTrace), xgetCValueUpdateTrace(), "UPDATE_TRACE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateTrace_NotLikeSearch(String updateTrace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateTrace_NotLikeSearch(updateTrace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPDATE_TRACE: {NotNull, VARCHAR(64)}
     * @param updateTrace The value of updateTrace as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateTrace_NotLikeSearch(String updateTrace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateTrace), xgetCValueUpdateTrace(), "UPDATE_TRACE", likeSearchOption);
    }

    protected void regUpdateTrace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateTrace(), "UPDATE_TRACE"); }
    protected abstract ConditionValue xgetCValueUpdateTrace();

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
    public HpSLCFunction<VillageCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VillageCB.class);
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
    public HpSLCFunction<VillageCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VillageCB.class);
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
    public HpSLCFunction<VillageCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VillageCB.class);
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
    public HpSLCFunction<VillageCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VillageCB.class);
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
    public HpSLCFunction<VillageCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VillageCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VillageCB&gt;() {
     *     public void query(VillageCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VillageCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VillageCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VillageCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VillageCQ sq);

    protected VillageCB xcreateScalarConditionCB() {
        VillageCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VillageCB xcreateScalarConditionPartitionByCB() {
        VillageCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VillageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillageCB cb = new VillageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VILLAGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VillageCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VillageCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VillageCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillageCB cb = new VillageCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VILLAGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VillageCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VillageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillageCB cb = new VillageCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VillageCQ sq);

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
    protected VillageCB newMyCB() {
        return new VillageCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VillageCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
