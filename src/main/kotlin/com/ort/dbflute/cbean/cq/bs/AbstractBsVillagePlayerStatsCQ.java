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
 * The abstract condition-query of village_player_stats.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVillagePlayerStatsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVillagePlayerStatsCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "village_player_stats";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsId The value of villagePlayerStatsId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_Equal(Integer villagePlayerStatsId) {
        doSetVillagePlayerStatsId_Equal(villagePlayerStatsId);
    }

    protected void doSetVillagePlayerStatsId_Equal(Integer villagePlayerStatsId) {
        regVillagePlayerStatsId(CK_EQ, villagePlayerStatsId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsId The value of villagePlayerStatsId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_NotEqual(Integer villagePlayerStatsId) {
        doSetVillagePlayerStatsId_NotEqual(villagePlayerStatsId);
    }

    protected void doSetVillagePlayerStatsId_NotEqual(Integer villagePlayerStatsId) {
        regVillagePlayerStatsId(CK_NES, villagePlayerStatsId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsId The value of villagePlayerStatsId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_GreaterThan(Integer villagePlayerStatsId) {
        regVillagePlayerStatsId(CK_GT, villagePlayerStatsId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsId The value of villagePlayerStatsId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_LessThan(Integer villagePlayerStatsId) {
        regVillagePlayerStatsId(CK_LT, villagePlayerStatsId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsId The value of villagePlayerStatsId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_GreaterEqual(Integer villagePlayerStatsId) {
        regVillagePlayerStatsId(CK_GE, villagePlayerStatsId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsId The value of villagePlayerStatsId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_LessEqual(Integer villagePlayerStatsId) {
        regVillagePlayerStatsId(CK_LE, villagePlayerStatsId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villagePlayerStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villagePlayerStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVillagePlayerStatsId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVillagePlayerStatsId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of villagePlayerStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villagePlayerStatsId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVillagePlayerStatsId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVillagePlayerStatsId(), "VILLAGE_PLAYER_STATS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsIdList The collection of villagePlayerStatsId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_InScope(Collection<Integer> villagePlayerStatsIdList) {
        doSetVillagePlayerStatsId_InScope(villagePlayerStatsIdList);
    }

    protected void doSetVillagePlayerStatsId_InScope(Collection<Integer> villagePlayerStatsIdList) {
        regINS(CK_INS, cTL(villagePlayerStatsIdList), xgetCValueVillagePlayerStatsId(), "VILLAGE_PLAYER_STATS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param villagePlayerStatsIdList The collection of villagePlayerStatsId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillagePlayerStatsId_NotInScope(Collection<Integer> villagePlayerStatsIdList) {
        doSetVillagePlayerStatsId_NotInScope(villagePlayerStatsIdList);
    }

    protected void doSetVillagePlayerStatsId_NotInScope(Collection<Integer> villagePlayerStatsIdList) {
        regINS(CK_NINS, cTL(villagePlayerStatsIdList), xgetCValueVillagePlayerStatsId(), "VILLAGE_PLAYER_STATS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setVillagePlayerStatsId_IsNull() { regVillagePlayerStatsId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setVillagePlayerStatsId_IsNotNull() { regVillagePlayerStatsId(CK_ISNN, DOBJ); }

    protected void regVillagePlayerStatsId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillagePlayerStatsId(), "VILLAGE_PLAYER_STATS_ID"); }
    protected abstract ConditionValue xgetCValueVillagePlayerStatsId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerId The value of countryPlayerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryPlayerId_Equal(Integer countryPlayerId) {
        doSetCountryPlayerId_Equal(countryPlayerId);
    }

    protected void doSetCountryPlayerId_Equal(Integer countryPlayerId) {
        regCountryPlayerId(CK_EQ, countryPlayerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerId The value of countryPlayerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryPlayerId_NotEqual(Integer countryPlayerId) {
        doSetCountryPlayerId_NotEqual(countryPlayerId);
    }

    protected void doSetCountryPlayerId_NotEqual(Integer countryPlayerId) {
        regCountryPlayerId(CK_NES, countryPlayerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerId The value of countryPlayerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryPlayerId_GreaterThan(Integer countryPlayerId) {
        regCountryPlayerId(CK_GT, countryPlayerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerId The value of countryPlayerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryPlayerId_LessThan(Integer countryPlayerId) {
        regCountryPlayerId(CK_LT, countryPlayerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerId The value of countryPlayerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryPlayerId_GreaterEqual(Integer countryPlayerId) {
        regCountryPlayerId(CK_GE, countryPlayerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerId The value of countryPlayerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCountryPlayerId_LessEqual(Integer countryPlayerId) {
        regCountryPlayerId(CK_LE, countryPlayerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param minNumber The min number of countryPlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryPlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCountryPlayerId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCountryPlayerId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param minNumber The min number of countryPlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of countryPlayerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCountryPlayerId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCountryPlayerId(), "COUNTRY_PLAYER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerIdList The collection of countryPlayerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryPlayerId_InScope(Collection<Integer> countryPlayerIdList) {
        doSetCountryPlayerId_InScope(countryPlayerIdList);
    }

    protected void doSetCountryPlayerId_InScope(Collection<Integer> countryPlayerIdList) {
        regINS(CK_INS, cTL(countryPlayerIdList), xgetCValueCountryPlayerId(), "COUNTRY_PLAYER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player}
     * @param countryPlayerIdList The collection of countryPlayerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryPlayerId_NotInScope(Collection<Integer> countryPlayerIdList) {
        doSetCountryPlayerId_NotInScope(countryPlayerIdList);
    }

    protected void doSetCountryPlayerId_NotInScope(Collection<Integer> countryPlayerIdList) {
        regINS(CK_NINS, cTL(countryPlayerIdList), xgetCValueCountryPlayerId(), "COUNTRY_PLAYER_ID");
    }

    protected void regCountryPlayerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryPlayerId(), "COUNTRY_PLAYER_ID"); }
    protected abstract ConditionValue xgetCValueCountryPlayerId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
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
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
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
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @param villageId The value of villageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_GreaterThan(Integer villageId) {
        regVillageId(CK_GT, villageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @param villageId The value of villageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_LessThan(Integer villageId) {
        regVillageId(CK_LT, villageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @param villageId The value of villageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_GreaterEqual(Integer villageId) {
        regVillageId(CK_GE, villageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @param villageId The value of villageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVillageId_LessEqual(Integer villageId) {
        regVillageId(CK_LE, villageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
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
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @param minNumber The min number of villageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of villageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVillageId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVillageId(), "VILLAGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
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
     * VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village}
     * @param villageIdList The collection of villageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVillageId_NotInScope(Collection<Integer> villageIdList) {
        doSetVillageId_NotInScope(villageIdList);
    }

    protected void doSetVillageId_NotInScope(Collection<Integer> villageIdList) {
        regINS(CK_NINS, cTL(villageIdList), xgetCValueVillageId(), "VILLAGE_ID");
    }

    protected void regVillageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVillageId(), "VILLAGE_ID"); }
    protected abstract ConditionValue xgetCValueVillageId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_Equal(String characterName) {
        doSetCharacterName_Equal(fRES(characterName));
    }

    protected void doSetCharacterName_Equal(String characterName) {
        regCharacterName(CK_EQ, characterName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_NotEqual(String characterName) {
        doSetCharacterName_NotEqual(fRES(characterName));
    }

    protected void doSetCharacterName_NotEqual(String characterName) {
        regCharacterName(CK_NES, characterName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_GreaterThan(String characterName) {
        regCharacterName(CK_GT, fRES(characterName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_LessThan(String characterName) {
        regCharacterName(CK_LT, fRES(characterName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_GreaterEqual(String characterName) {
        regCharacterName(CK_GE, fRES(characterName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_LessEqual(String characterName) {
        regCharacterName(CK_LE, fRES(characterName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterNameList The collection of characterName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_InScope(Collection<String> characterNameList) {
        doSetCharacterName_InScope(characterNameList);
    }

    protected void doSetCharacterName_InScope(Collection<String> characterNameList) {
        regINS(CK_INS, cTL(characterNameList), xgetCValueCharacterName(), "CHARACTER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterNameList The collection of characterName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterName_NotInScope(Collection<String> characterNameList) {
        doSetCharacterName_NotInScope(characterNameList);
    }

    protected void doSetCharacterName_NotInScope(Collection<String> characterNameList) {
        regINS(CK_NINS, cTL(characterNameList), xgetCValueCharacterName(), "CHARACTER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCharacterName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param characterName The value of characterName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCharacterName_LikeSearch(String characterName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCharacterName_LikeSearch(characterName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setCharacterName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param characterName The value of characterName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCharacterName_LikeSearch(String characterName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(characterName), xgetCValueCharacterName(), "CHARACTER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCharacterName_NotLikeSearch(String characterName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCharacterName_NotLikeSearch(characterName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_NAME: {NotNull, VARCHAR(255)}
     * @param characterName The value of characterName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCharacterName_NotLikeSearch(String characterName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(characterName), xgetCValueCharacterName(), "CHARACTER_NAME", likeSearchOption);
    }

    protected void regCharacterName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacterName(), "CHARACTER_NAME"); }
    protected abstract ConditionValue xgetCValueCharacterName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_Equal(String skillName) {
        doSetSkillName_Equal(fRES(skillName));
    }

    protected void doSetSkillName_Equal(String skillName) {
        regSkillName(CK_EQ, skillName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_NotEqual(String skillName) {
        doSetSkillName_NotEqual(fRES(skillName));
    }

    protected void doSetSkillName_NotEqual(String skillName) {
        regSkillName(CK_NES, skillName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_GreaterThan(String skillName) {
        regSkillName(CK_GT, fRES(skillName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_LessThan(String skillName) {
        regSkillName(CK_LT, fRES(skillName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_GreaterEqual(String skillName) {
        regSkillName(CK_GE, fRES(skillName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_LessEqual(String skillName) {
        regSkillName(CK_LE, fRES(skillName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillNameList The collection of skillName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_InScope(Collection<String> skillNameList) {
        doSetSkillName_InScope(skillNameList);
    }

    protected void doSetSkillName_InScope(Collection<String> skillNameList) {
        regINS(CK_INS, cTL(skillNameList), xgetCValueSkillName(), "SKILL_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillNameList The collection of skillName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkillName_NotInScope(Collection<String> skillNameList) {
        doSetSkillName_NotInScope(skillNameList);
    }

    protected void doSetSkillName_NotInScope(Collection<String> skillNameList) {
        regINS(CK_NINS, cTL(skillNameList), xgetCValueSkillName(), "SKILL_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setSkillName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param skillName The value of skillName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSkillName_LikeSearch(String skillName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSkillName_LikeSearch(skillName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setSkillName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skillName The value of skillName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSkillName_LikeSearch(String skillName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skillName), xgetCValueSkillName(), "SKILL_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSkillName_NotLikeSearch(String skillName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSkillName_NotLikeSearch(skillName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKILL_NAME: {NotNull, VARCHAR(255)}
     * @param skillName The value of skillName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSkillName_NotLikeSearch(String skillName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skillName), xgetCValueSkillName(), "SKILL_NAME", likeSearchOption);
    }

    protected void regSkillName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkillName(), "SKILL_NAME"); }
    protected abstract ConditionValue xgetCValueSkillName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     * @param winloseCode The value of winloseCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_Equal(String winloseCode) {
        doSetWinloseCode_Equal(fRES(winloseCode));
    }

    /**
     * Equal(=). As WinLose. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
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
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     * @param winloseCode The value of winloseCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_NotEqual(String winloseCode) {
        doSetWinloseCode_NotEqual(fRES(winloseCode));
    }

    /**
     * NotEqual(&lt;&gt;). As WinLose. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
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
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     * @param winloseCodeList The collection of winloseCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_InScope(Collection<String> winloseCodeList) {
        doSetWinloseCode_InScope(winloseCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As WinLose. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
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
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     * @param winloseCodeList The collection of winloseCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setWinloseCode_NotInScope(Collection<String> winloseCodeList) {
        doSetWinloseCode_NotInScope(winloseCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As WinLose. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
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
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     */
    public void setWinloseCode_IsNull() { regWinloseCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     */
    public void setWinloseCode_IsNullOrEmpty() { regWinloseCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose}
     */
    public void setWinloseCode_IsNotNull() { regWinloseCode(CK_ISNN, DOBJ); }

    protected void regWinloseCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWinloseCode(), "WINLOSE_CODE"); }
    protected abstract ConditionValue xgetCValueWinloseCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_Equal(String life) {
        doSetLife_Equal(fRES(life));
    }

    protected void doSetLife_Equal(String life) {
        regLife(CK_EQ, life);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_NotEqual(String life) {
        doSetLife_NotEqual(fRES(life));
    }

    protected void doSetLife_NotEqual(String life) {
        regLife(CK_NES, life);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_GreaterThan(String life) {
        regLife(CK_GT, fRES(life));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_LessThan(String life) {
        regLife(CK_LT, fRES(life));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_GreaterEqual(String life) {
        regLife(CK_GE, fRES(life));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_LessEqual(String life) {
        regLife(CK_LE, fRES(life));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param lifeList The collection of life as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_InScope(Collection<String> lifeList) {
        doSetLife_InScope(lifeList);
    }

    protected void doSetLife_InScope(Collection<String> lifeList) {
        regINS(CK_INS, cTL(lifeList), xgetCValueLife(), "LIFE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param lifeList The collection of life as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLife_NotInScope(Collection<String> lifeList) {
        doSetLife_NotInScope(lifeList);
    }

    protected void doSetLife_NotInScope(Collection<String> lifeList) {
        regINS(CK_NINS, cTL(lifeList), xgetCValueLife(), "LIFE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIFE: {VARCHAR(20)} <br>
     * <pre>e.g. setLife_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param life The value of life as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLife_LikeSearch(String life, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLife_LikeSearch(life, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIFE: {VARCHAR(20)} <br>
     * <pre>e.g. setLife_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param life The value of life as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLife_LikeSearch(String life, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(life), xgetCValueLife(), "LIFE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLife_NotLikeSearch(String life, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLife_NotLikeSearch(life, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIFE: {VARCHAR(20)}
     * @param life The value of life as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLife_NotLikeSearch(String life, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(life), xgetCValueLife(), "LIFE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     */
    public void setLife_IsNull() { regLife(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     */
    public void setLife_IsNullOrEmpty() { regLife(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIFE: {VARCHAR(20)}
     */
    public void setLife_IsNotNull() { regLife(CK_ISNN, DOBJ); }

    protected void regLife(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLife(), "LIFE"); }
    protected abstract ConditionValue xgetCValueLife();

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
    public HpSLCFunction<VillagePlayerStatsCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VillagePlayerStatsCB.class);
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
    public HpSLCFunction<VillagePlayerStatsCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VillagePlayerStatsCB.class);
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
    public HpSLCFunction<VillagePlayerStatsCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VillagePlayerStatsCB.class);
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
    public HpSLCFunction<VillagePlayerStatsCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VillagePlayerStatsCB.class);
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
    public HpSLCFunction<VillagePlayerStatsCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VillagePlayerStatsCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VillagePlayerStatsCB&gt;() {
     *     public void query(VillagePlayerStatsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VillagePlayerStatsCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VillagePlayerStatsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VillagePlayerStatsCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VillagePlayerStatsCQ sq);

    protected VillagePlayerStatsCB xcreateScalarConditionCB() {
        VillagePlayerStatsCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VillagePlayerStatsCB xcreateScalarConditionPartitionByCB() {
        VillagePlayerStatsCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VillagePlayerStatsCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VILLAGE_PLAYER_STATS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VillagePlayerStatsCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VillagePlayerStatsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VillagePlayerStatsCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VILLAGE_PLAYER_STATS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VillagePlayerStatsCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VillagePlayerStatsCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VillagePlayerStatsCB cb = new VillagePlayerStatsCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VillagePlayerStatsCQ sq);

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
    protected VillagePlayerStatsCB newMyCB() {
        return new VillagePlayerStatsCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VillagePlayerStatsCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
