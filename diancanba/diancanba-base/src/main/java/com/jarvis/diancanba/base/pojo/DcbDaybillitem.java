package com.jarvis.diancanba.base.pojo;

public class DcbDaybillitem {
    private Long dcbDaybillitemid;

    private Long dcbDaybillid;

    private Long dcbItemfoodid;

    private String dcbItemfoodname;

    private Float dcbItemfoodprice;

    private Float dcbItemmoney;

    private Integer dcbItemfoodnum;

    private String dcbFoodpicture;

    private String dcbDaybillitemtproperty1;

    private String dcbDaybillitemproperty2;

    public Long getDcbDaybillitemid() {
        return dcbDaybillitemid;
    }

    public void setDcbDaybillitemid(Long dcbDaybillitemid) {
        this.dcbDaybillitemid = dcbDaybillitemid;
    }

    public Long getDcbDaybillid() {
        return dcbDaybillid;
    }

    public void setDcbDaybillid(Long dcbDaybillid) {
        this.dcbDaybillid = dcbDaybillid;
    }

    public Long getDcbItemfoodid() {
        return dcbItemfoodid;
    }

    public void setDcbItemfoodid(Long dcbItemfoodid) {
        this.dcbItemfoodid = dcbItemfoodid;
    }

    public String getDcbItemfoodname() {
        return dcbItemfoodname;
    }

    public void setDcbItemfoodname(String dcbItemfoodname) {
        this.dcbItemfoodname = dcbItemfoodname == null ? null : dcbItemfoodname.trim();
    }

    public Float getDcbItemfoodprice() {
        return dcbItemfoodprice;
    }

    public void setDcbItemfoodprice(Float dcbItemfoodprice) {
        this.dcbItemfoodprice = dcbItemfoodprice;
    }

    public Float getDcbItemmoney() {
        return dcbItemmoney;
    }

    public void setDcbItemmoney(Float dcbItemmoney) {
        this.dcbItemmoney = dcbItemmoney;
    }

    public Integer getDcbItemfoodnum() {
        return dcbItemfoodnum;
    }

    public void setDcbItemfoodnum(Integer dcbItemfoodnum) {
        this.dcbItemfoodnum = dcbItemfoodnum;
    }

    public String getDcbFoodpicture() {
        return dcbFoodpicture;
    }

    public void setDcbFoodpicture(String dcbFoodpicture) {
        this.dcbFoodpicture = dcbFoodpicture == null ? null : dcbFoodpicture.trim();
    }

    public String getDcbDaybillitemtproperty1() {
        return dcbDaybillitemtproperty1;
    }

    public void setDcbDaybillitemtproperty1(String dcbDaybillitemtproperty1) {
        this.dcbDaybillitemtproperty1 = dcbDaybillitemtproperty1 == null ? null : dcbDaybillitemtproperty1.trim();
    }

    public String getDcbDaybillitemproperty2() {
        return dcbDaybillitemproperty2;
    }

    public void setDcbDaybillitemproperty2(String dcbDaybillitemproperty2) {
        this.dcbDaybillitemproperty2 = dcbDaybillitemproperty2 == null ? null : dcbDaybillitemproperty2.trim();
    }
}