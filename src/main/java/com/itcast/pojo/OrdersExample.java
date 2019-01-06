package com.itcast.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFNumIsNull() {
            addCriterion("f_num is null");
            return (Criteria) this;
        }

        public Criteria andFNumIsNotNull() {
            addCriterion("f_num is not null");
            return (Criteria) this;
        }

        public Criteria andFNumEqualTo(Integer value) {
            addCriterion("f_num =", value, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumNotEqualTo(Integer value) {
            addCriterion("f_num <>", value, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumGreaterThan(Integer value) {
            addCriterion("f_num >", value, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_num >=", value, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumLessThan(Integer value) {
            addCriterion("f_num <", value, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumLessThanOrEqualTo(Integer value) {
            addCriterion("f_num <=", value, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumIn(List<Integer> values) {
            addCriterion("f_num in", values, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumNotIn(List<Integer> values) {
            addCriterion("f_num not in", values, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumBetween(Integer value1, Integer value2) {
            addCriterion("f_num between", value1, value2, "fNum");
            return (Criteria) this;
        }

        public Criteria andFNumNotBetween(Integer value1, Integer value2) {
            addCriterion("f_num not between", value1, value2, "fNum");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(Double value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(Double value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(Double value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(Double value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(Double value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<Double> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<Double> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(Double value1, Double value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(Double value1, Double value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andODateIsNull() {
            addCriterion("o_date is null");
            return (Criteria) this;
        }

        public Criteria andODateIsNotNull() {
            addCriterion("o_date is not null");
            return (Criteria) this;
        }

        public Criteria andODateEqualTo(Date value) {
            addCriterion("o_date =", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotEqualTo(Date value) {
            addCriterion("o_date <>", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThan(Date value) {
            addCriterion("o_date >", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThanOrEqualTo(Date value) {
            addCriterion("o_date >=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThan(Date value) {
            addCriterion("o_date <", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThanOrEqualTo(Date value) {
            addCriterion("o_date <=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateIn(List<Date> values) {
            addCriterion("o_date in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotIn(List<Date> values) {
            addCriterion("o_date not in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateBetween(Date value1, Date value2) {
            addCriterion("o_date between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotBetween(Date value1, Date value2) {
            addCriterion("o_date not between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOCommIsNull() {
            addCriterion("o_comm is null");
            return (Criteria) this;
        }

        public Criteria andOCommIsNotNull() {
            addCriterion("o_comm is not null");
            return (Criteria) this;
        }

        public Criteria andOCommEqualTo(String value) {
            addCriterion("o_comm =", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommNotEqualTo(String value) {
            addCriterion("o_comm <>", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommGreaterThan(String value) {
            addCriterion("o_comm >", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommGreaterThanOrEqualTo(String value) {
            addCriterion("o_comm >=", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommLessThan(String value) {
            addCriterion("o_comm <", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommLessThanOrEqualTo(String value) {
            addCriterion("o_comm <=", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommLike(String value) {
            addCriterion("o_comm like", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommNotLike(String value) {
            addCriterion("o_comm not like", value, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommIn(List<String> values) {
            addCriterion("o_comm in", values, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommNotIn(List<String> values) {
            addCriterion("o_comm not in", values, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommBetween(String value1, String value2) {
            addCriterion("o_comm between", value1, value2, "oComm");
            return (Criteria) this;
        }

        public Criteria andOCommNotBetween(String value1, String value2) {
            addCriterion("o_comm not between", value1, value2, "oComm");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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