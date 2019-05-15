package org.group02.guitarshop.model;


public class Rate {

  private long id;
  private double numberOfStars;
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
