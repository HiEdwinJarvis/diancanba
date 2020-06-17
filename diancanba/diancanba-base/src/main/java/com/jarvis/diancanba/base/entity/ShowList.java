package com.jarvis.diancanba.base.entity;

import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/2/4 16:06
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/4 16:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ShowList {

    /**
     * 放入redis
     * 给后台显示
     * 让厨师可以看到已付款的菜品
     * */

    private String id;

    private Long restausrantId;

    private float money;
    private int tableNum;//第几桌的

    //备注信息
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private int status;//状态，0：未做，1：已做，2：用户已收到

    private List<Note> noteList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRestausrantId() {
        return restausrantId;
    }

    public void setRestausrantId(Long restausrantId) {
        this.restausrantId = restausrantId;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

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
}
