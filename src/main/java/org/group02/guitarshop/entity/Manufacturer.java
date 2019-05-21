package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="MANUFACTURER")
public class Manufacturer implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Name")
  private String name;

  @Column(name="Country")
  private String country;


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


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
