package com.jarvis.diancanba.base.pojo;

import java.util.Date;

public class DcbDaybill {
    private Long dcbDaybillid;

    private Long dcbRestaurantid;

    private String dcbRestaurantname;

    private Date dcbDaybilldate;

    private Date dcbDate;

    private Float dcbSummoney;

    private String dcbBillproperty1;

    private String dcbBillproperty2;

    public Long getDcbDaybillid() {
        return dcbDaybillid;
    }

    public void setDcbDaybillid(Long dcbDaybillid) {
        this.dcbDaybillid = dcbDaybillid;
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

    public Date getDcbDaybilldate() {
        return dcbDaybilldate;
    }

    public void setDcbDaybilldate(Date dcbDaybilldate) {
        this.dcbDaybilldate = dcbDaybilldate;
    }

    public Date getDcbDate() {
        return dcbDate;
    }

    public void setDcbDate(Date dcbDate) {
        this.dcbDate = dcbDate;
    }

    public Float getDcbSummoney() {
        return dcbSummoney;
    }

    public void setDcbSummoney(Float dcbSummoney) {
        this.dcbSummoney = dcbSummoney;
    }

    public String getDcbBillproperty1() {
        return dcbBillproperty1;
    }

    public void setDcbBillproperty1(String dcbBillproperty1) {
        this.dcbBillproperty1 = dcbBillproperty1 == null ? null : dcbBillproperty1.trim();
    }

    public String getDcbBillproperty2() {
        return dcbBillproperty2;
    }

    public void setDcbBillproperty2(String dcbBillproperty2) {
        this.dcbBillproperty2 = dcbBillproperty2 == null ? null : dcbBillproperty2.trim();
    }
}