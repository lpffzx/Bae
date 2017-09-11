package com.rabbit.ssm.domain.model.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LifePayRecordDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LifePayRecordDOExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
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

        public Criteria andPowerCostIsNull() {
            addCriterion("power_cost is null");
            return (Criteria) this;
        }

        public Criteria andPowerCostIsNotNull() {
            addCriterion("power_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPowerCostEqualTo(Double value) {
            addCriterion("power_cost =", value, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostNotEqualTo(Double value) {
            addCriterion("power_cost <>", value, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostGreaterThan(Double value) {
            addCriterion("power_cost >", value, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostGreaterThanOrEqualTo(Double value) {
            addCriterion("power_cost >=", value, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostLessThan(Double value) {
            addCriterion("power_cost <", value, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostLessThanOrEqualTo(Double value) {
            addCriterion("power_cost <=", value, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostIn(List<Double> values) {
            addCriterion("power_cost in", values, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostNotIn(List<Double> values) {
            addCriterion("power_cost not in", values, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostBetween(Double value1, Double value2) {
            addCriterion("power_cost between", value1, value2, "powerCost");
            return (Criteria) this;
        }

        public Criteria andPowerCostNotBetween(Double value1, Double value2) {
            addCriterion("power_cost not between", value1, value2, "powerCost");
            return (Criteria) this;
        }

        public Criteria andRecordMonthIsNull() {
            addCriterion("record_month is null");
            return (Criteria) this;
        }

        public Criteria andRecordMonthIsNotNull() {
            addCriterion("record_month is not null");
            return (Criteria) this;
        }

        public Criteria andRecordMonthEqualTo(Integer value) {
            addCriterion("record_month =", value, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthNotEqualTo(Integer value) {
            addCriterion("record_month <>", value, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthGreaterThan(Integer value) {
            addCriterion("record_month >", value, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_month >=", value, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthLessThan(Integer value) {
            addCriterion("record_month <", value, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthLessThanOrEqualTo(Integer value) {
            addCriterion("record_month <=", value, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthIn(List<Integer> values) {
            addCriterion("record_month in", values, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthNotIn(List<Integer> values) {
            addCriterion("record_month not in", values, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthBetween(Integer value1, Integer value2) {
            addCriterion("record_month between", value1, value2, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andRecordMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("record_month not between", value1, value2, "recordMonth");
            return (Criteria) this;
        }

        public Criteria andWaterCostIsNull() {
            addCriterion("water_cost is null");
            return (Criteria) this;
        }

        public Criteria andWaterCostIsNotNull() {
            addCriterion("water_cost is not null");
            return (Criteria) this;
        }

        public Criteria andWaterCostEqualTo(Double value) {
            addCriterion("water_cost =", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostNotEqualTo(Double value) {
            addCriterion("water_cost <>", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostGreaterThan(Double value) {
            addCriterion("water_cost >", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostGreaterThanOrEqualTo(Double value) {
            addCriterion("water_cost >=", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostLessThan(Double value) {
            addCriterion("water_cost <", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostLessThanOrEqualTo(Double value) {
            addCriterion("water_cost <=", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostIn(List<Double> values) {
            addCriterion("water_cost in", values, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostNotIn(List<Double> values) {
            addCriterion("water_cost not in", values, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostBetween(Double value1, Double value2) {
            addCriterion("water_cost between", value1, value2, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostNotBetween(Double value1, Double value2) {
            addCriterion("water_cost not between", value1, value2, "waterCost");
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