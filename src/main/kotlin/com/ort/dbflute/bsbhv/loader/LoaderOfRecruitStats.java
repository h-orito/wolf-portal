package com.ort.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.ort.dbflute.exbhv.*;
import com.ort.dbflute.exentity.*;

/**
 * The referrer loader of RECRUIT_STATS as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECRUIT_STATS_ID
 *
 * [column]
 *     RECRUIT_STATS_ID, STATS_DATETIME, VILLAGE_NUM, PARTICIPATE_NUM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECRUIT_STATS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRecruitStats {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RecruitStats> _selectedList;
    protected BehaviorSelector _selector;
    protected RecruitStatsBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRecruitStats ready(List<RecruitStats> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RecruitStatsBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RecruitStatsBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RecruitStats> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
