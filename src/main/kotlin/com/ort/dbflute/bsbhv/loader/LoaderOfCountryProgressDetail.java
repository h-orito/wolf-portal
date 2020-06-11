package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;

/**
 * The referrer loader of COUNTRY_PROGRESS_DETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     COUNTRY_PROGRESS_DETAIL_ID
 *
 * [column]
 *     COUNTRY_PROGRESS_DETAIL_ID, COUNTRY_PROGRESS_ID, ITEM_NAME, ITEM_VALUE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_PROGRESS_DETAIL_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY_PROGRESS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     countryProgress
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCountryProgressDetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CountryProgressDetail> _selectedList;
    protected BehaviorSelector _selector;
    protected CountryProgressDetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCountryProgressDetail ready(List<CountryProgressDetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CountryProgressDetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CountryProgressDetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCountryProgress _foreignCountryProgressLoader;
    public LoaderOfCountryProgress pulloutCountryProgress() {
        if (_foreignCountryProgressLoader == null)
        { _foreignCountryProgressLoader = new LoaderOfCountryProgress().ready(myBhv().pulloutCountryProgress(_selectedList), _selector); }
        return _foreignCountryProgressLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CountryProgressDetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
