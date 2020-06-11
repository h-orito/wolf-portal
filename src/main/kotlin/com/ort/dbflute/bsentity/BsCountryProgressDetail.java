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
 * The entity of COUNTRY_PROGRESS_DETAIL as TABLE. <br>
 * 国進行状況詳細
 * <pre>
 * [primary-key]
 *     COUNTRY_PROGRESS_DETAIL_ID
 *
 * [column]
 *     COUNTRY_PROGRESS_DETAIL_ID, COUNTRY_PROGRESS_ID, ITEM_NAME, ITEM_VALUE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_PROGRESS_DETAIL_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY_PROGRESS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     countryProgress
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer countryProgressDetailId = entity.getCountryProgressDetailId();
 * Integer countryProgressId = entity.getCountryProgressId();
 * String itemName = entity.getItemName();
 * String itemValue = entity.getItemValue();
 * entity.setCountryProgressDetailId(countryProgressDetailId);
 * entity.setCountryProgressId(countryProgressId);
 * entity.setItemName(itemName);
 * entity.setItemValue(itemValue);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCountryProgressDetail extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _countryProgressDetailId;

    /** COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress} */
    protected Integer _countryProgressId;

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
        return "country_progress_detail";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_countryProgressDetailId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** COUNTRY_PROGRESS by my COUNTRY_PROGRESS_ID, named 'countryProgress'. */
    protected OptionalEntity<CountryProgress> _countryProgress;

    /**
     * [get] COUNTRY_PROGRESS by my COUNTRY_PROGRESS_ID, named 'countryProgress'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'countryProgress'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CountryProgress> getCountryProgress() {
        if (_countryProgress == null) { _countryProgress = OptionalEntity.relationEmpty(this, "countryProgress"); }
        return _countryProgress;
    }

    /**
     * [set] COUNTRY_PROGRESS by my COUNTRY_PROGRESS_ID, named 'countryProgress'.
     * @param countryProgress The entity of foreign property 'countryProgress'. (NullAllowed)
     */
    public void setCountryProgress(OptionalEntity<CountryProgress> countryProgress) {
        _countryProgress = countryProgress;
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
        if (obj instanceof BsCountryProgressDetail) {
            BsCountryProgressDetail other = (BsCountryProgressDetail)obj;
            if (!xSV(_countryProgressDetailId, other._countryProgressDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _countryProgressDetailId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_countryProgress != null && _countryProgress.isPresent())
        { sb.append(li).append(xbRDS(_countryProgress, "countryProgress")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_countryProgressDetailId));
        sb.append(dm).append(xfND(_countryProgressId));
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
        if (_countryProgress != null && _countryProgress.isPresent())
        { sb.append(dm).append("countryProgress"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CountryProgressDetail clone() {
        return (CountryProgressDetail)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国進行状況詳細id
     * @return The value of the column 'COUNTRY_PROGRESS_DETAIL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryProgressDetailId() {
        checkSpecifiedProperty("countryProgressDetailId");
        return _countryProgressDetailId;
    }

    /**
     * [set] COUNTRY_PROGRESS_DETAIL_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 国進行状況詳細id
     * @param countryProgressDetailId The value of the column 'COUNTRY_PROGRESS_DETAIL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryProgressDetailId(Integer countryProgressDetailId) {
        registerModifiedProperty("countryProgressDetailId");
        _countryProgressDetailId = countryProgressDetailId;
    }

    /**
     * [get] COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress} <br>
     * 国進行状況id
     * @return The value of the column 'COUNTRY_PROGRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCountryProgressId() {
        checkSpecifiedProperty("countryProgressId");
        return _countryProgressId;
    }

    /**
     * [set] COUNTRY_PROGRESS_ID: {IX, NotNull, INT UNSIGNED(10), FK to country_progress} <br>
     * 国進行状況id
     * @param countryProgressId The value of the column 'COUNTRY_PROGRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCountryProgressId(Integer countryProgressId) {
        registerModifiedProperty("countryProgressId");
        _countryProgressId = countryProgressId;
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
