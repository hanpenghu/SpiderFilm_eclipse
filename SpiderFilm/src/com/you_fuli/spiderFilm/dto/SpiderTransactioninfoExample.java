package com.you_fuli.spiderFilm.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SpiderTransactioninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpiderTransactioninfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMerpriceIsNull() {
            addCriterion("merPrice is null");
            return (Criteria) this;
        }

        public Criteria andMerpriceIsNotNull() {
            addCriterion("merPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMerpriceEqualTo(BigDecimal value) {
            addCriterion("merPrice =", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotEqualTo(BigDecimal value) {
            addCriterion("merPrice <>", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceGreaterThan(BigDecimal value) {
            addCriterion("merPrice >", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merPrice >=", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceLessThan(BigDecimal value) {
            addCriterion("merPrice <", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merPrice <=", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceIn(List<BigDecimal> values) {
            addCriterion("merPrice in", values, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotIn(List<BigDecimal> values) {
            addCriterion("merPrice not in", values, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merPrice between", value1, value2, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merPrice not between", value1, value2, "merprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceIsNull() {
            addCriterion("feePrice is null");
            return (Criteria) this;
        }

        public Criteria andFeepriceIsNotNull() {
            addCriterion("feePrice is not null");
            return (Criteria) this;
        }

        public Criteria andFeepriceEqualTo(BigDecimal value) {
            addCriterion("feePrice =", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotEqualTo(BigDecimal value) {
            addCriterion("feePrice <>", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceGreaterThan(BigDecimal value) {
            addCriterion("feePrice >", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("feePrice >=", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceLessThan(BigDecimal value) {
            addCriterion("feePrice <", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("feePrice <=", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceIn(List<BigDecimal> values) {
            addCriterion("feePrice in", values, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotIn(List<BigDecimal> values) {
            addCriterion("feePrice not in", values, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("feePrice between", value1, value2, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("feePrice not between", value1, value2, "feeprice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSeatcountIsNull() {
            addCriterion("seatCount is null");
            return (Criteria) this;
        }

        public Criteria andSeatcountIsNotNull() {
            addCriterion("seatCount is not null");
            return (Criteria) this;
        }

        public Criteria andSeatcountEqualTo(Integer value) {
            addCriterion("seatCount =", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotEqualTo(Integer value) {
            addCriterion("seatCount <>", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountGreaterThan(Integer value) {
            addCriterion("seatCount >", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatCount >=", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountLessThan(Integer value) {
            addCriterion("seatCount <", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountLessThanOrEqualTo(Integer value) {
            addCriterion("seatCount <=", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountIn(List<Integer> values) {
            addCriterion("seatCount in", values, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotIn(List<Integer> values) {
            addCriterion("seatCount not in", values, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountBetween(Integer value1, Integer value2) {
            addCriterion("seatCount between", value1, value2, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotBetween(Integer value1, Integer value2) {
            addCriterion("seatCount not between", value1, value2, "seatcount");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(BigDecimal value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(BigDecimal value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<BigDecimal> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("OrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("OrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("OrderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("OrderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("OrderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("OrderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("OrderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("OrderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("OrderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("OrderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("OrderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("OrderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("OrderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidIsNull() {
            addCriterion("SpiderOrderId is null");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidIsNotNull() {
            addCriterion("SpiderOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidEqualTo(String value) {
            addCriterion("SpiderOrderId =", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidNotEqualTo(String value) {
            addCriterion("SpiderOrderId <>", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidGreaterThan(String value) {
            addCriterion("SpiderOrderId >", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidGreaterThanOrEqualTo(String value) {
            addCriterion("SpiderOrderId >=", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidLessThan(String value) {
            addCriterion("SpiderOrderId <", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidLessThanOrEqualTo(String value) {
            addCriterion("SpiderOrderId <=", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidLike(String value) {
            addCriterion("SpiderOrderId like", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidNotLike(String value) {
            addCriterion("SpiderOrderId not like", value, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidIn(List<String> values) {
            addCriterion("SpiderOrderId in", values, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidNotIn(List<String> values) {
            addCriterion("SpiderOrderId not in", values, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidBetween(String value1, String value2) {
            addCriterion("SpiderOrderId between", value1, value2, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSpiderorderidNotBetween(String value1, String value2) {
            addCriterion("SpiderOrderId not between", value1, value2, "spiderorderid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNull() {
            addCriterion("SerialNumber is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNotNull() {
            addCriterion("SerialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberEqualTo(String value) {
            addCriterion("SerialNumber =", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotEqualTo(String value) {
            addCriterion("SerialNumber <>", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThan(String value) {
            addCriterion("SerialNumber >", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SerialNumber >=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThan(String value) {
            addCriterion("SerialNumber <", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThanOrEqualTo(String value) {
            addCriterion("SerialNumber <=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLike(String value) {
            addCriterion("SerialNumber like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotLike(String value) {
            addCriterion("SerialNumber not like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIn(List<String> values) {
            addCriterion("SerialNumber in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotIn(List<String> values) {
            addCriterion("SerialNumber not in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberBetween(String value1, String value2) {
            addCriterion("SerialNumber between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotBetween(String value1, String value2) {
            addCriterion("SerialNumber not between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CreateTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CreateTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andShowdateIsNull() {
            addCriterion("showDate is null");
            return (Criteria) this;
        }

        public Criteria andShowdateIsNotNull() {
            addCriterion("showDate is not null");
            return (Criteria) this;
        }

        public Criteria andShowdateEqualTo(String value) {
            addCriterion("showDate =", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotEqualTo(String value) {
            addCriterion("showDate <>", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateGreaterThan(String value) {
            addCriterion("showDate >", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateGreaterThanOrEqualTo(String value) {
            addCriterion("showDate >=", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLessThan(String value) {
            addCriterion("showDate <", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLessThanOrEqualTo(String value) {
            addCriterion("showDate <=", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLike(String value) {
            addCriterion("showDate like", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotLike(String value) {
            addCriterion("showDate not like", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateIn(List<String> values) {
            addCriterion("showDate in", values, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotIn(List<String> values) {
            addCriterion("showDate not in", values, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateBetween(String value1, String value2) {
            addCriterion("showDate between", value1, value2, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotBetween(String value1, String value2) {
            addCriterion("showDate not between", value1, value2, "showdate");
            return (Criteria) this;
        }

        public Criteria andCinemanameIsNull() {
            addCriterion("cinemaName is null");
            return (Criteria) this;
        }

        public Criteria andCinemanameIsNotNull() {
            addCriterion("cinemaName is not null");
            return (Criteria) this;
        }

        public Criteria andCinemanameEqualTo(String value) {
            addCriterion("cinemaName =", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameNotEqualTo(String value) {
            addCriterion("cinemaName <>", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameGreaterThan(String value) {
            addCriterion("cinemaName >", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameGreaterThanOrEqualTo(String value) {
            addCriterion("cinemaName >=", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameLessThan(String value) {
            addCriterion("cinemaName <", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameLessThanOrEqualTo(String value) {
            addCriterion("cinemaName <=", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameLike(String value) {
            addCriterion("cinemaName like", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameNotLike(String value) {
            addCriterion("cinemaName not like", value, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameIn(List<String> values) {
            addCriterion("cinemaName in", values, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameNotIn(List<String> values) {
            addCriterion("cinemaName not in", values, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameBetween(String value1, String value2) {
            addCriterion("cinemaName between", value1, value2, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andCinemanameNotBetween(String value1, String value2) {
            addCriterion("cinemaName not between", value1, value2, "cinemaname");
            return (Criteria) this;
        }

        public Criteria andHallnameIsNull() {
            addCriterion("hallName is null");
            return (Criteria) this;
        }

        public Criteria andHallnameIsNotNull() {
            addCriterion("hallName is not null");
            return (Criteria) this;
        }

        public Criteria andHallnameEqualTo(String value) {
            addCriterion("hallName =", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameNotEqualTo(String value) {
            addCriterion("hallName <>", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameGreaterThan(String value) {
            addCriterion("hallName >", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameGreaterThanOrEqualTo(String value) {
            addCriterion("hallName >=", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameLessThan(String value) {
            addCriterion("hallName <", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameLessThanOrEqualTo(String value) {
            addCriterion("hallName <=", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameLike(String value) {
            addCriterion("hallName like", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameNotLike(String value) {
            addCriterion("hallName not like", value, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameIn(List<String> values) {
            addCriterion("hallName in", values, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameNotIn(List<String> values) {
            addCriterion("hallName not in", values, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameBetween(String value1, String value2) {
            addCriterion("hallName between", value1, value2, "hallname");
            return (Criteria) this;
        }

        public Criteria andHallnameNotBetween(String value1, String value2) {
            addCriterion("hallName not between", value1, value2, "hallname");
            return (Criteria) this;
        }

        public Criteria andFilmnameIsNull() {
            addCriterion("filmName is null");
            return (Criteria) this;
        }

        public Criteria andFilmnameIsNotNull() {
            addCriterion("filmName is not null");
            return (Criteria) this;
        }

        public Criteria andFilmnameEqualTo(String value) {
            addCriterion("filmName =", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotEqualTo(String value) {
            addCriterion("filmName <>", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameGreaterThan(String value) {
            addCriterion("filmName >", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameGreaterThanOrEqualTo(String value) {
            addCriterion("filmName >=", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLessThan(String value) {
            addCriterion("filmName <", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLessThanOrEqualTo(String value) {
            addCriterion("filmName <=", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameLike(String value) {
            addCriterion("filmName like", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotLike(String value) {
            addCriterion("filmName not like", value, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameIn(List<String> values) {
            addCriterion("filmName in", values, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotIn(List<String> values) {
            addCriterion("filmName not in", values, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameBetween(String value1, String value2) {
            addCriterion("filmName between", value1, value2, "filmname");
            return (Criteria) this;
        }

        public Criteria andFilmnameNotBetween(String value1, String value2) {
            addCriterion("filmName not between", value1, value2, "filmname");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNull() {
            addCriterion("seatId is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("seatId is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(String value) {
            addCriterion("seatId =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(String value) {
            addCriterion("seatId <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(String value) {
            addCriterion("seatId >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(String value) {
            addCriterion("seatId >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(String value) {
            addCriterion("seatId <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(String value) {
            addCriterion("seatId <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLike(String value) {
            addCriterion("seatId like", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotLike(String value) {
            addCriterion("seatId not like", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<String> values) {
            addCriterion("seatId in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<String> values) {
            addCriterion("seatId not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(String value1, String value2) {
            addCriterion("seatId between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(String value1, String value2) {
            addCriterion("seatId not between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andConfirmationidIsNull() {
            addCriterion("confirmationId is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationidIsNotNull() {
            addCriterion("confirmationId is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationidEqualTo(String value) {
            addCriterion("confirmationId =", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidNotEqualTo(String value) {
            addCriterion("confirmationId <>", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidGreaterThan(String value) {
            addCriterion("confirmationId >", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidGreaterThanOrEqualTo(String value) {
            addCriterion("confirmationId >=", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidLessThan(String value) {
            addCriterion("confirmationId <", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidLessThanOrEqualTo(String value) {
            addCriterion("confirmationId <=", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidLike(String value) {
            addCriterion("confirmationId like", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidNotLike(String value) {
            addCriterion("confirmationId not like", value, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidIn(List<String> values) {
            addCriterion("confirmationId in", values, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidNotIn(List<String> values) {
            addCriterion("confirmationId not in", values, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidBetween(String value1, String value2) {
            addCriterion("confirmationId between", value1, value2, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andConfirmationidNotBetween(String value1, String value2) {
            addCriterion("confirmationId not between", value1, value2, "confirmationid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidIsNull() {
            addCriterion("partnerbookingid is null");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidIsNotNull() {
            addCriterion("partnerbookingid is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidEqualTo(String value) {
            addCriterion("partnerbookingid =", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidNotEqualTo(String value) {
            addCriterion("partnerbookingid <>", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidGreaterThan(String value) {
            addCriterion("partnerbookingid >", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidGreaterThanOrEqualTo(String value) {
            addCriterion("partnerbookingid >=", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidLessThan(String value) {
            addCriterion("partnerbookingid <", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidLessThanOrEqualTo(String value) {
            addCriterion("partnerbookingid <=", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidLike(String value) {
            addCriterion("partnerbookingid like", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidNotLike(String value) {
            addCriterion("partnerbookingid not like", value, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidIn(List<String> values) {
            addCriterion("partnerbookingid in", values, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidNotIn(List<String> values) {
            addCriterion("partnerbookingid not in", values, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidBetween(String value1, String value2) {
            addCriterion("partnerbookingid between", value1, value2, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andPartnerbookingidNotBetween(String value1, String value2) {
            addCriterion("partnerbookingid not between", value1, value2, "partnerbookingid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
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