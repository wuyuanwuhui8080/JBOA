package cn.xingyu.jboa.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BizLeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizLeaveExample() {
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

        public Criteria andEmployeeSnIsNull() {
            addCriterion("EMPLOYEE_SN is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnIsNotNull() {
            addCriterion("EMPLOYEE_SN is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnEqualTo(String value) {
            addCriterion("EMPLOYEE_SN =", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnNotEqualTo(String value) {
            addCriterion("EMPLOYEE_SN <>", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnGreaterThan(String value) {
            addCriterion("EMPLOYEE_SN >", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_SN >=", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnLessThan(String value) {
            addCriterion("EMPLOYEE_SN <", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_SN <=", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnLike(String value) {
            addCriterion("EMPLOYEE_SN like", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnNotLike(String value) {
            addCriterion("EMPLOYEE_SN not like", value, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnIn(List<String> values) {
            addCriterion("EMPLOYEE_SN in", values, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnNotIn(List<String> values) {
            addCriterion("EMPLOYEE_SN not in", values, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_SN between", value1, value2, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andEmployeeSnNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_SN not between", value1, value2, "employeeSn");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andLeavedayIsNull() {
            addCriterion("LEAVEDAY is null");
            return (Criteria) this;
        }

        public Criteria andLeavedayIsNotNull() {
            addCriterion("LEAVEDAY is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedayEqualTo(BigDecimal value) {
            addCriterion("LEAVEDAY =", value, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayNotEqualTo(BigDecimal value) {
            addCriterion("LEAVEDAY <>", value, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayGreaterThan(BigDecimal value) {
            addCriterion("LEAVEDAY >", value, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEAVEDAY >=", value, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayLessThan(BigDecimal value) {
            addCriterion("LEAVEDAY <", value, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEAVEDAY <=", value, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayIn(List<BigDecimal> values) {
            addCriterion("LEAVEDAY in", values, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayNotIn(List<BigDecimal> values) {
            addCriterion("LEAVEDAY not in", values, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEAVEDAY between", value1, value2, "leaveday");
            return (Criteria) this;
        }

        public Criteria andLeavedayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEAVEDAY not between", value1, value2, "leaveday");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
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

        public Criteria andLeavetypeIsNull() {
            addCriterion("LEAVETYPE is null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIsNotNull() {
            addCriterion("LEAVETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeEqualTo(String value) {
            addCriterion("LEAVETYPE =", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotEqualTo(String value) {
            addCriterion("LEAVETYPE <>", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeGreaterThan(String value) {
            addCriterion("LEAVETYPE >", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVETYPE >=", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLessThan(String value) {
            addCriterion("LEAVETYPE <", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLessThanOrEqualTo(String value) {
            addCriterion("LEAVETYPE <=", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLike(String value) {
            addCriterion("LEAVETYPE like", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotLike(String value) {
            addCriterion("LEAVETYPE not like", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIn(List<String> values) {
            addCriterion("LEAVETYPE in", values, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotIn(List<String> values) {
            addCriterion("LEAVETYPE not in", values, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeBetween(String value1, String value2) {
            addCriterion("LEAVETYPE between", value1, value2, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotBetween(String value1, String value2) {
            addCriterion("LEAVETYPE not between", value1, value2, "leavetype");
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

        public Criteria andApproveOpinionIsNull() {
            addCriterion("APPROVE_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionIsNotNull() {
            addCriterion("APPROVE_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionEqualTo(String value) {
            addCriterion("APPROVE_OPINION =", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionNotEqualTo(String value) {
            addCriterion("APPROVE_OPINION <>", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionGreaterThan(String value) {
            addCriterion("APPROVE_OPINION >", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_OPINION >=", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionLessThan(String value) {
            addCriterion("APPROVE_OPINION <", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_OPINION <=", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionLike(String value) {
            addCriterion("APPROVE_OPINION like", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionNotLike(String value) {
            addCriterion("APPROVE_OPINION not like", value, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionIn(List<String> values) {
            addCriterion("APPROVE_OPINION in", values, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionNotIn(List<String> values) {
            addCriterion("APPROVE_OPINION not in", values, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionBetween(String value1, String value2) {
            addCriterion("APPROVE_OPINION between", value1, value2, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andApproveOpinionNotBetween(String value1, String value2) {
            addCriterion("APPROVE_OPINION not between", value1, value2, "approveOpinion");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterionForJDBCDate("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterionForJDBCDate("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MODIFYTIME not between", value1, value2, "modifytime");
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