package com.crm.vo;


public class RoleMenu {

  private long rmId;
  private long rmRoleid;
  private long rmMenuid;

  public RoleMenu(long rmId, long rmRoleid, long rmMenuid) {
    this.rmId = rmId;
    this.rmRoleid = rmRoleid;
    this.rmMenuid = rmMenuid;
  }
  public RoleMenu(){}
  public long getRmId() {
    return rmId;
  }

  public void setRmId(long rmId) {
    this.rmId = rmId;
  }


  public long getRmRoleid() {
    return rmRoleid;
  }

  public void setRmRoleid(long rmRoleid) {
    this.rmRoleid = rmRoleid;
  }


  public long getRmMenuid() {
    return rmMenuid;
  }

  public void setRmMenuid(long rmMenuid) {
    this.rmMenuid = rmMenuid;
  }

  @Override
  public String toString() {
    return "RoleMenu{" +
            "rmId=" + rmId +
            ", rmRoleid=" + rmRoleid +
            ", rmMenuid=" + rmMenuid +
            '}';
  }
}
