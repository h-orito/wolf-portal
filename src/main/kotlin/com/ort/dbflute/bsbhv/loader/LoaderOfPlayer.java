package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;
import com.ort.dbflute.cbean.*;

/**
 * The referrer loader of PLAYER as TABLE. <br>
 * <pre>
 * [primary key]
 *     PLAYER_ID
 *
 * [column]
 *     PLAYER_ID, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PLAYER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     COUNTRY_PLAYER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     countryPlayerList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPlayer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Player> _selectedList;
    protected BehaviorSelector _selector;
    protected PlayerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPlayer ready(List<Player> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PlayerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PlayerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CountryPlayer> _referrerCountryPlayer;

    /**
     * Load referrer of countryPlayerList by the set-upper of referrer. <br>
     * COUNTRY_PLAYER by PLAYER_ID, named 'countryPlayerList'.
     * <pre>
     * <span style="color: #0000C0">playerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">playerList</span>, <span style="color: #553000">playerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">playerLoader</span>.<span style="color: #CC4747">loadCountryPlayer</span>(<span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">playerCB</span>.setupSelect...
     *         <span style="color: #553000">playerCB</span>.query().set...
     *         <span style="color: #553000">playerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">playerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    playerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Player player : <span style="color: #553000">playerList</span>) {
     *     ... = player.<span style="color: #CC4747">getCountryPlayerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlayerId_InScope(pkList);
     * cb.query().addOrderBy_PlayerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCountryPlayer> loadCountryPlayer(ReferrerConditionSetupper<CountryPlayerCB> refCBLambda) {
        myBhv().loadCountryPlayer(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCountryPlayer = refLs);
        return hd -> hd.handle(new LoaderOfCountryPlayer().ready(_referrerCountryPlayer, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Player> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
