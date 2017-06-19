package com.you_fuli.spiderFilm.dto;

public class SpiderShowlist {
    private Long id;

    private String showid;

    private String cinemaid;

    private String cinemaname;

    private String hallid;

    private String hallname;

    private String filmid;

    private String filmname;

    private String showdate;

    private String showtime;

    private String staprice;

    private String userprice;

    private String merprice;

    private String feeprice;

    private String language;

    private String duration;

    private String dimensional;

    private String activityid;

    private String isdiscount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShowid() {
        return showid;
    }

    public void setShowid(String showid) {
        this.showid = showid == null ? null : showid.trim();
    }

    public String getCinemaid() {
        return cinemaid;
    }

    public void setCinemaid(String cinemaid) {
        this.cinemaid = cinemaid == null ? null : cinemaid.trim();
    }

    public String getCinemaname() {
        return cinemaname;
    }

    public void setCinemaname(String cinemaname) {
        this.cinemaname = cinemaname == null ? null : cinemaname.trim();
    }

    public String getHallid() {
        return hallid;
    }

    public void setHallid(String hallid) {
        this.hallid = hallid == null ? null : hallid.trim();
    }

    public String getHallname() {
        return hallname;
    }

    public void setHallname(String hallname) {
        this.hallname = hallname == null ? null : hallname.trim();
    }

    public String getFilmid() {
        return filmid;
    }

    public void setFilmid(String filmid) {
        this.filmid = filmid == null ? null : filmid.trim();
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname == null ? null : filmname.trim();
    }

    public String getShowdate() {
        return showdate;
    }

    public void setShowdate(String showdate) {
        this.showdate = showdate == null ? null : showdate.trim();
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime == null ? null : showtime.trim();
    }

    public String getStaprice() {
        return staprice;
    }

    public void setStaprice(String staprice) {
        this.staprice = staprice == null ? null : staprice.trim();
    }

    public String getUserprice() {
        return userprice;
    }

    public void setUserprice(String userprice) {
        this.userprice = userprice == null ? null : userprice.trim();
    }

    public String getMerprice() {
        return merprice;
    }

    public void setMerprice(String merprice) {
        this.merprice = merprice == null ? null : merprice.trim();
    }

    public String getFeeprice() {
        return feeprice;
    }

    public void setFeeprice(String feeprice) {
        this.feeprice = feeprice == null ? null : feeprice.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getDimensional() {
        return dimensional;
    }

    public void setDimensional(String dimensional) {
        this.dimensional = dimensional == null ? null : dimensional.trim();
    }

    public String getActivityid() {
        return activityid;
    }

    public void setActivityid(String activityid) {
        this.activityid = activityid == null ? null : activityid.trim();
    }

    public String getIsdiscount() {
        return isdiscount;
    }

    public void setIsdiscount(String isdiscount) {
        this.isdiscount = isdiscount == null ? null : isdiscount.trim();
    }
}