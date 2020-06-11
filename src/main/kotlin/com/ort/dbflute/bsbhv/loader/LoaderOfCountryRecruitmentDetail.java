package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;

/**
 * The referrer loader of COUNTRY_RECRUITMENT_DETAIL as TABLE. <br>
 * <pre>
 * [primary key]
 *     COUNTRY_RECRUITMENT_DETAIL_ID
 *
 * [column]
 *     COUNTRY_RECRUITMENT_DETAIL_ID, COUNTRY_RECRUITMENT_ID, ITEM_NAME, ITEM_VALUE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COUNTRY_RECRUITMENT_DETAIL_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     COUNTRY_RECRUITMENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     countryRecruitment
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCountryRecruitmentDetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CountryRecruitmentDetail> _selectedList;
    protected BehaviorSelector _selector;
    protected CountryRecruitmentDetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCountryRecruitmentDetail ready(List<CountryRecruitmentDetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CountryRecruitmentDetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CountryRecruitmentDetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCountryRecruitment _foreignCountryRecruitmentLoader;
    public LoaderOfCountryRecruitment pulloutCountryRecruitment() {
        if (_foreignCountryRecruitmentLoader == null)
        { _foreignCountryRecruitmentLoader = new LoaderOfCountryRecruitment().ready(myBhv().pulloutCountryRecruitment(_selectedList), _selector); }
        return _foreignCountryRecruitmentLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CountryRecruitmentDetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
