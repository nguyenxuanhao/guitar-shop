package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ADMIN")

public class Admin  implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Name")
  private String name;

  @Column(name="Username")
  private String username;

  @Column(name="Password")
  private String password;

  @Column(name="Avatar")
  private String avatar;


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


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

}
