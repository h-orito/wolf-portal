package com.ort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.ort.dbflute.allcommon.DBMetaInstanceHandler;
import com.ort.dbflute.exentity.*;

/**
 * The entity of RECRUIT_STATS as TABLE. <br>
 * 開催状況統計
 * <pre>
 * [primary-key]
 *     RECRUIT_STATS_ID
 *
 * [column]
 *     RECRUIT_STATS_ID, STATS_DATETIME, VILLAGE_NUM, PARTICIPATE_NUM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECRUIT_STATS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer recruitStatsId = entity.getRecruitStatsId();
 * java.time.LocalDateTime statsDatetime = entity.getStatsDatetime();
 * Integer villageNum = entity.getVillageNum();
 * Integer participateNum = entity.getParticipateNum();
 * entity.setRecruitStatsId(recruitStatsId);
 * entity.setStatsDatetime(statsDatetime);
 * entity.setVillageNum(villageNum);
 * entity.setParticipateNum(participateNum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRecruitStats extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _recruitStatsId;

    /** STATS_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _statsDatetime;

    /** VILLAGE_NUM: {NotNull, INT UNSIGNED(10)} */
    protected Integer _villageNum;

    /** PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)} */
    protected Integer _participateNum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "recruit_stats";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_recruitStatsId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsRecruitStats) {
            BsRecruitStats other = (BsRecruitStats)obj;
            if (!xSV(_recruitStatsId, other._recruitStatsId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _recruitStatsId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_recruitStatsId));
        sb.append(dm).append(xfND(_statsDatetime));
        sb.append(dm).append(xfND(_villageNum));
        sb.append(dm).append(xfND(_participateNum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public RecruitStats clone() {
        return (RecruitStats)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 開催状況統計id
     * @return The value of the column 'RECRUIT_STATS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRecruitStatsId() {
        checkSpecifiedProperty("recruitStatsId");
        return _recruitStatsId;
    }

    /**
     * [set] RECRUIT_STATS_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * 開催状況統計id
     * @param recruitStatsId The value of the column 'RECRUIT_STATS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRecruitStatsId(Integer recruitStatsId) {
        registerModifiedProperty("recruitStatsId");
        _recruitStatsId = recruitStatsId;
    }

    /**
     * [get] STATS_DATETIME: {NotNull, DATETIME(19)} <br>
     * 日時
     * @return The value of the column 'STATS_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getStatsDatetime() {
        checkSpecifiedProperty("statsDatetime");
        return _statsDatetime;
    }

    /**
     * [set] STATS_DATETIME: {NotNull, DATETIME(19)} <br>
     * 日時
     * @param statsDatetime The value of the column 'STATS_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setStatsDatetime(java.time.LocalDateTime statsDatetime) {
        registerModifiedProperty("statsDatetime");
        _statsDatetime = statsDatetime;
    }

    /**
     * [get] VILLAGE_NUM: {NotNull, INT UNSIGNED(10)} <br>
     * 村数
     * @return The value of the column 'VILLAGE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVillageNum() {
        checkSpecifiedProperty("villageNum");
        return _villageNum;
    }

    /**
     * [set] VILLAGE_NUM: {NotNull, INT UNSIGNED(10)} <br>
     * 村数
     * @param villageNum The value of the column 'VILLAGE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setVillageNum(Integer villageNum) {
        registerModifiedProperty("villageNum");
        _villageNum = villageNum;
    }

    /**
     * [get] PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)} <br>
     * 参加者数
     * @return The value of the column 'PARTICIPATE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateNum() {
        checkSpecifiedProperty("participateNum");
        return _participateNum;
    }

    /**
     * [set] PARTICIPATE_NUM: {NotNull, INT UNSIGNED(10)} <br>
     * 参加者数
     * @param participateNum The value of the column 'PARTICIPATE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateNum(Integer participateNum) {
        registerModifiedProperty("participateNum");
        _participateNum = participateNum;
    }
}
