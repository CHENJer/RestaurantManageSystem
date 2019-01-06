package com.itcast.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNCommIsNull() {
            addCriterion("n_comm is null");
            return (Criteria) this;
        }

        public Criteria andNCommIsNotNull() {
            addCriterion("n_comm is not null");
            return (Criteria) this;
        }

        public Criteria andNCommEqualTo(String value) {
            addCriterion("n_comm =", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommNotEqualTo(String value) {
            addCriterion("n_comm <>", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommGreaterThan(String value) {
            addCriterion("n_comm >", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommGreaterThanOrEqualTo(String value) {
            addCriterion("n_comm >=", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommLessThan(String value) {
            addCriterion("n_comm <", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommLessThanOrEqualTo(String value) {
            addCriterion("n_comm <=", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommLike(String value) {
            addCriterion("n_comm like", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommNotLike(String value) {
            addCriterion("n_comm not like", value, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommIn(List<String> values) {
            addCriterion("n_comm in", values, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommNotIn(List<String> values) {
            addCriterion("n_comm not in", values, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommBetween(String value1, String value2) {
            addCriterion("n_comm between", value1, value2, "nComm");
            return (Criteria) this;
        }

        public Criteria andNCommNotBetween(String value1, String value2) {
            addCriterion("n_comm not between", value1, value2, "nComm");
            return (Criteria) this;
        }

        public Criteria andNTimeIsNull() {
            addCriterion("n_time is null");
            return (Criteria) this;
        }

        public Criteria andNTimeIsNotNull() {
            addCriterion("n_time is not null");
            return (Criteria) this;
        }

        public Criteria andNTimeEqualTo(Date value) {
            addCriterion("n_time =", value, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeNotEqualTo(Date value) {
            addCriterion("n_time <>", value, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeGreaterThan(Date value) {
            addCriterion("n_time >", value, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("n_time >=", value, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeLessThan(Date value) {
            addCriterion("n_time <", value, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeLessThanOrEqualTo(Date value) {
            addCriterion("n_time <=", value, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeIn(List<Date> values) {
            addCriterion("n_time in", values, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeNotIn(List<Date> values) {
            addCriterion("n_time not in", values, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeBetween(Date value1, Date value2) {
            addCriterion("n_time between", value1, value2, "nTime");
            return (Criteria) this;
        }

        public Criteria andNTimeNotBetween(Date value1, Date value2) {
            addCriterion("n_time not between", value1, value2, "nTime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeIsNull() {
            addCriterion("n_keeptime is null");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeIsNotNull() {
            addCriterion("n_keeptime is not null");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeEqualTo(Date value) {
            addCriterion("n_keeptime =", value, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeNotEqualTo(Date value) {
            addCriterion("n_keeptime <>", value, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeGreaterThan(Date value) {
            addCriterion("n_keeptime >", value, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("n_keeptime >=", value, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeLessThan(Date value) {
            addCriterion("n_keeptime <", value, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeLessThanOrEqualTo(Date value) {
            addCriterion("n_keeptime <=", value, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeIn(List<Date> values) {
            addCriterion("n_keeptime in", values, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeNotIn(List<Date> values) {
            addCriterion("n_keeptime not in", values, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeBetween(Date value1, Date value2) {
            addCriterion("n_keeptime between", value1, value2, "nKeeptime");
            return (Criteria) this;
        }

        public Criteria andNKeeptimeNotBetween(Date value1, Date value2) {
            addCriterion("n_keeptime not between", value1, value2, "nKeeptime");
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