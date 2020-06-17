package com.jarvis.diancanba.base.pojo;

public class DcbOnecategory {
    private Long dcbOnecategoryid;

    private Long dcbRestaurantid;

    private String dcbOnecategoryname;

    private String dcbOnecategorydesc;

    private String dcbOnecategorypicture;

    private String dcbOnecategoryproperty1;

    private String dcbOnecategoryproperty2;

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

    public String getDcbOnecategoryname() {
        return dcbOnecategoryname;
    }

    public void setDcbOnecategoryname(String dcbOnecategoryname) {
        this.dcbOnecategoryname = dcbOnecategoryname == null ? null : dcbOnecategoryname.trim();
    }

    public String getDcbOnecategorydesc() {
        return dcbOnecategorydesc;
    }

    public void setDcbOnecategorydesc(String dcbOnecategorydesc) {
        this.dcbOnecategorydesc = dcbOnecategorydesc == null ? null : dcbOnecategorydesc.trim();
    }

    public String getDcbOnecategorypicture() {
        return dcbOnecategorypicture;
    }

    public void setDcbOnecategorypicture(String dcbOnecategorypicture) {
        this.dcbOnecategorypicture = dcbOnecategorypicture == null ? null : dcbOnecategorypicture.trim();
    }

    public String getDcbOnecategoryproperty1() {
        return dcbOnecategoryproperty1;
    }

    public void setDcbOnecategoryproperty1(String dcbOnecategoryproperty1) {
        this.dcbOnecategoryproperty1 = dcbOnecategoryproperty1 == null ? null : dcbOnecategoryproperty1.trim();
    }

    public String getDcbOnecategoryproperty2() {
        return dcbOnecategoryproperty2;
    }

    public void setDcbOnecategoryproperty2(String dcbOnecategoryproperty2) {
        this.dcbOnecategoryproperty2 = dcbOnecategoryproperty2 == null ? null : dcbOnecategoryproperty2.trim();
    }
}