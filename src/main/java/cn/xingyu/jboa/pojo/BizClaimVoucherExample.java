package cn.xingyu.jboa.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BizClaimVoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizClaimVoucherExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNextDealSnIsNull() {
            addCriterion("NEXT_DEAL_SN is null");
            return (Criteria) this;
        }

        public Criteria andNextDealSnIsNotNull() {
            addCriterion("NEXT_DEAL_SN is not null");
            return (Criteria) this;
        }

        public Criteria andNextDealSnEqualTo(String value) {
            addCriterion("NEXT_DEAL_SN =", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnNotEqualTo(String value) {
            addCriterion("NEXT_DEAL_SN <>", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnGreaterThan(String value) {
            addCriterion("NEXT_DEAL_SN >", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_DEAL_SN >=", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnLessThan(String value) {
            addCriterion("NEXT_DEAL_SN <", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnLessThanOrEqualTo(String value) {
            addCriterion("NEXT_DEAL_SN <=", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnLike(String value) {
            addCriterion("NEXT_DEAL_SN like", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnNotLike(String value) {
            addCriterion("NEXT_DEAL_SN not like", value, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnIn(List<String> values) {
            addCriterion("NEXT_DEAL_SN in", values, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnNotIn(List<String> values) {
            addCriterion("NEXT_DEAL_SN not in", values, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnBetween(String value1, String value2) {
            addCriterion("NEXT_DEAL_SN between", value1, value2, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andNextDealSnNotBetween(String value1, String value2) {
            addCriterion("NEXT_DEAL_SN not between", value1, value2, "nextDealSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnIsNull() {
            addCriterion("CREATE_SN is null");
            return (Criteria) this;
        }

        public Criteria andCreateSnIsNotNull() {
            addCriterion("CREATE_SN is not null");
            return (Criteria) this;
        }

        public Criteria andCreateSnEqualTo(String value) {
            addCriterion("CREATE_SN =", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnNotEqualTo(String value) {
            addCriterion("CREATE_SN <>", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnGreaterThan(String value) {
            addCriterion("CREATE_SN >", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_SN >=", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnLessThan(String value) {
            addCriterion("CREATE_SN <", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnLessThanOrEqualTo(String value) {
            addCriterion("CREATE_SN <=", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnLike(String value) {
            addCriterion("CREATE_SN like", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnNotLike(String value) {
            addCriterion("CREATE_SN not like", value, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnIn(List<String> values) {
            addCriterion("CREATE_SN in", values, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnNotIn(List<String> values) {
            addCriterion("CREATE_SN not in", values, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnBetween(String value1, String value2) {
            addCriterion("CREATE_SN between", value1, value2, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateSnNotBetween(String value1, String value2) {
            addCriterion("CREATE_SN not between", value1, value2, "createSn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("EVENT is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("EVENT is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("EVENT =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("EVENT <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("EVENT >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("EVENT <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("EVENT <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("EVENT like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("EVENT not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("EVENT in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("EVENT not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("EVENT between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("EVENT not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIsNull() {
            addCriterion("TOTAL_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIsNotNull() {
            addCriterion("TOTAL_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAccountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ACCOUNT =", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ACCOUNT <>", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_ACCOUNT >", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ACCOUNT >=", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountLessThan(BigDecimal value) {
            addCriterion("TOTAL_ACCOUNT <", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ACCOUNT <=", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ACCOUNT in", values, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ACCOUNT not in", values, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ACCOUNT between", value1, value2, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ACCOUNT not between", value1, value2, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MODIFY_TIME not between", value1, value2, "modifyTime");
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