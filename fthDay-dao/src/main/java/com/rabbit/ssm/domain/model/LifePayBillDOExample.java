package com.rabbit.ssm.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LifePayBillDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LifePayBillDOExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
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

        public Criteria andPowerBillIsNull() {
            addCriterion("power_bill is null");
            return (Criteria) this;
        }

        public Criteria andPowerBillIsNotNull() {
            addCriterion("power_bill is not null");
            return (Criteria) this;
        }

        public Criteria andPowerBillEqualTo(Double value) {
            addCriterion("power_bill =", value, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillNotEqualTo(Double value) {
            addCriterion("power_bill <>", value, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillGreaterThan(Double value) {
            addCriterion("power_bill >", value, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillGreaterThanOrEqualTo(Double value) {
            addCriterion("power_bill >=", value, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillLessThan(Double value) {
            addCriterion("power_bill <", value, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillLessThanOrEqualTo(Double value) {
            addCriterion("power_bill <=", value, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillIn(List<Double> values) {
            addCriterion("power_bill in", values, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillNotIn(List<Double> values) {
            addCriterion("power_bill not in", values, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillBetween(Double value1, Double value2) {
            addCriterion("power_bill between", value1, value2, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerBillNotBetween(Double value1, Double value2) {
            addCriterion("power_bill not between", value1, value2, "powerBill");
            return (Criteria) this;
        }

        public Criteria andPowerRateIsNull() {
            addCriterion("power_rate is null");
            return (Criteria) this;
        }

        public Criteria andPowerRateIsNotNull() {
            addCriterion("power_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPowerRateEqualTo(Double value) {
            addCriterion("power_rate =", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotEqualTo(Double value) {
            addCriterion("power_rate <>", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateGreaterThan(Double value) {
            addCriterion("power_rate >", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateGreaterThanOrEqualTo(Double value) {
            addCriterion("power_rate >=", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateLessThan(Double value) {
            addCriterion("power_rate <", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateLessThanOrEqualTo(Double value) {
            addCriterion("power_rate <=", value, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateIn(List<Double> values) {
            addCriterion("power_rate in", values, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotIn(List<Double> values) {
            addCriterion("power_rate not in", values, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateBetween(Double value1, Double value2) {
            addCriterion("power_rate between", value1, value2, "powerRate");
            return (Criteria) this;
        }

        public Criteria andPowerRateNotBetween(Double value1, Double value2) {
            addCriterion("power_rate not between", value1, value2, "powerRate");
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

        public Criteria andWaterBillIsNull() {
            addCriterion("water_bill is null");
            return (Criteria) this;
        }

        public Criteria andWaterBillIsNotNull() {
            addCriterion("water_bill is not null");
            return (Criteria) this;
        }

        public Criteria andWaterBillEqualTo(Double value) {
            addCriterion("water_bill =", value, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillNotEqualTo(Double value) {
            addCriterion("water_bill <>", value, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillGreaterThan(Double value) {
            addCriterion("water_bill >", value, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillGreaterThanOrEqualTo(Double value) {
            addCriterion("water_bill >=", value, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillLessThan(Double value) {
            addCriterion("water_bill <", value, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillLessThanOrEqualTo(Double value) {
            addCriterion("water_bill <=", value, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillIn(List<Double> values) {
            addCriterion("water_bill in", values, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillNotIn(List<Double> values) {
            addCriterion("water_bill not in", values, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillBetween(Double value1, Double value2) {
            addCriterion("water_bill between", value1, value2, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterBillNotBetween(Double value1, Double value2) {
            addCriterion("water_bill not between", value1, value2, "waterBill");
            return (Criteria) this;
        }

        public Criteria andWaterRateIsNull() {
            addCriterion("water_rate is null");
            return (Criteria) this;
        }

        public Criteria andWaterRateIsNotNull() {
            addCriterion("water_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWaterRateEqualTo(Double value) {
            addCriterion("water_rate =", value, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateNotEqualTo(Double value) {
            addCriterion("water_rate <>", value, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateGreaterThan(Double value) {
            addCriterion("water_rate >", value, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateGreaterThanOrEqualTo(Double value) {
            addCriterion("water_rate >=", value, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateLessThan(Double value) {
            addCriterion("water_rate <", value, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateLessThanOrEqualTo(Double value) {
            addCriterion("water_rate <=", value, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateIn(List<Double> values) {
            addCriterion("water_rate in", values, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateNotIn(List<Double> values) {
            addCriterion("water_rate not in", values, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateBetween(Double value1, Double value2) {
            addCriterion("water_rate between", value1, value2, "waterRate");
            return (Criteria) this;
        }

        public Criteria andWaterRateNotBetween(Double value1, Double value2) {
            addCriterion("water_rate not between", value1, value2, "waterRate");
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