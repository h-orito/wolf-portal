package com.ort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.ort.dbflute.allcommon.DBMetaInstanceHandler;
import com.ort.dbflute.allcommon.CDef;
import com.ort.dbflute.exentity.*;

/**
 * The entity of WINLOSE as TABLE. <br>
 * 勝敗
 * <pre>
 * [primary-key]
 *     WINLOSE_CODE
 *
 * [column]
 *     WINLOSE_CODE, WINLOSE_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     VILLAGE_PLAYER_STATS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     villagePlayerStatsList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String winloseCode = entity.getWinloseCode();
 * String winloseName = entity.getWinloseName();
 * entity.setWinloseCode(winloseCode);
 * entity.setWinloseName(winloseName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWinlose extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} */
    protected String _winloseCode;

    /** WINLOSE_NAME: {NotNull, VARCHAR(255)} */
    protected String _winloseName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "winlose";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_winloseCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of winloseCode as the classification of WinLose. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.WinLose getWinloseCodeAsWinLose() {
        return CDef.WinLose.codeOf(getWinloseCode());
    }

    /**
     * Set the value of winloseCode as the classification of WinLose. <br>
     * WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VILLAGE_PLAYER_STATS by WINLOSE_CODE, named 'villagePlayerStatsList'. */
    protected List<VillagePlayerStats> _villagePlayerStatsList;

    /**
     * [get] VILLAGE_PLAYER_STATS by WINLOSE_CODE, named 'villagePlayerStatsList'.
     * @return The entity list of referrer property 'villagePlayerStatsList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VillagePlayerStats> getVillagePlayerStatsList() {
        if (_villagePlayerStatsList == null) { _villagePlayerStatsList = newReferrerList(); }
        return _villagePlayerStatsList;
    }

    /**
     * [set] VILLAGE_PLAYER_STATS by WINLOSE_CODE, named 'villagePlayerStatsList'.
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
        if (obj instanceof BsWinlose) {
            BsWinlose other = (BsWinlose)obj;
            if (!xSV(_winloseCode, other._winloseCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _winloseCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_villagePlayerStatsList != null) { for (VillagePlayerStats et : _villagePlayerStatsList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "villagePlayerStatsList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_winloseCode));
        sb.append(dm).append(xfND(_winloseName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_villagePlayerStatsList != null && !_villagePlayerStatsList.isEmpty())
        { sb.append(dm).append("villagePlayerStatsList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Winlose clone() {
        return (Winlose)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗コード
     * @return The value of the column 'WINLOSE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getWinloseCode() {
        checkSpecifiedProperty("winloseCode");
        return convertEmptyToNull(_winloseCode);
    }

    /**
     * [set] WINLOSE_CODE: {PK, NotNull, VARCHAR(20), classification=WinLose} <br>
     * 勝敗コード
     * @param winloseCode The value of the column 'WINLOSE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setWinloseCode(String winloseCode) {
        checkClassificationCode("WINLOSE_CODE", CDef.DefMeta.WinLose, winloseCode);
        registerModifiedProperty("winloseCode");
        _winloseCode = winloseCode;
    }

    /**
     * [get] WINLOSE_NAME: {NotNull, VARCHAR(255)} <br>
     * 勝敗名
     * @return The value of the column 'WINLOSE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWinloseName() {
        checkSpecifiedProperty("winloseName");
        return convertEmptyToNull(_winloseName);
    }

    /**
     * [set] WINLOSE_NAME: {NotNull, VARCHAR(255)} <br>
     * 勝敗名
     * @param winloseName The value of the column 'WINLOSE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setWinloseName(String winloseName) {
        registerModifiedProperty("winloseName");
        _winloseName = winloseName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param winloseCode The value of the column 'WINLOSE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingWinloseCode(String winloseCode) {
        setWinloseCode(winloseCode);
    }
}
