package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;

/**
 * The referrer loader of VILLAGE_PLAYER_STATS as TABLE. <br>
 * <pre>
 * [primary key]
 *     VILLAGE_PLAYER_STATS_ID
 *
 * [column]
 *     VILLAGE_PLAYER_STATS_ID, COUNTRY_PLAYER_ID, VILLAGE_ID, CHARACTER_NAME, SKILL_NAME, WINLOSE_CODE, LIFE, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     VILLAGE_PLAYER_STATS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY_PLAYER, VILLAGE, WINLOSE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     countryPlayer, village, winlose
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVillagePlayerStats {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VillagePlayerStats> _selectedList;
    protected BehaviorSelector _selector;
    protected VillagePlayerStatsBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVillagePlayerStats ready(List<VillagePlayerStats> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VillagePlayerStatsBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VillagePlayerStatsBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCountryPlayer _foreignCountryPlayerLoader;
    public LoaderOfCountryPlayer pulloutCountryPlayer() {
        if (_foreignCountryPlayerLoader == null)
        { _foreignCountryPlayerLoader = new LoaderOfCountryPlayer().ready(myBhv().pulloutCountryPlayer(_selectedList), _selector); }
        return _foreignCountryPlayerLoader;
    }

    protected LoaderOfVillage _foreignVillageLoader;
    public LoaderOfVillage pulloutVillage() {
        if (_foreignVillageLoader == null)
        { _foreignVillageLoader = new LoaderOfVillage().ready(myBhv().pulloutVillage(_selectedList), _selector); }
        return _foreignVillageLoader;
    }

    protected LoaderOfWinlose _foreignWinloseLoader;
    public LoaderOfWinlose pulloutWinlose() {
        if (_foreignWinloseLoader == null)
        { _foreignWinloseLoader = new LoaderOfWinlose().ready(myBhv().pulloutWinlose(_selectedList), _selector); }
        return _foreignWinloseLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VillagePlayerStats> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
