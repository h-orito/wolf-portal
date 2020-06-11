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
import com.ort.dbflute.exentity.*;

/**
 * The entity of COUNTRY_PLAYER as TABLE. <br>
 * 国プレイヤー
 * <pre>
 * [primary-key]
 *     COUNTRY_PLAYER_ID
 *
 * [column]
 *     COUNTRY_PLAYER_ID, COUNTRY_ID, PLAYER_ID, USER_ID, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_PLAYER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY, PLAYER
 *
 * [referrer table]
 *     VILLAGE_PLAYER_STATS
 *
 * [foreign property]
 *     country, player
 *
 * [referrer property]
 *     villagePlayerStatsList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer countryPlayerId = entity.getCountryPlayerId();
 * Integer countryId = entity.getCountryId();
 * Integer playerId = entity.getPlayerId();
 * String userId = entity.getUserId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCountryPlayerId(countryPlayerId);
 * entity.setCountryId(countryId);
 * entity.setPlayerId(playerId);
 * entity.setUserId(userId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCountryPlayer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COUNTRY_PLAYER_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _countryPlayerId;

    /** COUNTRY_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country} */
    protected Integer _countryId;

    /** PLAYER_ID: {IX, NotNull, INT UNSIGNED(10), FK to player} */
    protected Integer _playerId;

    /** USER_ID: {+UQ, NotNull, VARCHAR(100)} */
    protected String _userId;

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
        return "country_player";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_countryPlayerId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param countryId : UQ+, NotNull, INT UNSIGNED(10), FK to country. (NotNull)
     * @param userId : +UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(Integer countryId, String userId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("countryId");
        __uniqueDrivenProperties.addPropertyName("userId");
        setCountryId(countryId);setUserId(userId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** COUNTRY by my COUNTRY_ID, named 'country'. */
    protected OptionalEntity<Country> _country;

    /**
     * [get] COUNTRY by my COUNTRY_ID, named 'country'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'country'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Country> getCountry() {
        if (_country == null) { _country = OptionalEntity.relationEmpty(this, "country"); }
        return _country;
    }

    /**
     * [set] COUNTRY by my COUNTRY_ID, named 'country'.
     * @param country The entity of foreign property 'country'. (NullAllowed)
     */
    public void setCountry(OptionalEntity<Country> country) {
        _country = country;
    }

    /** PLAYER by my PLAYER_ID, named 'player'. */
    protected OptionalEntity<Player> _player;

    /**
     * [get] PLAYER by my PLAYER_ID, named 'player'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'player'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Player> getPlayer() {
        if (_player == null) { _player = OptionalEntity.relationEmpty(this, "player"); }
        return _player;
    }

    /**
     * [set] PLAYER by my PLAYER_ID, named 'player'.
     * @param player The entity of foreign property 'player'. (NullAllowed)
     */
    public void setPlayer(OptionalEntity<Player> player) {
        _player = player;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VILLAGE_PLAYER_STATS by COUNTRY_PLAYER_ID, named 'villagePlayerStatsList'. */
    protected List<VillagePlayerStats> _villagePlayerStatsList;

    /**
     * [get] VILLAGE_PLAYER_STATS by COUNTRY_PLAYER_ID, named 'villagePlayerStatsList'.
     * @return The entity list of referrer property 'villagePlayerStatsList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VillagePlayerStats> getVillagePlayerStatsList() {
        if (_villagePlayerStatsList == null) { _villagePlayerStatsList = newReferrerList(); }
        return _villagePlayerStatsList;
    }

    /**
     * [set] VILLAGE_PLAYER_STATS by COUNTRY_PLAYER_ID, named 'villagePlayerStatsList'.
     * @param villagePlayerStatsList The entity list of referrer property 'villagePlayerStatsList'. (NullAllowed)
     */
    public void setVillagePlayerStatsList(List<VillagePlayerStats> villagePlayerStatsList) {
        _villagePlayerStatsList = villagePlayerStatsList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCountryPlayer) {
            BsCountryPlayer other = (BsCountryPlayer)obj;
            if (!xSV(_countryPlayerId, other._countryPlayerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _countryPlayerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_country != null && _country.isPresent())
        { sb.append(li).append(xbRDS(_country, "country")); }
        if (_player != null && _player.isPresent())
        { sb.append(li).append(xbRDS(_player, "player")); }
        if (_villagePlayerStatsList != null) { for (VillagePlayerStats et : _villagePlayerStatsList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "villagePlayerStatsList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_countryPlayerId));
        sb.append(dm).append(xfND(_countryId));
        sb.append(dm).append(xfND(_playerId));
        sb.append(dm).append(xfND(_userId));
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
        if (_country != null && _country.isPresent())
        { sb.append(dm).append("country"); }
        if (_player != null && _player.isPresent())
        { sb.append(dm).append("player"); }
        if (_villagePlayerStatsList != null && !_villagePlayerStatsList.isEmpty())
        { sb.append(dm).append("villagePlayerStatsList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CountryPlayer clone() {
        return (CountryPlayer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COUNTRY_PLAYER_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国プレイヤーID
     * @return The value of the column 'COUNTRY_PLAYER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryPlayerId() {
        checkSpecifiedProperty("countryPlayerId");
        return _countryPlayerId;
    }

    /**
     * [set] COUNTRY_PLAYER_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国プレイヤーID
     * @param countryPlayerId The value of the column 'COUNTRY_PLAYER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryPlayerId(Integer countryPlayerId) {
        registerModifiedProperty("countryPlayerId");
        _countryPlayerId = countryPlayerId;
    }

    /**
     * [get] COUNTRY_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country} <br>
     * 国ID
     * @return The value of the column 'COUNTRY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryId() {
        checkSpecifiedProperty("countryId");
        return _countryId;
    }

    /**
     * [set] COUNTRY_ID: {UQ+, NotNull, INT UNSIGNED(10), FK to country} <br>
     * 国ID
     * @param countryId The value of the column 'COUNTRY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryId(Integer countryId) {
        registerModifiedProperty("countryId");
        _countryId = countryId;
    }

    /**
     * [get] PLAYER_ID: {IX, NotNull, INT UNSIGNED(10), FK to player} <br>
     * プレイヤーID
     * @return The value of the column 'PLAYER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPlayerId() {
        checkSpecifiedProperty("playerId");
        return _playerId;
    }

    /**
     * [set] PLAYER_ID: {IX, NotNull, INT UNSIGNED(10), FK to player} <br>
     * プレイヤーID
     * @param playerId The value of the column 'PLAYER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPlayerId(Integer playerId) {
        registerModifiedProperty("playerId");
        _playerId = playerId;
    }

    /**
     * [get] USER_ID: {+UQ, NotNull, VARCHAR(100)} <br>
     * ユーザID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getUserId() {
        checkSpecifiedProperty("userId");
        return convertEmptyToNull(_userId);
    }

    /**
     * [set] USER_ID: {+UQ, NotNull, VARCHAR(100)} <br>
     * ユーザID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(String userId) {
        registerModifiedProperty("userId");
        _userId = userId;
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
}
