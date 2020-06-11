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
 * The condition-query for in-line of village.
 * @author DBFlute(AutoGenerator)
 */
public class VillageCIQ extends AbstractBsVillageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVillageCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VillageCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVillageCQ myCQ) {
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
    protected ConditionValue xgetCValueVillageId() { return _myCQ.xdfgetVillageId(); }
    public String keepVillageId_ExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepVillageId_NotExistsReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepVillageId_SpecifyDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepVillageId_QueryDerivedReferrer_VillagePlayerStatsList(VillagePlayerStatsCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepVillageId_QueryDerivedReferrer_VillagePlayerStatsListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCountryId() { return _myCQ.xdfgetCountryId(); }
    protected ConditionValue xgetCValueVillageName() { return _myCQ.xdfgetVillageName(); }
    protected ConditionValue xgetCValueVillageNo() { return _myCQ.xdfgetVillageNo(); }
    protected ConditionValue xgetCValueVillageUrl() { return _myCQ.xdfgetVillageUrl(); }
    protected ConditionValue xgetCValueVillageStartDatetime() { return _myCQ.xdfgetVillageStartDatetime(); }
    protected ConditionValue xgetCValueVillageEndDatetime() { return _myCQ.xdfgetVillageEndDatetime(); }
    protected ConditionValue xgetCValueWinCampName() { return _myCQ.xdfgetWinCampName(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterTrace() { return _myCQ.xdfgetRegisterTrace(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateTrace() { return _myCQ.xdfgetUpdateTrace(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VillageCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VillageCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VillageCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VillageCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VillageCB.class.getName(); }
    protected String xinCQ() { return VillageCQ.class.getName(); }
}
