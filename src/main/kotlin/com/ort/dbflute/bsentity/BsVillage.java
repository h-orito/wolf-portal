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
 * The entity of VILLAGE as TABLE. <br>
 * 村
 * <pre>
 * [primary-key]
 *     VILLAGE_ID
 *
 * [column]
 *     VILLAGE_ID, COUNTRY_ID, VILLAGE_NAME, VILLAGE_NO, VILLAGE_URL, VILLAGE_START_DATETIME, VILLAGE_END_DATETIME, WIN_CAMP_NAME, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     VILLAGE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY
 *
 * [referrer table]
 *     VILLAGE_PLAYER_STATS
 *
 * [foreign property]
 *     country
 *
 * [referrer property]
 *     villagePlayerStatsList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer villageId = entity.getVillageId();
 * Integer countryId = entity.getCountryId();
 * String villageName = entity.getVillageName();
 * Integer villageNo = entity.getVillageNo();
 * String villageUrl = entity.getVillageUrl();
 * java.time.LocalDateTime villageStartDatetime = entity.getVillageStartDatetime();
 * java.time.LocalDateTime villageEndDatetime = entity.getVillageEndDatetime();
 * String winCampName = entity.getWinCampName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setVillageId(villageId);
 * entity.setCountryId(countryId);
 * entity.setVillageName(villageName);
 * entity.setVillageNo(villageNo);
 * entity.setVillageUrl(villageUrl);
 * entity.setVillageStartDatetime(villageStartDatetime);
 * entity.setVillageEndDatetime(villageEndDatetime);
 * entity.setWinCampName(winCampName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVillage extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _villageId;

    /** COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country} */
    protected Integer _countryId;

    /** VILLAGE_NAME: {NotNull, VARCHAR(255)} */
    protected String _villageName;

    /** VILLAGE_NO: {NotNull, INT UNSIGNED(10)} */
    protected Integer _villageNo;

    /** VILLAGE_URL: {NotNull, VARCHAR(255)} */
    protected String _villageUrl;

    /** VILLAGE_START_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _villageStartDatetime;

    /** VILLAGE_END_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _villageEndDatetime;

    /** WIN_CAMP_NAME: {VARCHAR(255)} */
    protected String _winCampName;

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
        return "village";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_villageId == null) { return false; }
        return true;
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VILLAGE_PLAYER_STATS by VILLAGE_ID, named 'villagePlayerStatsList'. */
    protected List<VillagePlayerStats> _villagePlayerStatsList;

    /**
     * [get] VILLAGE_PLAYER_STATS by VILLAGE_ID, named 'villagePlayerStatsList'.
     * @return The entity list of referrer property 'villagePlayerStatsList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VillagePlayerStats> getVillagePlayerStatsList() {
        if (_villagePlayerStatsList == null) { _villagePlayerStatsList = newReferrerList(); }
        return _villagePlayerStatsList;
    }

    /**
     * [set] VILLAGE_PLAYER_STATS by VILLAGE_ID, named 'villagePlayerStatsList'.
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
        if (obj instanceof BsVillage) {
            BsVillage other = (BsVillage)obj;
            if (!xSV(_villageId, other._villageId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _villageId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_country != null && _country.isPresent())
        { sb.append(li).append(xbRDS(_country, "country")); }
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
        sb.append(dm).append(xfND(_villageId));
        sb.append(dm).append(xfND(_countryId));
        sb.append(dm).append(xfND(_villageName));
        sb.append(dm).append(xfND(_villageNo));
        sb.append(dm).append(xfND(_villageUrl));
        sb.append(dm).append(xfND(_villageStartDatetime));
        sb.append(dm).append(xfND(_villageEndDatetime));
        sb.append(dm).append(xfND(_winCampName));
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
        if (_villagePlayerStatsList != null && !_villagePlayerStatsList.isEmpty())
        { sb.append(dm).append("villagePlayerStatsList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Village clone() {
        return (Village)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 村ID
     * @return The value of the column 'VILLAGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVillageId() {
        checkSpecifiedProperty("villageId");
        return _villageId;
    }

    /**
     * [set] VILLAGE_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 村ID
     * @param villageId The value of the column 'VILLAGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVillageId(Integer villageId) {
        registerModifiedProperty("villageId");
        _villageId = villageId;
    }

    /**
     * [get] COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country} <br>
     * 国ID
     * @return The value of the column 'COUNTRY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryId() {
        checkSpecifiedProperty("countryId");
        return _countryId;
    }

    /**
     * [set] COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country} <br>
     * 国ID
     * @param countryId The value of the column 'COUNTRY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryId(Integer countryId) {
        registerModifiedProperty("countryId");
        _countryId = countryId;
    }

    /**
     * [get] VILLAGE_NAME: {NotNull, VARCHAR(255)} <br>
     * 村名
     * @return The value of the column 'VILLAGE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getVillageName() {
        checkSpecifiedProperty("villageName");
        return convertEmptyToNull(_villageName);
    }

    /**
     * [set] VILLAGE_NAME: {NotNull, VARCHAR(255)} <br>
     * 村名
     * @param villageName The value of the column 'VILLAGE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setVillageName(String villageName) {
        registerModifiedProperty("villageName");
        _villageName = villageName;
    }

    /**
     * [get] VILLAGE_NO: {NotNull, INT UNSIGNED(10)} <br>
     * 村番号
     * @return The value of the column 'VILLAGE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVillageNo() {
        checkSpecifiedProperty("villageNo");
        return _villageNo;
    }

    /**
     * [set] VILLAGE_NO: {NotNull, INT UNSIGNED(10)} <br>
     * 村番号
     * @param villageNo The value of the column 'VILLAGE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVillageNo(Integer villageNo) {
        registerModifiedProperty("villageNo");
        _villageNo = villageNo;
    }

    /**
     * [get] VILLAGE_URL: {NotNull, VARCHAR(255)} <br>
     * 村URL
     * @return The value of the column 'VILLAGE_URL'. (basically NotNull if selected: for the constraint)
     */
    public String getVillageUrl() {
        checkSpecifiedProperty("villageUrl");
        return convertEmptyToNull(_villageUrl);
    }

    /**
     * [set] VILLAGE_URL: {NotNull, VARCHAR(255)} <br>
     * 村URL
     * @param villageUrl The value of the column 'VILLAGE_URL'. (basically NotNull if update: for the constraint)
     */
    public void setVillageUrl(String villageUrl) {
        registerModifiedProperty("villageUrl");
        _villageUrl = villageUrl;
    }

    /**
     * [get] VILLAGE_START_DATETIME: {DATETIME(19)} <br>
     * 開始日時
     * @return The value of the column 'VILLAGE_START_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getVillageStartDatetime() {
        checkSpecifiedProperty("villageStartDatetime");
        return _villageStartDatetime;
    }

    /**
     * [set] VILLAGE_START_DATETIME: {DATETIME(19)} <br>
     * 開始日時
     * @param villageStartDatetime The value of the column 'VILLAGE_START_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVillageStartDatetime(java.time.LocalDateTime villageStartDatetime) {
        registerModifiedProperty("villageStartDatetime");
        _villageStartDatetime = villageStartDatetime;
    }

    /**
     * [get] VILLAGE_END_DATETIME: {DATETIME(19)} <br>
     * 終了日時
     * @return The value of the column 'VILLAGE_END_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getVillageEndDatetime() {
        checkSpecifiedProperty("villageEndDatetime");
        return _villageEndDatetime;
    }

    /**
     * [set] VILLAGE_END_DATETIME: {DATETIME(19)} <br>
     * 終了日時
     * @param villageEndDatetime The value of the column 'VILLAGE_END_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVillageEndDatetime(java.time.LocalDateTime villageEndDatetime) {
        registerModifiedProperty("villageEndDatetime");
        _villageEndDatetime = villageEndDatetime;
    }

    /**
     * [get] WIN_CAMP_NAME: {VARCHAR(255)} <br>
     * 勝利陣営名
     * @return The value of the column 'WIN_CAMP_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getWinCampName() {
        checkSpecifiedProperty("winCampName");
        return convertEmptyToNull(_winCampName);
    }

    /**
     * [set] WIN_CAMP_NAME: {VARCHAR(255)} <br>
     * 勝利陣営名
     * @param winCampName The value of the column 'WIN_CAMP_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWinCampName(String winCampName) {
        registerModifiedProperty("winCampName");
        _winCampName = winCampName;
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
