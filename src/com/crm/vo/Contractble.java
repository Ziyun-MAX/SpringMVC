package com.crm.vo;


import java.sql.Date;

public class Contractble {

  private long cId;
  private long cKid;
  private long cYid;
  private Date cTime;
  private long cState;
  private String cContent;
  private Date cEndtime;

  public Contractble(long cId, long cKid, long cYid, Date cTime, long cState, String cContent, Date cEndtime) {
    this.cId = cId;
    this.cKid = cKid;
    this.cYid = cYid;
    this.cTime = cTime;
    this.cState = cState;
    this.cContent = cContent;
    this.cEndtime = cEndtime;
  }
  public Contractble(){}
  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public long getCKid() {
    return cKid;
  }

  public void setCKid(long cKid) {
    this.cKid = cKid;
  }


  public long getCYid() {
    return cYid;
  }

  public void setCYid(long cYid) {
    this.cYid = cYid;
  }


  public Date getCTime() {
    return cTime;
  }

  public void setCTime(Date cTime) {
    this.cTime = cTime;
  }


  public long getCState() {
    return cState;
  }

  public void setCState(long cState) {
    this.cState = cState;
  }


  public String getCContent() {
    return cContent;
  }

  public void setCContent(String cContent) {
    this.cContent = cContent;
  }


  public Date getCEndtime() {
    return cEndtime;
  }

  public void setCEndtime(Date cEndtime) {
    this.cEndtime = cEndtime;
  }

  @Override
  public String toString() {
    return "Contractble{" +
            "cId=" + cId +
            ", cKid=" + cKid +
            ", cYid=" + cYid +
            ", cTime=" + cTime +
            ", cState=" + cState +
            ", cContent='" + cContent + '\'' +
            ", cEndtime=" + cEndtime +
            '}';
  }
}
