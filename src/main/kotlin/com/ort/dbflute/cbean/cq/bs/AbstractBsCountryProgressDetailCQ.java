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
 * The abstract condition-query of country_progress_detail.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCountryProgressDetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCountryProgressDetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "country_progress_detail";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailId The value of countryProgressDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_Equal(Integer countryProgressDetailId) {
        doSetCountryProgressDetailId_Equal(countryProgressDetailId);
    }

    protected void doSetCountryProgressDetailId_Equal(Integer countryProgressDetailId) {
        regCountryProgressDetailId(CK_EQ, countryProgressDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailId The value of countryProgressDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_NotEqual(Integer countryProgressDetailId) {
        doSetCountryProgressDetailId_NotEqual(countryProgressDetailId);
    }

    protected void doSetCountryProgressDetailId_NotEqual(Integer countryProgressDetailId) {
        regCountryProgressDetailId(CK_NES, countryProgressDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailId The value of countryProgressDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_GreaterThan(Integer countryProgressDetailId) {
        regCountryProgressDetailId(CK_GT, countryProgressDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailId The value of countryProgressDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_LessThan(Integer countryProgressDetailId) {
        regCountryProgressDetailId(CK_LT, countryProgressDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailId The value of countryProgressDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_GreaterEqual(Integer countryProgressDetailId) {
        regCountryProgressDetailId(CK_GE, countryProgressDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailId The value of countryProgressDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_LessEqual(Integer countryProgressDetailId) {
        regCountryProgressDetailId(CK_LE, countryProgressDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of countryProgressDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryProgressDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCountryProgressDetailId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCountryProgressDetailId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of countryProgressDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryProgressDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCountryProgressDetailId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCountryProgressDetailId(), "COUNTRY_PROGRESS_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailIdList The collection of countryProgressDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_InScope(Collection<Integer> countryProgressDetailIdList) {
        doSetCountryProgressDetailId_InScope(countryProgressDetailIdList);
    }

    protected void doSetCountryProgressDetailId_InScope(Collection<Integer> countryProgressDetailIdList) {
        regINS(CK_INS, cTL(countryProgressDetailIdList), xgetCValueCountryProgressDetailId(), "COUNTRY_PROGRESS_DETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param countryProgressDetailIdList The collection of countryProgressDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryProgressDetailId_NotInScope(Collection<Integer> countryProgressDetailIdList) {
        doSetCountryProgressDetailId_NotInScope(countryProgressDetailIdList);
    }

    protected void doSetCountryProgressDetailId_NotInScope(Collection<Integer> countryProgressDetailIdList) {
        regINS(CK_NINS, cTL(countryProgressDetailIdList), xgetCValueCountryProgressDetailId(), "COUNTRY_PROGRESS_DETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCountryProgressDetailId_IsNull() { regCountryProgressDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCountryProgressDetailId_IsNotNull() { regCountryProgressDetailId(CK_ISNN, DOBJ); }

    protected void regCountryProgressDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryProgressDetailId(), "COUNTRY_PROGRESS_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValueCountryProgressDetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressId The value of countryProgressId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressId_Equal(Integer countryProgressId) {
        doSetCountryProgressId_Equal(countryProgressId);
    }

    protected void doSetCountryProgressId_Equal(Integer countryProgressId) {
        regCountryProgressId(CK_EQ, countryProgressId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressId The value of countryProgressId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressId_NotEqual(Integer countryProgressId) {
        doSetCountryProgressId_NotEqual(countryProgressId);
    }

    protected void doSetCountryProgressId_NotEqual(Integer countryProgressId) {
        regCountryProgressId(CK_NES, countryProgressId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressId The value of countryProgressId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressId_GreaterThan(Integer countryProgressId) {
        regCountryProgressId(CK_GT, countryProgressId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressId The value of countryProgressId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressId_LessThan(Integer countryProgressId) {
        regCountryProgressId(CK_LT, countryProgressId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressId The value of countryProgressId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressId_GreaterEqual(Integer countryProgressId) {
        regCountryProgressId(CK_GE, countryProgressId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressId The value of countryProgressId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryProgressId_LessEqual(Integer countryProgressId) {
        regCountryProgressId(CK_LE, countryProgressId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param minNumber The min number of countryProgressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryProgressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCountryProgressId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCountryProgressId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param minNumber The min number of countryProgressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryProgressId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCountryProgressId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCountryProgressId(), "COUNTRY_PROGRESS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressIdList The collection of countryProgressId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryProgressId_InScope(Collection<Integer> countryProgressIdList) {
        doSetCountryProgressId_InScope(countryProgressIdList);
    }

    protected void doSetCountryProgressId_InScope(Collection<Integer> countryProgressIdList) {
        regINS(CK_INS, cTL(countryProgressIdList), xgetCValueCountryProgressId(), "COUNTRY_PROGRESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress}
     * @param countryProgressIdList The collection of countryProgressId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryProgressId_NotInScope(Collection<Integer> countryProgressIdList) {
        doSetCountryProgressId_NotInScope(countryProgressIdList);
    }

    protected void doSetCountryProgressId_NotInScope(Collection<Integer> countryProgressIdList) {
        regINS(CK_NINS, cTL(countryProgressIdList), xgetCValueCountryProgressId(), "COUNTRY_PROGRESS_ID");
    }

    protected void regCountryProgressId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryProgressId(), "COUNTRY_PROGRESS_ID"); }
    protected abstract ConditionValue xgetCValueCountryProgressId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_Equal(String itemName) {
        doSetItemName_Equal(fRES(itemName));
    }

    protected void doSetItemName_Equal(String itemName) {
        regItemName(CK_EQ, itemName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_NotEqual(String itemName) {
        doSetItemName_NotEqual(fRES(itemName));
    }

    protected void doSetItemName_NotEqual(String itemName) {
        regItemName(CK_NES, itemName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_GreaterThan(String itemName) {
        regItemName(CK_GT, fRES(itemName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_LessThan(String itemName) {
        regItemName(CK_LT, fRES(itemName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_GreaterEqual(String itemName) {
        regItemName(CK_GE, fRES(itemName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_LessEqual(String itemName) {
        regItemName(CK_LE, fRES(itemName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemNameList The collection of itemName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_InScope(Collection<String> itemNameList) {
        doSetItemName_InScope(itemNameList);
    }

    protected void doSetItemName_InScope(Collection<String> itemNameList) {
        regINS(CK_INS, cTL(itemNameList), xgetCValueItemName(), "ITEM_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemNameList The collection of itemName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemName_NotInScope(Collection<String> itemNameList) {
        doSetItemName_NotInScope(itemNameList);
    }

    protected void doSetItemName_NotInScope(Collection<String> itemNameList) {
        regINS(CK_NINS, cTL(itemNameList), xgetCValueItemName(), "ITEM_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setItemName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param itemName The value of itemName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setItemName_LikeSearch(String itemName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setItemName_LikeSearch(itemName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setItemName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemName The value of itemName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setItemName_LikeSearch(String itemName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemName), xgetCValueItemName(), "ITEM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setItemName_NotLikeSearch(String itemName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setItemName_NotLikeSearch(itemName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NAME: {NotNull, VARCHAR(20)}
     * @param itemName The value of itemName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setItemName_NotLikeSearch(String itemName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemName), xgetCValueItemName(), "ITEM_NAME", likeSearchOption);
    }

    protected void regItemName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemName(), "ITEM_NAME"); }
    protected abstract ConditionValue xgetCValueItemName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_Equal(String itemValue) {
        doSetItemValue_Equal(fRES(itemValue));
    }

    protected void doSetItemValue_Equal(String itemValue) {
        regItemValue(CK_EQ, itemValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_NotEqual(String itemValue) {
        doSetItemValue_NotEqual(fRES(itemValue));
    }

    protected void doSetItemValue_NotEqual(String itemValue) {
        regItemValue(CK_NES, itemValue);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_GreaterThan(String itemValue) {
        regItemValue(CK_GT, fRES(itemValue));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_LessThan(String itemValue) {
        regItemValue(CK_LT, fRES(itemValue));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_GreaterEqual(String itemValue) {
        regItemValue(CK_GE, fRES(itemValue));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_LessEqual(String itemValue) {
        regItemValue(CK_LE, fRES(itemValue));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValueList The collection of itemValue as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_InScope(Collection<String> itemValueList) {
        doSetItemValue_InScope(itemValueList);
    }

    protected void doSetItemValue_InScope(Collection<String> itemValueList) {
        regINS(CK_INS, cTL(itemValueList), xgetCValueItemValue(), "ITEM_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValueList The collection of itemValue as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemValue_NotInScope(Collection<String> itemValueList) {
        doSetItemValue_NotInScope(itemValueList);
    }

    protected void doSetItemValue_NotInScope(Collection<String> itemValueList) {
        regINS(CK_NINS, cTL(itemValueList), xgetCValueItemValue(), "ITEM_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)} <br>
     * <pre>e.g. setItemValue_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param itemValue The value of itemValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setItemValue_LikeSearch(String itemValue, ConditionOptionCall<LikeSearchOption> opLambda) {
        setItemValue_LikeSearch(itemValue, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)} <br>
     * <pre>e.g. setItemValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemValue The value of itemValue as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setItemValue_LikeSearch(String itemValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemValue), xgetCValueItemValue(), "ITEM_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setItemValue_NotLikeSearch(String itemValue, ConditionOptionCall<LikeSearchOption> opLambda) {
        setItemValue_NotLikeSearch(itemValue, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_VALUE: {NotNull, VARCHAR(1000)}
     * @param itemValue The value of itemValue as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setItemValue_NotLikeSearch(String itemValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemValue), xgetCValueItemValue(), "ITEM_VALUE", likeSearchOption);
    }

    protected void regItemValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemValue(), "ITEM_VALUE"); }
    protected abstract ConditionValue xgetCValueItemValue();

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
    public HpSLCFunction<CountryProgressDetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CountryProgressDetailCB.class);
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
    public HpSLCFunction<CountryProgressDetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CountryProgressDetailCB.class);
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
    public HpSLCFunction<CountryProgressDetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CountryProgressDetailCB.class);
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
    public HpSLCFunction<CountryProgressDetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CountryProgressDetailCB.class);
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
    public HpSLCFunction<CountryProgressDetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CountryProgressDetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CountryProgressDetailCB&gt;() {
     *     public void query(CountryProgressDetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CountryProgressDetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CountryProgressDetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryProgressDetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CountryProgressDetailCQ sq);

    protected CountryProgressDetailCB xcreateScalarConditionCB() {
        CountryProgressDetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CountryProgressDetailCB xcreateScalarConditionPartitionByCB() {
        CountryProgressDetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CountryProgressDetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryProgressDetailCB cb = new CountryProgressDetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COUNTRY_PROGRESS_DETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CountryProgressDetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CountryProgressDetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CountryProgressDetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CountryProgressDetailCB cb = new CountryProgressDetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COUNTRY_PROGRESS_DETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CountryProgressDetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CountryProgressDetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CountryProgressDetailCB cb = new CountryProgressDetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CountryProgressDetailCQ sq);

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
    protected CountryProgressDetailCB newMyCB() {
        return new CountryProgressDetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CountryProgressDetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
