package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;
import com.ort.dbflute.cbean.*;

/**
 * The referrer loader of COUNTRY_PLAYER as TABLE. <br>
 * <pre>
 * [primary key]
 *     COUNTRY_PLAYER_ID
 *
 * [column]
 *     COUNTRY_PLAYER_ID, COUNTRY_ID, PLAYER_ID, USER_ID, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_PLAYER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY, PLAYER
 *
 * [referrer table]
 *     VILLAGE_PLAYER_STATS
 *
 * [foreign property]
 *     country, player
 *
 * [referrer property]
 *     villagePlayerStatsList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCountryPlayer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CountryPlayer> _selectedList;
    protected BehaviorSelector _selector;
    protected CountryPlayerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCountryPlayer ready(List<CountryPlayer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CountryPlayerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CountryPlayerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VillagePlayerStats> _referrerVillagePlayerStats;

    /**
     * Load referrer of villagePlayerStatsList by the set-upper of referrer. <br>
     * VILLAGE_PLAYER_STATS by COUNTRY_PLAYER_ID, named 'villagePlayerStatsList'.
     * <pre>
     * <span style="color: #0000C0">countryPlayerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryPlayerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadVillagePlayerStats</span>(<span style="color: #553000">statsCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">statsCB</span>.setupSelect...
     *         <span style="color: #553000">statsCB</span>.query().set...
     *         <span style="color: #553000">statsCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">statsLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    statsLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CountryPlayer countryPlayer : <span style="color: #553000">countryPlayerList</span>) {
     *     ... = countryPlayer.<span style="color: #CC4747">getVillagePlayerStatsList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryPlayerId_InScope(pkList);
     * cb.query().addOrderBy_CountryPlayerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVillagePlayerStats> loadVillagePlayerStats(ReferrerConditionSetupper<VillagePlayerStatsCB> refCBLambda) {
        myBhv().loadVillagePlayerStats(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVillagePlayerStats = refLs);
        return hd -> hd.handle(new LoaderOfVillagePlayerStats().ready(_referrerVillagePlayerStats, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCountry _foreignCountryLoader;
    public LoaderOfCountry pulloutCountry() {
        if (_foreignCountryLoader == null)
        { _foreignCountryLoader = new LoaderOfCountry().ready(myBhv().pulloutCountry(_selectedList), _selector); }
        return _foreignCountryLoader;
    }

    protected LoaderOfPlayer _foreignPlayerLoader;
    public LoaderOfPlayer pulloutPlayer() {
        if (_foreignPlayerLoader == null)
        { _foreignPlayerLoader = new LoaderOfPlayer().ready(myBhv().pulloutPlayer(_selectedList), _selector); }
        return _foreignPlayerLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CountryPlayer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
