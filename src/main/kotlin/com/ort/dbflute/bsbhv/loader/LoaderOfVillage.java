package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;
import com.ort.dbflute.cbean.*;

/**
 * The referrer loader of VILLAGE as TABLE. <br>
 * <pre>
 * [primary key]
 *     VILLAGE_ID
 *
 * [column]
 *     VILLAGE_ID, COUNTRY_ID, VILLAGE_NAME, VILLAGE_NO, VILLAGE_URL, VILLAGE_START_DATETIME, VILLAGE_END_DATETIME, WIN_CAMP_NAME, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     VILLAGE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY
 *
 * [referrer table]
 *     VILLAGE_PLAYER_STATS
 *
 * [foreign property]
 *     country
 *
 * [referrer property]
 *     villagePlayerStatsList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVillage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Village> _selectedList;
    protected BehaviorSelector _selector;
    protected VillageBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVillage ready(List<Village> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VillageBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VillageBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VillagePlayerStats> _referrerVillagePlayerStats;

    /**
     * Load referrer of villagePlayerStatsList by the set-upper of referrer. <br>
     * VILLAGE_PLAYER_STATS by VILLAGE_ID, named 'villagePlayerStatsList'.
     * <pre>
     * <span style="color: #0000C0">villageBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">villageList</span>, <span style="color: #553000">villageLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">villageLoader</span>.<span style="color: #CC4747">loadVillagePlayerStats</span>(<span style="color: #553000">statsCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">statsCB</span>.setupSelect...
     *         <span style="color: #553000">statsCB</span>.query().set...
     *         <span style="color: #553000">statsCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">statsLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    statsLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Village village : <span style="color: #553000">villageList</span>) {
     *     ... = village.<span style="color: #CC4747">getVillagePlayerStatsList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVillageId_InScope(pkList);
     * cb.query().addOrderBy_VillageId_Asc();
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Village> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
