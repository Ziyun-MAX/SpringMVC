package com.crm.vo;

import java.io.Serializable;

/**
 * 邮箱实体类
 */
public class MailVO implements Serializable {

    //邮箱主键mid
    private int mid;

    //邮箱内容
    private String mcontent;

    //指用户id(发信息的人)
    private int uid;

    //地址
    private int addresseeid;

    //邮箱类别(1:意见邮箱，2:离职邮箱)
    private int mcategory;

    //状态(1:已查看，2：未查看，3：批准)
    private int state;

    public MailVO(int mid, String mcontent, int uid, int addresseeid, int mcategory, int state) {
        this.mid = mid;
        this.mcontent = mcontent;
        this.uid = uid;
        this.addresseeid = addresseeid;
        this.mcategory = mcategory;
        this.state = state;
    }

    public MailVO() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAddresseeid() {
        return addresseeid;
    }

    public void setAddresseeid(int addresseeid) {
        this.addresseeid = addresseeid;
    }

    public int getMcategory() {
        return mcategory;
    }

    public void setMcategory(int mcategory) {
        this.mcategory = mcategory;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MailVO{" +
                "mid=" + mid +
                ", mcontent='" + mcontent + '\'' +
                ", uid=" + uid +
                ", addresseeid=" + addresseeid +
                ", mcategory=" + mcategory +
                ", state=" + state +
                '}';
    }
}
