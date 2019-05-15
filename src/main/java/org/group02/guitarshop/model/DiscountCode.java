package org.group02.guitarshop.model;


public class DiscountCode {

  private long id;
  private String code;
  private long discountAmount;
  private java.sql.Timestamp startDate;
  private java.sql.Timestamp endDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public long getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(long discountAmount) {
    this.discountAmount = discountAmount;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

}
