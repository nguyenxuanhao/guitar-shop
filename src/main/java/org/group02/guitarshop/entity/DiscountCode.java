package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="DISCOUNT_CODE")
public class DiscountCode implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Code")
  private String code;

  @Column(name="Discount_Amount")
  private long discountAmount;

  @Column(name="Start_Date")
  private java.sql.Timestamp startDate;

  @Column(name="End_Date")
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
