package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.CountryRecruitmentDetailCQ;

/**
 * The nest select set-upper of country_recruitment_detail.
 * @author DBFlute(AutoGenerator)
 */
public class CountryRecruitmentDetailNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CountryRecruitmentDetailCQ _query;
    public CountryRecruitmentDetailNss(CountryRecruitmentDetailCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * COUNTRY_RECRUITMENT by my COUNTRY_RECRUITMENT_ID, named 'countryRecruitment'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CountryRecruitmentNss withCountryRecruitment() {
        _query.xdoNss(() -> _query.queryCountryRecruitment());
        return new CountryRecruitmentNss(_query.queryCountryRecruitment());
    }
}
