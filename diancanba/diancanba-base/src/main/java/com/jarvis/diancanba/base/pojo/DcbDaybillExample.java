package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DcbDaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbDaybillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDcbDaybillidIsNull() {
            addCriterion("DCB_DayBillId is null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidIsNotNull() {
            addCriterion("DCB_DayBillId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidEqualTo(Long value) {
            addCriterion("DCB_DayBillId =", value, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidNotEqualTo(Long value) {
            addCriterion("DCB_DayBillId <>", value, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidGreaterThan(Long value) {
            addCriterion("DCB_DayBillId >", value, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_DayBillId >=", value, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidLessThan(Long value) {
            addCriterion("DCB_DayBillId <", value, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_DayBillId <=", value, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidIn(List<Long> values) {
            addCriterion("DCB_DayBillId in", values, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidNotIn(List<Long> values) {
            addCriterion("DCB_DayBillId not in", values, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidBetween(Long value1, Long value2) {
            addCriterion("DCB_DayBillId between", value1, value2, "dcbDaybillid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_DayBillId not between", value1, value2, "dcbDaybillid");
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

        public Criteria andDcbDaybilldateIsNull() {
            addCriterion("DCB_DayBillDate is null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateIsNotNull() {
            addCriterion("DCB_DayBillDate is not null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_DayBillDate =", value, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_DayBillDate <>", value, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateGreaterThan(Date value) {
            addCriterionForJDBCDate("DCB_DayBillDate >", value, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_DayBillDate >=", value, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateLessThan(Date value) {
            addCriterionForJDBCDate("DCB_DayBillDate <", value, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_DayBillDate <=", value, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateIn(List<Date> values) {
            addCriterionForJDBCDate("DCB_DayBillDate in", values, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DCB_DayBillDate not in", values, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DCB_DayBillDate between", value1, value2, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDaybilldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DCB_DayBillDate not between", value1, value2, "dcbDaybilldate");
            return (Criteria) this;
        }

        public Criteria andDcbDateIsNull() {
            addCriterion("DCB_Date is null");
            return (Criteria) this;
        }

        public Criteria andDcbDateIsNotNull() {
            addCriterion("DCB_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDcbDateEqualTo(Date value) {
            addCriterion("DCB_Date =", value, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateNotEqualTo(Date value) {
            addCriterion("DCB_Date <>", value, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateGreaterThan(Date value) {
            addCriterion("DCB_Date >", value, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DCB_Date >=", value, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateLessThan(Date value) {
            addCriterion("DCB_Date <", value, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateLessThanOrEqualTo(Date value) {
            addCriterion("DCB_Date <=", value, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateIn(List<Date> values) {
            addCriterion("DCB_Date in", values, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateNotIn(List<Date> values) {
            addCriterion("DCB_Date not in", values, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateBetween(Date value1, Date value2) {
            addCriterion("DCB_Date between", value1, value2, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbDateNotBetween(Date value1, Date value2) {
            addCriterion("DCB_Date not between", value1, value2, "dcbDate");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyIsNull() {
            addCriterion("DCB_SumMoney is null");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyIsNotNull() {
            addCriterion("DCB_SumMoney is not null");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyEqualTo(Float value) {
            addCriterion("DCB_SumMoney =", value, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyNotEqualTo(Float value) {
            addCriterion("DCB_SumMoney <>", value, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyGreaterThan(Float value) {
            addCriterion("DCB_SumMoney >", value, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("DCB_SumMoney >=", value, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyLessThan(Float value) {
            addCriterion("DCB_SumMoney <", value, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyLessThanOrEqualTo(Float value) {
            addCriterion("DCB_SumMoney <=", value, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyIn(List<Float> values) {
            addCriterion("DCB_SumMoney in", values, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyNotIn(List<Float> values) {
            addCriterion("DCB_SumMoney not in", values, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyBetween(Float value1, Float value2) {
            addCriterion("DCB_SumMoney between", value1, value2, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbSummoneyNotBetween(Float value1, Float value2) {
            addCriterion("DCB_SumMoney not between", value1, value2, "dcbSummoney");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1IsNull() {
            addCriterion("DCB_BillProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1IsNotNull() {
            addCriterion("DCB_BillProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1EqualTo(String value) {
            addCriterion("DCB_BillProperty1 =", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1NotEqualTo(String value) {
            addCriterion("DCB_BillProperty1 <>", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1GreaterThan(String value) {
            addCriterion("DCB_BillProperty1 >", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BillProperty1 >=", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1LessThan(String value) {
            addCriterion("DCB_BillProperty1 <", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_BillProperty1 <=", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1Like(String value) {
            addCriterion("DCB_BillProperty1 like", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1NotLike(String value) {
            addCriterion("DCB_BillProperty1 not like", value, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1In(List<String> values) {
            addCriterion("DCB_BillProperty1 in", values, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1NotIn(List<String> values) {
            addCriterion("DCB_BillProperty1 not in", values, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1Between(String value1, String value2) {
            addCriterion("DCB_BillProperty1 between", value1, value2, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_BillProperty1 not between", value1, value2, "dcbBillproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2IsNull() {
            addCriterion("DCB_BillProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2IsNotNull() {
            addCriterion("DCB_BillProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2EqualTo(String value) {
            addCriterion("DCB_BillProperty2 =", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2NotEqualTo(String value) {
            addCriterion("DCB_BillProperty2 <>", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2GreaterThan(String value) {
            addCriterion("DCB_BillProperty2 >", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BillProperty2 >=", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2LessThan(String value) {
            addCriterion("DCB_BillProperty2 <", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_BillProperty2 <=", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2Like(String value) {
            addCriterion("DCB_BillProperty2 like", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2NotLike(String value) {
            addCriterion("DCB_BillProperty2 not like", value, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2In(List<String> values) {
            addCriterion("DCB_BillProperty2 in", values, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2NotIn(List<String> values) {
            addCriterion("DCB_BillProperty2 not in", values, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2Between(String value1, String value2) {
            addCriterion("DCB_BillProperty2 between", value1, value2, "dcbBillproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBillproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_BillProperty2 not between", value1, value2, "dcbBillproperty2");
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