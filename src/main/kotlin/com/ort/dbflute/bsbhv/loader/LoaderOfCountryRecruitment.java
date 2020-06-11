package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;
import com.ort.dbflute.cbean.*;

/**
 * The referrer loader of COUNTRY_RECRUITMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     COUNTRY_RECRUITMENT_ID
 *
 * [column]
 *     COUNTRY_RECRUITMENT_ID, COUNTRY_ID, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_TRACE, UPDATE_DATETIME, UPDATE_TRACE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_RECRUITMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY
 *
 * [referrer table]
 *     COUNTRY_RECRUITMENT_DETAIL
 *
 * [foreign property]
 *     country
 *
 * [referrer property]
 *     countryRecruitmentDetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCountryRecruitment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CountryRecruitment> _selectedList;
    protected BehaviorSelector _selector;
    protected CountryRecruitmentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCountryRecruitment ready(List<CountryRecruitment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CountryRecruitmentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CountryRecruitmentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CountryRecruitmentDetail> _referrerCountryRecruitmentDetail;

    /**
     * Load referrer of countryRecruitmentDetailList by the set-upper of referrer. <br>
     * COUNTRY_RECRUITMENT_DETAIL by COUNTRY_RECRUITMENT_ID, named 'countryRecruitmentDetailList'.
     * <pre>
     * <span style="color: #0000C0">countryRecruitmentBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">countryRecruitmentList</span>, <span style="color: #553000">recruitmentLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">recruitmentLoader</span>.<span style="color: #CC4747">loadCountryRecruitmentDetail</span>(<span style="color: #553000">detailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">detailCB</span>.setupSelect...
     *         <span style="color: #553000">detailCB</span>.query().set...
     *         <span style="color: #553000">detailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">detailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    detailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CountryRecruitment countryRecruitment : <span style="color: #553000">countryRecruitmentList</span>) {
     *     ... = countryRecruitment.<span style="color: #CC4747">getCountryRecruitmentDetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCountryRecruitmentId_InScope(pkList);
     * cb.query().addOrderBy_CountryRecruitmentId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCountryRecruitmentDetail> loadCountryRecruitmentDetail(ReferrerConditionSetupper<CountryRecruitmentDetailCB> refCBLambda) {
        myBhv().loadCountryRecruitmentDetail(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCountryRecruitmentDetail = refLs);
        return hd -> hd.handle(new LoaderOfCountryRecruitmentDetail().ready(_referrerCountryRecruitmentDetail, _selector));
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
    public List<CountryRecruitment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
