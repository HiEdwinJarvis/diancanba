package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcbMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbMessageExample() {
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

        public Criteria andDcbMessageidIsNull() {
            addCriterion("DCB_MessageId is null");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidIsNotNull() {
            addCriterion("DCB_MessageId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidEqualTo(Long value) {
            addCriterion("DCB_MessageId =", value, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidNotEqualTo(Long value) {
            addCriterion("DCB_MessageId <>", value, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidGreaterThan(Long value) {
            addCriterion("DCB_MessageId >", value, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_MessageId >=", value, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidLessThan(Long value) {
            addCriterion("DCB_MessageId <", value, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_MessageId <=", value, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidIn(List<Long> values) {
            addCriterion("DCB_MessageId in", values, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidNotIn(List<Long> values) {
            addCriterion("DCB_MessageId not in", values, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidBetween(Long value1, Long value2) {
            addCriterion("DCB_MessageId between", value1, value2, "dcbMessageid");
            return (Criteria) this;
        }

        public Criteria andDcbMessageidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_MessageId not between", value1, value2, "dcbMessageid");
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

        public Criteria andDcbCreatetimeIsNull() {
            addCriterion("DCB_CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeIsNotNull() {
            addCriterion("DCB_CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeEqualTo(Date value) {
            addCriterion("DCB_CreateTime =", value, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeNotEqualTo(Date value) {
            addCriterion("DCB_CreateTime <>", value, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeGreaterThan(Date value) {
            addCriterion("DCB_CreateTime >", value, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DCB_CreateTime >=", value, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeLessThan(Date value) {
            addCriterion("DCB_CreateTime <", value, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DCB_CreateTime <=", value, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeIn(List<Date> values) {
            addCriterion("DCB_CreateTime in", values, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeNotIn(List<Date> values) {
            addCriterion("DCB_CreateTime not in", values, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeBetween(Date value1, Date value2) {
            addCriterion("DCB_CreateTime between", value1, value2, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DCB_CreateTime not between", value1, value2, "dcbCreatetime");
            return (Criteria) this;
        }

        public Criteria andDcbMessageIsNull() {
            addCriterion("DCB_Message is null");
            return (Criteria) this;
        }

        public Criteria andDcbMessageIsNotNull() {
            addCriterion("DCB_Message is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMessageEqualTo(String value) {
            addCriterion("DCB_Message =", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageNotEqualTo(String value) {
            addCriterion("DCB_Message <>", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageGreaterThan(String value) {
            addCriterion("DCB_Message >", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_Message >=", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageLessThan(String value) {
            addCriterion("DCB_Message <", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageLessThanOrEqualTo(String value) {
            addCriterion("DCB_Message <=", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageLike(String value) {
            addCriterion("DCB_Message like", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageNotLike(String value) {
            addCriterion("DCB_Message not like", value, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageIn(List<String> values) {
            addCriterion("DCB_Message in", values, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageNotIn(List<String> values) {
            addCriterion("DCB_Message not in", values, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageBetween(String value1, String value2) {
            addCriterion("DCB_Message between", value1, value2, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessageNotBetween(String value1, String value2) {
            addCriterion("DCB_Message not between", value1, value2, "dcbMessage");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusIsNull() {
            addCriterion("DCB_MessageStatus is null");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusIsNotNull() {
            addCriterion("DCB_MessageStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusEqualTo(Integer value) {
            addCriterion("DCB_MessageStatus =", value, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusNotEqualTo(Integer value) {
            addCriterion("DCB_MessageStatus <>", value, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusGreaterThan(Integer value) {
            addCriterion("DCB_MessageStatus >", value, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_MessageStatus >=", value, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusLessThan(Integer value) {
            addCriterion("DCB_MessageStatus <", value, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_MessageStatus <=", value, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusIn(List<Integer> values) {
            addCriterion("DCB_MessageStatus in", values, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusNotIn(List<Integer> values) {
            addCriterion("DCB_MessageStatus not in", values, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusBetween(Integer value1, Integer value2) {
            addCriterion("DCB_MessageStatus between", value1, value2, "dcbMessagestatus");
            return (Criteria) this;
        }

        public Criteria andDcbMessagestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_MessageStatus not between", value1, value2, "dcbMessagestatus");
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