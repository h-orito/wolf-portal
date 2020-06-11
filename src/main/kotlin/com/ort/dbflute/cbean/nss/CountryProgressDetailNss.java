package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.CountryProgressDetailCQ;

/**
 * The nest select set-upper of country_progress_detail.
 * @author DBFlute(AutoGenerator)
 */
public class CountryProgressDetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CountryProgressDetailCQ _query;
    public CountryProgressDetailNss(CountryProgressDetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * COUNTRY_PROGRESS by my COUNTRY_PROGRESS_ID, named 'countryProgress'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CountryProgressNss withCountryProgress() {
        _query.xdoNss(() -> _query.queryCountryProgress());
        return new CountryProgressNss(_query.queryCountryProgress());
    }
}
