package com.crm.vo;

import java.io.Serializable;
import java.util.Date;

public class ContractbleVO implements Serializable {

    //合同id
    private int id;

    //客户id
    private int cid;

    //员工id
    private int sid;

    //提交合同时间
    private Date time;

    //合同状态(1：成交，2：未付款)
    private int state;

    public ContractbleVO(int id, int cid, int sid, Date time, int state) {
        this.id = id;
        this.cid = cid;
        this.sid = sid;
        this.time = time;
        this.state = state;
    }

    public ContractbleVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ContractbleVO{" +
                "id=" + id +
                ", cid=" + cid +
                ", sid=" + sid +
                ", time=" + time +
                ", state=" + state +
                '}';
    }
}
