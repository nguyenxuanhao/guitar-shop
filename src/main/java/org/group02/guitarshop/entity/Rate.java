package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="RATE")
public class Rate implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Number_Of_Stars")
  private double numberOfStars;

  @Column(name="Id_Product")
  private long idProduct;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getNumberOfStars() {
    return numberOfStars;
  }

  public void setNumberOfStars(double numberOfStars) {
    this.numberOfStars = numberOfStars;
  }


  public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }

}
