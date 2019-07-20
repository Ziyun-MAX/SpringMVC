package com.crm.vo;


public class City {

  private long dId;
  private String dAddress;
  private long dPid;

  public City(long dId, String dAddress, long dPid) {
    this.dId = dId;
    this.dAddress = dAddress;
    this.dPid = dPid;
  }
  public City(){}
  public long getDId() {
    return dId;
  }

  public void setDId(long dId) {
    this.dId = dId;
  }


  public String getDAddress() {
    return dAddress;
  }

  public void setDAddress(String dAddress) {
    this.dAddress = dAddress;
  }


  public long getDPid() {
    return dPid;
  }

  public void setDPid(long dPid) {
    this.dPid = dPid;
  }

  @Override
  public String toString() {
    return "City{" +
            "dId=" + dId +
            ", dAddress='" + dAddress + '\'' +
            ", dPid=" + dPid +
            '}';
  }
}
