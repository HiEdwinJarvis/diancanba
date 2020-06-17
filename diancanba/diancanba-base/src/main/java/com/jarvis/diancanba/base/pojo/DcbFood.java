package com.jarvis.diancanba.base.pojo;

public class DcbFood {
    private Long dcbFoodid;

    private Long dcbTwocategoryid;

    private Long dcbRestaurantid;

    private String dcbFoodname;

    private Float dcbFoodprice;

    private String dcbFooddesc;

    private String dcbFoodpicture;

    private Integer dcbFoodishot;

    private String dcbFoodproperty1;

    private String dcbFoodproperty2;

    public Long getDcbFoodid() {
        return dcbFoodid;
    }

    public void setDcbFoodid(Long dcbFoodid) {
        this.dcbFoodid = dcbFoodid;
    }

    public Long getDcbTwocategoryid() {
        return dcbTwocategoryid;
    }

    public void setDcbTwocategoryid(Long dcbTwocategoryid) {
        this.dcbTwocategoryid = dcbTwocategoryid;
    }

    public Long getDcbRestaurantid() {
        return dcbRestaurantid;
    }

    public void setDcbRestaurantid(Long dcbRestaurantid) {
        this.dcbRestaurantid = dcbRestaurantid;
    }

    public String getDcbFoodname() {
        return dcbFoodname;
    }

    public void setDcbFoodname(String dcbFoodname) {
        this.dcbFoodname = dcbFoodname == null ? null : dcbFoodname.trim();
    }

    public Float getDcbFoodprice() {
        return dcbFoodprice;
    }

    public void setDcbFoodprice(Float dcbFoodprice) {
        this.dcbFoodprice = dcbFoodprice;
    }

    public String getDcbFooddesc() {
        return dcbFooddesc;
    }

    public void setDcbFooddesc(String dcbFooddesc) {
        this.dcbFooddesc = dcbFooddesc == null ? null : dcbFooddesc.trim();
    }

    public String getDcbFoodpicture() {
        return dcbFoodpicture;
    }

    public void setDcbFoodpicture(String dcbFoodpicture) {
        this.dcbFoodpicture = dcbFoodpicture == null ? null : dcbFoodpicture.trim();
    }

    public Integer getDcbFoodishot() {
        return dcbFoodishot;
    }

    public void setDcbFoodishot(Integer dcbFoodishot) {
        this.dcbFoodishot = dcbFoodishot;
    }

    public String getDcbFoodproperty1() {
        return dcbFoodproperty1;
    }

    public void setDcbFoodproperty1(String dcbFoodproperty1) {
        this.dcbFoodproperty1 = dcbFoodproperty1 == null ? null : dcbFoodproperty1.trim();
    }

    public String getDcbFoodproperty2() {
        return dcbFoodproperty2;
    }

    public void setDcbFoodproperty2(String dcbFoodproperty2) {
        this.dcbFoodproperty2 = dcbFoodproperty2 == null ? null : dcbFoodproperty2.trim();
    }
}