package com.crm.vo;


import java.sql.Date;

public class User {

  private long uId;
  private String uName;
  private String uPassword;
  private String uPhone;
  private String uEmall;
  private long uState;
  private Date uBegintime;
  private Date uEndtime;
  private long uCityid;

  public User(long uId, String uName, String uPassword, String uPhone, String uEmall, long uState, Date uBegintime, Date uEndtime, long uCityid) {
    this.uId = uId;
    this.uName = uName;
    this.uPassword = uPassword;
    this.uPhone = uPhone;
    this.uEmall = uEmall;
    this.uState = uState;
    this.uBegintime = uBegintime;
    this.uEndtime = uEndtime;
    this.uCityid = uCityid;
  }
  public User(){}
  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getUName() {
    return uName;
  }

  public void setUName(String uName) {
    this.uName = uName;
  }


  public String getUPassword() {
    return uPassword;
  }

  public void setUPassword(String uPassword) {
    this.uPassword = uPassword;
  }


  public String getUPhone() {
    return uPhone;
  }

  public void setUPhone(String uPhone) {
    this.uPhone = uPhone;
  }


  public String getUEmall() {
    return uEmall;
  }

  public void setUEmall(String uEmall) {
    this.uEmall = uEmall;
  }


  public long getUState() {
    return uState;
  }

  public void setUState(long uState) {
    this.uState = uState;
  }


  public Date getUBegintime() {
    return uBegintime;
  }

  public void setUBegintime(Date uBegintime) {
    this.uBegintime = uBegintime;
  }


  public Date getUEndtime() {
    return uEndtime;
  }

  public void setUEndtime(Date uEndtime) {
    this.uEndtime = uEndtime;
  }


  public long getUCityid() {
    return uCityid;
  }

  public void setUCityid(long uCityid) {
    this.uCityid = uCityid;
  }

  @Override
  public String toString() {
    return "User{" +
            "uId=" + uId +
            ", uName='" + uName + '\'' +
            ", uPassword='" + uPassword + '\'' +
            ", uPhone='" + uPhone + '\'' +
            ", uEmall='" + uEmall + '\'' +
            ", uState=" + uState +
            ", uBegintime=" + uBegintime +
            ", uEndtime=" + uEndtime +
            ", uCityid=" + uCityid +
            '}';
  }
}
