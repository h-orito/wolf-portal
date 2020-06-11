package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;
import com.ort.dbflute.cbean.*;

/**
 * The referrer loader of COUNTRY as TABLE. <br>
 * <pre>
 * [primary key]
 *     COUNTRY_ID
 *
 * [column]
 *     COUNTRY_ID, COUNTRY_NAME, COUNTRY_TOP_PAGE_URL, DISPLAY_ORDER, IS_CRAWL_FAIL, IS_DISPLAY, LAST_UPDATE_DATETIME, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     COUNTRY_PLAYER, COUNTRY_PROGRESS, COUNTRY_RECRUITMENT, VILLAGE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     countryPlayerList, countryProgressList, countryRecruitmentList, villageList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCountry {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Country> _selectedList;
    protected BehaviorSelector _selector;
    protected CountryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCountry ready(List<Country> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CountryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CountryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CountryPlayer> _referrerCountryPlayer;

    /**
     * Load referrer of countryPlayerList by the set-upper of referrer. <br>
     * COUNTRY_PLAYER by COUNTRY_ID, named 'countryPlayerList'.
     * <pre>
     * <span style="color: #0000C0">countryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryList</span>, <span style="color: #553000">countryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">countryLoader</span>.<span style="color: #CC4747">loadCountryPlayer</span>(<span style="color: #553000">playerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">playerCB</span>.setupSelect...
     *         <span style="color: #553000">playerCB</span>.query().set...
     *         <span style="color: #553000">playerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">playerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    playerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Country country : <span style="color: #553000">countryList</span>) {
     *     ... = country.<span style="color: #CC4747">getCountryPlayerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryId_InScope(pkList);
     * cb.query().addOrderBy_CountryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCountryPlayer> loadCountryPlayer(ReferrerConditionSetupper<CountryPlayerCB> refCBLambda) {
        myBhv().loadCountryPlayer(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCountryPlayer = refLs);
        return hd -> hd.handle(new LoaderOfCountryPlayer().ready(_referrerCountryPlayer, _selector));
    }

    protected List<CountryProgress> _referrerCountryProgress;

    /**
     * Load referrer of countryProgressList by the set-upper of referrer. <br>
     * COUNTRY_PROGRESS by COUNTRY_ID, named 'countryProgressList'.
     * <pre>
     * <span style="color: #0000C0">countryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryList</span>, <span style="color: #553000">countryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">countryLoader</span>.<span style="color: #CC4747">loadCountryProgress</span>(<span style="color: #553000">progressCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">progressCB</span>.setupSelect...
     *         <span style="color: #553000">progressCB</span>.query().set...
     *         <span style="color: #553000">progressCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">progressLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    progressLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Country country : <span style="color: #553000">countryList</span>) {
     *     ... = country.<span style="color: #CC4747">getCountryProgressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryId_InScope(pkList);
     * cb.query().addOrderBy_CountryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCountryProgress> loadCountryProgress(ReferrerConditionSetupper<CountryProgressCB> refCBLambda) {
        myBhv().loadCountryProgress(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCountryProgress = refLs);
        return hd -> hd.handle(new LoaderOfCountryProgress().ready(_referrerCountryProgress, _selector));
    }

    protected List<CountryRecruitment> _referrerCountryRecruitment;

    /**
     * Load referrer of countryRecruitmentList by the set-upper of referrer. <br>
     * COUNTRY_RECRUITMENT by COUNTRY_ID, named 'countryRecruitmentList'.
     * <pre>
     * <span style="color: #0000C0">countryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryList</span>, <span style="color: #553000">countryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">countryLoader</span>.<span style="color: #CC4747">loadCountryRecruitment</span>(<span style="color: #553000">recruitmentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recruitmentCB</span>.setupSelect...
     *         <span style="color: #553000">recruitmentCB</span>.query().set...
     *         <span style="color: #553000">recruitmentCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recruitmentLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recruitmentLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Country country : <span style="color: #553000">countryList</span>) {
     *     ... = country.<span style="color: #CC4747">getCountryRecruitmentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryId_InScope(pkList);
     * cb.query().addOrderBy_CountryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCountryRecruitment> loadCountryRecruitment(ReferrerConditionSetupper<CountryRecruitmentCB> refCBLambda) {
        myBhv().loadCountryRecruitment(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCountryRecruitment = refLs);
        return hd -> hd.handle(new LoaderOfCountryRecruitment().ready(_referrerCountryRecruitment, _selector));
    }

    protected List<Village> _referrerVillage;

    /**
     * Load referrer of villageList by the set-upper of referrer. <br>
     * VILLAGE by COUNTRY_ID, named 'villageList'.
     * <pre>
     * <span style="color: #0000C0">countryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryList</span>, <span style="color: #553000">countryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">countryLoader</span>.<span style="color: #CC4747">loadVillage</span>(<span style="color: #553000">villageCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">villageCB</span>.setupSelect...
     *         <span style="color: #553000">villageCB</span>.query().set...
     *         <span style="color: #553000">villageCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">villageLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    villageLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Country country : <span style="color: #553000">countryList</span>) {
     *     ... = country.<span style="color: #CC4747">getVillageList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryId_InScope(pkList);
     * cb.query().addOrderBy_CountryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVillage> loadVillage(ReferrerConditionSetupper<VillageCB> refCBLambda) {
        myBhv().loadVillage(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVillage = refLs);
        return hd -> hd.handle(new LoaderOfVillage().ready(_referrerVillage, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Country> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
