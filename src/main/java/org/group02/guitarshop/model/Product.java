package org.group02.guitarshop.model;


public class Product {

  private long id;
  private String name;
  private String price;
  private long discountAmount;
  private double averageRate;
  private String imageThumbnail;
  private String status;
  private String modelNumber;
  private String description;
  private String style;
  private String material;
  private String warrantyPeriod;
  private String stringMaterial;
  private java.sql.Timestamp createdTime;
  private long idCategory;
  private long idManufacturer;
  private String metadata;


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


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public long getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(long discountAmount) {
    this.discountAmount = discountAmount;
  }


  public double getAverageRate() {
    return averageRate;
  }

  public void setAverageRate(double averageRate) {
    this.averageRate = averageRate;
  }


  public String getImageThumbnail() {
    return imageThumbnail;
  }

  public void setImageThumbnail(String imageThumbnail) {
    this.imageThumbnail = imageThumbnail;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }


  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }


  public String getWarrantyPeriod() {
    return warrantyPeriod;
  }

  public void setWarrantyPeriod(String warrantyPeriod) {
    this.warrantyPeriod = warrantyPeriod;
  }


  public String getStringMaterial() {
    return stringMaterial;
  }

  public void setStringMaterial(String stringMaterial) {
    this.stringMaterial = stringMaterial;
  }


  public java.sql.Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(java.sql.Timestamp createdTime) {
    this.createdTime = createdTime;
  }


  public long getIdCategory() {
    return idCategory;
  }

  public void setIdCategory(long idCategory) {
    this.idCategory = idCategory;
  }


  public long getIdManufacturer() {
    return idManufacturer;
  }

  public void setIdManufacturer(long idManufacturer) {
    this.idManufacturer = idManufacturer;
  }


  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

}
