package com.you_fuli.spiderFilm.dto;

import java.util.ArrayList;
import java.util.List;

public class SpiderShowlistOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpiderShowlistOrgExample() {
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

        public Criteria andShowidIsNull() {
            addCriterion("showId is null");
            return (Criteria) this;
        }

        public Criteria andShowidIsNotNull() {
            addCriterion("showId is not null");
            return (Criteria) this;
        }

        public Criteria andShowidEqualTo(String value) {
            addCriterion("showId =", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotEqualTo(String value) {
            addCriterion("showId <>", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidGreaterThan(String value) {
            addCriterion("showId >", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidGreaterThanOrEqualTo(String value) {
            addCriterion("showId >=", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidLessThan(String value) {
            addCriterion("showId <", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidLessThanOrEqualTo(String value) {
            addCriterion("showId <=", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidLike(String value) {
            addCriterion("showId like", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotLike(String value) {
            addCriterion("showId not like", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidIn(List<String> values) {
            addCriterion("showId in", values, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotIn(List<String> values) {
            addCriterion("showId not in", values, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidBetween(String value1, String value2) {
            addCriterion("showId between", value1, value2, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotBetween(String value1, String value2) {
            addCriterion("showId not between", value1, value2, "showid");
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

        public Criteria andFilmidIsNull() {
            addCriterion("filmId is null");
            return (Criteria) this;
        }

        public Criteria andFilmidIsNotNull() {
            addCriterion("filmId is not null");
            return (Criteria) this;
        }

        public Criteria andFilmidEqualTo(String value) {
            addCriterion("filmId =", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotEqualTo(String value) {
            addCriterion("filmId <>", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidGreaterThan(String value) {
            addCriterion("filmId >", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidGreaterThanOrEqualTo(String value) {
            addCriterion("filmId >=", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLessThan(String value) {
            addCriterion("filmId <", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLessThanOrEqualTo(String value) {
            addCriterion("filmId <=", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidLike(String value) {
            addCriterion("filmId like", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotLike(String value) {
            addCriterion("filmId not like", value, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidIn(List<String> values) {
            addCriterion("filmId in", values, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotIn(List<String> values) {
            addCriterion("filmId not in", values, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidBetween(String value1, String value2) {
            addCriterion("filmId between", value1, value2, "filmid");
            return (Criteria) this;
        }

        public Criteria andFilmidNotBetween(String value1, String value2) {
            addCriterion("filmId not between", value1, value2, "filmid");
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

        public Criteria andShowtimeIsNull() {
            addCriterion("showTime is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeIsNotNull() {
            addCriterion("showTime is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeEqualTo(String value) {
            addCriterion("showTime =", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotEqualTo(String value) {
            addCriterion("showTime <>", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeGreaterThan(String value) {
            addCriterion("showTime >", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("showTime >=", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeLessThan(String value) {
            addCriterion("showTime <", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeLessThanOrEqualTo(String value) {
            addCriterion("showTime <=", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeLike(String value) {
            addCriterion("showTime like", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotLike(String value) {
            addCriterion("showTime not like", value, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeIn(List<String> values) {
            addCriterion("showTime in", values, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotIn(List<String> values) {
            addCriterion("showTime not in", values, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeBetween(String value1, String value2) {
            addCriterion("showTime between", value1, value2, "showtime");
            return (Criteria) this;
        }

        public Criteria andShowtimeNotBetween(String value1, String value2) {
            addCriterion("showTime not between", value1, value2, "showtime");
            return (Criteria) this;
        }

        public Criteria andStapriceIsNull() {
            addCriterion("staPrice is null");
            return (Criteria) this;
        }

        public Criteria andStapriceIsNotNull() {
            addCriterion("staPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStapriceEqualTo(String value) {
            addCriterion("staPrice =", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceNotEqualTo(String value) {
            addCriterion("staPrice <>", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceGreaterThan(String value) {
            addCriterion("staPrice >", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceGreaterThanOrEqualTo(String value) {
            addCriterion("staPrice >=", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceLessThan(String value) {
            addCriterion("staPrice <", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceLessThanOrEqualTo(String value) {
            addCriterion("staPrice <=", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceLike(String value) {
            addCriterion("staPrice like", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceNotLike(String value) {
            addCriterion("staPrice not like", value, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceIn(List<String> values) {
            addCriterion("staPrice in", values, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceNotIn(List<String> values) {
            addCriterion("staPrice not in", values, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceBetween(String value1, String value2) {
            addCriterion("staPrice between", value1, value2, "staprice");
            return (Criteria) this;
        }

        public Criteria andStapriceNotBetween(String value1, String value2) {
            addCriterion("staPrice not between", value1, value2, "staprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceIsNull() {
            addCriterion("userPrice is null");
            return (Criteria) this;
        }

        public Criteria andUserpriceIsNotNull() {
            addCriterion("userPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUserpriceEqualTo(String value) {
            addCriterion("userPrice =", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotEqualTo(String value) {
            addCriterion("userPrice <>", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceGreaterThan(String value) {
            addCriterion("userPrice >", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceGreaterThanOrEqualTo(String value) {
            addCriterion("userPrice >=", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceLessThan(String value) {
            addCriterion("userPrice <", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceLessThanOrEqualTo(String value) {
            addCriterion("userPrice <=", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceLike(String value) {
            addCriterion("userPrice like", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotLike(String value) {
            addCriterion("userPrice not like", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceIn(List<String> values) {
            addCriterion("userPrice in", values, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotIn(List<String> values) {
            addCriterion("userPrice not in", values, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceBetween(String value1, String value2) {
            addCriterion("userPrice between", value1, value2, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotBetween(String value1, String value2) {
            addCriterion("userPrice not between", value1, value2, "userprice");
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

        public Criteria andMerpriceEqualTo(String value) {
            addCriterion("merPrice =", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotEqualTo(String value) {
            addCriterion("merPrice <>", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceGreaterThan(String value) {
            addCriterion("merPrice >", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceGreaterThanOrEqualTo(String value) {
            addCriterion("merPrice >=", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceLessThan(String value) {
            addCriterion("merPrice <", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceLessThanOrEqualTo(String value) {
            addCriterion("merPrice <=", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceLike(String value) {
            addCriterion("merPrice like", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotLike(String value) {
            addCriterion("merPrice not like", value, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceIn(List<String> values) {
            addCriterion("merPrice in", values, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotIn(List<String> values) {
            addCriterion("merPrice not in", values, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceBetween(String value1, String value2) {
            addCriterion("merPrice between", value1, value2, "merprice");
            return (Criteria) this;
        }

        public Criteria andMerpriceNotBetween(String value1, String value2) {
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

        public Criteria andFeepriceEqualTo(String value) {
            addCriterion("feePrice =", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotEqualTo(String value) {
            addCriterion("feePrice <>", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceGreaterThan(String value) {
            addCriterion("feePrice >", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceGreaterThanOrEqualTo(String value) {
            addCriterion("feePrice >=", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceLessThan(String value) {
            addCriterion("feePrice <", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceLessThanOrEqualTo(String value) {
            addCriterion("feePrice <=", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceLike(String value) {
            addCriterion("feePrice like", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotLike(String value) {
            addCriterion("feePrice not like", value, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceIn(List<String> values) {
            addCriterion("feePrice in", values, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotIn(List<String> values) {
            addCriterion("feePrice not in", values, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceBetween(String value1, String value2) {
            addCriterion("feePrice between", value1, value2, "feeprice");
            return (Criteria) this;
        }

        public Criteria andFeepriceNotBetween(String value1, String value2) {
            addCriterion("feePrice not between", value1, value2, "feeprice");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDimensionalIsNull() {
            addCriterion("dimensional is null");
            return (Criteria) this;
        }

        public Criteria andDimensionalIsNotNull() {
            addCriterion("dimensional is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionalEqualTo(String value) {
            addCriterion("dimensional =", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalNotEqualTo(String value) {
            addCriterion("dimensional <>", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalGreaterThan(String value) {
            addCriterion("dimensional >", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalGreaterThanOrEqualTo(String value) {
            addCriterion("dimensional >=", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalLessThan(String value) {
            addCriterion("dimensional <", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalLessThanOrEqualTo(String value) {
            addCriterion("dimensional <=", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalLike(String value) {
            addCriterion("dimensional like", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalNotLike(String value) {
            addCriterion("dimensional not like", value, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalIn(List<String> values) {
            addCriterion("dimensional in", values, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalNotIn(List<String> values) {
            addCriterion("dimensional not in", values, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalBetween(String value1, String value2) {
            addCriterion("dimensional between", value1, value2, "dimensional");
            return (Criteria) this;
        }

        public Criteria andDimensionalNotBetween(String value1, String value2) {
            addCriterion("dimensional not between", value1, value2, "dimensional");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNull() {
            addCriterion("activityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(String value) {
            addCriterion("activityId =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(String value) {
            addCriterion("activityId <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(String value) {
            addCriterion("activityId >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(String value) {
            addCriterion("activityId >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(String value) {
            addCriterion("activityId <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(String value) {
            addCriterion("activityId <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLike(String value) {
            addCriterion("activityId like", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotLike(String value) {
            addCriterion("activityId not like", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<String> values) {
            addCriterion("activityId in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<String> values) {
            addCriterion("activityId not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(String value1, String value2) {
            addCriterion("activityId between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(String value1, String value2) {
            addCriterion("activityId not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNull() {
            addCriterion("isDiscount is null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNotNull() {
            addCriterion("isDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountEqualTo(String value) {
            addCriterion("isDiscount =", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotEqualTo(String value) {
            addCriterion("isDiscount <>", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThan(String value) {
            addCriterion("isDiscount >", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThanOrEqualTo(String value) {
            addCriterion("isDiscount >=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThan(String value) {
            addCriterion("isDiscount <", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThanOrEqualTo(String value) {
            addCriterion("isDiscount <=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLike(String value) {
            addCriterion("isDiscount like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotLike(String value) {
            addCriterion("isDiscount not like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIn(List<String> values) {
            addCriterion("isDiscount in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotIn(List<String> values) {
            addCriterion("isDiscount not in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountBetween(String value1, String value2) {
            addCriterion("isDiscount between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotBetween(String value1, String value2) {
            addCriterion("isDiscount not between", value1, value2, "isdiscount");
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