package com.you_fuli.spiderFilm.dto;

public class SpiderSeatlistOrg {
    private Long id;

    private String cinemaid;

    private String hallid;

    private String maxcolumn;

    private String maxrownum;

    private String row;

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

    public String getHallid() {
        return hallid;
    }

    public void setHallid(String hallid) {
        this.hallid = hallid == null ? null : hallid.trim();
    }

    public String getMaxcolumn() {
        return maxcolumn;
    }

    public void setMaxcolumn(String maxcolumn) {
        this.maxcolumn = maxcolumn == null ? null : maxcolumn.trim();
    }

    public String getMaxrownum() {
        return maxrownum;
    }

    public void setMaxrownum(String maxrownum) {
        this.maxrownum = maxrownum == null ? null : maxrownum.trim();
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row == null ? null : row.trim();
    }
}