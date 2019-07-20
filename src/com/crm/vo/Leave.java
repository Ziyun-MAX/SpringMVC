package com.crm.vo;


public class Leave {

  private long eId;
  private String eContent;
  private long eHand;
  private long eSendid;
  private long eState;

  public Leave(long eId, String eContent, long eHand, long eSendid, long eState) {
    this.eId = eId;
    this.eContent = eContent;
    this.eHand = eHand;
    this.eSendid = eSendid;
    this.eState = eState;
  }
  public Leave(){}
  public long getEId() {
    return eId;
  }

  public void setEId(long eId) {
    this.eId = eId;
  }


  public String getEContent() {
    return eContent;
  }

  public void setEContent(String eContent) {
    this.eContent = eContent;
  }


  public long getEHand() {
    return eHand;
  }

  public void setEHand(long eHand) {
    this.eHand = eHand;
  }


  public long getESendid() {
    return eSendid;
  }

  public void setESendid(long eSendid) {
    this.eSendid = eSendid;
  }


  public long getEState() {
    return eState;
  }

  public void setEState(long eState) {
    this.eState = eState;
  }

  @Override
  public String toString() {
    return "Leave{" +
            "eId=" + eId +
            ", eContent='" + eContent + '\'' +
            ", eHand=" + eHand +
            ", eSendid=" + eSendid +
            ", eState=" + eState +
            '}';
  }
}
