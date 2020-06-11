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
 * The abstract condition-query of country.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCountryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCountryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "country";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryId The value of countryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_GreaterThan(Integer countryId) {
        regCountryId(CK_GT, countryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryId The value of countryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_LessThan(Integer countryId) {
        regCountryId(CK_LT, countryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryId The value of countryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_GreaterEqual(Integer countryId) {
        regCountryId(CK_GE, countryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryId The value of countryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryId_LessEqual(Integer countryId) {
        regCountryId(CK_LE, countryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of countryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCountryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCountryId(), "COUNTRY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryIdList The collection of countryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryId_NotInScope(Collection<Integer> countryIdList) {
        doSetCountryId_NotInScope(countryIdList);
    }

    protected void doSetCountryId_NotInScope(Collection<Integer> countryIdList) {
        regINS(CK_NINS, cTL(countryIdList), xgetCValueCountryId(), "COUNTRY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COUNTRY_ID from country_player where ...)} <br>
     * country_player by COUNTRY_ID, named 'countryPlayerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCountryPlayer</span>(playerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     playerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryPlayerList for 'exists'. (NotNull)
     */
    public void existsCountryPlayer(SubQuery<CountryPlayerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryPlayerCB cb = new CountryPlayerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_ExistsReferrer_CountryPlayerList(cb.query());
        registerExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryPlayerList");
    }
    public abstract String keepCountryId_ExistsReferrer_CountryPlayerList(CountryPlayerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COUNTRY_ID from country_progress where ...)} <br>
     * country_progress by COUNTRY_ID, named 'countryProgressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCountryProgress</span>(progressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     progressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryProgressList for 'exists'. (NotNull)
     */
    public void existsCountryProgress(SubQuery<CountryProgressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryProgressCB cb = new CountryProgressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_ExistsReferrer_CountryProgressList(cb.query());
        registerExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryProgressList");
    }
    public abstract String keepCountryId_ExistsReferrer_CountryProgressList(CountryProgressCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COUNTRY_ID from country_recruitment where ...)} <br>
     * country_recruitment by COUNTRY_ID, named 'countryRecruitmentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCountryRecruitment</span>(recruitmentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recruitmentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryRecruitmentList for 'exists'. (NotNull)
     */
    public void existsCountryRecruitment(SubQuery<CountryRecruitmentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryRecruitmentCB cb = new CountryRecruitmentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_ExistsReferrer_CountryRecruitmentList(cb.query());
        registerExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryRecruitmentList");
    }
    public abstract String keepCountryId_ExistsReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COUNTRY_ID from village where ...)} <br>
     * village by COUNTRY_ID, named 'villageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVillage</span>(villageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     villageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VillageList for 'exists'. (NotNull)
     */
    public void existsVillage(SubQuery<VillageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillageCB cb = new VillageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_ExistsReferrer_VillageList(cb.query());
        registerExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "villageList");
    }
    public abstract String keepCountryId_ExistsReferrer_VillageList(VillageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COUNTRY_ID from country_player where ...)} <br>
     * country_player by COUNTRY_ID, named 'countryPlayerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCountryPlayer</span>(playerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     playerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryId_NotExistsReferrer_CountryPlayerList for 'not exists'. (NotNull)
     */
    public void notExistsCountryPlayer(SubQuery<CountryPlayerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryPlayerCB cb = new CountryPlayerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_NotExistsReferrer_CountryPlayerList(cb.query());
        registerNotExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryPlayerList");
    }
    public abstract String keepCountryId_NotExistsReferrer_CountryPlayerList(CountryPlayerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COUNTRY_ID from country_progress where ...)} <br>
     * country_progress by COUNTRY_ID, named 'countryProgressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCountryProgress</span>(progressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     progressCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryId_NotExistsReferrer_CountryProgressList for 'not exists'. (NotNull)
     */
    public void notExistsCountryProgress(SubQuery<CountryProgressCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryProgressCB cb = new CountryProgressCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_NotExistsReferrer_CountryProgressList(cb.query());
        registerNotExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryProgressList");
    }
    public abstract String keepCountryId_NotExistsReferrer_CountryProgressList(CountryProgressCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COUNTRY_ID from country_recruitment where ...)} <br>
     * country_recruitment by COUNTRY_ID, named 'countryRecruitmentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCountryRecruitment</span>(recruitmentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recruitmentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryId_NotExistsReferrer_CountryRecruitmentList for 'not exists'. (NotNull)
     */
    public void notExistsCountryRecruitment(SubQuery<CountryRecruitmentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryRecruitmentCB cb = new CountryRecruitmentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_NotExistsReferrer_CountryRecruitmentList(cb.query());
        registerNotExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryRecruitmentList");
    }
    public abstract String keepCountryId_NotExistsReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COUNTRY_ID from village where ...)} <br>
     * village by COUNTRY_ID, named 'villageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVillage</span>(villageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     villageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CountryId_NotExistsReferrer_VillageList for 'not exists'. (NotNull)
     */
    public void notExistsVillage(SubQuery<VillageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillageCB cb = new VillageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCountryId_NotExistsReferrer_VillageList(cb.query());
        registerNotExistsReferrer(cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "villageList");
    }
    public abstract String keepCountryId_NotExistsReferrer_VillageList(VillageCQ sq);

    public void xsderiveCountryPlayerList(String fn, SubQuery<CountryPlayerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryPlayerCB cb = new CountryPlayerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCountryId_SpecifyDerivedReferrer_CountryPlayerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryPlayerList", al, op);
    }
    public abstract String keepCountryId_SpecifyDerivedReferrer_CountryPlayerList(CountryPlayerCQ sq);

    public void xsderiveCountryProgressList(String fn, SubQuery<CountryProgressCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryProgressCB cb = new CountryProgressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCountryId_SpecifyDerivedReferrer_CountryProgressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryProgressList", al, op);
    }
    public abstract String keepCountryId_SpecifyDerivedReferrer_CountryProgressList(CountryProgressCQ sq);

    public void xsderiveCountryRecruitmentList(String fn, SubQuery<CountryRecruitmentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryRecruitmentCB cb = new CountryRecruitmentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCountryId_SpecifyDerivedReferrer_CountryRecruitmentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "countryRecruitmentList", al, op);
    }
    public abstract String keepCountryId_SpecifyDerivedReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq);

    public void xsderiveVillageList(String fn, SubQuery<VillageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillageCB cb = new VillageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCountryId_SpecifyDerivedReferrer_VillageList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", pp, "villageList", al, op);
    }
    public abstract String keepCountryId_SpecifyDerivedReferrer_VillageList(VillageCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from country_player where ...)} <br>
     * country_player by COUNTRY_ID, named 'countryPlayerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCountryPlayer()</span>.<span style="color: #CC4747">max</span>(playerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     playerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     playerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CountryPlayerCB> derivedCountryPlayer() {
        return xcreateQDRFunctionCountryPlayerList();
    }
    protected HpQDRFunction<CountryPlayerCB> xcreateQDRFunctionCountryPlayerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCountryPlayerList(fn, sq, rd, vl, op));
    }
    public void xqderiveCountryPlayerList(String fn, SubQuery<CountryPlayerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryPlayerCB cb = new CountryPlayerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCountryId_QueryDerivedReferrer_CountryPlayerList(cb.query()); String prpp = keepCountryId_QueryDerivedReferrer_CountryPlayerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", sqpp, "countryPlayerList", rd, vl, prpp, op);
    }
    public abstract String keepCountryId_QueryDerivedReferrer_CountryPlayerList(CountryPlayerCQ sq);
    public abstract String keepCountryId_QueryDerivedReferrer_CountryPlayerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from country_progress where ...)} <br>
     * country_progress by COUNTRY_ID, named 'countryProgressAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCountryProgress()</span>.<span style="color: #CC4747">max</span>(progressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     progressCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     progressCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CountryProgressCB> derivedCountryProgress() {
        return xcreateQDRFunctionCountryProgressList();
    }
    protected HpQDRFunction<CountryProgressCB> xcreateQDRFunctionCountryProgressList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCountryProgressList(fn, sq, rd, vl, op));
    }
    public void xqderiveCountryProgressList(String fn, SubQuery<CountryProgressCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryProgressCB cb = new CountryProgressCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCountryId_QueryDerivedReferrer_CountryProgressList(cb.query()); String prpp = keepCountryId_QueryDerivedReferrer_CountryProgressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", sqpp, "countryProgressList", rd, vl, prpp, op);
    }
    public abstract String keepCountryId_QueryDerivedReferrer_CountryProgressList(CountryProgressCQ sq);
    public abstract String keepCountryId_QueryDerivedReferrer_CountryProgressListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from country_recruitment where ...)} <br>
     * country_recruitment by COUNTRY_ID, named 'countryRecruitmentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCountryRecruitment()</span>.<span style="color: #CC4747">max</span>(recruitmentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     recruitmentCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     recruitmentCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CountryRecruitmentCB> derivedCountryRecruitment() {
        return xcreateQDRFunctionCountryRecruitmentList();
    }
    protected HpQDRFunction<CountryRecruitmentCB> xcreateQDRFunctionCountryRecruitmentList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCountryRecruitmentList(fn, sq, rd, vl, op));
    }
    public void xqderiveCountryRecruitmentList(String fn, SubQuery<CountryRecruitmentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryRecruitmentCB cb = new CountryRecruitmentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCountryId_QueryDerivedReferrer_CountryRecruitmentList(cb.query()); String prpp = keepCountryId_QueryDerivedReferrer_CountryRecruitmentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", sqpp, "countryRecruitmentList", rd, vl, prpp, op);
    }
    public abstract String keepCountryId_QueryDerivedReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq);
    public abstract String keepCountryId_QueryDerivedReferrer_CountryRecruitmentListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from village where ...)} <br>
     * village by COUNTRY_ID, named 'villageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVillage()</span>.<span style="color: #CC4747">max</span>(villageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     villageCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     villageCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VillageCB> derivedVillage() {
        return xcreateQDRFunctionVillageList();
    }
    protected HpQDRFunction<VillageCB> xcreateQDRFunctionVillageList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVillageList(fn, sq, rd, vl, op));
    }
    public void xqderiveVillageList(String fn, SubQuery<VillageCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillageCB cb = new VillageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCountryId_QueryDerivedReferrer_VillageList(cb.query()); String prpp = keepCountryId_QueryDerivedReferrer_VillageListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COUNTRY_ID", "COUNTRY_ID", sqpp, "villageList", rd, vl, prpp, op);
    }
    public abstract String keepCountryId_QueryDerivedReferrer_VillageList(VillageCQ sq);
    public abstract String keepCountryId_QueryDerivedReferrer_VillageListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCountryId_IsNull() { regCountryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCountryId_IsNotNull() { regCountryId(CK_ISNN, DOBJ); }

    protected void regCountryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryId(), "COUNTRY_ID"); }
    protected abstract ConditionValue xgetCValueCountryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_Equal(String countryName) {
        doSetCountryName_Equal(fRES(countryName));
    }

    protected void doSetCountryName_Equal(String countryName) {
        regCountryName(CK_EQ, countryName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_NotEqual(String countryName) {
        doSetCountryName_NotEqual(fRES(countryName));
    }

    protected void doSetCountryName_NotEqual(String countryName) {
        regCountryName(CK_NES, countryName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_GreaterThan(String countryName) {
        regCountryName(CK_GT, fRES(countryName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_LessThan(String countryName) {
        regCountryName(CK_LT, fRES(countryName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_GreaterEqual(String countryName) {
        regCountryName(CK_GE, fRES(countryName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_LessEqual(String countryName) {
        regCountryName(CK_LE, fRES(countryName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryNameList The collection of countryName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_InScope(Collection<String> countryNameList) {
        doSetCountryName_InScope(countryNameList);
    }

    protected void doSetCountryName_InScope(Collection<String> countryNameList) {
        regINS(CK_INS, cTL(countryNameList), xgetCValueCountryName(), "COUNTRY_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryNameList The collection of countryName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryName_NotInScope(Collection<String> countryNameList) {
        doSetCountryName_NotInScope(countryNameList);
    }

    protected void doSetCountryName_NotInScope(Collection<String> countryNameList) {
        regINS(CK_NINS, cTL(countryNameList), xgetCValueCountryName(), "COUNTRY_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCountryName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param countryName The value of countryName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountryName_LikeSearch(String countryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountryName_LikeSearch(countryName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCountryName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countryName The value of countryName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCountryName_LikeSearch(String countryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countryName), xgetCValueCountryName(), "COUNTRY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountryName_NotLikeSearch(String countryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountryName_NotLikeSearch(countryName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_NAME: {NotNull, VARCHAR(100)}
     * @param countryName The value of countryName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCountryName_NotLikeSearch(String countryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countryName), xgetCValueCountryName(), "COUNTRY_NAME", likeSearchOption);
    }

    protected void regCountryName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryName(), "COUNTRY_NAME"); }
    protected abstract ConditionValue xgetCValueCountryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_Equal(String countryTopPageUrl) {
        doSetCountryTopPageUrl_Equal(fRES(countryTopPageUrl));
    }

    protected void doSetCountryTopPageUrl_Equal(String countryTopPageUrl) {
        regCountryTopPageUrl(CK_EQ, countryTopPageUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_NotEqual(String countryTopPageUrl) {
        doSetCountryTopPageUrl_NotEqual(fRES(countryTopPageUrl));
    }

    protected void doSetCountryTopPageUrl_NotEqual(String countryTopPageUrl) {
        regCountryTopPageUrl(CK_NES, countryTopPageUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_GreaterThan(String countryTopPageUrl) {
        regCountryTopPageUrl(CK_GT, fRES(countryTopPageUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_LessThan(String countryTopPageUrl) {
        regCountryTopPageUrl(CK_LT, fRES(countryTopPageUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_GreaterEqual(String countryTopPageUrl) {
        regCountryTopPageUrl(CK_GE, fRES(countryTopPageUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_LessEqual(String countryTopPageUrl) {
        regCountryTopPageUrl(CK_LE, fRES(countryTopPageUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrlList The collection of countryTopPageUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_InScope(Collection<String> countryTopPageUrlList) {
        doSetCountryTopPageUrl_InScope(countryTopPageUrlList);
    }

    protected void doSetCountryTopPageUrl_InScope(Collection<String> countryTopPageUrlList) {
        regINS(CK_INS, cTL(countryTopPageUrlList), xgetCValueCountryTopPageUrl(), "COUNTRY_TOP_PAGE_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrlList The collection of countryTopPageUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryTopPageUrl_NotInScope(Collection<String> countryTopPageUrlList) {
        doSetCountryTopPageUrl_NotInScope(countryTopPageUrlList);
    }

    protected void doSetCountryTopPageUrl_NotInScope(Collection<String> countryTopPageUrlList) {
        regINS(CK_NINS, cTL(countryTopPageUrlList), xgetCValueCountryTopPageUrl(), "COUNTRY_TOP_PAGE_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCountryTopPageUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param countryTopPageUrl The value of countryTopPageUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountryTopPageUrl_LikeSearch(String countryTopPageUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountryTopPageUrl_LikeSearch(countryTopPageUrl, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCountryTopPageUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countryTopPageUrl The value of countryTopPageUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCountryTopPageUrl_LikeSearch(String countryTopPageUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countryTopPageUrl), xgetCValueCountryTopPageUrl(), "COUNTRY_TOP_PAGE_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountryTopPageUrl_NotLikeSearch(String countryTopPageUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountryTopPageUrl_NotLikeSearch(countryTopPageUrl, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)}
     * @param countryTopPageUrl The value of countryTopPageUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCountryTopPageUrl_NotLikeSearch(String countryTopPageUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countryTopPageUrl), xgetCValueCountryTopPageUrl(), "COUNTRY_TOP_PAGE_URL", likeSearchOption);
    }

    protected void regCountryTopPageUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryTopPageUrl(), "COUNTRY_TOP_PAGE_URL"); }
    protected abstract ConditionValue xgetCValueCountryTopPageUrl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_NotEqual(Integer displayOrder) {
        doSetDisplayOrder_NotEqual(displayOrder);
    }

    protected void doSetDisplayOrder_NotEqual(Integer displayOrder) {
        regDisplayOrder(CK_NES, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_GreaterThan(Integer displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_LessThan(Integer displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_GreaterEqual(Integer displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_LessEqual(Integer displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrderList The collection of displayOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), xgetCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)}
     * @param displayOrderList The collection of displayOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_NotInScope(displayOrderList);
    }

    protected void doSetDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        regINS(CK_NINS, cTL(displayOrderList), xgetCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IS_CRAWL_FAIL: {NotNull, BIT}
     * @param isCrawlFail The value of isCrawlFail as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsCrawlFail_Equal(Boolean isCrawlFail) {
        regIsCrawlFail(CK_EQ, isCrawlFail);
    }

    protected void regIsCrawlFail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsCrawlFail(), "IS_CRAWL_FAIL"); }
    protected abstract ConditionValue xgetCValueIsCrawlFail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IS_DISPLAY: {NotNull, BIT}
     * @param isDisplay The value of isDisplay as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIsDisplay_Equal(Boolean isDisplay) {
        regIsDisplay(CK_EQ, isDisplay);
    }

    protected void regIsDisplay(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsDisplay(), "IS_DISPLAY"); }
    protected abstract ConditionValue xgetCValueIsDisplay();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @param lastUpdateDatetime The value of lastUpdateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastUpdateDatetime_Equal(java.time.LocalDateTime lastUpdateDatetime) {
        regLastUpdateDatetime(CK_EQ,  lastUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @param lastUpdateDatetime The value of lastUpdateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastUpdateDatetime_GreaterThan(java.time.LocalDateTime lastUpdateDatetime) {
        regLastUpdateDatetime(CK_GT,  lastUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @param lastUpdateDatetime The value of lastUpdateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastUpdateDatetime_LessThan(java.time.LocalDateTime lastUpdateDatetime) {
        regLastUpdateDatetime(CK_LT,  lastUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @param lastUpdateDatetime The value of lastUpdateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastUpdateDatetime_GreaterEqual(java.time.LocalDateTime lastUpdateDatetime) {
        regLastUpdateDatetime(CK_GE,  lastUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * @param lastUpdateDatetime The value of lastUpdateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastUpdateDatetime_LessEqual(java.time.LocalDateTime lastUpdateDatetime) {
        regLastUpdateDatetime(CK_LE, lastUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * <pre>e.g. setLastUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setLastUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setLastUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     * <pre>e.g. setLastUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setLastUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "LAST_UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueLastUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     */
    public void setLastUpdateDatetime_IsNull() { regLastUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAST_UPDATE_DATETIME: {DATETIME(19)}
     */
    public void setLastUpdateDatetime_IsNotNull() { regLastUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regLastUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastUpdateDatetime(), "LAST_UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueLastUpdateDatetime();

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
    public HpSLCFunction<CountryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CountryCB.class);
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
    public HpSLCFunction<CountryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CountryCB.class);
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
    public HpSLCFunction<CountryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CountryCB.class);
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
    public HpSLCFunction<CountryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CountryCB.class);
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
    public HpSLCFunction<CountryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CountryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CountryCB&gt;() {
     *     public void query(CountryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CountryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CountryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CountryCQ sq);

    protected CountryCB xcreateScalarConditionCB() {
        CountryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CountryCB xcreateScalarConditionPartitionByCB() {
        CountryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CountryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryCB cb = new CountryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COUNTRY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CountryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CountryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CountryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryCB cb = new CountryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COUNTRY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CountryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CountryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryCB cb = new CountryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CountryCQ sq);

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
    protected CountryCB newMyCB() {
        return new CountryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CountryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
