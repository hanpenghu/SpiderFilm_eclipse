package com.you_fuli.spiderFilm.dto;

public class SpiderCitylist {
    private String cityid;

    private String cityname;

    private String citytype;

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCitytype() {
        return citytype;
    }

    public void setCitytype(String citytype) {
        this.citytype = citytype == null ? null : citytype.trim();
    }
}