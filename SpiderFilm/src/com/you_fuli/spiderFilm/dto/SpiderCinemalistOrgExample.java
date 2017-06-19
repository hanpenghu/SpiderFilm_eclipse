package com.you_fuli.spiderFilm.dto;

import java.util.ArrayList;
import java.util.List;

public class SpiderCinemalistOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpiderCinemalistOrgExample() {
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

        public Criteria andCinemalogoIsNull() {
            addCriterion("cinemaLogo is null");
            return (Criteria) this;
        }

        public Criteria andCinemalogoIsNotNull() {
            addCriterion("cinemaLogo is not null");
            return (Criteria) this;
        }

        public Criteria andCinemalogoEqualTo(String value) {
            addCriterion("cinemaLogo =", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoNotEqualTo(String value) {
            addCriterion("cinemaLogo <>", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoGreaterThan(String value) {
            addCriterion("cinemaLogo >", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoGreaterThanOrEqualTo(String value) {
            addCriterion("cinemaLogo >=", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoLessThan(String value) {
            addCriterion("cinemaLogo <", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoLessThanOrEqualTo(String value) {
            addCriterion("cinemaLogo <=", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoLike(String value) {
            addCriterion("cinemaLogo like", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoNotLike(String value) {
            addCriterion("cinemaLogo not like", value, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoIn(List<String> values) {
            addCriterion("cinemaLogo in", values, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoNotIn(List<String> values) {
            addCriterion("cinemaLogo not in", values, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoBetween(String value1, String value2) {
            addCriterion("cinemaLogo between", value1, value2, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemalogoNotBetween(String value1, String value2) {
            addCriterion("cinemaLogo not between", value1, value2, "cinemalogo");
            return (Criteria) this;
        }

        public Criteria andCinemaaddIsNull() {
            addCriterion("cinemaAdd is null");
            return (Criteria) this;
        }

        public Criteria andCinemaaddIsNotNull() {
            addCriterion("cinemaAdd is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaaddEqualTo(String value) {
            addCriterion("cinemaAdd =", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddNotEqualTo(String value) {
            addCriterion("cinemaAdd <>", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddGreaterThan(String value) {
            addCriterion("cinemaAdd >", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddGreaterThanOrEqualTo(String value) {
            addCriterion("cinemaAdd >=", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddLessThan(String value) {
            addCriterion("cinemaAdd <", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddLessThanOrEqualTo(String value) {
            addCriterion("cinemaAdd <=", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddLike(String value) {
            addCriterion("cinemaAdd like", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddNotLike(String value) {
            addCriterion("cinemaAdd not like", value, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddIn(List<String> values) {
            addCriterion("cinemaAdd in", values, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddNotIn(List<String> values) {
            addCriterion("cinemaAdd not in", values, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddBetween(String value1, String value2) {
            addCriterion("cinemaAdd between", value1, value2, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andCinemaaddNotBetween(String value1, String value2) {
            addCriterion("cinemaAdd not between", value1, value2, "cinemaadd");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andGetticketwayIsNull() {
            addCriterion("getTicketWay is null");
            return (Criteria) this;
        }

        public Criteria andGetticketwayIsNotNull() {
            addCriterion("getTicketWay is not null");
            return (Criteria) this;
        }

        public Criteria andGetticketwayEqualTo(String value) {
            addCriterion("getTicketWay =", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayNotEqualTo(String value) {
            addCriterion("getTicketWay <>", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayGreaterThan(String value) {
            addCriterion("getTicketWay >", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayGreaterThanOrEqualTo(String value) {
            addCriterion("getTicketWay >=", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayLessThan(String value) {
            addCriterion("getTicketWay <", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayLessThanOrEqualTo(String value) {
            addCriterion("getTicketWay <=", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayLike(String value) {
            addCriterion("getTicketWay like", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayNotLike(String value) {
            addCriterion("getTicketWay not like", value, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayIn(List<String> values) {
            addCriterion("getTicketWay in", values, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayNotIn(List<String> values) {
            addCriterion("getTicketWay not in", values, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayBetween(String value1, String value2) {
            addCriterion("getTicketWay between", value1, value2, "getticketway");
            return (Criteria) this;
        }

        public Criteria andGetticketwayNotBetween(String value1, String value2) {
            addCriterion("getTicketWay not between", value1, value2, "getticketway");
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

        public Criteria andEndbuydateIsNull() {
            addCriterion("endbuyDate is null");
            return (Criteria) this;
        }

        public Criteria andEndbuydateIsNotNull() {
            addCriterion("endbuyDate is not null");
            return (Criteria) this;
        }

        public Criteria andEndbuydateEqualTo(String value) {
            addCriterion("endbuyDate =", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateNotEqualTo(String value) {
            addCriterion("endbuyDate <>", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateGreaterThan(String value) {
            addCriterion("endbuyDate >", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateGreaterThanOrEqualTo(String value) {
            addCriterion("endbuyDate >=", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateLessThan(String value) {
            addCriterion("endbuyDate <", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateLessThanOrEqualTo(String value) {
            addCriterion("endbuyDate <=", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateLike(String value) {
            addCriterion("endbuyDate like", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateNotLike(String value) {
            addCriterion("endbuyDate not like", value, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateIn(List<String> values) {
            addCriterion("endbuyDate in", values, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateNotIn(List<String> values) {
            addCriterion("endbuyDate not in", values, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateBetween(String value1, String value2) {
            addCriterion("endbuyDate between", value1, value2, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andEndbuydateNotBetween(String value1, String value2) {
            addCriterion("endbuyDate not between", value1, value2, "endbuydate");
            return (Criteria) this;
        }

        public Criteria andPresaledayIsNull() {
            addCriterion("presaleDay is null");
            return (Criteria) this;
        }

        public Criteria andPresaledayIsNotNull() {
            addCriterion("presaleDay is not null");
            return (Criteria) this;
        }

        public Criteria andPresaledayEqualTo(String value) {
            addCriterion("presaleDay =", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayNotEqualTo(String value) {
            addCriterion("presaleDay <>", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayGreaterThan(String value) {
            addCriterion("presaleDay >", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayGreaterThanOrEqualTo(String value) {
            addCriterion("presaleDay >=", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayLessThan(String value) {
            addCriterion("presaleDay <", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayLessThanOrEqualTo(String value) {
            addCriterion("presaleDay <=", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayLike(String value) {
            addCriterion("presaleDay like", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayNotLike(String value) {
            addCriterion("presaleDay not like", value, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayIn(List<String> values) {
            addCriterion("presaleDay in", values, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayNotIn(List<String> values) {
            addCriterion("presaleDay not in", values, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayBetween(String value1, String value2) {
            addCriterion("presaleDay between", value1, value2, "presaleday");
            return (Criteria) this;
        }

        public Criteria andPresaledayNotBetween(String value1, String value2) {
            addCriterion("presaleDay not between", value1, value2, "presaleday");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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