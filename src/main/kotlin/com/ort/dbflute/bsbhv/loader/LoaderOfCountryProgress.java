package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;
import com.ort.dbflute.cbean.*;

/**
 * The referrer loader of COUNTRY_PROGRESS as TABLE. <br>
 * <pre>
 * [primary key]
 *     COUNTRY_PROGRESS_ID
 *
 * [column]
 *     COUNTRY_PROGRESS_ID, COUNTRY_ID, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_PROGRESS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY
 *
 * [referrer table]
 *     COUNTRY_PROGRESS_DETAIL
 *
 * [foreign property]
 *     country
 *
 * [referrer property]
 *     countryProgressDetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCountryProgress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CountryProgress> _selectedList;
    protected BehaviorSelector _selector;
    protected CountryProgressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCountryProgress ready(List<CountryProgress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CountryProgressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CountryProgressBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CountryProgressDetail> _referrerCountryProgressDetail;

    /**
     * Load referrer of countryProgressDetailList by the set-upper of referrer. <br>
     * COUNTRY_PROGRESS_DETAIL by COUNTRY_PROGRESS_ID, named 'countryProgressDetailList'.
     * <pre>
     * <span style="color: #0000C0">countryProgressBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryProgressList</span>, <span style="color: #553000">progressLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">progressLoader</span>.<span style="color: #CC4747">loadCountryProgressDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CountryProgress countryProgress : <span style="color: #553000">countryProgressList</span>) {
     *     ... = countryProgress.<span style="color: #CC4747">getCountryProgressDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryProgressId_InScope(pkList);
     * cb.query().addOrderBy_CountryProgressId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCountryProgressDetail> loadCountryProgressDetail(ReferrerConditionSetupper<CountryProgressDetailCB> refCBLambda) {
        myBhv().loadCountryProgressDetail(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCountryProgressDetail = refLs);
        return hd -> hd.handle(new LoaderOfCountryProgressDetail().ready(_referrerCountryProgressDetail, _selector));
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
    public List<CountryProgress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
