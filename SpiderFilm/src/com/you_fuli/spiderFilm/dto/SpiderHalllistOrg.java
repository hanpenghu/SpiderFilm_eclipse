package com.you_fuli.spiderFilm.dto;

public class SpiderHalllistOrg {
    private Long id;

    private String hallid;

    private String hallname;

    private String cinemaid;

    private String halltype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCinemaid() {
        return cinemaid;
    }

    public void setCinemaid(String cinemaid) {
        this.cinemaid = cinemaid == null ? null : cinemaid.trim();
    }

    public String getHalltype() {
        return halltype;
    }

    public void setHalltype(String halltype) {
        this.halltype = halltype == null ? null : halltype.trim();
    }
}