package com.rabbit.ssm.domain.model.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LifePayFamilyDescDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LifePayFamilyDescDOExample() {
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

        public Criteria andDescIdIsNull() {
            addCriterion("desc_id is null");
            return (Criteria) this;
        }

        public Criteria andDescIdIsNotNull() {
            addCriterion("desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDescIdEqualTo(Integer value) {
            addCriterion("desc_id =", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdNotEqualTo(Integer value) {
            addCriterion("desc_id <>", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdGreaterThan(Integer value) {
            addCriterion("desc_id >", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("desc_id >=", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdLessThan(Integer value) {
            addCriterion("desc_id <", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdLessThanOrEqualTo(Integer value) {
            addCriterion("desc_id <=", value, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdIn(List<Integer> values) {
            addCriterion("desc_id in", values, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdNotIn(List<Integer> values) {
            addCriterion("desc_id not in", values, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdBetween(Integer value1, Integer value2) {
            addCriterion("desc_id between", value1, value2, "descId");
            return (Criteria) this;
        }

        public Criteria andDescIdNotBetween(Integer value1, Integer value2) {
            addCriterion("desc_id not between", value1, value2, "descId");
            return (Criteria) this;
        }

        public Criteria andCententIsNull() {
            addCriterion("centent is null");
            return (Criteria) this;
        }

        public Criteria andCententIsNotNull() {
            addCriterion("centent is not null");
            return (Criteria) this;
        }

        public Criteria andCententEqualTo(String value) {
            addCriterion("centent =", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententNotEqualTo(String value) {
            addCriterion("centent <>", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententGreaterThan(String value) {
            addCriterion("centent >", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententGreaterThanOrEqualTo(String value) {
            addCriterion("centent >=", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententLessThan(String value) {
            addCriterion("centent <", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententLessThanOrEqualTo(String value) {
            addCriterion("centent <=", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententLike(String value) {
            addCriterion("centent like", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententNotLike(String value) {
            addCriterion("centent not like", value, "centent");
            return (Criteria) this;
        }

        public Criteria andCententIn(List<String> values) {
            addCriterion("centent in", values, "centent");
            return (Criteria) this;
        }

        public Criteria andCententNotIn(List<String> values) {
            addCriterion("centent not in", values, "centent");
            return (Criteria) this;
        }

        public Criteria andCententBetween(String value1, String value2) {
            addCriterion("centent between", value1, value2, "centent");
            return (Criteria) this;
        }

        public Criteria andCententNotBetween(String value1, String value2) {
            addCriterion("centent not between", value1, value2, "centent");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("last_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("last_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("last_modify_date =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("last_modify_date <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("last_modify_date >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_date >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("last_modify_date <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_date <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("last_modify_date in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("last_modify_date not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("last_modify_date between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_date not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(Integer value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(Integer value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(Integer value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(Integer value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<Integer> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<Integer> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
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