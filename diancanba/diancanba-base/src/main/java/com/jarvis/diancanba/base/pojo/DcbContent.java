package com.jarvis.diancanba.base.pojo;

public class DcbContent {
    private Long dcbContentid;

    private Long dcbRestaurantid;

    private String dcbContenttile;

    private String dcbContentpicture;

    private Integer dcbContentstatus;

    private String dcbContentproperty1;

    private String dcbContentproperty2;

    public Long getDcbContentid() {
        return dcbContentid;
    }

    public void setDcbContentid(Long dcbContentid) {
        this.dcbContentid = dcbContentid;
    }

    public Long getDcbRestaurantid() {
        return dcbRestaurantid;
    }

    public void setDcbRestaurantid(Long dcbRestaurantid) {
        this.dcbRestaurantid = dcbRestaurantid;
    }

    public String getDcbContenttile() {
        return dcbContenttile;
    }

    public void setDcbContenttile(String dcbContenttile) {
        this.dcbContenttile = dcbContenttile == null ? null : dcbContenttile.trim();
    }

    public String getDcbContentpicture() {
        return dcbContentpicture;
    }

    public void setDcbContentpicture(String dcbContentpicture) {
        this.dcbContentpicture = dcbContentpicture == null ? null : dcbContentpicture.trim();
    }

    public Integer getDcbContentstatus() {
        return dcbContentstatus;
    }

    public void setDcbContentstatus(Integer dcbContentstatus) {
        this.dcbContentstatus = dcbContentstatus;
    }

    public String getDcbContentproperty1() {
        return dcbContentproperty1;
    }

    public void setDcbContentproperty1(String dcbContentproperty1) {
        this.dcbContentproperty1 = dcbContentproperty1 == null ? null : dcbContentproperty1.trim();
    }

    public String getDcbContentproperty2() {
        return dcbContentproperty2;
    }

    public void setDcbContentproperty2(String dcbContentproperty2) {
        this.dcbContentproperty2 = dcbContentproperty2 == null ? null : dcbContentproperty2.trim();
    }
}