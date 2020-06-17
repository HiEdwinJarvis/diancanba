package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcbMonthbillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbMonthbillExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDcbMonthbillidIsNull() {
            addCriterion("DCB_MonthBillId is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidIsNotNull() {
            addCriterion("DCB_MonthBillId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidEqualTo(Long value) {
            addCriterion("DCB_MonthBillId =", value, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidNotEqualTo(Long value) {
            addCriterion("DCB_MonthBillId <>", value, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidGreaterThan(Long value) {
            addCriterion("DCB_MonthBillId >", value, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_MonthBillId >=", value, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidLessThan(Long value) {
            addCriterion("DCB_MonthBillId <", value, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_MonthBillId <=", value, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidIn(List<Long> values) {
            addCriterion("DCB_MonthBillId in", values, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidNotIn(List<Long> values) {
            addCriterion("DCB_MonthBillId not in", values, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidBetween(Long value1, Long value2) {
            addCriterion("DCB_MonthBillId between", value1, value2, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_MonthBillId not between", value1, value2, "dcbMonthbillid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidIsNull() {
            addCriterion("DCB_RestaurantId is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidIsNotNull() {
            addCriterion("DCB_RestaurantId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidEqualTo(Long value) {
            addCriterion("DCB_RestaurantId =", value, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidNotEqualTo(Long value) {
            addCriterion("DCB_RestaurantId <>", value, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidGreaterThan(Long value) {
            addCriterion("DCB_RestaurantId >", value, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_RestaurantId >=", value, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidLessThan(Long value) {
            addCriterion("DCB_RestaurantId <", value, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_RestaurantId <=", value, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidIn(List<Long> values) {
            addCriterion("DCB_RestaurantId in", values, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidNotIn(List<Long> values) {
            addCriterion("DCB_RestaurantId not in", values, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidBetween(Long value1, Long value2) {
            addCriterion("DCB_RestaurantId between", value1, value2, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_RestaurantId not between", value1, value2, "dcbRestaurantid");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameIsNull() {
            addCriterion("DCB_RestaurantName is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameIsNotNull() {
            addCriterion("DCB_RestaurantName is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameEqualTo(String value) {
            addCriterion("DCB_RestaurantName =", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameNotEqualTo(String value) {
            addCriterion("DCB_RestaurantName <>", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameGreaterThan(String value) {
            addCriterion("DCB_RestaurantName >", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantName >=", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameLessThan(String value) {
            addCriterion("DCB_RestaurantName <", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameLessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantName <=", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameLike(String value) {
            addCriterion("DCB_RestaurantName like", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameNotLike(String value) {
            addCriterion("DCB_RestaurantName not like", value, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameIn(List<String> values) {
            addCriterion("DCB_RestaurantName in", values, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameNotIn(List<String> values) {
            addCriterion("DCB_RestaurantName not in", values, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantName between", value1, value2, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantnameNotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantName not between", value1, value2, "dcbRestaurantname");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeIsNull() {
            addCriterion("DCB_MonthBillDateTime is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeIsNotNull() {
            addCriterion("DCB_MonthBillDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeEqualTo(Date value) {
            addCriterion("DCB_MonthBillDateTime =", value, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeNotEqualTo(Date value) {
            addCriterion("DCB_MonthBillDateTime <>", value, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeGreaterThan(Date value) {
            addCriterion("DCB_MonthBillDateTime >", value, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DCB_MonthBillDateTime >=", value, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeLessThan(Date value) {
            addCriterion("DCB_MonthBillDateTime <", value, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DCB_MonthBillDateTime <=", value, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeIn(List<Date> values) {
            addCriterion("DCB_MonthBillDateTime in", values, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeNotIn(List<Date> values) {
            addCriterion("DCB_MonthBillDateTime not in", values, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeBetween(Date value1, Date value2) {
            addCriterion("DCB_MonthBillDateTime between", value1, value2, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbilldatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DCB_MonthBillDateTime not between", value1, value2, "dcbMonthbilldatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMonthIsNull() {
            addCriterion("DCB_Month is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthIsNotNull() {
            addCriterion("DCB_Month is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthEqualTo(Integer value) {
            addCriterion("DCB_Month =", value, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthNotEqualTo(Integer value) {
            addCriterion("DCB_Month <>", value, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthGreaterThan(Integer value) {
            addCriterion("DCB_Month >", value, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_Month >=", value, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthLessThan(Integer value) {
            addCriterion("DCB_Month <", value, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_Month <=", value, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthIn(List<Integer> values) {
            addCriterion("DCB_Month in", values, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthNotIn(List<Integer> values) {
            addCriterion("DCB_Month not in", values, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthBetween(Integer value1, Integer value2) {
            addCriterion("DCB_Month between", value1, value2, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_Month not between", value1, value2, "dcbMonth");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontIsNull() {
            addCriterion("DCB_MonthBillIncomeFront is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontIsNotNull() {
            addCriterion("DCB_MonthBillIncomeFront is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeFront =", value, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontNotEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeFront <>", value, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontGreaterThan(Float value) {
            addCriterion("DCB_MonthBillIncomeFront >", value, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontGreaterThanOrEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeFront >=", value, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontLessThan(Float value) {
            addCriterion("DCB_MonthBillIncomeFront <", value, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontLessThanOrEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeFront <=", value, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontIn(List<Float> values) {
            addCriterion("DCB_MonthBillIncomeFront in", values, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontNotIn(List<Float> values) {
            addCriterion("DCB_MonthBillIncomeFront not in", values, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontBetween(Float value1, Float value2) {
            addCriterion("DCB_MonthBillIncomeFront between", value1, value2, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomefrontNotBetween(Float value1, Float value2) {
            addCriterion("DCB_MonthBillIncomeFront not between", value1, value2, "dcbMonthbillincomefront");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterIsNull() {
            addCriterion("DCB_MonthBillIncomeAfter is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterIsNotNull() {
            addCriterion("DCB_MonthBillIncomeAfter is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeAfter =", value, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterNotEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeAfter <>", value, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterGreaterThan(Float value) {
            addCriterion("DCB_MonthBillIncomeAfter >", value, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterGreaterThanOrEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeAfter >=", value, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterLessThan(Float value) {
            addCriterion("DCB_MonthBillIncomeAfter <", value, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterLessThanOrEqualTo(Float value) {
            addCriterion("DCB_MonthBillIncomeAfter <=", value, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterIn(List<Float> values) {
            addCriterion("DCB_MonthBillIncomeAfter in", values, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterNotIn(List<Float> values) {
            addCriterion("DCB_MonthBillIncomeAfter not in", values, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterBetween(Float value1, Float value2) {
            addCriterion("DCB_MonthBillIncomeAfter between", value1, value2, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillincomeafterNotBetween(Float value1, Float value2) {
            addCriterion("DCB_MonthBillIncomeAfter not between", value1, value2, "dcbMonthbillincomeafter");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusIsNull() {
            addCriterion("DCB_MonthBillStatus is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusIsNotNull() {
            addCriterion("DCB_MonthBillStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusEqualTo(Integer value) {
            addCriterion("DCB_MonthBillStatus =", value, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusNotEqualTo(Integer value) {
            addCriterion("DCB_MonthBillStatus <>", value, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusGreaterThan(Integer value) {
            addCriterion("DCB_MonthBillStatus >", value, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_MonthBillStatus >=", value, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusLessThan(Integer value) {
            addCriterion("DCB_MonthBillStatus <", value, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_MonthBillStatus <=", value, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusIn(List<Integer> values) {
            addCriterion("DCB_MonthBillStatus in", values, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusNotIn(List<Integer> values) {
            addCriterion("DCB_MonthBillStatus not in", values, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusBetween(Integer value1, Integer value2) {
            addCriterion("DCB_MonthBillStatus between", value1, value2, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_MonthBillStatus not between", value1, value2, "dcbMonthbillstatus");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaIsNull() {
            addCriterion("DCB_MonthBillIdea is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaIsNotNull() {
            addCriterion("DCB_MonthBillIdea is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaEqualTo(String value) {
            addCriterion("DCB_MonthBillIdea =", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaNotEqualTo(String value) {
            addCriterion("DCB_MonthBillIdea <>", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaGreaterThan(String value) {
            addCriterion("DCB_MonthBillIdea >", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_MonthBillIdea >=", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaLessThan(String value) {
            addCriterion("DCB_MonthBillIdea <", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaLessThanOrEqualTo(String value) {
            addCriterion("DCB_MonthBillIdea <=", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaLike(String value) {
            addCriterion("DCB_MonthBillIdea like", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaNotLike(String value) {
            addCriterion("DCB_MonthBillIdea not like", value, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaIn(List<String> values) {
            addCriterion("DCB_MonthBillIdea in", values, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaNotIn(List<String> values) {
            addCriterion("DCB_MonthBillIdea not in", values, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaBetween(String value1, String value2) {
            addCriterion("DCB_MonthBillIdea between", value1, value2, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillideaNotBetween(String value1, String value2) {
            addCriterion("DCB_MonthBillIdea not between", value1, value2, "dcbMonthbillidea");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1IsNull() {
            addCriterion("DCB_MonthBillProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1IsNotNull() {
            addCriterion("DCB_MonthBillProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1EqualTo(String value) {
            addCriterion("DCB_MonthBillProperty1 =", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1NotEqualTo(String value) {
            addCriterion("DCB_MonthBillProperty1 <>", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1GreaterThan(String value) {
            addCriterion("DCB_MonthBillProperty1 >", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_MonthBillProperty1 >=", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1LessThan(String value) {
            addCriterion("DCB_MonthBillProperty1 <", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_MonthBillProperty1 <=", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1Like(String value) {
            addCriterion("DCB_MonthBillProperty1 like", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1NotLike(String value) {
            addCriterion("DCB_MonthBillProperty1 not like", value, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1In(List<String> values) {
            addCriterion("DCB_MonthBillProperty1 in", values, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1NotIn(List<String> values) {
            addCriterion("DCB_MonthBillProperty1 not in", values, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1Between(String value1, String value2) {
            addCriterion("DCB_MonthBillProperty1 between", value1, value2, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_MonthBillProperty1 not between", value1, value2, "dcbMonthbillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2IsNull() {
            addCriterion("DCB_MonthBillProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2IsNotNull() {
            addCriterion("DCB_MonthBillProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2EqualTo(String value) {
            addCriterion("DCB_MonthBillProperty2 =", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2NotEqualTo(String value) {
            addCriterion("DCB_MonthBillProperty2 <>", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2GreaterThan(String value) {
            addCriterion("DCB_MonthBillProperty2 >", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_MonthBillProperty2 >=", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2LessThan(String value) {
            addCriterion("DCB_MonthBillProperty2 <", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_MonthBillProperty2 <=", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2Like(String value) {
            addCriterion("DCB_MonthBillProperty2 like", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2NotLike(String value) {
            addCriterion("DCB_MonthBillProperty2 not like", value, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2In(List<String> values) {
            addCriterion("DCB_MonthBillProperty2 in", values, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2NotIn(List<String> values) {
            addCriterion("DCB_MonthBillProperty2 not in", values, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2Between(String value1, String value2) {
            addCriterion("DCB_MonthBillProperty2 between", value1, value2, "dcbMonthbillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbMonthbillproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_MonthBillProperty2 not between", value1, value2, "dcbMonthbillproperty2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}