package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.VillageCQ;

/**
 * The nest select set-upper of village.
 * @author DBFlute(AutoGenerator)
 */
public class VillageNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final VillageCQ _query;
    public VillageNss(VillageCQ query) { _query = query; }
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
