package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="INVOICE")
public class Invoice implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Customer_Name")
  private String customerName;

  @Column(name="Customer_Email")
  private String customerEmail;

  @Column(name="Customer_Phone")
  private String customerPhone;

  @Column(name="Customer_Address")
  private String customerAddress;

  @Column(name="Customer_Message")
  private String customerMessage;

  @Column(name="Total")
  private String total;

  @Column(name="Payment_Method")
  private String paymentMethod;

  @Column(name="Created_Time")
  private java.sql.Timestamp createdTime;

  @Column(name="Id_User")
  private long idUser;

  @Column(name="Id_Discount_Code")
  private long idDiscountCode;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }


  public String getCustomerMessage() {
    return customerMessage;
  }

  public void setCustomerMessage(String customerMessage) {
    this.customerMessage = customerMessage;
  }


  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public java.sql.Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(java.sql.Timestamp createdTime) {
    this.createdTime = createdTime;
  }


  public long getIdUser() {
    return idUser;
  }

  public void setIdUser(long idUser) {
    this.idUser = idUser;
  }


  public long getIdDiscountCode() {
    return idDiscountCode;
  }

  public void setIdDiscountCode(long idDiscountCode) {
    this.idDiscountCode = idDiscountCode;
  }

}
