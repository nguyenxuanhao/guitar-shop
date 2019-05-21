package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PRODUCT_IMAGE")
public class ProductImage implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id")
  private long id;

  @Column(name="Data")
  private String data;

  @Column(name="Id_Product")
  private long idProduct;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }

}
