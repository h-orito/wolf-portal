package com.ort.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.ort.dbflute.cbean.*;
import com.ort.dbflute.cbean.cq.bs.*;
import com.ort.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of country.
 * @author DBFlute(AutoGenerator)
 */
public class CountryCIQ extends AbstractBsCountryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCountryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CountryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCountryCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueCountryId() { return _myCQ.xdfgetCountryId(); }
    public String keepCountryId_ExistsReferrer_CountryPlayerList(CountryPlayerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCountryId_ExistsReferrer_CountryProgressList(CountryProgressCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCountryId_ExistsReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCountryId_ExistsReferrer_VillageList(VillageCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCountryId_NotExistsReferrer_CountryPlayerList(CountryPlayerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCountryId_NotExistsReferrer_CountryProgressList(CountryProgressCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCountryId_NotExistsReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCountryId_NotExistsReferrer_VillageList(VillageCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCountryId_SpecifyDerivedReferrer_CountryPlayerList(CountryPlayerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCountryId_SpecifyDerivedReferrer_CountryProgressList(CountryProgressCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCountryId_SpecifyDerivedReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCountryId_SpecifyDerivedReferrer_VillageList(VillageCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_CountryPlayerList(CountryPlayerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_CountryPlayerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_CountryProgressList(CountryProgressCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_CountryProgressListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_CountryRecruitmentList(CountryRecruitmentCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_CountryRecruitmentListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_VillageList(VillageCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCountryId_QueryDerivedReferrer_VillageListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCountryName() { return _myCQ.xdfgetCountryName(); }
    protected ConditionValue xgetCValueCountryTopPageUrl() { return _myCQ.xdfgetCountryTopPageUrl(); }
    protected ConditionValue xgetCValueDisplayOrder() { return _myCQ.xdfgetDisplayOrder(); }
    protected ConditionValue xgetCValueIsCrawlFail() { return _myCQ.xdfgetIsCrawlFail(); }
    protected ConditionValue xgetCValueIsDisplay() { return _myCQ.xdfgetIsDisplay(); }
    protected ConditionValue xgetCValueLastUpdateDatetime() { return _myCQ.xdfgetLastUpdateDatetime(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CountryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CountryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CountryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CountryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CountryCB.class.getName(); }
    protected String xinCQ() { return CountryCQ.class.getName(); }
}
