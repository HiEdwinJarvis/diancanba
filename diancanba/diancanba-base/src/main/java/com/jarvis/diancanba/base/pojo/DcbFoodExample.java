package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class DcbFoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbFoodExample() {
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

        public Criteria andDcbFoodidIsNull() {
            addCriterion("DCB_FoodId is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidIsNotNull() {
            addCriterion("DCB_FoodId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidEqualTo(Long value) {
            addCriterion("DCB_FoodId =", value, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidNotEqualTo(Long value) {
            addCriterion("DCB_FoodId <>", value, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidGreaterThan(Long value) {
            addCriterion("DCB_FoodId >", value, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_FoodId >=", value, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidLessThan(Long value) {
            addCriterion("DCB_FoodId <", value, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_FoodId <=", value, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidIn(List<Long> values) {
            addCriterion("DCB_FoodId in", values, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidNotIn(List<Long> values) {
            addCriterion("DCB_FoodId not in", values, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidBetween(Long value1, Long value2) {
            addCriterion("DCB_FoodId between", value1, value2, "dcbFoodid");
            return (Criteria) this;
        }

        public Criteria andDcbFoodidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_FoodId not between", value1, value2, "dcbFoodid");
            return (Criteria) this;
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

        public Criteria andDcbFoodnameIsNull() {
            addCriterion("DCB_FoodName is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameIsNotNull() {
            addCriterion("DCB_FoodName is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameEqualTo(String value) {
            addCriterion("DCB_FoodName =", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameNotEqualTo(String value) {
            addCriterion("DCB_FoodName <>", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameGreaterThan(String value) {
            addCriterion("DCB_FoodName >", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_FoodName >=", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameLessThan(String value) {
            addCriterion("DCB_FoodName <", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameLessThanOrEqualTo(String value) {
            addCriterion("DCB_FoodName <=", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameLike(String value) {
            addCriterion("DCB_FoodName like", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameNotLike(String value) {
            addCriterion("DCB_FoodName not like", value, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameIn(List<String> values) {
            addCriterion("DCB_FoodName in", values, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameNotIn(List<String> values) {
            addCriterion("DCB_FoodName not in", values, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameBetween(String value1, String value2) {
            addCriterion("DCB_FoodName between", value1, value2, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodnameNotBetween(String value1, String value2) {
            addCriterion("DCB_FoodName not between", value1, value2, "dcbFoodname");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceIsNull() {
            addCriterion("DCB_FoodPrice is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceIsNotNull() {
            addCriterion("DCB_FoodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceEqualTo(Float value) {
            addCriterion("DCB_FoodPrice =", value, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceNotEqualTo(Float value) {
            addCriterion("DCB_FoodPrice <>", value, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceGreaterThan(Float value) {
            addCriterion("DCB_FoodPrice >", value, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("DCB_FoodPrice >=", value, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceLessThan(Float value) {
            addCriterion("DCB_FoodPrice <", value, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceLessThanOrEqualTo(Float value) {
            addCriterion("DCB_FoodPrice <=", value, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceIn(List<Float> values) {
            addCriterion("DCB_FoodPrice in", values, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceNotIn(List<Float> values) {
            addCriterion("DCB_FoodPrice not in", values, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceBetween(Float value1, Float value2) {
            addCriterion("DCB_FoodPrice between", value1, value2, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpriceNotBetween(Float value1, Float value2) {
            addCriterion("DCB_FoodPrice not between", value1, value2, "dcbFoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescIsNull() {
            addCriterion("DCB_FoodDesc is null");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescIsNotNull() {
            addCriterion("DCB_FoodDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescEqualTo(String value) {
            addCriterion("DCB_FoodDesc =", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescNotEqualTo(String value) {
            addCriterion("DCB_FoodDesc <>", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescGreaterThan(String value) {
            addCriterion("DCB_FoodDesc >", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_FoodDesc >=", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescLessThan(String value) {
            addCriterion("DCB_FoodDesc <", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescLessThanOrEqualTo(String value) {
            addCriterion("DCB_FoodDesc <=", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescLike(String value) {
            addCriterion("DCB_FoodDesc like", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescNotLike(String value) {
            addCriterion("DCB_FoodDesc not like", value, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescIn(List<String> values) {
            addCriterion("DCB_FoodDesc in", values, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescNotIn(List<String> values) {
            addCriterion("DCB_FoodDesc not in", values, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescBetween(String value1, String value2) {
            addCriterion("DCB_FoodDesc between", value1, value2, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFooddescNotBetween(String value1, String value2) {
            addCriterion("DCB_FoodDesc not between", value1, value2, "dcbFooddesc");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureIsNull() {
            addCriterion("DCB_FoodPicture is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureIsNotNull() {
            addCriterion("DCB_FoodPicture is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureEqualTo(String value) {
            addCriterion("DCB_FoodPicture =", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureNotEqualTo(String value) {
            addCriterion("DCB_FoodPicture <>", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureGreaterThan(String value) {
            addCriterion("DCB_FoodPicture >", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_FoodPicture >=", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureLessThan(String value) {
            addCriterion("DCB_FoodPicture <", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureLessThanOrEqualTo(String value) {
            addCriterion("DCB_FoodPicture <=", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureLike(String value) {
            addCriterion("DCB_FoodPicture like", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureNotLike(String value) {
            addCriterion("DCB_FoodPicture not like", value, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureIn(List<String> values) {
            addCriterion("DCB_FoodPicture in", values, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureNotIn(List<String> values) {
            addCriterion("DCB_FoodPicture not in", values, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureBetween(String value1, String value2) {
            addCriterion("DCB_FoodPicture between", value1, value2, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodpictureNotBetween(String value1, String value2) {
            addCriterion("DCB_FoodPicture not between", value1, value2, "dcbFoodpicture");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotIsNull() {
            addCriterion("DCB_FoodIsHot is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotIsNotNull() {
            addCriterion("DCB_FoodIsHot is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotEqualTo(Integer value) {
            addCriterion("DCB_FoodIsHot =", value, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotNotEqualTo(Integer value) {
            addCriterion("DCB_FoodIsHot <>", value, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotGreaterThan(Integer value) {
            addCriterion("DCB_FoodIsHot >", value, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_FoodIsHot >=", value, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotLessThan(Integer value) {
            addCriterion("DCB_FoodIsHot <", value, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_FoodIsHot <=", value, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotIn(List<Integer> values) {
            addCriterion("DCB_FoodIsHot in", values, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotNotIn(List<Integer> values) {
            addCriterion("DCB_FoodIsHot not in", values, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_FoodIsHot between", value1, value2, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodishotNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_FoodIsHot not between", value1, value2, "dcbFoodishot");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1IsNull() {
            addCriterion("DCB_FoodProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1IsNotNull() {
            addCriterion("DCB_FoodProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1EqualTo(String value) {
            addCriterion("DCB_FoodProperty1 =", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1NotEqualTo(String value) {
            addCriterion("DCB_FoodProperty1 <>", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1GreaterThan(String value) {
            addCriterion("DCB_FoodProperty1 >", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_FoodProperty1 >=", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1LessThan(String value) {
            addCriterion("DCB_FoodProperty1 <", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_FoodProperty1 <=", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1Like(String value) {
            addCriterion("DCB_FoodProperty1 like", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1NotLike(String value) {
            addCriterion("DCB_FoodProperty1 not like", value, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1In(List<String> values) {
            addCriterion("DCB_FoodProperty1 in", values, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1NotIn(List<String> values) {
            addCriterion("DCB_FoodProperty1 not in", values, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1Between(String value1, String value2) {
            addCriterion("DCB_FoodProperty1 between", value1, value2, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_FoodProperty1 not between", value1, value2, "dcbFoodproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2IsNull() {
            addCriterion("DCB_FoodProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2IsNotNull() {
            addCriterion("DCB_FoodProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2EqualTo(String value) {
            addCriterion("DCB_FoodProperty2 =", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2NotEqualTo(String value) {
            addCriterion("DCB_FoodProperty2 <>", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2GreaterThan(String value) {
            addCriterion("DCB_FoodProperty2 >", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_FoodProperty2 >=", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2LessThan(String value) {
            addCriterion("DCB_FoodProperty2 <", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_FoodProperty2 <=", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2Like(String value) {
            addCriterion("DCB_FoodProperty2 like", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2NotLike(String value) {
            addCriterion("DCB_FoodProperty2 not like", value, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2In(List<String> values) {
            addCriterion("DCB_FoodProperty2 in", values, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2NotIn(List<String> values) {
            addCriterion("DCB_FoodProperty2 not in", values, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2Between(String value1, String value2) {
            addCriterion("DCB_FoodProperty2 between", value1, value2, "dcbFoodproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbFoodproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_FoodProperty2 not between", value1, value2, "dcbFoodproperty2");
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