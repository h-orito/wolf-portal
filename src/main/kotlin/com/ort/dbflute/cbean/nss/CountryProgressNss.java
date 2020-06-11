package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.CountryProgressCQ;

/**
 * The nest select set-upper of country_progress.
 * @author DBFlute(AutoGenerator)
 */
public class CountryProgressNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CountryProgressCQ _query;
    public CountryProgressNss(CountryProgressCQ query) { _query = query; }
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
}
