package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class DcbDaybillitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbDaybillitemExample() {
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

        public Criteria andDcbDaybillitemidIsNull() {
            addCriterion("DCB_DayBillItemId is null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidIsNotNull() {
            addCriterion("DCB_DayBillItemId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidEqualTo(Long value) {
            addCriterion("DCB_DayBillItemId =", value, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidNotEqualTo(Long value) {
            addCriterion("DCB_DayBillItemId <>", value, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidGreaterThan(Long value) {
            addCriterion("DCB_DayBillItemId >", value, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_DayBillItemId >=", value, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidLessThan(Long value) {
            addCriterion("DCB_DayBillItemId <", value, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_DayBillItemId <=", value, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidIn(List<Long> values) {
            addCriterion("DCB_DayBillItemId in", values, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidNotIn(List<Long> values) {
            addCriterion("DCB_DayBillItemId not in", values, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidBetween(Long value1, Long value2) {
            addCriterion("DCB_DayBillItemId between", value1, value2, "dcbDaybillitemid");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_DayBillItemId not between", value1, value2, "dcbDaybillitemid");
            return (Criteria) this;
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

        public Criteria andDcbItemfoodidIsNull() {
            addCriterion("DCB_ItemFoodId is null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidIsNotNull() {
            addCriterion("DCB_ItemFoodId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidEqualTo(Long value) {
            addCriterion("DCB_ItemFoodId =", value, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidNotEqualTo(Long value) {
            addCriterion("DCB_ItemFoodId <>", value, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidGreaterThan(Long value) {
            addCriterion("DCB_ItemFoodId >", value, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCB_ItemFoodId >=", value, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidLessThan(Long value) {
            addCriterion("DCB_ItemFoodId <", value, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidLessThanOrEqualTo(Long value) {
            addCriterion("DCB_ItemFoodId <=", value, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidIn(List<Long> values) {
            addCriterion("DCB_ItemFoodId in", values, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidNotIn(List<Long> values) {
            addCriterion("DCB_ItemFoodId not in", values, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidBetween(Long value1, Long value2) {
            addCriterion("DCB_ItemFoodId between", value1, value2, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodidNotBetween(Long value1, Long value2) {
            addCriterion("DCB_ItemFoodId not between", value1, value2, "dcbItemfoodid");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameIsNull() {
            addCriterion("DCB_ItemFoodName is null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameIsNotNull() {
            addCriterion("DCB_ItemFoodName is not null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameEqualTo(String value) {
            addCriterion("DCB_ItemFoodName =", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameNotEqualTo(String value) {
            addCriterion("DCB_ItemFoodName <>", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameGreaterThan(String value) {
            addCriterion("DCB_ItemFoodName >", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_ItemFoodName >=", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameLessThan(String value) {
            addCriterion("DCB_ItemFoodName <", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameLessThanOrEqualTo(String value) {
            addCriterion("DCB_ItemFoodName <=", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameLike(String value) {
            addCriterion("DCB_ItemFoodName like", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameNotLike(String value) {
            addCriterion("DCB_ItemFoodName not like", value, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameIn(List<String> values) {
            addCriterion("DCB_ItemFoodName in", values, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameNotIn(List<String> values) {
            addCriterion("DCB_ItemFoodName not in", values, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameBetween(String value1, String value2) {
            addCriterion("DCB_ItemFoodName between", value1, value2, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnameNotBetween(String value1, String value2) {
            addCriterion("DCB_ItemFoodName not between", value1, value2, "dcbItemfoodname");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceIsNull() {
            addCriterion("DCB_ItemFoodPrice is null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceIsNotNull() {
            addCriterion("DCB_ItemFoodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceEqualTo(Float value) {
            addCriterion("DCB_ItemFoodPrice =", value, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceNotEqualTo(Float value) {
            addCriterion("DCB_ItemFoodPrice <>", value, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceGreaterThan(Float value) {
            addCriterion("DCB_ItemFoodPrice >", value, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("DCB_ItemFoodPrice >=", value, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceLessThan(Float value) {
            addCriterion("DCB_ItemFoodPrice <", value, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceLessThanOrEqualTo(Float value) {
            addCriterion("DCB_ItemFoodPrice <=", value, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceIn(List<Float> values) {
            addCriterion("DCB_ItemFoodPrice in", values, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceNotIn(List<Float> values) {
            addCriterion("DCB_ItemFoodPrice not in", values, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceBetween(Float value1, Float value2) {
            addCriterion("DCB_ItemFoodPrice between", value1, value2, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodpriceNotBetween(Float value1, Float value2) {
            addCriterion("DCB_ItemFoodPrice not between", value1, value2, "dcbItemfoodprice");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyIsNull() {
            addCriterion("DCB_ItemMoney is null");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyIsNotNull() {
            addCriterion("DCB_ItemMoney is not null");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyEqualTo(Float value) {
            addCriterion("DCB_ItemMoney =", value, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyNotEqualTo(Float value) {
            addCriterion("DCB_ItemMoney <>", value, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyGreaterThan(Float value) {
            addCriterion("DCB_ItemMoney >", value, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("DCB_ItemMoney >=", value, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyLessThan(Float value) {
            addCriterion("DCB_ItemMoney <", value, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyLessThanOrEqualTo(Float value) {
            addCriterion("DCB_ItemMoney <=", value, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyIn(List<Float> values) {
            addCriterion("DCB_ItemMoney in", values, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyNotIn(List<Float> values) {
            addCriterion("DCB_ItemMoney not in", values, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyBetween(Float value1, Float value2) {
            addCriterion("DCB_ItemMoney between", value1, value2, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemmoneyNotBetween(Float value1, Float value2) {
            addCriterion("DCB_ItemMoney not between", value1, value2, "dcbItemmoney");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumIsNull() {
            addCriterion("DCB_ItemFoodNum is null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumIsNotNull() {
            addCriterion("DCB_ItemFoodNum is not null");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumEqualTo(Integer value) {
            addCriterion("DCB_ItemFoodNum =", value, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumNotEqualTo(Integer value) {
            addCriterion("DCB_ItemFoodNum <>", value, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumGreaterThan(Integer value) {
            addCriterion("DCB_ItemFoodNum >", value, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_ItemFoodNum >=", value, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumLessThan(Integer value) {
            addCriterion("DCB_ItemFoodNum <", value, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_ItemFoodNum <=", value, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumIn(List<Integer> values) {
            addCriterion("DCB_ItemFoodNum in", values, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumNotIn(List<Integer> values) {
            addCriterion("DCB_ItemFoodNum not in", values, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumBetween(Integer value1, Integer value2) {
            addCriterion("DCB_ItemFoodNum between", value1, value2, "dcbItemfoodnum");
            return (Criteria) this;
        }

        public Criteria andDcbItemfoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_ItemFoodNum not between", value1, value2, "dcbItemfoodnum");
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

        public Criteria andDcbDaybillitemtproperty1IsNull() {
            addCriterion("DCB_DayBillItemtProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1IsNotNull() {
            addCriterion("DCB_DayBillItemtProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1EqualTo(String value) {
            addCriterion("DCB_DayBillItemtProperty1 =", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1NotEqualTo(String value) {
            addCriterion("DCB_DayBillItemtProperty1 <>", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1GreaterThan(String value) {
            addCriterion("DCB_DayBillItemtProperty1 >", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_DayBillItemtProperty1 >=", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1LessThan(String value) {
            addCriterion("DCB_DayBillItemtProperty1 <", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_DayBillItemtProperty1 <=", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1Like(String value) {
            addCriterion("DCB_DayBillItemtProperty1 like", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1NotLike(String value) {
            addCriterion("DCB_DayBillItemtProperty1 not like", value, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1In(List<String> values) {
            addCriterion("DCB_DayBillItemtProperty1 in", values, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1NotIn(List<String> values) {
            addCriterion("DCB_DayBillItemtProperty1 not in", values, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1Between(String value1, String value2) {
            addCriterion("DCB_DayBillItemtProperty1 between", value1, value2, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemtproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_DayBillItemtProperty1 not between", value1, value2, "dcbDaybillitemtproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2IsNull() {
            addCriterion("DCB_DayBillItemProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2IsNotNull() {
            addCriterion("DCB_DayBillItemProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2EqualTo(String value) {
            addCriterion("DCB_DayBillItemProperty2 =", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2NotEqualTo(String value) {
            addCriterion("DCB_DayBillItemProperty2 <>", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2GreaterThan(String value) {
            addCriterion("DCB_DayBillItemProperty2 >", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_DayBillItemProperty2 >=", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2LessThan(String value) {
            addCriterion("DCB_DayBillItemProperty2 <", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_DayBillItemProperty2 <=", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2Like(String value) {
            addCriterion("DCB_DayBillItemProperty2 like", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2NotLike(String value) {
            addCriterion("DCB_DayBillItemProperty2 not like", value, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2In(List<String> values) {
            addCriterion("DCB_DayBillItemProperty2 in", values, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2NotIn(List<String> values) {
            addCriterion("DCB_DayBillItemProperty2 not in", values, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2Between(String value1, String value2) {
            addCriterion("DCB_DayBillItemProperty2 between", value1, value2, "dcbDaybillitemproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbDaybillitemproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_DayBillItemProperty2 not between", value1, value2, "dcbDaybillitemproperty2");
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