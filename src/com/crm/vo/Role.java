package com.crm.vo;


public class Role {

  private long rId;
  private String rName;

  public Role(long rId, String rName) {
    this.rId = rId;
    this.rName = rName;
  }
  public Role(){}
  public long getRId() {
    return rId;
  }

  public void setRId(long rId) {
    this.rId = rId;
  }


  public String getRName() {
    return rName;
  }

  public void setRName(String rName) {
    this.rName = rName;
  }

  @Override
  public String toString() {
    return "Role{" +
            "rId=" + rId +
            ", rName='" + rName + '\'' +
            '}';
  }
}
