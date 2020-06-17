package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class DcbOnecategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbOnecategoryExample() {
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

        public Criteria andDcbOnecategoryidIsNull() {
            addCriterion("DCB_OneCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidIsNotNull() {
            addCriterion("DCB_OneCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidEqualTo(Long value) {
            addCriterion("DCB_OneCategoryId =", value, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidNotEqualTo(Long value) {
            addCriterion("DCB_OneCategoryId <>", value, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidGreaterThan(Long value) {
            addCriterion("DCB_OneCategoryId >", value, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_OneCategoryId >=", value, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidLessThan(Long value) {
            addCriterion("DCB_OneCategoryId <", value, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_OneCategoryId <=", value, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidIn(List<Long> values) {
            addCriterion("DCB_OneCategoryId in", values, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidNotIn(List<Long> values) {
            addCriterion("DCB_OneCategoryId not in", values, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidBetween(Long value1, Long value2) {
            addCriterion("DCB_OneCategoryId between", value1, value2, "dcbOnecategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_OneCategoryId not between", value1, value2, "dcbOnecategoryid");
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

        public Criteria andDcbOnecategorynameIsNull() {
            addCriterion("DCB_OneCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameIsNotNull() {
            addCriterion("DCB_OneCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameEqualTo(String value) {
            addCriterion("DCB_OneCategoryName =", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameNotEqualTo(String value) {
            addCriterion("DCB_OneCategoryName <>", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameGreaterThan(String value) {
            addCriterion("DCB_OneCategoryName >", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryName >=", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameLessThan(String value) {
            addCriterion("DCB_OneCategoryName <", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameLessThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryName <=", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameLike(String value) {
            addCriterion("DCB_OneCategoryName like", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameNotLike(String value) {
            addCriterion("DCB_OneCategoryName not like", value, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameIn(List<String> values) {
            addCriterion("DCB_OneCategoryName in", values, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameNotIn(List<String> values) {
            addCriterion("DCB_OneCategoryName not in", values, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryName between", value1, value2, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorynameNotBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryName not between", value1, value2, "dcbOnecategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescIsNull() {
            addCriterion("DCB_OneCategoryDesc is null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescIsNotNull() {
            addCriterion("DCB_OneCategoryDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescEqualTo(String value) {
            addCriterion("DCB_OneCategoryDesc =", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescNotEqualTo(String value) {
            addCriterion("DCB_OneCategoryDesc <>", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescGreaterThan(String value) {
            addCriterion("DCB_OneCategoryDesc >", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryDesc >=", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescLessThan(String value) {
            addCriterion("DCB_OneCategoryDesc <", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescLessThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryDesc <=", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescLike(String value) {
            addCriterion("DCB_OneCategoryDesc like", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescNotLike(String value) {
            addCriterion("DCB_OneCategoryDesc not like", value, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescIn(List<String> values) {
            addCriterion("DCB_OneCategoryDesc in", values, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescNotIn(List<String> values) {
            addCriterion("DCB_OneCategoryDesc not in", values, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryDesc between", value1, value2, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorydescNotBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryDesc not between", value1, value2, "dcbOnecategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureIsNull() {
            addCriterion("DCB_OneCategoryPicture is null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureIsNotNull() {
            addCriterion("DCB_OneCategoryPicture is not null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureEqualTo(String value) {
            addCriterion("DCB_OneCategoryPicture =", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureNotEqualTo(String value) {
            addCriterion("DCB_OneCategoryPicture <>", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureGreaterThan(String value) {
            addCriterion("DCB_OneCategoryPicture >", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryPicture >=", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureLessThan(String value) {
            addCriterion("DCB_OneCategoryPicture <", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureLessThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryPicture <=", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureLike(String value) {
            addCriterion("DCB_OneCategoryPicture like", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureNotLike(String value) {
            addCriterion("DCB_OneCategoryPicture not like", value, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureIn(List<String> values) {
            addCriterion("DCB_OneCategoryPicture in", values, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureNotIn(List<String> values) {
            addCriterion("DCB_OneCategoryPicture not in", values, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryPicture between", value1, value2, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategorypictureNotBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryPicture not between", value1, value2, "dcbOnecategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1IsNull() {
            addCriterion("DCB_OneCategoryProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1IsNotNull() {
            addCriterion("DCB_OneCategoryProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1EqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty1 =", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1NotEqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty1 <>", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1GreaterThan(String value) {
            addCriterion("DCB_OneCategoryProperty1 >", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty1 >=", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1LessThan(String value) {
            addCriterion("DCB_OneCategoryProperty1 <", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty1 <=", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1Like(String value) {
            addCriterion("DCB_OneCategoryProperty1 like", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1NotLike(String value) {
            addCriterion("DCB_OneCategoryProperty1 not like", value, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1In(List<String> values) {
            addCriterion("DCB_OneCategoryProperty1 in", values, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1NotIn(List<String> values) {
            addCriterion("DCB_OneCategoryProperty1 not in", values, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1Between(String value1, String value2) {
            addCriterion("DCB_OneCategoryProperty1 between", value1, value2, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryProperty1 not between", value1, value2, "dcbOnecategoryproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2IsNull() {
            addCriterion("DCB_OneCategoryProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2IsNotNull() {
            addCriterion("DCB_OneCategoryProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2EqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty2 =", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2NotEqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty2 <>", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2GreaterThan(String value) {
            addCriterion("DCB_OneCategoryProperty2 >", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty2 >=", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2LessThan(String value) {
            addCriterion("DCB_OneCategoryProperty2 <", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_OneCategoryProperty2 <=", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2Like(String value) {
            addCriterion("DCB_OneCategoryProperty2 like", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2NotLike(String value) {
            addCriterion("DCB_OneCategoryProperty2 not like", value, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2In(List<String> values) {
            addCriterion("DCB_OneCategoryProperty2 in", values, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2NotIn(List<String> values) {
            addCriterion("DCB_OneCategoryProperty2 not in", values, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2Between(String value1, String value2) {
            addCriterion("DCB_OneCategoryProperty2 between", value1, value2, "dcbOnecategoryproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbOnecategoryproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_OneCategoryProperty2 not between", value1, value2, "dcbOnecategoryproperty2");
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