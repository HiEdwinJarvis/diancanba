package com.jarvis.diancanba.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcbBossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcbBossExample() {
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

        public Criteria andDcbBosspasswordIsNull() {
            addCriterion("DCB_BossPassword is null");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordIsNotNull() {
            addCriterion("DCB_BossPassword is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordEqualTo(String value) {
            addCriterion("DCB_BossPassword =", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordNotEqualTo(String value) {
            addCriterion("DCB_BossPassword <>", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordGreaterThan(String value) {
            addCriterion("DCB_BossPassword >", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossPassword >=", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordLessThan(String value) {
            addCriterion("DCB_BossPassword <", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossPassword <=", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordLike(String value) {
            addCriterion("DCB_BossPassword like", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordNotLike(String value) {
            addCriterion("DCB_BossPassword not like", value, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordIn(List<String> values) {
            addCriterion("DCB_BossPassword in", values, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordNotIn(List<String> values) {
            addCriterion("DCB_BossPassword not in", values, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordBetween(String value1, String value2) {
            addCriterion("DCB_BossPassword between", value1, value2, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBosspasswordNotBetween(String value1, String value2) {
            addCriterion("DCB_BossPassword not between", value1, value2, "dcbBosspassword");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameIsNull() {
            addCriterion("DCB_BossName is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameIsNotNull() {
            addCriterion("DCB_BossName is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameEqualTo(String value) {
            addCriterion("DCB_BossName =", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameNotEqualTo(String value) {
            addCriterion("DCB_BossName <>", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameGreaterThan(String value) {
            addCriterion("DCB_BossName >", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossName >=", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameLessThan(String value) {
            addCriterion("DCB_BossName <", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossName <=", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameLike(String value) {
            addCriterion("DCB_BossName like", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameNotLike(String value) {
            addCriterion("DCB_BossName not like", value, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameIn(List<String> values) {
            addCriterion("DCB_BossName in", values, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameNotIn(List<String> values) {
            addCriterion("DCB_BossName not in", values, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameBetween(String value1, String value2) {
            addCriterion("DCB_BossName between", value1, value2, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBossnameNotBetween(String value1, String value2) {
            addCriterion("DCB_BossName not between", value1, value2, "dcbBossname");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelIsNull() {
            addCriterion("DCB_BossTel is null");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelIsNotNull() {
            addCriterion("DCB_BossTel is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelEqualTo(String value) {
            addCriterion("DCB_BossTel =", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelNotEqualTo(String value) {
            addCriterion("DCB_BossTel <>", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelGreaterThan(String value) {
            addCriterion("DCB_BossTel >", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossTel >=", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelLessThan(String value) {
            addCriterion("DCB_BossTel <", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossTel <=", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelLike(String value) {
            addCriterion("DCB_BossTel like", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelNotLike(String value) {
            addCriterion("DCB_BossTel not like", value, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelIn(List<String> values) {
            addCriterion("DCB_BossTel in", values, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelNotIn(List<String> values) {
            addCriterion("DCB_BossTel not in", values, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelBetween(String value1, String value2) {
            addCriterion("DCB_BossTel between", value1, value2, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBosstelNotBetween(String value1, String value2) {
            addCriterion("DCB_BossTel not between", value1, value2, "dcbBosstel");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgIsNull() {
            addCriterion("DCB_BossHeadImg is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgIsNotNull() {
            addCriterion("DCB_BossHeadImg is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgEqualTo(String value) {
            addCriterion("DCB_BossHeadImg =", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgNotEqualTo(String value) {
            addCriterion("DCB_BossHeadImg <>", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgGreaterThan(String value) {
            addCriterion("DCB_BossHeadImg >", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossHeadImg >=", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgLessThan(String value) {
            addCriterion("DCB_BossHeadImg <", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossHeadImg <=", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgLike(String value) {
            addCriterion("DCB_BossHeadImg like", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgNotLike(String value) {
            addCriterion("DCB_BossHeadImg not like", value, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgIn(List<String> values) {
            addCriterion("DCB_BossHeadImg in", values, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgNotIn(List<String> values) {
            addCriterion("DCB_BossHeadImg not in", values, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgBetween(String value1, String value2) {
            addCriterion("DCB_BossHeadImg between", value1, value2, "dcbBossheadimg");
            return (Criteria) this;
        }

        public Criteria andDcbBossheadimgNotBetween(String value1, String value2) {
            addCriterion("DCB_BossHeadImg not between", value1, value2, "dcbBossheadimg");
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

        public Criteria andDcbBossstatusIsNull() {
            addCriterion("DCB_BossStatus is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusIsNotNull() {
            addCriterion("DCB_BossStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusEqualTo(Integer value) {
            addCriterion("DCB_BossStatus =", value, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusNotEqualTo(Integer value) {
            addCriterion("DCB_BossStatus <>", value, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusGreaterThan(Integer value) {
            addCriterion("DCB_BossStatus >", value, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCB_BossStatus >=", value, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusLessThan(Integer value) {
            addCriterion("DCB_BossStatus <", value, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusLessThanOrEqualTo(Integer value) {
            addCriterion("DCB_BossStatus <=", value, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusIn(List<Integer> values) {
            addCriterion("DCB_BossStatus in", values, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusNotIn(List<Integer> values) {
            addCriterion("DCB_BossStatus not in", values, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusBetween(Integer value1, Integer value2) {
            addCriterion("DCB_BossStatus between", value1, value2, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DCB_BossStatus not between", value1, value2, "dcbBossstatus");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressIsNull() {
            addCriterion("DCB_BossAddress is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressIsNotNull() {
            addCriterion("DCB_BossAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressEqualTo(String value) {
            addCriterion("DCB_BossAddress =", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressNotEqualTo(String value) {
            addCriterion("DCB_BossAddress <>", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressGreaterThan(String value) {
            addCriterion("DCB_BossAddress >", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossAddress >=", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressLessThan(String value) {
            addCriterion("DCB_BossAddress <", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossAddress <=", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressLike(String value) {
            addCriterion("DCB_BossAddress like", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressNotLike(String value) {
            addCriterion("DCB_BossAddress not like", value, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressIn(List<String> values) {
            addCriterion("DCB_BossAddress in", values, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressNotIn(List<String> values) {
            addCriterion("DCB_BossAddress not in", values, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressBetween(String value1, String value2) {
            addCriterion("DCB_BossAddress between", value1, value2, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossaddressNotBetween(String value1, String value2) {
            addCriterion("DCB_BossAddress not between", value1, value2, "dcbBossaddress");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailIsNull() {
            addCriterion("DCB_BossEmail is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailIsNotNull() {
            addCriterion("DCB_BossEmail is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailEqualTo(String value) {
            addCriterion("DCB_BossEmail =", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailNotEqualTo(String value) {
            addCriterion("DCB_BossEmail <>", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailGreaterThan(String value) {
            addCriterion("DCB_BossEmail >", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailGreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossEmail >=", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailLessThan(String value) {
            addCriterion("DCB_BossEmail <", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailLessThanOrEqualTo(String value) {
            addCriterion("DCB_BossEmail <=", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailLike(String value) {
            addCriterion("DCB_BossEmail like", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailNotLike(String value) {
            addCriterion("DCB_BossEmail not like", value, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailIn(List<String> values) {
            addCriterion("DCB_BossEmail in", values, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailNotIn(List<String> values) {
            addCriterion("DCB_BossEmail not in", values, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailBetween(String value1, String value2) {
            addCriterion("DCB_BossEmail between", value1, value2, "dcbBossemail");
            return (Criteria) this;
        }

        public Criteria andDcbBossemailNotBetween(String value1, String value2) {
            addCriterion("DCB_BossEmail not between", value1, value2, "dcbBossemail");
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

        public Criteria andDcbBossproperty1IsNull() {
            addCriterion("DCB_BossProperty1 is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1IsNotNull() {
            addCriterion("DCB_BossProperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1EqualTo(String value) {
            addCriterion("DCB_BossProperty1 =", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1NotEqualTo(String value) {
            addCriterion("DCB_BossProperty1 <>", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1GreaterThan(String value) {
            addCriterion("DCB_BossProperty1 >", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossProperty1 >=", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1LessThan(String value) {
            addCriterion("DCB_BossProperty1 <", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1LessThanOrEqualTo(String value) {
            addCriterion("DCB_BossProperty1 <=", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1Like(String value) {
            addCriterion("DCB_BossProperty1 like", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1NotLike(String value) {
            addCriterion("DCB_BossProperty1 not like", value, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1In(List<String> values) {
            addCriterion("DCB_BossProperty1 in", values, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1NotIn(List<String> values) {
            addCriterion("DCB_BossProperty1 not in", values, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1Between(String value1, String value2) {
            addCriterion("DCB_BossProperty1 between", value1, value2, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty1NotBetween(String value1, String value2) {
            addCriterion("DCB_BossProperty1 not between", value1, value2, "dcbBossproperty1");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2IsNull() {
            addCriterion("DCB_BossProperty2 is null");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2IsNotNull() {
            addCriterion("DCB_BossProperty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2EqualTo(String value) {
            addCriterion("DCB_BossProperty2 =", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2NotEqualTo(String value) {
            addCriterion("DCB_BossProperty2 <>", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2GreaterThan(String value) {
            addCriterion("DCB_BossProperty2 >", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2GreaterThanOrEqualTo(String value) {
            addCriterion("DCB_BossProperty2 >=", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2LessThan(String value) {
            addCriterion("DCB_BossProperty2 <", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2LessThanOrEqualTo(String value) {
            addCriterion("DCB_BossProperty2 <=", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2Like(String value) {
            addCriterion("DCB_BossProperty2 like", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2NotLike(String value) {
            addCriterion("DCB_BossProperty2 not like", value, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2In(List<String> values) {
            addCriterion("DCB_BossProperty2 in", values, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2NotIn(List<String> values) {
            addCriterion("DCB_BossProperty2 not in", values, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2Between(String value1, String value2) {
            addCriterion("DCB_BossProperty2 between", value1, value2, "dcbBossproperty2");
            return (Criteria) this;
        }

        public Criteria andDcbBossproperty2NotBetween(String value1, String value2) {
            addCriterion("DCB_BossProperty2 not between", value1, value2, "dcbBossproperty2");
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