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
 * The entity of COUNTRY_RECRUITMENT as TABLE. <br>
 * 国募集状況
 * <pre>
 * [primary-key]
 *     COUNTRY_RECRUITMENT_ID
 *
 * [column]
 *     COUNTRY_RECRUITMENT_ID, COUNTRY_ID, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_RECRUITMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY
 *
 * [referrer table]
 *     COUNTRY_RECRUITMENT_DETAIL
 *
 * [foreign property]
 *     country
 *
 * [referrer property]
 *     countryRecruitmentDetailList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer countryRecruitmentId = entity.getCountryRecruitmentId();
 * Integer countryId = entity.getCountryId();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setCountryRecruitmentId(countryRecruitmentId);
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
public abstract class BsCountryRecruitment extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COUNTRY_RECRUITMENT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _countryRecruitmentId;

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
        return "country_recruitment";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_countryRecruitmentId == null) { return false; }
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
    /** COUNTRY_RECRUITMENT_DETAIL by COUNTRY_RECRUITMENT_ID, named 'countryRecruitmentDetailList'. */
    protected List<CountryRecruitmentDetail> _countryRecruitmentDetailList;

    /**
     * [get] COUNTRY_RECRUITMENT_DETAIL by COUNTRY_RECRUITMENT_ID, named 'countryRecruitmentDetailList'.
     * @return The entity list of referrer property 'countryRecruitmentDetailList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CountryRecruitmentDetail> getCountryRecruitmentDetailList() {
        if (_countryRecruitmentDetailList == null) { _countryRecruitmentDetailList = newReferrerList(); }
        return _countryRecruitmentDetailList;
    }

    /**
     * [set] COUNTRY_RECRUITMENT_DETAIL by COUNTRY_RECRUITMENT_ID, named 'countryRecruitmentDetailList'.
     * @param countryRecruitmentDetailList The entity list of referrer property 'countryRecruitmentDetailList'. (NullAllowed)
     */
    public void setCountryRecruitmentDetailList(List<CountryRecruitmentDetail> countryRecruitmentDetailList) {
        _countryRecruitmentDetailList = countryRecruitmentDetailList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCountryRecruitment) {
            BsCountryRecruitment other = (BsCountryRecruitment)obj;
            if (!xSV(_countryRecruitmentId, other._countryRecruitmentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _countryRecruitmentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_country != null && _country.isPresent())
        { sb.append(li).append(xbRDS(_country, "country")); }
        if (_countryRecruitmentDetailList != null) { for (CountryRecruitmentDetail et : _countryRecruitmentDetailList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "countryRecruitmentDetailList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_countryRecruitmentId));
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
        if (_countryRecruitmentDetailList != null && !_countryRecruitmentDetailList.isEmpty())
        { sb.append(dm).append("countryRecruitmentDetailList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CountryRecruitment clone() {
        return (CountryRecruitment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COUNTRY_RECRUITMENT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国募集状況id
     * @return The value of the column 'COUNTRY_RECRUITMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryRecruitmentId() {
        checkSpecifiedProperty("countryRecruitmentId");
        return _countryRecruitmentId;
    }

    /**
     * [set] COUNTRY_RECRUITMENT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国募集状況id
     * @param countryRecruitmentId The value of the column 'COUNTRY_RECRUITMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryRecruitmentId(Integer countryRecruitmentId) {
        registerModifiedProperty("countryRecruitmentId");
        _countryRecruitmentId = countryRecruitmentId;
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
