package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DcbRestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbRestaurantExample() {
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

        public Criteria andDcbBossidIsNull() {
            addCriterion("DCB_BossId is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossidIsNotNull() {
            addCriterion("DCB_BossId is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossidEqualTo(String value) {
            addCriterion("DCB_BossId =", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidNotEqualTo(String value) {
            addCriterion("DCB_BossId <>", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidGreaterThan(String value) {
            addCriterion("DCB_BossId >", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossId >=", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidLessThan(String value) {
            addCriterion("DCB_BossId <", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossId <=", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidLike(String value) {
            addCriterion("DCB_BossId like", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidNotLike(String value) {
            addCriterion("DCB_BossId not like", value, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidIn(List<String> values) {
            addCriterion("DCB_BossId in", values, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidNotIn(List<String> values) {
            addCriterion("DCB_BossId not in", values, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidBetween(String value1, String value2) {
            addCriterion("DCB_BossId between", value1, value2, "dcbBossid");
            return (Criteria) this;
        }

        public Criteria andDcbBossidNotBetween(String value1, String value2) {
            addCriterion("DCB_BossId not between", value1, value2, "dcbBossid");
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

        public Criteria andDcbRestauranttelIsNull() {
            addCriterion("DCB_RestaurantTel is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelIsNotNull() {
            addCriterion("DCB_RestaurantTel is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelEqualTo(String value) {
            addCriterion("DCB_RestaurantTel =", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelNotEqualTo(String value) {
            addCriterion("DCB_RestaurantTel <>", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelGreaterThan(String value) {
            addCriterion("DCB_RestaurantTel >", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantTel >=", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelLessThan(String value) {
            addCriterion("DCB_RestaurantTel <", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelLessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantTel <=", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelLike(String value) {
            addCriterion("DCB_RestaurantTel like", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelNotLike(String value) {
            addCriterion("DCB_RestaurantTel not like", value, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelIn(List<String> values) {
            addCriterion("DCB_RestaurantTel in", values, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelNotIn(List<String> values) {
            addCriterion("DCB_RestaurantTel not in", values, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantTel between", value1, value2, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranttelNotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantTel not between", value1, value2, "dcbRestauranttel");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescIsNull() {
            addCriterion("DCB_RestaurantDesc is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescIsNotNull() {
            addCriterion("DCB_RestaurantDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescEqualTo(String value) {
            addCriterion("DCB_RestaurantDesc =", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescNotEqualTo(String value) {
            addCriterion("DCB_RestaurantDesc <>", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescGreaterThan(String value) {
            addCriterion("DCB_RestaurantDesc >", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantDesc >=", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescLessThan(String value) {
            addCriterion("DCB_RestaurantDesc <", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescLessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantDesc <=", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescLike(String value) {
            addCriterion("DCB_RestaurantDesc like", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescNotLike(String value) {
            addCriterion("DCB_RestaurantDesc not like", value, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescIn(List<String> values) {
            addCriterion("DCB_RestaurantDesc in", values, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescNotIn(List<String> values) {
            addCriterion("DCB_RestaurantDesc not in", values, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantDesc between", value1, value2, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdescNotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantDesc not between", value1, value2, "dcbRestaurantdesc");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressIsNull() {
            addCriterion("DCB_RestaurantAddress is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressIsNotNull() {
            addCriterion("DCB_RestaurantAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressEqualTo(String value) {
            addCriterion("DCB_RestaurantAddress =", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressNotEqualTo(String value) {
            addCriterion("DCB_RestaurantAddress <>", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressGreaterThan(String value) {
            addCriterion("DCB_RestaurantAddress >", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantAddress >=", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressLessThan(String value) {
            addCriterion("DCB_RestaurantAddress <", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressLessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantAddress <=", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressLike(String value) {
            addCriterion("DCB_RestaurantAddress like", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressNotLike(String value) {
            addCriterion("DCB_RestaurantAddress not like", value, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressIn(List<String> values) {
            addCriterion("DCB_RestaurantAddress in", values, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressNotIn(List<String> values) {
            addCriterion("DCB_RestaurantAddress not in", values, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantAddress between", value1, value2, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantaddressNotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantAddress not between", value1, value2, "dcbRestaurantaddress");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlIsNull() {
            addCriterion("DCB_RestaurantUrl is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlIsNotNull() {
            addCriterion("DCB_RestaurantUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlEqualTo(String value) {
            addCriterion("DCB_RestaurantUrl =", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlNotEqualTo(String value) {
            addCriterion("DCB_RestaurantUrl <>", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlGreaterThan(String value) {
            addCriterion("DCB_RestaurantUrl >", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantUrl >=", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlLessThan(String value) {
            addCriterion("DCB_RestaurantUrl <", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlLessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantUrl <=", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlLike(String value) {
            addCriterion("DCB_RestaurantUrl like", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlNotLike(String value) {
            addCriterion("DCB_RestaurantUrl not like", value, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlIn(List<String> values) {
            addCriterion("DCB_RestaurantUrl in", values, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlNotIn(List<String> values) {
            addCriterion("DCB_RestaurantUrl not in", values, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantUrl between", value1, value2, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestauranturlNotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantUrl not between", value1, value2, "dcbRestauranturl");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureIsNull() {
            addCriterion("DCB_RestaurantPicture is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureIsNotNull() {
            addCriterion("DCB_RestaurantPicture is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureEqualTo(String value) {
            addCriterion("DCB_RestaurantPicture =", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureNotEqualTo(String value) {
            addCriterion("DCB_RestaurantPicture <>", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureGreaterThan(String value) {
            addCriterion("DCB_RestaurantPicture >", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantPicture >=", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureLessThan(String value) {
            addCriterion("DCB_RestaurantPicture <", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureLessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantPicture <=", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureLike(String value) {
            addCriterion("DCB_RestaurantPicture like", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureNotLike(String value) {
            addCriterion("DCB_RestaurantPicture not like", value, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureIn(List<String> values) {
            addCriterion("DCB_RestaurantPicture in", values, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureNotIn(List<String> values) {
            addCriterion("DCB_RestaurantPicture not in", values, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantPicture between", value1, value2, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantpictureNotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantPicture not between", value1, value2, "dcbRestaurantpicture");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusIsNull() {
            addCriterion("DCB_RestaurantStatus is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusIsNotNull() {
            addCriterion("DCB_RestaurantStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusEqualTo(Integer value) {
            addCriterion("DCB_RestaurantStatus =", value, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusNotEqualTo(Integer value) {
            addCriterion("DCB_RestaurantStatus <>", value, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusGreaterThan(Integer value) {
            addCriterion("DCB_RestaurantStatus >", value, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_RestaurantStatus >=", value, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusLessThan(Integer value) {
            addCriterion("DCB_RestaurantStatus <", value, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_RestaurantStatus <=", value, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusIn(List<Integer> values) {
            addCriterion("DCB_RestaurantStatus in", values, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusNotIn(List<Integer> values) {
            addCriterion("DCB_RestaurantStatus not in", values, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusBetween(Integer value1, Integer value2) {
            addCriterion("DCB_RestaurantStatus between", value1, value2, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_RestaurantStatus not between", value1, value2, "dcbRestaurantstatus");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateIsNull() {
            addCriterion("DCB_RestaurantDate is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateIsNotNull() {
            addCriterion("DCB_RestaurantDate is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_RestaurantDate =", value, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_RestaurantDate <>", value, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateGreaterThan(Date value) {
            addCriterionForJDBCDate("DCB_RestaurantDate >", value, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_RestaurantDate >=", value, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateLessThan(Date value) {
            addCriterionForJDBCDate("DCB_RestaurantDate <", value, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DCB_RestaurantDate <=", value, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateIn(List<Date> values) {
            addCriterionForJDBCDate("DCB_RestaurantDate in", values, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DCB_RestaurantDate not in", values, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DCB_RestaurantDate between", value1, value2, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DCB_RestaurantDate not between", value1, value2, "dcbRestaurantdate");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessIsNull() {
            addCriterion("DCB_IsBusiness is null");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessIsNotNull() {
            addCriterion("DCB_IsBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessEqualTo(Integer value) {
            addCriterion("DCB_IsBusiness =", value, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessNotEqualTo(Integer value) {
            addCriterion("DCB_IsBusiness <>", value, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessGreaterThan(Integer value) {
            addCriterion("DCB_IsBusiness >", value, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_IsBusiness >=", value, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessLessThan(Integer value) {
            addCriterion("DCB_IsBusiness <", value, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_IsBusiness <=", value, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessIn(List<Integer> values) {
            addCriterion("DCB_IsBusiness in", values, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessNotIn(List<Integer> values) {
            addCriterion("DCB_IsBusiness not in", values, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessBetween(Integer value1, Integer value2) {
            addCriterion("DCB_IsBusiness between", value1, value2, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbIsbusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_IsBusiness not between", value1, value2, "dcbIsbusiness");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1IsNull() {
            addCriterion("DCB_RestaurantProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1IsNotNull() {
            addCriterion("DCB_RestaurantProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1EqualTo(String value) {
            addCriterion("DCB_RestaurantProperty1 =", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1NotEqualTo(String value) {
            addCriterion("DCB_RestaurantProperty1 <>", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1GreaterThan(String value) {
            addCriterion("DCB_RestaurantProperty1 >", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantProperty1 >=", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1LessThan(String value) {
            addCriterion("DCB_RestaurantProperty1 <", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantProperty1 <=", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1Like(String value) {
            addCriterion("DCB_RestaurantProperty1 like", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1NotLike(String value) {
            addCriterion("DCB_RestaurantProperty1 not like", value, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1In(List<String> values) {
            addCriterion("DCB_RestaurantProperty1 in", values, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1NotIn(List<String> values) {
            addCriterion("DCB_RestaurantProperty1 not in", values, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1Between(String value1, String value2) {
            addCriterion("DCB_RestaurantProperty1 between", value1, value2, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantProperty1 not between", value1, value2, "dcbRestaurantproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2IsNull() {
            addCriterion("DCB_RestaurantProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2IsNotNull() {
            addCriterion("DCB_RestaurantProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2EqualTo(String value) {
            addCriterion("DCB_RestaurantProperty2 =", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2NotEqualTo(String value) {
            addCriterion("DCB_RestaurantProperty2 <>", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2GreaterThan(String value) {
            addCriterion("DCB_RestaurantProperty2 >", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantProperty2 >=", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2LessThan(String value) {
            addCriterion("DCB_RestaurantProperty2 <", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_RestaurantProperty2 <=", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2Like(String value) {
            addCriterion("DCB_RestaurantProperty2 like", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2NotLike(String value) {
            addCriterion("DCB_RestaurantProperty2 not like", value, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2In(List<String> values) {
            addCriterion("DCB_RestaurantProperty2 in", values, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2NotIn(List<String> values) {
            addCriterion("DCB_RestaurantProperty2 not in", values, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2Between(String value1, String value2) {
            addCriterion("DCB_RestaurantProperty2 between", value1, value2, "dcbRestaurantproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbRestaurantproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_RestaurantProperty2 not between", value1, value2, "dcbRestaurantproperty2");
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