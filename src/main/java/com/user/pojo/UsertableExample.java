package com.user.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsertableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsertableExample() {
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

        public Criteria andUcodeIsNull() {
            addCriterion("uCode is null");
            return (Criteria) this;
        }

        public Criteria andUcodeIsNotNull() {
            addCriterion("uCode is not null");
            return (Criteria) this;
        }

        public Criteria andUcodeEqualTo(Integer value) {
            addCriterion("uCode =", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotEqualTo(Integer value) {
            addCriterion("uCode <>", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeGreaterThan(Integer value) {
            addCriterion("uCode >", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uCode >=", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeLessThan(Integer value) {
            addCriterion("uCode <", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeLessThanOrEqualTo(Integer value) {
            addCriterion("uCode <=", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeIn(List<Integer> values) {
            addCriterion("uCode in", values, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotIn(List<Integer> values) {
            addCriterion("uCode not in", values, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeBetween(Integer value1, Integer value2) {
            addCriterion("uCode between", value1, value2, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("uCode not between", value1, value2, "ucode");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uName is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uName is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uName =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uName <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uName >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uName >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uName <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uName <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uName like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uName not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uName in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uName not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uName between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uName not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNull() {
            addCriterion("uPwd is null");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNotNull() {
            addCriterion("uPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUpwdEqualTo(String value) {
            addCriterion("uPwd =", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotEqualTo(String value) {
            addCriterion("uPwd <>", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThan(String value) {
            addCriterion("uPwd >", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThanOrEqualTo(String value) {
            addCriterion("uPwd >=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThan(String value) {
            addCriterion("uPwd <", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThanOrEqualTo(String value) {
            addCriterion("uPwd <=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLike(String value) {
            addCriterion("uPwd like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotLike(String value) {
            addCriterion("uPwd not like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdIn(List<String> values) {
            addCriterion("uPwd in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotIn(List<String> values) {
            addCriterion("uPwd not in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdBetween(String value1, String value2) {
            addCriterion("uPwd between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotBetween(String value1, String value2) {
            addCriterion("uPwd not between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("uType is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("uType is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(Integer value) {
            addCriterion("uType =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(Integer value) {
            addCriterion("uType <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(Integer value) {
            addCriterion("uType >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uType >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(Integer value) {
            addCriterion("uType <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(Integer value) {
            addCriterion("uType <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<Integer> values) {
            addCriterion("uType in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<Integer> values) {
            addCriterion("uType not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(Integer value1, Integer value2) {
            addCriterion("uType between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("uType not between", value1, value2, "utype");
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