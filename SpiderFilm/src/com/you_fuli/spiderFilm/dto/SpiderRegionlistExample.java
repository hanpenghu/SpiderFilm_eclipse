package com.you_fuli.spiderFilm.dto;

import java.util.ArrayList;
import java.util.List;

public class SpiderRegionlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpiderRegionlistExample() {
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

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityId like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityId not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitytypeIsNull() {
            addCriterion("cityType is null");
            return (Criteria) this;
        }

        public Criteria andCitytypeIsNotNull() {
            addCriterion("cityType is not null");
            return (Criteria) this;
        }

        public Criteria andCitytypeEqualTo(String value) {
            addCriterion("cityType =", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeNotEqualTo(String value) {
            addCriterion("cityType <>", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeGreaterThan(String value) {
            addCriterion("cityType >", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("cityType >=", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeLessThan(String value) {
            addCriterion("cityType <", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeLessThanOrEqualTo(String value) {
            addCriterion("cityType <=", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeLike(String value) {
            addCriterion("cityType like", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeNotLike(String value) {
            addCriterion("cityType not like", value, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeIn(List<String> values) {
            addCriterion("cityType in", values, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeNotIn(List<String> values) {
            addCriterion("cityType not in", values, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeBetween(String value1, String value2) {
            addCriterion("cityType between", value1, value2, "citytype");
            return (Criteria) this;
        }

        public Criteria andCitytypeNotBetween(String value1, String value2) {
            addCriterion("cityType not between", value1, value2, "citytype");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNull() {
            addCriterion("regionId is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("regionId is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(String value) {
            addCriterion("regionId =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(String value) {
            addCriterion("regionId <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(String value) {
            addCriterion("regionId >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(String value) {
            addCriterion("regionId >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(String value) {
            addCriterion("regionId <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(String value) {
            addCriterion("regionId <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLike(String value) {
            addCriterion("regionId like", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotLike(String value) {
            addCriterion("regionId not like", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<String> values) {
            addCriterion("regionId in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<String> values) {
            addCriterion("regionId not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(String value1, String value2) {
            addCriterion("regionId between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(String value1, String value2) {
            addCriterion("regionId not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNull() {
            addCriterion("regionName is null");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNotNull() {
            addCriterion("regionName is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnameEqualTo(String value) {
            addCriterion("regionName =", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotEqualTo(String value) {
            addCriterion("regionName <>", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThan(String value) {
            addCriterion("regionName >", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThanOrEqualTo(String value) {
            addCriterion("regionName >=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThan(String value) {
            addCriterion("regionName <", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThanOrEqualTo(String value) {
            addCriterion("regionName <=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLike(String value) {
            addCriterion("regionName like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotLike(String value) {
            addCriterion("regionName not like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameIn(List<String> values) {
            addCriterion("regionName in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotIn(List<String> values) {
            addCriterion("regionName not in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameBetween(String value1, String value2) {
            addCriterion("regionName between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotBetween(String value1, String value2) {
            addCriterion("regionName not between", value1, value2, "regionname");
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