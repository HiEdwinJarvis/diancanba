package com.jarvis.diancanba.base.entity;

import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/2/1 19:26
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/1 19:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NoteList {

    private List<Note> noteList;

    private Float money;

    //新增备注信息
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private int status;//是否已付款

    public int getStatus() {
        return status;
    }



    public void setStatus(int status) {
        this.status = status;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
