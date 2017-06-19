package com.you_fuli.spiderFilm.dto;

import java.math.BigDecimal;

public class SpiderTransactioninfo {
    private Long id;

    private String username;

    private BigDecimal merprice;

    private BigDecimal feeprice;

    private BigDecimal price;

    private Integer seatcount;

    private BigDecimal totalprice;

    private String ordernumber;

    private String spiderorderid;

    private String serialnumber;

    private String createtime;

    private String showdate;

    private String cinemaname;

    private String hallname;

    private String filmname;

    private String seatid;

    private String mobile;

    private String status;

    private String confirmationid;

    private String partnerbookingid;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getMerprice() {
        return merprice;
    }

    public void setMerprice(BigDecimal merprice) {
        this.merprice = merprice;
    }

    public BigDecimal getFeeprice() {
        return feeprice;
    }

    public void setFeeprice(BigDecimal feeprice) {
        this.feeprice = feeprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSeatcount() {
        return seatcount;
    }

    public void setSeatcount(Integer seatcount) {
        this.seatcount = seatcount;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public String getSpiderorderid() {
        return spiderorderid;
    }

    public void setSpiderorderid(String spiderorderid) {
        this.spiderorderid = spiderorderid == null ? null : spiderorderid.trim();
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getShowdate() {
        return showdate;
    }

    public void setShowdate(String showdate) {
        this.showdate = showdate == null ? null : showdate.trim();
    }

    public String getCinemaname() {
        return cinemaname;
    }

    public void setCinemaname(String cinemaname) {
        this.cinemaname = cinemaname == null ? null : cinemaname.trim();
    }

    public String getHallname() {
        return hallname;
    }

    public void setHallname(String hallname) {
        this.hallname = hallname == null ? null : hallname.trim();
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname == null ? null : filmname.trim();
    }

    public String getSeatid() {
        return seatid;
    }

    public void setSeatid(String seatid) {
        this.seatid = seatid == null ? null : seatid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getConfirmationid() {
        return confirmationid;
    }

    public void setConfirmationid(String confirmationid) {
        this.confirmationid = confirmationid == null ? null : confirmationid.trim();
    }

    public String getPartnerbookingid() {
        return partnerbookingid;
    }

    public void setPartnerbookingid(String partnerbookingid) {
        this.partnerbookingid = partnerbookingid == null ? null : partnerbookingid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}