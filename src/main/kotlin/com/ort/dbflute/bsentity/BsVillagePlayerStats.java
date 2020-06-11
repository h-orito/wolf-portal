package com.ort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.ort.dbflute.allcommon.EntityDefinedCommonColumn;
import com.ort.dbflute.allcommon.DBMetaInstanceHandler;
import com.ort.dbflute.allcommon.CDef;
import com.ort.dbflute.exentity.*;

/**
 * The entity of VILLAGE_PLAYER_STATS as TABLE. <br>
 * 村戦績
 * <pre>
 * [primary-key]
 *     VILLAGE_PLAYER_STATS_ID
 *
 * [column]
 *     VILLAGE_PLAYER_STATS_ID, COUNTRY_PLAYER_ID, VILLAGE_ID, CHARACTER_NAME, SKILL_NAME, WINLOSE_CODE, LIFE, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     VILLAGE_PLAYER_STATS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY_PLAYER, VILLAGE, WINLOSE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     countryPlayer, village, winlose
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer villagePlayerStatsId = entity.getVillagePlayerStatsId();
 * Integer countryPlayerId = entity.getCountryPlayerId();
 * Integer villageId = entity.getVillageId();
 * String characterName = entity.getCharacterName();
 * String skillName = entity.getSkillName();
 * String winloseCode = entity.getWinloseCode();
 * String life = entity.getLife();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setVillagePlayerStatsId(villagePlayerStatsId);
 * entity.setCountryPlayerId(countryPlayerId);
 * entity.setVillageId(villageId);
 * entity.setCharacterName(characterName);
 * entity.setSkillName(skillName);
 * entity.setWinloseCode(winloseCode);
 * entity.setLife(life);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVillagePlayerStats extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _villagePlayerStatsId;

    /** COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player} */
    protected Integer _countryPlayerId;

    /** VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village} */
    protected Integer _villageId;

    /** CHARACTER_NAME: {NotNull, VARCHAR(255)} */
    protected String _characterName;

    /** SKILL_NAME: {NotNull, VARCHAR(255)} */
    protected String _skillName;

    /** WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} */
    protected String _winloseCode;

    /** LIFE: {VARCHAR(20)} */
    protected String _life;

    /** REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_TRACE: {NotNull, VARCHAR(64)} */
    protected String _registerTrace;

    /** UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_TRACE: {NotNull, VARCHAR(64)} */
    protected String _updateTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "village_player_stats";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_villagePlayerStatsId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param countryPlayerId : UQ+, NotNull, INT UNSIGNED(10), FK to country_player. (NotNull)
     * @param villageId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to village. (NotNull)
     */
    public void uniqueBy(Integer countryPlayerId, Integer villageId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("countryPlayerId");
        __uniqueDrivenProperties.addPropertyName("villageId");
        setCountryPlayerId(countryPlayerId);setVillageId(villageId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of winloseCode as the classification of WinLose. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
     * 勝敗
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.WinLose getWinloseCodeAsWinLose() {
        return CDef.WinLose.codeOf(getWinloseCode());
    }

    /**
     * Set the value of winloseCode as the classification of WinLose. <br>
     * WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
     * 勝敗
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setWinloseCodeAsWinLose(CDef.WinLose cdef) {
        setWinloseCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of winloseCode as 引分 (DRAW). <br>
     * 引分
     */
    public void setWinloseCode_引分() {
        setWinloseCodeAsWinLose(CDef.WinLose.引分);
    }

    /**
     * Set the value of winloseCode as 敗北 (LOSE). <br>
     * 敗北
     */
    public void setWinloseCode_敗北() {
        setWinloseCodeAsWinLose(CDef.WinLose.敗北);
    }

    /**
     * Set the value of winloseCode as 勝利 (WIN). <br>
     * 勝利
     */
    public void setWinloseCode_勝利() {
        setWinloseCodeAsWinLose(CDef.WinLose.勝利);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of winloseCode 引分? <br>
     * 引分
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWinloseCode引分() {
        CDef.WinLose cdef = getWinloseCodeAsWinLose();
        return cdef != null ? cdef.equals(CDef.WinLose.引分) : false;
    }

    /**
     * Is the value of winloseCode 敗北? <br>
     * 敗北
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWinloseCode敗北() {
        CDef.WinLose cdef = getWinloseCodeAsWinLose();
        return cdef != null ? cdef.equals(CDef.WinLose.敗北) : false;
    }

    /**
     * Is the value of winloseCode 勝利? <br>
     * 勝利
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWinloseCode勝利() {
        CDef.WinLose cdef = getWinloseCodeAsWinLose();
        return cdef != null ? cdef.equals(CDef.WinLose.勝利) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** COUNTRY_PLAYER by my COUNTRY_PLAYER_ID, named 'countryPlayer'. */
    protected OptionalEntity<CountryPlayer> _countryPlayer;

    /**
     * [get] COUNTRY_PLAYER by my COUNTRY_PLAYER_ID, named 'countryPlayer'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'countryPlayer'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CountryPlayer> getCountryPlayer() {
        if (_countryPlayer == null) { _countryPlayer = OptionalEntity.relationEmpty(this, "countryPlayer"); }
        return _countryPlayer;
    }

    /**
     * [set] COUNTRY_PLAYER by my COUNTRY_PLAYER_ID, named 'countryPlayer'.
     * @param countryPlayer The entity of foreign property 'countryPlayer'. (NullAllowed)
     */
    public void setCountryPlayer(OptionalEntity<CountryPlayer> countryPlayer) {
        _countryPlayer = countryPlayer;
    }

    /** VILLAGE by my VILLAGE_ID, named 'village'. */
    protected OptionalEntity<Village> _village;

    /**
     * [get] VILLAGE by my VILLAGE_ID, named 'village'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'village'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Village> getVillage() {
        if (_village == null) { _village = OptionalEntity.relationEmpty(this, "village"); }
        return _village;
    }

    /**
     * [set] VILLAGE by my VILLAGE_ID, named 'village'.
     * @param village The entity of foreign property 'village'. (NullAllowed)
     */
    public void setVillage(OptionalEntity<Village> village) {
        _village = village;
    }

    /** WINLOSE by my WINLOSE_CODE, named 'winlose'. */
    protected OptionalEntity<Winlose> _winlose;

    /**
     * [get] WINLOSE by my WINLOSE_CODE, named 'winlose'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'winlose'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Winlose> getWinlose() {
        if (_winlose == null) { _winlose = OptionalEntity.relationEmpty(this, "winlose"); }
        return _winlose;
    }

    /**
     * [set] WINLOSE by my WINLOSE_CODE, named 'winlose'.
     * @param winlose The entity of foreign property 'winlose'. (NullAllowed)
     */
    public void setWinlose(OptionalEntity<Winlose> winlose) {
        _winlose = winlose;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVillagePlayerStats) {
            BsVillagePlayerStats other = (BsVillagePlayerStats)obj;
            if (!xSV(_villagePlayerStatsId, other._villagePlayerStatsId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _villagePlayerStatsId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_countryPlayer != null && _countryPlayer.isPresent())
        { sb.append(li).append(xbRDS(_countryPlayer, "countryPlayer")); }
        if (_village != null && _village.isPresent())
        { sb.append(li).append(xbRDS(_village, "village")); }
        if (_winlose != null && _winlose.isPresent())
        { sb.append(li).append(xbRDS(_winlose, "winlose")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_villagePlayerStatsId));
        sb.append(dm).append(xfND(_countryPlayerId));
        sb.append(dm).append(xfND(_villageId));
        sb.append(dm).append(xfND(_characterName));
        sb.append(dm).append(xfND(_skillName));
        sb.append(dm).append(xfND(_winloseCode));
        sb.append(dm).append(xfND(_life));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerTrace));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_countryPlayer != null && _countryPlayer.isPresent())
        { sb.append(dm).append("countryPlayer"); }
        if (_village != null && _village.isPresent())
        { sb.append(dm).append("village"); }
        if (_winlose != null && _winlose.isPresent())
        { sb.append(dm).append("winlose"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VillagePlayerStats clone() {
        return (VillagePlayerStats)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 村戦績ID
     * @return The value of the column 'VILLAGE_PLAYER_STATS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVillagePlayerStatsId() {
        checkSpecifiedProperty("villagePlayerStatsId");
        return _villagePlayerStatsId;
    }

    /**
     * [set] VILLAGE_PLAYER_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 村戦績ID
     * @param villagePlayerStatsId The value of the column 'VILLAGE_PLAYER_STATS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVillagePlayerStatsId(Integer villagePlayerStatsId) {
        registerModifiedProperty("villagePlayerStatsId");
        _villagePlayerStatsId = villagePlayerStatsId;
    }

    /**
     * [get] COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player} <br>
     * 国プレイヤーID
     * @return The value of the column 'COUNTRY_PLAYER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryPlayerId() {
        checkSpecifiedProperty("countryPlayerId");
        return _countryPlayerId;
    }

    /**
     * [set] COUNTRY_PLAYER_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country_player} <br>
     * 国プレイヤーID
     * @param countryPlayerId The value of the column 'COUNTRY_PLAYER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryPlayerId(Integer countryPlayerId) {
        registerModifiedProperty("countryPlayerId");
        _countryPlayerId = countryPlayerId;
    }

    /**
     * [get] VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village} <br>
     * 村ID
     * @return The value of the column 'VILLAGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVillageId() {
        checkSpecifiedProperty("villageId");
        return _villageId;
    }

    /**
     * [set] VILLAGE_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to village} <br>
     * 村ID
     * @param villageId The value of the column 'VILLAGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVillageId(Integer villageId) {
        registerModifiedProperty("villageId");
        _villageId = villageId;
    }

    /**
     * [get] CHARACTER_NAME: {NotNull, VARCHAR(255)} <br>
     * キャラクター名
     * @return The value of the column 'CHARACTER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCharacterName() {
        checkSpecifiedProperty("characterName");
        return convertEmptyToNull(_characterName);
    }

    /**
     * [set] CHARACTER_NAME: {NotNull, VARCHAR(255)} <br>
     * キャラクター名
     * @param characterName The value of the column 'CHARACTER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCharacterName(String characterName) {
        registerModifiedProperty("characterName");
        _characterName = characterName;
    }

    /**
     * [get] SKILL_NAME: {NotNull, VARCHAR(255)} <br>
     * 役職名
     * @return The value of the column 'SKILL_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSkillName() {
        checkSpecifiedProperty("skillName");
        return convertEmptyToNull(_skillName);
    }

    /**
     * [set] SKILL_NAME: {NotNull, VARCHAR(255)} <br>
     * 役職名
     * @param skillName The value of the column 'SKILL_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSkillName(String skillName) {
        registerModifiedProperty("skillName");
        _skillName = skillName;
    }

    /**
     * [get] WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
     * 勝敗コード
     * @return The value of the column 'WINLOSE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getWinloseCode() {
        checkSpecifiedProperty("winloseCode");
        return convertEmptyToNull(_winloseCode);
    }

    /**
     * [set] WINLOSE_CODE: {IX, VARCHAR(20), FK to winlose, classification=WinLose} <br>
     * 勝敗コード
     * @param winloseCode The value of the column 'WINLOSE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setWinloseCode(String winloseCode) {
        checkClassificationCode("WINLOSE_CODE", CDef.DefMeta.WinLose, winloseCode);
        registerModifiedProperty("winloseCode");
        _winloseCode = winloseCode;
    }

    /**
     * [get] LIFE: {VARCHAR(20)} <br>
     * 生死
     * @return The value of the column 'LIFE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLife() {
        checkSpecifiedProperty("life");
        return convertEmptyToNull(_life);
    }

    /**
     * [set] LIFE: {VARCHAR(20)} <br>
     * 生死
     * @param life The value of the column 'LIFE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLife(String life) {
        registerModifiedProperty("life");
        _life = life;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_TRACE: {NotNull, VARCHAR(64)} <br>
     * 登録トレース
     * @return The value of the column 'REGISTER_TRACE'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterTrace() {
        checkSpecifiedProperty("registerTrace");
        return convertEmptyToNull(_registerTrace);
    }

    /**
     * [set] REGISTER_TRACE: {NotNull, VARCHAR(64)} <br>
     * 登録トレース
     * @param registerTrace The value of the column 'REGISTER_TRACE'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterTrace(String registerTrace) {
        registerModifiedProperty("registerTrace");
        _registerTrace = registerTrace;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * 更新日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_TRACE: {NotNull, VARCHAR(64)} <br>
     * 更新トレース
     * @return The value of the column 'UPDATE_TRACE'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateTrace() {
        checkSpecifiedProperty("updateTrace");
        return convertEmptyToNull(_updateTrace);
    }

    /**
     * [set] UPDATE_TRACE: {NotNull, VARCHAR(64)} <br>
     * 更新トレース
     * @param updateTrace The value of the column 'UPDATE_TRACE'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateTrace(String updateTrace) {
        registerModifiedProperty("updateTrace");
        _updateTrace = updateTrace;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param winloseCode The value of the column 'WINLOSE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingWinloseCode(String winloseCode) {
        setWinloseCode(winloseCode);
    }
}
