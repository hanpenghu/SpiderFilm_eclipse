package com.you_fuli.spiderFilm.dto;

public class SpiderRegionlistOrg {
    private Long id;

    private String cityid;

    private String cityname;

    private String citytype;

    private String regionid;

    private String regionname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }
}