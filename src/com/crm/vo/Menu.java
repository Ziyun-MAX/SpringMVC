package com.crm.vo;


public class Menu {

  private long mId;
  private String mName;
  private long mPid;

  public Menu(long mId, String mName, long mPid) {
    this.mId = mId;
    this.mName = mName;
    this.mPid = mPid;
  }
  public Menu(){}
  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public String getMName() {
    return mName;
  }

  public void setMName(String mName) {
    this.mName = mName;
  }


  public long getMPid() {
    return mPid;
  }

  public void setMPid(long mPid) {
    this.mPid = mPid;
  }

  @Override
  public String toString() {
    return "Menu{" +
            "mId=" + mId +
            ", mName='" + mName + '\'' +
            ", mPid=" + mPid +
            '}';
  }
}
