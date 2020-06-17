package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class DcbContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbContentExample() {
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

        public Criteria andDcbContentidIsNull() {
            addCriterion("DCB_ContentId is null");
            return (Criteria) this;
        }

        public Criteria andDcbContentidIsNotNull() {
            addCriterion("DCB_ContentId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbContentidEqualTo(Long value) {
            addCriterion("DCB_ContentId =", value, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidNotEqualTo(Long value) {
            addCriterion("DCB_ContentId <>", value, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidGreaterThan(Long value) {
            addCriterion("DCB_ContentId >", value, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_ContentId >=", value, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidLessThan(Long value) {
            addCriterion("DCB_ContentId <", value, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_ContentId <=", value, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidIn(List<Long> values) {
            addCriterion("DCB_ContentId in", values, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidNotIn(List<Long> values) {
            addCriterion("DCB_ContentId not in", values, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidBetween(Long value1, Long value2) {
            addCriterion("DCB_ContentId between", value1, value2, "dcbContentid");
            return (Criteria) this;
        }

        public Criteria andDcbContentidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_ContentId not between", value1, value2, "dcbContentid");
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

        public Criteria andDcbContenttileIsNull() {
            addCriterion("DCB_ContentTile is null");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileIsNotNull() {
            addCriterion("DCB_ContentTile is not null");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileEqualTo(String value) {
            addCriterion("DCB_ContentTile =", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileNotEqualTo(String value) {
            addCriterion("DCB_ContentTile <>", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileGreaterThan(String value) {
            addCriterion("DCB_ContentTile >", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_ContentTile >=", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileLessThan(String value) {
            addCriterion("DCB_ContentTile <", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileLessThanOrEqualTo(String value) {
            addCriterion("DCB_ContentTile <=", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileLike(String value) {
            addCriterion("DCB_ContentTile like", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileNotLike(String value) {
            addCriterion("DCB_ContentTile not like", value, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileIn(List<String> values) {
            addCriterion("DCB_ContentTile in", values, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileNotIn(List<String> values) {
            addCriterion("DCB_ContentTile not in", values, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileBetween(String value1, String value2) {
            addCriterion("DCB_ContentTile between", value1, value2, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContenttileNotBetween(String value1, String value2) {
            addCriterion("DCB_ContentTile not between", value1, value2, "dcbContenttile");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureIsNull() {
            addCriterion("DCB_ContentPicture is null");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureIsNotNull() {
            addCriterion("DCB_ContentPicture is not null");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureEqualTo(String value) {
            addCriterion("DCB_ContentPicture =", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureNotEqualTo(String value) {
            addCriterion("DCB_ContentPicture <>", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureGreaterThan(String value) {
            addCriterion("DCB_ContentPicture >", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_ContentPicture >=", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureLessThan(String value) {
            addCriterion("DCB_ContentPicture <", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureLessThanOrEqualTo(String value) {
            addCriterion("DCB_ContentPicture <=", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureLike(String value) {
            addCriterion("DCB_ContentPicture like", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureNotLike(String value) {
            addCriterion("DCB_ContentPicture not like", value, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureIn(List<String> values) {
            addCriterion("DCB_ContentPicture in", values, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureNotIn(List<String> values) {
            addCriterion("DCB_ContentPicture not in", values, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureBetween(String value1, String value2) {
            addCriterion("DCB_ContentPicture between", value1, value2, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentpictureNotBetween(String value1, String value2) {
            addCriterion("DCB_ContentPicture not between", value1, value2, "dcbContentpicture");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusIsNull() {
            addCriterion("DCB_ContentStatus is null");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusIsNotNull() {
            addCriterion("DCB_ContentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusEqualTo(Integer value) {
            addCriterion("DCB_ContentStatus =", value, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusNotEqualTo(Integer value) {
            addCriterion("DCB_ContentStatus <>", value, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusGreaterThan(Integer value) {
            addCriterion("DCB_ContentStatus >", value, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_ContentStatus >=", value, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusLessThan(Integer value) {
            addCriterion("DCB_ContentStatus <", value, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_ContentStatus <=", value, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusIn(List<Integer> values) {
            addCriterion("DCB_ContentStatus in", values, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusNotIn(List<Integer> values) {
            addCriterion("DCB_ContentStatus not in", values, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusBetween(Integer value1, Integer value2) {
            addCriterion("DCB_ContentStatus between", value1, value2, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_ContentStatus not between", value1, value2, "dcbContentstatus");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1IsNull() {
            addCriterion("DCB_ContentProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1IsNotNull() {
            addCriterion("DCB_ContentProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1EqualTo(String value) {
            addCriterion("DCB_ContentProperty1 =", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1NotEqualTo(String value) {
            addCriterion("DCB_ContentProperty1 <>", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1GreaterThan(String value) {
            addCriterion("DCB_ContentProperty1 >", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_ContentProperty1 >=", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1LessThan(String value) {
            addCriterion("DCB_ContentProperty1 <", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_ContentProperty1 <=", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1Like(String value) {
            addCriterion("DCB_ContentProperty1 like", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1NotLike(String value) {
            addCriterion("DCB_ContentProperty1 not like", value, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1In(List<String> values) {
            addCriterion("DCB_ContentProperty1 in", values, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1NotIn(List<String> values) {
            addCriterion("DCB_ContentProperty1 not in", values, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1Between(String value1, String value2) {
            addCriterion("DCB_ContentProperty1 between", value1, value2, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_ContentProperty1 not between", value1, value2, "dcbContentproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2IsNull() {
            addCriterion("DCB_ContentProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2IsNotNull() {
            addCriterion("DCB_ContentProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2EqualTo(String value) {
            addCriterion("DCB_ContentProperty2 =", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2NotEqualTo(String value) {
            addCriterion("DCB_ContentProperty2 <>", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2GreaterThan(String value) {
            addCriterion("DCB_ContentProperty2 >", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_ContentProperty2 >=", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2LessThan(String value) {
            addCriterion("DCB_ContentProperty2 <", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_ContentProperty2 <=", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2Like(String value) {
            addCriterion("DCB_ContentProperty2 like", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2NotLike(String value) {
            addCriterion("DCB_ContentProperty2 not like", value, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2In(List<String> values) {
            addCriterion("DCB_ContentProperty2 in", values, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2NotIn(List<String> values) {
            addCriterion("DCB_ContentProperty2 not in", values, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2Between(String value1, String value2) {
            addCriterion("DCB_ContentProperty2 between", value1, value2, "dcbContentproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbContentproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_ContentProperty2 not between", value1, value2, "dcbContentproperty2");
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