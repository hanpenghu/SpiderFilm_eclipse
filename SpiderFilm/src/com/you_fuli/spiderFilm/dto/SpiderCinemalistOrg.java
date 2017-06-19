package com.you_fuli.spiderFilm.dto;

public class SpiderCinemalistOrg {
    private Long id;

    private String cinemaid;

    private String cinemaname;

    private String cinemalogo;

    private String cinemaadd;

    private String contact;

    private String getticketway;

    private String cityid;

    private String regionid;

    private String endbuydate;

    private String presaleday;

    private String longitude;

    private String latitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCinemalogo() {
        return cinemalogo;
    }

    public void setCinemalogo(String cinemalogo) {
        this.cinemalogo = cinemalogo == null ? null : cinemalogo.trim();
    }

    public String getCinemaadd() {
        return cinemaadd;
    }

    public void setCinemaadd(String cinemaadd) {
        this.cinemaadd = cinemaadd == null ? null : cinemaadd.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getGetticketway() {
        return getticketway;
    }

    public void setGetticketway(String getticketway) {
        this.getticketway = getticketway == null ? null : getticketway.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public String getEndbuydate() {
        return endbuydate;
    }

    public void setEndbuydate(String endbuydate) {
        this.endbuydate = endbuydate == null ? null : endbuydate.trim();
    }

    public String getPresaleday() {
        return presaleday;
    }

    public void setPresaleday(String presaleday) {
        this.presaleday = presaleday == null ? null : presaleday.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }
}