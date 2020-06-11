package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.CountryPlayerCQ;

/**
 * The nest select set-upper of country_player.
 * @author DBFlute(AutoGenerator)
 */
public class CountryPlayerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CountryPlayerCQ _query;
    public CountryPlayerNss(CountryPlayerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * COUNTRY by my COUNTRY_ID, named 'country'.
     */
    public void withCountry() {
        _query.xdoNss(() -> _query.queryCountry());
    }
    /**
     * With nested relation columns to select clause. <br>
     * PLAYER by my PLAYER_ID, named 'player'.
     */
    public void withPlayer() {
        _query.xdoNss(() -> _query.queryPlayer());
    }
}
