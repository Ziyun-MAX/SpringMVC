package com.crm.vo;


public class Client {

  private long kId;
  private String kName;
  private String kPhone;
  private String kGs;
  private String kQq;
  private long kCtiyid;
  private long kUser;
  private long kState;

  public Client(long kId, String kName, String kPhone, String kGs, String kQq, long kCtiyid, long kUser, long kState) {
    this.kId = kId;
    this.kName = kName;
    this.kPhone = kPhone;
    this.kGs = kGs;
    this.kQq = kQq;
    this.kCtiyid = kCtiyid;
    this.kUser = kUser;
    this.kState = kState;
  }
  public Client(){}
  public long getKId() {
    return kId;
  }

  public void setKId(long kId) {
    this.kId = kId;
  }


  public String getKName() {
    return kName;
  }

  public void setKName(String kName) {
    this.kName = kName;
  }


  public String getKPhone() {
    return kPhone;
  }

  public void setKPhone(String kPhone) {
    this.kPhone = kPhone;
  }


  public String getKGs() {
    return kGs;
  }

  public void setKGs(String kGs) {
    this.kGs = kGs;
  }


  public String getKQq() {
    return kQq;
  }

  public void setKQq(String kQq) {
    this.kQq = kQq;
  }


  public long getKCtiyid() {
    return kCtiyid;
  }

  public void setKCtiyid(long kCtiyid) {
    this.kCtiyid = kCtiyid;
  }


  public long getKUser() {
    return kUser;
  }

  public void setKUser(long kUser) {
    this.kUser = kUser;
  }


  public long getKState() {
    return kState;
  }

  public void setKState(long kState) {
    this.kState = kState;
  }

  @Override
  public String toString() {
    return "Client{" +
            "kId=" + kId +
            ", kName='" + kName + '\'' +
            ", kPhone='" + kPhone + '\'' +
            ", kGs='" + kGs + '\'' +
            ", kQq='" + kQq + '\'' +
            ", kCtiyid=" + kCtiyid +
            ", kUser=" + kUser +
            ", kState=" + kState +
            '}';
  }
}
