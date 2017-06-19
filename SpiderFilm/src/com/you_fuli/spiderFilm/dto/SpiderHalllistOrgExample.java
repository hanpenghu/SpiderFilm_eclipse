package com.you_fuli.spiderFilm.dto;

import java.util.ArrayList;
import java.util.List;

public class SpiderHalllistOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpiderHalllistOrgExample() {
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

        public Criteria andHallidIsNull() {
            addCriterion("hallId is null");
            return (Criteria) this;
        }

        public Criteria andHallidIsNotNull() {
            addCriterion("hallId is not null");
            return (Criteria) this;
        }

        public Criteria andHallidEqualTo(String value) {
            addCriterion("hallId =", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidNotEqualTo(String value) {
            addCriterion("hallId <>", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidGreaterThan(String value) {
            addCriterion("hallId >", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidGreaterThanOrEqualTo(String value) {
            addCriterion("hallId >=", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidLessThan(String value) {
            addCriterion("hallId <", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidLessThanOrEqualTo(String value) {
            addCriterion("hallId <=", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidLike(String value) {
            addCriterion("hallId like", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidNotLike(String value) {
            addCriterion("hallId not like", value, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidIn(List<String> values) {
            addCriterion("hallId in", values, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidNotIn(List<String> values) {
            addCriterion("hallId not in", values, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidBetween(String value1, String value2) {
            addCriterion("hallId between", value1, value2, "hallid");
            return (Criteria) this;
        }

        public Criteria andHallidNotBetween(String value1, String value2) {
            addCriterion("hallId not between", value1, value2, "hallid");
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

        public Criteria andCinemaidIsNull() {
            addCriterion("cinemaId is null");
            return (Criteria) this;
        }

        public Criteria andCinemaidIsNotNull() {
            addCriterion("cinemaId is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaidEqualTo(String value) {
            addCriterion("cinemaId =", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidNotEqualTo(String value) {
            addCriterion("cinemaId <>", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidGreaterThan(String value) {
            addCriterion("cinemaId >", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidGreaterThanOrEqualTo(String value) {
            addCriterion("cinemaId >=", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidLessThan(String value) {
            addCriterion("cinemaId <", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidLessThanOrEqualTo(String value) {
            addCriterion("cinemaId <=", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidLike(String value) {
            addCriterion("cinemaId like", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidNotLike(String value) {
            addCriterion("cinemaId not like", value, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidIn(List<String> values) {
            addCriterion("cinemaId in", values, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidNotIn(List<String> values) {
            addCriterion("cinemaId not in", values, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidBetween(String value1, String value2) {
            addCriterion("cinemaId between", value1, value2, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andCinemaidNotBetween(String value1, String value2) {
            addCriterion("cinemaId not between", value1, value2, "cinemaid");
            return (Criteria) this;
        }

        public Criteria andHalltypeIsNull() {
            addCriterion("hallType is null");
            return (Criteria) this;
        }

        public Criteria andHalltypeIsNotNull() {
            addCriterion("hallType is not null");
            return (Criteria) this;
        }

        public Criteria andHalltypeEqualTo(String value) {
            addCriterion("hallType =", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeNotEqualTo(String value) {
            addCriterion("hallType <>", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeGreaterThan(String value) {
            addCriterion("hallType >", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeGreaterThanOrEqualTo(String value) {
            addCriterion("hallType >=", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeLessThan(String value) {
            addCriterion("hallType <", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeLessThanOrEqualTo(String value) {
            addCriterion("hallType <=", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeLike(String value) {
            addCriterion("hallType like", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeNotLike(String value) {
            addCriterion("hallType not like", value, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeIn(List<String> values) {
            addCriterion("hallType in", values, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeNotIn(List<String> values) {
            addCriterion("hallType not in", values, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeBetween(String value1, String value2) {
            addCriterion("hallType between", value1, value2, "halltype");
            return (Criteria) this;
        }

        public Criteria andHalltypeNotBetween(String value1, String value2) {
            addCriterion("hallType not between", value1, value2, "halltype");
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