package com.crm.vo;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class UserVO implements Serializable {

    //用户主键id
    private int uid;

    //用户名字
    private String uname;

    //用户密码
    private String upassord;

    //用户电话
    private String uphone;

    //用户邮箱
    private String uemall;

    //进入公司时间
    private String ubegintime;

    //辞职时间
    private String uendtime;

    //用户状态（1管理员2客户3已不在公司）
    private int ustate;

    public UserVO(int uid, String uname, String upassord, String uphone, String uemall, String ubegintime, String uendtime, int ustate) {
        this.uid = uid;
        this.uname = uname;
        this.upassord = upassord;
        this.uphone = uphone;
        this.uemall = uemall;
        this.ubegintime = ubegintime;
        this.uendtime = uendtime;
        this.ustate = ustate;
    }

    public UserVO() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassord() {
        return upassord;
    }

    public void setUpassord(String upassord) {
        this.upassord = upassord;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemall() {
        return uemall;
    }

    public void setUemall(String uemall) {
        this.uemall = uemall;
    }

    public String getUbegintime() {
        return ubegintime;
    }

    public void setUbegintime(String ubegintime) {
        this.ubegintime = ubegintime;
    }

    public String getUendtime() {
        return uendtime;
    }

    public void setUendtime(String uendtime) {
        this.uendtime = uendtime;
    }

    public int getUstate() {
        return ustate;
    }

    public void setUstate(int ustate) {
        this.ustate = ustate;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassord='" + upassord + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uemall='" + uemall + '\'' +
                ", ubegintime='" + ubegintime + '\'' +
                ", uendtime='" + uendtime + '\'' +
                ", ustate=" + ustate +
                '}';
    }
}
