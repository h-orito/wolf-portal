package com.ort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.ort.dbflute.allcommon.EntityDefinedCommonColumn;
import com.ort.dbflute.allcommon.DBMetaInstanceHandler;
import com.ort.dbflute.exentity.*;

/**
 * The entity of COUNTRY as TABLE. <br>
 * 国
 * <pre>
 * [primary-key]
 *     COUNTRY_ID
 *
 * [column]
 *     COUNTRY_ID, COUNTRY_NAME, COUNTRY_TOP_PAGE_URL, DISPLAY_ORDER, IS_CRAWL_FAIL, IS_DISPLAY, LAST_UPDATE_DATETIME, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     COUNTRY_PLAYER, COUNTRY_PROGRESS, COUNTRY_RECRUITMENT, VILLAGE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     countryPlayerList, countryProgressList, countryRecruitmentList, villageList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer countryId = entity.getCountryId();
 * String countryName = entity.getCountryName();
 * String countryTopPageUrl = entity.getCountryTopPageUrl();
 * Integer displayOrder = entity.getDisplayOrder();
 * Boolean isCrawlFail = entity.getIsCrawlFail();
 * Boolean isDisplay = entity.getIsDisplay();
 * java.time.LocalDateTime lastUpdateDatetime = entity.getLastUpdateDatetime();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCountryId(countryId);
 * entity.setCountryName(countryName);
 * entity.setCountryTopPageUrl(countryTopPageUrl);
 * entity.setDisplayOrder(displayOrder);
 * entity.setIsCrawlFail(isCrawlFail);
 * entity.setIsDisplay(isDisplay);
 * entity.setLastUpdateDatetime(lastUpdateDatetime);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCountry extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _countryId;

    /** COUNTRY_NAME: {NotNull, VARCHAR(100)} */
    protected String _countryName;

    /** COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)} */
    protected String _countryTopPageUrl;

    /** DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)} */
    protected Integer _displayOrder;

    /** IS_CRAWL_FAIL: {NotNull, BIT} */
    protected Boolean _isCrawlFail;

    /** IS_DISPLAY: {NotNull, BIT} */
    protected Boolean _isDisplay;

    /** LAST_UPDATE_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _lastUpdateDatetime;

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
        return "country";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_countryId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** COUNTRY_PLAYER by COUNTRY_ID, named 'countryPlayerList'. */
    protected List<CountryPlayer> _countryPlayerList;

    /**
     * [get] COUNTRY_PLAYER by COUNTRY_ID, named 'countryPlayerList'.
     * @return The entity list of referrer property 'countryPlayerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CountryPlayer> getCountryPlayerList() {
        if (_countryPlayerList == null) { _countryPlayerList = newReferrerList(); }
        return _countryPlayerList;
    }

    /**
     * [set] COUNTRY_PLAYER by COUNTRY_ID, named 'countryPlayerList'.
     * @param countryPlayerList The entity list of referrer property 'countryPlayerList'. (NullAllowed)
     */
    public void setCountryPlayerList(List<CountryPlayer> countryPlayerList) {
        _countryPlayerList = countryPlayerList;
    }

    /** COUNTRY_PROGRESS by COUNTRY_ID, named 'countryProgressList'. */
    protected List<CountryProgress> _countryProgressList;

    /**
     * [get] COUNTRY_PROGRESS by COUNTRY_ID, named 'countryProgressList'.
     * @return The entity list of referrer property 'countryProgressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CountryProgress> getCountryProgressList() {
        if (_countryProgressList == null) { _countryProgressList = newReferrerList(); }
        return _countryProgressList;
    }

    /**
     * [set] COUNTRY_PROGRESS by COUNTRY_ID, named 'countryProgressList'.
     * @param countryProgressList The entity list of referrer property 'countryProgressList'. (NullAllowed)
     */
    public void setCountryProgressList(List<CountryProgress> countryProgressList) {
        _countryProgressList = countryProgressList;
    }

    /** COUNTRY_RECRUITMENT by COUNTRY_ID, named 'countryRecruitmentList'. */
    protected List<CountryRecruitment> _countryRecruitmentList;

    /**
     * [get] COUNTRY_RECRUITMENT by COUNTRY_ID, named 'countryRecruitmentList'.
     * @return The entity list of referrer property 'countryRecruitmentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CountryRecruitment> getCountryRecruitmentList() {
        if (_countryRecruitmentList == null) { _countryRecruitmentList = newReferrerList(); }
        return _countryRecruitmentList;
    }

    /**
     * [set] COUNTRY_RECRUITMENT by COUNTRY_ID, named 'countryRecruitmentList'.
     * @param countryRecruitmentList The entity list of referrer property 'countryRecruitmentList'. (NullAllowed)
     */
    public void setCountryRecruitmentList(List<CountryRecruitment> countryRecruitmentList) {
        _countryRecruitmentList = countryRecruitmentList;
    }

    /** VILLAGE by COUNTRY_ID, named 'villageList'. */
    protected List<Village> _villageList;

    /**
     * [get] VILLAGE by COUNTRY_ID, named 'villageList'.
     * @return The entity list of referrer property 'villageList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Village> getVillageList() {
        if (_villageList == null) { _villageList = newReferrerList(); }
        return _villageList;
    }

    /**
     * [set] VILLAGE by COUNTRY_ID, named 'villageList'.
     * @param villageList The entity list of referrer property 'villageList'. (NullAllowed)
     */
    public void setVillageList(List<Village> villageList) {
        _villageList = villageList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCountry) {
            BsCountry other = (BsCountry)obj;
            if (!xSV(_countryId, other._countryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _countryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_countryPlayerList != null) { for (CountryPlayer et : _countryPlayerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "countryPlayerList")); } } }
        if (_countryProgressList != null) { for (CountryProgress et : _countryProgressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "countryProgressList")); } } }
        if (_countryRecruitmentList != null) { for (CountryRecruitment et : _countryRecruitmentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "countryRecruitmentList")); } } }
        if (_villageList != null) { for (Village et : _villageList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "villageList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_countryId));
        sb.append(dm).append(xfND(_countryName));
        sb.append(dm).append(xfND(_countryTopPageUrl));
        sb.append(dm).append(xfND(_displayOrder));
        sb.append(dm).append(xfND(_isCrawlFail));
        sb.append(dm).append(xfND(_isDisplay));
        sb.append(dm).append(xfND(_lastUpdateDatetime));
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
        if (_countryPlayerList != null && !_countryPlayerList.isEmpty())
        { sb.append(dm).append("countryPlayerList"); }
        if (_countryProgressList != null && !_countryProgressList.isEmpty())
        { sb.append(dm).append("countryProgressList"); }
        if (_countryRecruitmentList != null && !_countryRecruitmentList.isEmpty())
        { sb.append(dm).append("countryRecruitmentList"); }
        if (_villageList != null && !_villageList.isEmpty())
        { sb.append(dm).append("villageList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Country clone() {
        return (Country)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国id
     * @return The value of the column 'COUNTRY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryId() {
        checkSpecifiedProperty("countryId");
        return _countryId;
    }

    /**
     * [set] COUNTRY_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国id
     * @param countryId The value of the column 'COUNTRY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryId(Integer countryId) {
        registerModifiedProperty("countryId");
        _countryId = countryId;
    }

    /**
     * [get] COUNTRY_NAME: {NotNull, VARCHAR(100)} <br>
     * 国名
     * @return The value of the column 'COUNTRY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCountryName() {
        checkSpecifiedProperty("countryName");
        return convertEmptyToNull(_countryName);
    }

    /**
     * [set] COUNTRY_NAME: {NotNull, VARCHAR(100)} <br>
     * 国名
     * @param countryName The value of the column 'COUNTRY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCountryName(String countryName) {
        registerModifiedProperty("countryName");
        _countryName = countryName;
    }

    /**
     * [get] COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)} <br>
     * 国トップページURL
     * @return The value of the column 'COUNTRY_TOP_PAGE_URL'. (basically NotNull if selected: for the constraint)
     */
    public String getCountryTopPageUrl() {
        checkSpecifiedProperty("countryTopPageUrl");
        return convertEmptyToNull(_countryTopPageUrl);
    }

    /**
     * [set] COUNTRY_TOP_PAGE_URL: {NotNull, VARCHAR(255)} <br>
     * 国トップページURL
     * @param countryTopPageUrl The value of the column 'COUNTRY_TOP_PAGE_URL'. (basically NotNull if update: for the constraint)
     */
    public void setCountryTopPageUrl(String countryTopPageUrl) {
        registerModifiedProperty("countryTopPageUrl");
        _countryTopPageUrl = countryTopPageUrl;
    }

    /**
     * [get] DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)} <br>
     * 表示順
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)} <br>
     * 表示順
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * [get] IS_CRAWL_FAIL: {NotNull, BIT} <br>
     * クロール失敗しているか
     * @return The value of the column 'IS_CRAWL_FAIL'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIsCrawlFail() {
        checkSpecifiedProperty("isCrawlFail");
        return _isCrawlFail;
    }

    /**
     * [set] IS_CRAWL_FAIL: {NotNull, BIT} <br>
     * クロール失敗しているか
     * @param isCrawlFail The value of the column 'IS_CRAWL_FAIL'. (basically NotNull if update: for the constraint)
     */
    public void setIsCrawlFail(Boolean isCrawlFail) {
        registerModifiedProperty("isCrawlFail");
        _isCrawlFail = isCrawlFail;
    }

    /**
     * [get] IS_DISPLAY: {NotNull, BIT} <br>
     * 表示するか
     * @return The value of the column 'IS_DISPLAY'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getIsDisplay() {
        checkSpecifiedProperty("isDisplay");
        return _isDisplay;
    }

    /**
     * [set] IS_DISPLAY: {NotNull, BIT} <br>
     * 表示するか
     * @param isDisplay The value of the column 'IS_DISPLAY'. (basically NotNull if update: for the constraint)
     */
    public void setIsDisplay(Boolean isDisplay) {
        registerModifiedProperty("isDisplay");
        _isDisplay = isDisplay;
    }

    /**
     * [get] LAST_UPDATE_DATETIME: {DATETIME(19)} <br>
     * 最終取得日時
     * @return The value of the column 'LAST_UPDATE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getLastUpdateDatetime() {
        checkSpecifiedProperty("lastUpdateDatetime");
        return _lastUpdateDatetime;
    }

    /**
     * [set] LAST_UPDATE_DATETIME: {DATETIME(19)} <br>
     * 最終取得日時
     * @param lastUpdateDatetime The value of the column 'LAST_UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastUpdateDatetime(java.time.LocalDateTime lastUpdateDatetime) {
        registerModifiedProperty("lastUpdateDatetime");
        _lastUpdateDatetime = lastUpdateDatetime;
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
