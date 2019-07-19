package com.crm.vo;

import java.io.Serializable;

/**
 * 角色实体类
 */
public class RoleVO implements Serializable {

    //角色主键rid
    private int rid;

    //角色名称
    private String rname;

    public RoleVO(int rid, String rname) {
        this.rid = rid;
        this.rname = rname;
    }

    public RoleVO() {
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "RoleVO{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }
}
