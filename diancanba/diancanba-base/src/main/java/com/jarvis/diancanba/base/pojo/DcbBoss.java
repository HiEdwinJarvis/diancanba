package com.jarvis.diancanba.base.pojo;

import java.util.Date;

public class DcbBoss {
    private String dcbBossid;

    private String dcbBosspassword;

    private String dcbBossname;

    private String dcbBosstel;

    private String dcbBossheadimg;

    private String dcbRestaurantname;

    private Integer dcbBossstatus;

    private String dcbBossaddress;

    private String dcbBossemail;

    private Date dcbCreatetime;

    private String dcbBossproperty1;

    private String dcbBossproperty2;

    public String getDcbBossid() {
        return dcbBossid;
    }

    public void setDcbBossid(String dcbBossid) {
        this.dcbBossid = dcbBossid == null ? null : dcbBossid.trim();
    }

    public String getDcbBosspassword() {
        return dcbBosspassword;
    }

    public void setDcbBosspassword(String dcbBosspassword) {
        this.dcbBosspassword = dcbBosspassword == null ? null : dcbBosspassword.trim();
    }

    public String getDcbBossname() {
        return dcbBossname;
    }

    public void setDcbBossname(String dcbBossname) {
        this.dcbBossname = dcbBossname == null ? null : dcbBossname.trim();
    }

    public String getDcbBosstel() {
        return dcbBosstel;
    }

    public void setDcbBosstel(String dcbBosstel) {
        this.dcbBosstel = dcbBosstel == null ? null : dcbBosstel.trim();
    }

    public String getDcbBossheadimg() {
        return dcbBossheadimg;
    }

    public void setDcbBossheadimg(String dcbBossheadimg) {
        this.dcbBossheadimg = dcbBossheadimg == null ? null : dcbBossheadimg.trim();
    }

    public String getDcbRestaurantname() {
        return dcbRestaurantname;
    }

    public void setDcbRestaurantname(String dcbRestaurantname) {
        this.dcbRestaurantname = dcbRestaurantname == null ? null : dcbRestaurantname.trim();
    }

    public Integer getDcbBossstatus() {
        return dcbBossstatus;
    }

    public void setDcbBossstatus(Integer dcbBossstatus) {
        this.dcbBossstatus = dcbBossstatus;
    }

    public String getDcbBossaddress() {
        return dcbBossaddress;
    }

    public void setDcbBossaddress(String dcbBossaddress) {
        this.dcbBossaddress = dcbBossaddress == null ? null : dcbBossaddress.trim();
    }

    public String getDcbBossemail() {
        return dcbBossemail;
    }

    public void setDcbBossemail(String dcbBossemail) {
        this.dcbBossemail = dcbBossemail == null ? null : dcbBossemail.trim();
    }

    public Date getDcbCreatetime() {
        return dcbCreatetime;
    }

    public void setDcbCreatetime(Date dcbCreatetime) {
        this.dcbCreatetime = dcbCreatetime;
    }

    public String getDcbBossproperty1() {
        return dcbBossproperty1;
    }

    public void setDcbBossproperty1(String dcbBossproperty1) {
        this.dcbBossproperty1 = dcbBossproperty1 == null ? null : dcbBossproperty1.trim();
    }

    public String getDcbBossproperty2() {
        return dcbBossproperty2;
    }

    public void setDcbBossproperty2(String dcbBossproperty2) {
        this.dcbBossproperty2 = dcbBossproperty2 == null ? null : dcbBossproperty2.trim();
    }
}