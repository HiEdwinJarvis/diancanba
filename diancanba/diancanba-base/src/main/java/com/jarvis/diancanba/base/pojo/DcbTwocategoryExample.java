package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class DcbTwocategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbTwocategoryExample() {
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

        public Criteria andDcbTwocategoryidIsNull() {
            addCriterion("DCB_TwoCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidIsNotNull() {
            addCriterion("DCB_TwoCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidEqualTo(Long value) {
            addCriterion("DCB_TwoCategoryId =", value, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidNotEqualTo(Long value) {
            addCriterion("DCB_TwoCategoryId <>", value, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidGreaterThan(Long value) {
            addCriterion("DCB_TwoCategoryId >", value, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_TwoCategoryId >=", value, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidLessThan(Long value) {
            addCriterion("DCB_TwoCategoryId <", value, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_TwoCategoryId <=", value, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidIn(List<Long> values) {
            addCriterion("DCB_TwoCategoryId in", values, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidNotIn(List<Long> values) {
            addCriterion("DCB_TwoCategoryId not in", values, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidBetween(Long value1, Long value2) {
            addCriterion("DCB_TwoCategoryId between", value1, value2, "dcbTwocategoryid");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategoryidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_TwoCategoryId not between", value1, value2, "dcbTwocategoryid");
            return (Criteria) this;
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

        public Criteria andDcbTwocategorynameIsNull() {
            addCriterion("DCB_TwoCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameIsNotNull() {
            addCriterion("DCB_TwoCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameEqualTo(String value) {
            addCriterion("DCB_TwoCategoryName =", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameNotEqualTo(String value) {
            addCriterion("DCB_TwoCategoryName <>", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameGreaterThan(String value) {
            addCriterion("DCB_TwoCategoryName >", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_TwoCategoryName >=", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameLessThan(String value) {
            addCriterion("DCB_TwoCategoryName <", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameLessThanOrEqualTo(String value) {
            addCriterion("DCB_TwoCategoryName <=", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameLike(String value) {
            addCriterion("DCB_TwoCategoryName like", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameNotLike(String value) {
            addCriterion("DCB_TwoCategoryName not like", value, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameIn(List<String> values) {
            addCriterion("DCB_TwoCategoryName in", values, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameNotIn(List<String> values) {
            addCriterion("DCB_TwoCategoryName not in", values, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameBetween(String value1, String value2) {
            addCriterion("DCB_TwoCategoryName between", value1, value2, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorynameNotBetween(String value1, String value2) {
            addCriterion("DCB_TwoCategoryName not between", value1, value2, "dcbTwocategoryname");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescIsNull() {
            addCriterion("DCB_TwoCategoryDesc is null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescIsNotNull() {
            addCriterion("DCB_TwoCategoryDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescEqualTo(String value) {
            addCriterion("DCB_TwoCategoryDesc =", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescNotEqualTo(String value) {
            addCriterion("DCB_TwoCategoryDesc <>", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescGreaterThan(String value) {
            addCriterion("DCB_TwoCategoryDesc >", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_TwoCategoryDesc >=", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescLessThan(String value) {
            addCriterion("DCB_TwoCategoryDesc <", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescLessThanOrEqualTo(String value) {
            addCriterion("DCB_TwoCategoryDesc <=", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescLike(String value) {
            addCriterion("DCB_TwoCategoryDesc like", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescNotLike(String value) {
            addCriterion("DCB_TwoCategoryDesc not like", value, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescIn(List<String> values) {
            addCriterion("DCB_TwoCategoryDesc in", values, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescNotIn(List<String> values) {
            addCriterion("DCB_TwoCategoryDesc not in", values, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescBetween(String value1, String value2) {
            addCriterion("DCB_TwoCategoryDesc between", value1, value2, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorydescNotBetween(String value1, String value2) {
            addCriterion("DCB_TwoCategoryDesc not between", value1, value2, "dcbTwocategorydesc");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureIsNull() {
            addCriterion("DCB_TwoCategoryPicture is null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureIsNotNull() {
            addCriterion("DCB_TwoCategoryPicture is not null");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureEqualTo(String value) {
            addCriterion("DCB_TwoCategoryPicture =", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureNotEqualTo(String value) {
            addCriterion("DCB_TwoCategoryPicture <>", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureGreaterThan(String value) {
            addCriterion("DCB_TwoCategoryPicture >", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_TwoCategoryPicture >=", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureLessThan(String value) {
            addCriterion("DCB_TwoCategoryPicture <", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureLessThanOrEqualTo(String value) {
            addCriterion("DCB_TwoCategoryPicture <=", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureLike(String value) {
            addCriterion("DCB_TwoCategoryPicture like", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureNotLike(String value) {
            addCriterion("DCB_TwoCategoryPicture not like", value, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureIn(List<String> values) {
            addCriterion("DCB_TwoCategoryPicture in", values, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureNotIn(List<String> values) {
            addCriterion("DCB_TwoCategoryPicture not in", values, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureBetween(String value1, String value2) {
            addCriterion("DCB_TwoCategoryPicture between", value1, value2, "dcbTwocategorypicture");
            return (Criteria) this;
        }

        public Criteria andDcbTwocategorypictureNotBetween(String value1, String value2) {
            addCriterion("DCB_TwoCategoryPicture not between", value1, value2, "dcbTwocategorypicture");
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