package org.group02.guitarshop.model;

public class Invoice {

  private long id;
  private String customerName;
  private String customerEmail;
  private String customerPhone;
  private String customerAddress;
  private String customerMessage;
  private String total;
  private String paymentMethod;
  private java.sql.Timestamp createdTime;
  private long idUser;
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
