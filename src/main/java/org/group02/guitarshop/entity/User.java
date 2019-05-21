package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USER")
public class User implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Name")
  private String name;

  @Column(name="Email")
  private String email;

  @Column(name="Password")
  private String password;

  @Column(name="Address")
  private String address;

  @Column(name="Phone")
  private String phone;

  @Column(name="Avatar")
  private String avatar;

  @Column(name="Participation_Time")
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
