package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.CountryRecruitmentCQ;

/**
 * The nest select set-upper of country_recruitment.
 * @author DBFlute(AutoGenerator)
 */
public class CountryRecruitmentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CountryRecruitmentCQ _query;
    public CountryRecruitmentNss(CountryRecruitmentCQ query) { _query = query; }
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
