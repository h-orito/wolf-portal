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
 * The entity of COUNTRY_PROGRESS as TABLE. <br>
 * 国進行状況
 * <pre>
 * [primary-key]
 *     COUNTRY_PROGRESS_ID
 *
 * [column]
 *     COUNTRY_PROGRESS_ID, COUNTRY_ID, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_PROGRESS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY
 *
 * [referrer table]
 *     COUNTRY_PROGRESS_DETAIL
 *
 * [foreign property]
 *     country
 *
 * [referrer property]
 *     countryProgressDetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer countryProgressId = entity.getCountryProgressId();
 * Integer countryId = entity.getCountryId();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCountryProgressId(countryProgressId);
 * entity.setCountryId(countryId);
 * entity.setDisplayOrder(displayOrder);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCountryProgress extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COUNTRY_PROGRESS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _countryProgressId;

    /** COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country} */
    protected Integer _countryId;

    /** DISPLAY_ORDER: {NotNull, INT UNSIGNED(10)} */
    protected Integer _displayOrder;

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
        return "country_progress";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_countryProgressId == null) { return false; }
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
    /** COUNTRY_PROGRESS_DETAIL by COUNTRY_PROGRESS_ID, named 'countryProgressDetailList'. */
    protected List<CountryProgressDetail> _countryProgressDetailList;

    /**
     * [get] COUNTRY_PROGRESS_DETAIL by COUNTRY_PROGRESS_ID, named 'countryProgressDetailList'.
     * @return The entity list of referrer property 'countryProgressDetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CountryProgressDetail> getCountryProgressDetailList() {
        if (_countryProgressDetailList == null) { _countryProgressDetailList = newReferrerList(); }
        return _countryProgressDetailList;
    }

    /**
     * [set] COUNTRY_PROGRESS_DETAIL by COUNTRY_PROGRESS_ID, named 'countryProgressDetailList'.
     * @param countryProgressDetailList The entity list of referrer property 'countryProgressDetailList'. (NullAllowed)
     */
    public void setCountryProgressDetailList(List<CountryProgressDetail> countryProgressDetailList) {
        _countryProgressDetailList = countryProgressDetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCountryProgress) {
            BsCountryProgress other = (BsCountryProgress)obj;
            if (!xSV(_countryProgressId, other._countryProgressId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _countryProgressId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_country != null && _country.isPresent())
        { sb.append(li).append(xbRDS(_country, "country")); }
        if (_countryProgressDetailList != null) { for (CountryProgressDetail et : _countryProgressDetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "countryProgressDetailList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_countryProgressId));
        sb.append(dm).append(xfND(_countryId));
        sb.append(dm).append(xfND(_displayOrder));
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
        if (_countryProgressDetailList != null && !_countryProgressDetailList.isEmpty())
        { sb.append(dm).append("countryProgressDetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CountryProgress clone() {
        return (CountryProgress)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COUNTRY_PROGRESS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国進行状況id
     * @return The value of the column 'COUNTRY_PROGRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryProgressId() {
        checkSpecifiedProperty("countryProgressId");
        return _countryProgressId;
    }

    /**
     * [set] COUNTRY_PROGRESS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国進行状況id
     * @param countryProgressId The value of the column 'COUNTRY_PROGRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryProgressId(Integer countryProgressId) {
        registerModifiedProperty("countryProgressId");
        _countryProgressId = countryProgressId;
    }

    /**
     * [get] COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country} <br>
     * 国id
     * @return The value of the column 'COUNTRY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryId() {
        checkSpecifiedProperty("countryId");
        return _countryId;
    }

    /**
     * [set] COUNTRY_ID: {IX, NotNull, INT UNSIGNED(10), FK to country} <br>
     * 国id
     * @param countryId The value of the column 'COUNTRY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryId(Integer countryId) {
        registerModifiedProperty("countryId");
        _countryId = countryId;
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
