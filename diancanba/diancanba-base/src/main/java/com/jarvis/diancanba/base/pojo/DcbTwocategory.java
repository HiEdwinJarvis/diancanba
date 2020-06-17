package com.jarvis.diancanba.base.pojo;

public class DcbTwocategory {
    private Long dcbTwocategoryid;

    private Long dcbOnecategoryid;

    private Long dcbRestaurantid;

    private String dcbTwocategoryname;

    private String dcbTwocategorydesc;

    private String dcbTwocategorypicture;

    public Long getDcbTwocategoryid() {
        return dcbTwocategoryid;
    }

    public void setDcbTwocategoryid(Long dcbTwocategoryid) {
        this.dcbTwocategoryid = dcbTwocategoryid;
    }

    public Long getDcbOnecategoryid() {
        return dcbOnecategoryid;
    }

    public void setDcbOnecategoryid(Long dcbOnecategoryid) {
        this.dcbOnecategoryid = dcbOnecategoryid;
    }

    public Long getDcbRestaurantid() {
        return dcbRestaurantid;
    }

    public void setDcbRestaurantid(Long dcbRestaurantid) {
        this.dcbRestaurantid = dcbRestaurantid;
    }

    public String getDcbTwocategoryname() {
        return dcbTwocategoryname;
    }

    public void setDcbTwocategoryname(String dcbTwocategoryname) {
        this.dcbTwocategoryname = dcbTwocategoryname == null ? null : dcbTwocategoryname.trim();
    }

    public String getDcbTwocategorydesc() {
        return dcbTwocategorydesc;
    }

    public void setDcbTwocategorydesc(String dcbTwocategorydesc) {
        this.dcbTwocategorydesc = dcbTwocategorydesc == null ? null : dcbTwocategorydesc.trim();
    }

    public String getDcbTwocategorypicture() {
        return dcbTwocategorypicture;
    }

    public void setDcbTwocategorypicture(String dcbTwocategorypicture) {
        this.dcbTwocategorypicture = dcbTwocategorypicture == null ? null : dcbTwocategorypicture.trim();
    }
}