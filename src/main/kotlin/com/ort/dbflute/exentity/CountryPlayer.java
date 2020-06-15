package com.ort.dbflute.exentity;

import com.ort.dbflute.bsentity.BsCountryPlayer;

/**
 * The entity of COUNTRY_PLAYER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CountryPlayer extends BsCountryPlayer {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    /** PARTICIPATE_COUNT: Derived Referrer Alias. */
    public static final String participateCount = "PARTICIPATE_COUNT";
    /** PARTICIPATE_COUNT: (Derived Referrer) */
    protected Integer _participateCount;

    /**
     * [get] PARTICIPATE_COUNT: (Derived Referrer)
     * @return The value of the column 'PARTICIPATE_COUNT'. (NullAllowed)
     */
    public Integer getParticipateCount() {
        return _participateCount;
    }

    /**
     * [set] PARTICIPATE_COUNT: (Derived Referrer)
     * @param participateCount The value of the column 'PARTICIPATE_COUNT'. (NullAllowed)
     */
    public void setParticipateCount(Integer participateCount) {
        _participateCount = participateCount;
    }
}
