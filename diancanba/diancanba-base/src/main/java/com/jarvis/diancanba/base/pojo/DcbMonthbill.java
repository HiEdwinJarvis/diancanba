package com.jarvis.diancanba.base.pojo;

import java.util.Date;

public class DcbMonthbill {
    private Long dcbMonthbillid;

    private Long dcbRestaurantid;

    private String dcbRestaurantname;

    private Date dcbMonthbilldatetime;

    private Integer dcbMonth;

    private Float dcbMonthbillincomefront;

    private Float dcbMonthbillincomeafter;

    private Integer dcbMonthbillstatus;

    private String dcbMonthbillidea;

    private String dcbMonthbillproperty1;

    private String dcbMonthbillproperty2;

    public Long getDcbMonthbillid() {
        return dcbMonthbillid;
    }

    public void setDcbMonthbillid(Long dcbMonthbillid) {
        this.dcbMonthbillid = dcbMonthbillid;
    }

    public Long getDcbRestaurantid() {
        return dcbRestaurantid;
    }

    public void setDcbRestaurantid(Long dcbRestaurantid) {
        this.dcbRestaurantid = dcbRestaurantid;
    }

    public String getDcbRestaurantname() {
        return dcbRestaurantname;
    }

    public void setDcbRestaurantname(String dcbRestaurantname) {
        this.dcbRestaurantname = dcbRestaurantname == null ? null : dcbRestaurantname.trim();
    }

    public Date getDcbMonthbilldatetime() {
        return dcbMonthbilldatetime;
    }

    public void setDcbMonthbilldatetime(Date dcbMonthbilldatetime) {
        this.dcbMonthbilldatetime = dcbMonthbilldatetime;
    }

    public Integer getDcbMonth() {
        return dcbMonth;
    }

    public void setDcbMonth(Integer dcbMonth) {
        this.dcbMonth = dcbMonth;
    }

    public Float getDcbMonthbillincomefront() {
        return dcbMonthbillincomefront;
    }

    public void setDcbMonthbillincomefront(Float dcbMonthbillincomefront) {
        this.dcbMonthbillincomefront = dcbMonthbillincomefront;
    }

    public Float getDcbMonthbillincomeafter() {
        return dcbMonthbillincomeafter;
    }

    public void setDcbMonthbillincomeafter(Float dcbMonthbillincomeafter) {
        this.dcbMonthbillincomeafter = dcbMonthbillincomeafter;
    }

    public Integer getDcbMonthbillstatus() {
        return dcbMonthbillstatus;
    }

    public void setDcbMonthbillstatus(Integer dcbMonthbillstatus) {
        this.dcbMonthbillstatus = dcbMonthbillstatus;
    }

    public String getDcbMonthbillidea() {
        return dcbMonthbillidea;
    }

    public void setDcbMonthbillidea(String dcbMonthbillidea) {
        this.dcbMonthbillidea = dcbMonthbillidea == null ? null : dcbMonthbillidea.trim();
    }

    public String getDcbMonthbillproperty1() {
        return dcbMonthbillproperty1;
    }

    public void setDcbMonthbillproperty1(String dcbMonthbillproperty1) {
        this.dcbMonthbillproperty1 = dcbMonthbillproperty1 == null ? null : dcbMonthbillproperty1.trim();
    }

    public String getDcbMonthbillproperty2() {
        return dcbMonthbillproperty2;
    }

    public void setDcbMonthbillproperty2(String dcbMonthbillproperty2) {
        this.dcbMonthbillproperty2 = dcbMonthbillproperty2 == null ? null : dcbMonthbillproperty2.trim();
    }
}