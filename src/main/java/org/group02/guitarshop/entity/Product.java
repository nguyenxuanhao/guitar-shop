package org.group02.guitarshop.entity;


import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="price", nullable=false)
    private String price;

    @Column(name="discountAmount", nullable=false)
    private long discountAmount;

    @Column(name="averageRate", nullable=false)
    private double averageRate;

    @Column(name="imageThumbnail", nullable=false)
    private String imageThumbnail;

    @Column(name="status", nullable=false)
    private String status;

    @Column(name="modelNumber", nullable=false)
    private String modelNumber;

    @Column(name="description", nullable=false)
    private String description;

    @Column(name="style", nullable=false)
    private String style;

    @Column(name="material", nullable=false)
    private String material;

    @Column(name="warrantyPeriod", nullable=false)
    private String warrantyPeriod;

    @Column(name="stringMaterial", nullable=false)
    private String stringMaterial;

    @Column(name="createdTime", nullable=false)
    private java.sql.Timestamp createdTime;

    @Column(name="idCategory", nullable=false)
    private long idCategory;

    @Column(name="idManufacturer", nullable=false)
    private long idManufacturer;

    @Column(name="zzz", nullable=false)
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