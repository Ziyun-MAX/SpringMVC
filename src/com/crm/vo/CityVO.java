package com.crm.vo;

import java.io.Serializable;

/**
 * 城市实体类(省市二级)
 */
public class CityVO implements Serializable {

    //城市主键id
    private int id;

    //用户地址
    private String address;

    //上级地址id
    private int pid;

    public CityVO() {
    }

    public CityVO(int id, String address, int pid) {
        this.id = id;
        this.address = address;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "CityVO{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", pid=" + pid +
                '}';
    }
}
