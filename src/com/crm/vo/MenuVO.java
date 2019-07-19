package com.crm.vo;

import java.io.Serializable;

/**
 * 菜单实体类
 */
public class MenuVO implements Serializable {

    //菜单mid
    private int mid;

    //菜单名称
    private String mname;

    //上级菜单名称
    private int pid;

    public MenuVO(int mid, String mname, int pid) {
        this.mid = mid;
        this.mname = mname;
        this.pid = pid;
    }

    public MenuVO() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "MenuVO{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", pid=" + pid +
                '}';
    }
}
