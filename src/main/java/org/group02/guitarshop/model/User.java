package org.group02.guitarshop.model;


public class User {

  private long id;
  private String name;
  private String email;
  private String password;
  private String address;
  private String phone;
  private String avatar;
  private java.sql.Timestamp participationTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public java.sql.Timestamp getParticipationTime() {
    return participationTime;
  }

  public void setParticipationTime(java.sql.Timestamp participationTime) {
    this.participationTime = participationTime;
  }

}
