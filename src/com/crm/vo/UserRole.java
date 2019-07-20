package com.crm.vo;


public class UserRole {

  private long urId;
  private long urUid;
  private long urRid;

  public UserRole(long urId, long urUid, long urRid) {
    this.urId = urId;
    this.urUid = urUid;
    this.urRid = urRid;
  }
  public UserRole(){}
  public long getUrId() {
    return urId;
  }

  public void setUrId(long urId) {
    this.urId = urId;
  }


  public long getUrUid() {
    return urUid;
  }

  public void setUrUid(long urUid) {
    this.urUid = urUid;
  }


  public long getUrRid() {
    return urRid;
  }

  public void setUrRid(long urRid) {
    this.urRid = urRid;
  }

  @Override
  public String toString() {
    return "UserRole{" +
            "urId=" + urId +
            ", urUid=" + urUid +
            ", urRid=" + urRid +
            '}';
  }
}
