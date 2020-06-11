package com.ort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.ort.dbflute.allcommon.DBMetaInstanceHandler;
import com.ort.dbflute.exentity.*;

/**
 * The entity of COUNTRY_RECRUITMENT_DETAIL as TABLE. <br>
 * 国募集状況詳細
 * <pre>
 * [primary-key]
 *     COUNTRY_RECRUITMENT_DETAIL_ID
 *
 * [column]
 *     COUNTRY_RECRUITMENT_DETAIL_ID, COUNTRY_RECRUITMENT_ID, ITEM_NAME, ITEM_VALUE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_RECRUITMENT_DETAIL_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY_RECRUITMENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     countryRecruitment
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer countryRecruitmentDetailId = entity.getCountryRecruitmentDetailId();
 * Integer countryRecruitmentId = entity.getCountryRecruitmentId();
 * String itemName = entity.getItemName();
 * String itemValue = entity.getItemValue();
 * entity.setCountryRecruitmentDetailId(countryRecruitmentDetailId);
 * entity.setCountryRecruitmentId(countryRecruitmentId);
 * entity.setItemName(itemName);
 * entity.setItemValue(itemValue);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCountryRecruitmentDetail extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COUNTRY_RECRUITMENT_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _countryRecruitmentDetailId;

    /** COUNTRY_RECRUITMENT_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_recruitment} */
    protected Integer _countryRecruitmentId;

    /** ITEM_NAME: {NotNull, VARCHAR(20)} */
    protected String _itemName;

    /** ITEM_VALUE: {NotNull, VARCHAR(1000)} */
    protected String _itemValue;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "country_recruitment_detail";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_countryRecruitmentDetailId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** COUNTRY_RECRUITMENT by my COUNTRY_RECRUITMENT_ID, named 'countryRecruitment'. */
    protected OptionalEntity<CountryRecruitment> _countryRecruitment;

    /**
     * [get] COUNTRY_RECRUITMENT by my COUNTRY_RECRUITMENT_ID, named 'countryRecruitment'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'countryRecruitment'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CountryRecruitment> getCountryRecruitment() {
        if (_countryRecruitment == null) { _countryRecruitment = OptionalEntity.relationEmpty(this, "countryRecruitment"); }
        return _countryRecruitment;
    }

    /**
     * [set] COUNTRY_RECRUITMENT by my COUNTRY_RECRUITMENT_ID, named 'countryRecruitment'.
     * @param countryRecruitment The entity of foreign property 'countryRecruitment'. (NullAllowed)
     */
    public void setCountryRecruitment(OptionalEntity<CountryRecruitment> countryRecruitment) {
        _countryRecruitment = countryRecruitment;
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
        if (obj instanceof BsCountryRecruitmentDetail) {
            BsCountryRecruitmentDetail other = (BsCountryRecruitmentDetail)obj;
            if (!xSV(_countryRecruitmentDetailId, other._countryRecruitmentDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _countryRecruitmentDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_countryRecruitment != null && _countryRecruitment.isPresent())
        { sb.append(li).append(xbRDS(_countryRecruitment, "countryRecruitment")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_countryRecruitmentDetailId));
        sb.append(dm).append(xfND(_countryRecruitmentId));
        sb.append(dm).append(xfND(_itemName));
        sb.append(dm).append(xfND(_itemValue));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_countryRecruitment != null && _countryRecruitment.isPresent())
        { sb.append(dm).append("countryRecruitment"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CountryRecruitmentDetail clone() {
        return (CountryRecruitmentDetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COUNTRY_RECRUITMENT_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国募集状況詳細id
     * @return The value of the column 'COUNTRY_RECRUITMENT_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryRecruitmentDetailId() {
        checkSpecifiedProperty("countryRecruitmentDetailId");
        return _countryRecruitmentDetailId;
    }

    /**
     * [set] COUNTRY_RECRUITMENT_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国募集状況詳細id
     * @param countryRecruitmentDetailId The value of the column 'COUNTRY_RECRUITMENT_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryRecruitmentDetailId(Integer countryRecruitmentDetailId) {
        registerModifiedProperty("countryRecruitmentDetailId");
        _countryRecruitmentDetailId = countryRecruitmentDetailId;
    }

    /**
     * [get] COUNTRY_RECRUITMENT_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_recruitment} <br>
     * 国募集状況id
     * @return The value of the column 'COUNTRY_RECRUITMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryRecruitmentId() {
        checkSpecifiedProperty("countryRecruitmentId");
        return _countryRecruitmentId;
    }

    /**
     * [set] COUNTRY_RECRUITMENT_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_recruitment} <br>
     * 国募集状況id
     * @param countryRecruitmentId The value of the column 'COUNTRY_RECRUITMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryRecruitmentId(Integer countryRecruitmentId) {
        registerModifiedProperty("countryRecruitmentId");
        _countryRecruitmentId = countryRecruitmentId;
    }

    /**
     * [get] ITEM_NAME: {NotNull, VARCHAR(20)} <br>
     * 項目名
     * @return The value of the column 'ITEM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getItemName() {
        checkSpecifiedProperty("itemName");
        return convertEmptyToNull(_itemName);
    }

    /**
     * [set] ITEM_NAME: {NotNull, VARCHAR(20)} <br>
     * 項目名
     * @param itemName The value of the column 'ITEM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setItemName(String itemName) {
        registerModifiedProperty("itemName");
        _itemName = itemName;
    }

    /**
     * [get] ITEM_VALUE: {NotNull, VARCHAR(1000)} <br>
     * 項目値
     * @return The value of the column 'ITEM_VALUE'. (basically NotNull if selected: for the constraint)
     */
    public String getItemValue() {
        checkSpecifiedProperty("itemValue");
        return convertEmptyToNull(_itemValue);
    }

    /**
     * [set] ITEM_VALUE: {NotNull, VARCHAR(1000)} <br>
     * 項目値
     * @param itemValue The value of the column 'ITEM_VALUE'. (basically NotNull if update: for the constraint)
     */
    public void setItemValue(String itemValue) {
        registerModifiedProperty("itemValue");
        _itemValue = itemValue;
    }
}
