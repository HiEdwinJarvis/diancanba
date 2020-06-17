package com.jarvis.diancanba.base.pojo;

import java.util.Date;

public class DcbRestaurant {
    private Long dcbRestaurantid;

    private String dcbBossid;

    private String dcbRestaurantname;

    private String dcbRestauranttel;

    private String dcbRestaurantdesc;

    private String dcbRestaurantaddress;

    private String dcbRestauranturl;

    private String dcbRestaurantpicture;

    private Integer dcbRestaurantstatus;

    private Date dcbRestaurantdate;

    private Integer dcbIsbusiness;

    private String dcbRestaurantproperty1;

    private String dcbRestaurantproperty2;

    public Long getDcbRestaurantid() {
        return dcbRestaurantid;
    }

    public void setDcbRestaurantid(Long dcbRestaurantid) {
        this.dcbRestaurantid = dcbRestaurantid;
    }

    public String getDcbBossid() {
        return dcbBossid;
    }

    public void setDcbBossid(String dcbBossid) {
        this.dcbBossid = dcbBossid == null ? null : dcbBossid.trim();
    }

    public String getDcbRestaurantname() {
        return dcbRestaurantname;
    }

    public void setDcbRestaurantname(String dcbRestaurantname) {
        this.dcbRestaurantname = dcbRestaurantname == null ? null : dcbRestaurantname.trim();
    }

    public String getDcbRestauranttel() {
        return dcbRestauranttel;
    }

    public void setDcbRestauranttel(String dcbRestauranttel) {
        this.dcbRestauranttel = dcbRestauranttel == null ? null : dcbRestauranttel.trim();
    }

    public String getDcbRestaurantdesc() {
        return dcbRestaurantdesc;
    }

    public void setDcbRestaurantdesc(String dcbRestaurantdesc) {
        this.dcbRestaurantdesc = dcbRestaurantdesc == null ? null : dcbRestaurantdesc.trim();
    }

    public String getDcbRestaurantaddress() {
        return dcbRestaurantaddress;
    }

    public void setDcbRestaurantaddress(String dcbRestaurantaddress) {
        this.dcbRestaurantaddress = dcbRestaurantaddress == null ? null : dcbRestaurantaddress.trim();
    }

    public String getDcbRestauranturl() {
        return dcbRestauranturl;
    }

    public void setDcbRestauranturl(String dcbRestauranturl) {
        this.dcbRestauranturl = dcbRestauranturl == null ? null : dcbRestauranturl.trim();
    }

    public String getDcbRestaurantpicture() {
        return dcbRestaurantpicture;
    }

    public void setDcbRestaurantpicture(String dcbRestaurantpicture) {
        this.dcbRestaurantpicture = dcbRestaurantpicture == null ? null : dcbRestaurantpicture.trim();
    }

    public Integer getDcbRestaurantstatus() {
        return dcbRestaurantstatus;
    }

    public void setDcbRestaurantstatus(Integer dcbRestaurantstatus) {
        this.dcbRestaurantstatus = dcbRestaurantstatus;
    }

    public Date getDcbRestaurantdate() {
        return dcbRestaurantdate;
    }

    public void setDcbRestaurantdate(Date dcbRestaurantdate) {
        this.dcbRestaurantdate = dcbRestaurantdate;
    }

    public Integer getDcbIsbusiness() {
        return dcbIsbusiness;
    }

    public void setDcbIsbusiness(Integer dcbIsbusiness) {
        this.dcbIsbusiness = dcbIsbusiness;
    }

    public String getDcbRestaurantproperty1() {
        return dcbRestaurantproperty1;
    }

    public void setDcbRestaurantproperty1(String dcbRestaurantproperty1) {
        this.dcbRestaurantproperty1 = dcbRestaurantproperty1 == null ? null : dcbRestaurantproperty1.trim();
    }

    public String getDcbRestaurantproperty2() {
        return dcbRestaurantproperty2;
    }

    public void setDcbRestaurantproperty2(String dcbRestaurantproperty2) {
        this.dcbRestaurantproperty2 = dcbRestaurantproperty2 == null ? null : dcbRestaurantproperty2.trim();
    }
}