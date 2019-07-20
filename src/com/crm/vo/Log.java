package com.crm.vo;


import java.sql.Date;

public class Log {

  private long lId;
  private long lYid;
  private long lKid;
  private Date lTime;
  private String lContent;

  public Log(long lId, long lYid, long lKid, Date lTime, String lContent) {
    this.lId = lId;
    this.lYid = lYid;
    this.lKid = lKid;
    this.lTime = lTime;
    this.lContent = lContent;
  }
  public Log(){}
  public long getLId() {
    return lId;
  }

  public void setLId(long lId) {
    this.lId = lId;
  }


  public long getLYid() {
    return lYid;
  }

  public void setLYid(long lYid) {
    this.lYid = lYid;
  }


  public long getLKid() {
    return lKid;
  }

  public void setLKid(long lKid) {
    this.lKid = lKid;
  }


  public Date getLTime() {
    return lTime;
  }

  public void setLTime(Date lTime) {
    this.lTime = lTime;
  }


  public String getLContent() {
    return lContent;
  }

  public void setLContent(String lContent) {
    this.lContent = lContent;
  }

  @Override
  public String toString() {
    return "Log{" +
            "lId=" + lId +
            ", lYid=" + lYid +
            ", lKid=" + lKid +
            ", lTime=" + lTime +
            ", lContent='" + lContent + '\'' +
            '}';
  }
}
