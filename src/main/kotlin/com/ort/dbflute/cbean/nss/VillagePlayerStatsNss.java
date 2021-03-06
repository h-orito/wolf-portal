package com.ort.dbflute.cbean.nss;

import com.ort.dbflute.cbean.cq.VillagePlayerStatsCQ;

/**
 * The nest select set-upper of village_player_stats.
 * @author DBFlute(AutoGenerator)
 */
public class VillagePlayerStatsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final VillagePlayerStatsCQ _query;
    public VillagePlayerStatsNss(VillagePlayerStatsCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * COUNTRY_PLAYER by my COUNTRY_PLAYER_ID, named 'countryPlayer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CountryPlayerNss withCountryPlayer() {
        _query.xdoNss(() -> _query.queryCountryPlayer());
        return new CountryPlayerNss(_query.queryCountryPlayer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * VILLAGE by my VILLAGE_ID, named 'village'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VillageNss withVillage() {
        _query.xdoNss(() -> _query.queryVillage());
        return new VillageNss(_query.queryVillage());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WINLOSE by my WINLOSE_CODE, named 'winlose'.
     */
    public void withWinlose() {
        _query.xdoNss(() -> _query.queryWinlose());
    }
}
