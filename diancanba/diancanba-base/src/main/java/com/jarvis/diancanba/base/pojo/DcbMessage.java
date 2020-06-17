package com.jarvis.diancanba.base.pojo;

import java.util.Date;

public class DcbMessage {
    private Long dcbMessageid;

    private Long dcbRestaurantid;

    private Date dcbCreatetime;

    private String dcbMessage;

    private Integer dcbMessagestatus;

    public Long getDcbMessageid() {
        return dcbMessageid;
    }

    public void setDcbMessageid(Long dcbMessageid) {
        this.dcbMessageid = dcbMessageid;
    }

    public Long getDcbRestaurantid() {
        return dcbRestaurantid;
    }

    public void setDcbRestaurantid(Long dcbRestaurantid) {
        this.dcbRestaurantid = dcbRestaurantid;
    }

    public Date getDcbCreatetime() {
        return dcbCreatetime;
    }

    public void setDcbCreatetime(Date dcbCreatetime) {
        this.dcbCreatetime = dcbCreatetime;
    }

    public String getDcbMessage() {
        return dcbMessage;
    }

    public void setDcbMessage(String dcbMessage) {
        this.dcbMessage = dcbMessage == null ? null : dcbMessage.trim();
    }

    public Integer getDcbMessagestatus() {
        return dcbMessagestatus;
    }

    public void setDcbMessagestatus(Integer dcbMessagestatus) {
        this.dcbMessagestatus = dcbMessagestatus;
    }
}