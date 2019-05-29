package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
    private int id;
    private String name;
    private Double price;
    private Integer discountAmount;
    private Double averageRate;
    private String imageThumbnail;
    private String status;
    private String modelNumber;
    private String description;
    private String style;
    private String material;
    private String warrantyPeriod;
    private String stringMaterial;
    private Timestamp createdTime;
    private Integer idCategory;
    private Integer idManufacturer;
    private String metadata;
    private Collection<InvoiceDetail> invoiceDetailsById;
    private Category categoryByIdCategory;
    private Manufacturer manufacturerByIdManufacturer;
    private Collection<ProductImage> productImagesById;
    private Collection<Rate> ratesById;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Price", nullable = true)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Discount_Amount", nullable = true)
    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column(name = "Average_Rate", nullable = true, precision = 0)
    public Double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(Double averageRate) {
        this.averageRate = averageRate;
    }

    @Basic
    @Column(name = "Image_Thumbnail", nullable = true, length = 2147483647)
    public String getImageThumbnail() {
        return imageThumbnail;
    }

    public void setImageThumbnail(String imageThumbnail) {
        this.imageThumbnail = imageThumbnail;
    }

    @Basic
    @Column(name = "Status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Model_Number", nullable = true, length = 255)
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = 1255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "Style", nullable = true, length = 255)
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Basic
    @Column(name = "Material", nullable = true, length = 255)
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Basic
    @Column(name = "Warranty_Period", nullable = true, length = 255)
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Basic
    @Column(name = "String_Material", nullable = true, length = 255)
    public String getStringMaterial() {
        return stringMaterial;
    }

    public void setStringMaterial(String stringMaterial) {
        this.stringMaterial = stringMaterial;
    }

    @Basic
    @Column(name = "Created_Time", nullable = true)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "Id_Category", nullable = true)
    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "Id_Manufacturer", nullable = true)
    public Integer getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(Integer idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    @Basic
    @Column(name = "Metadata", nullable = true, length = 255)
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(discountAmount, product.discountAmount) &&
                Objects.equals(averageRate, product.averageRate) &&
                Objects.equals(imageThumbnail, product.imageThumbnail) &&
                Objects.equals(status, product.status) &&
                Objects.equals(modelNumber, product.modelNumber) &&
                Objects.equals(description, product.description) &&
                Objects.equals(style, product.style) &&
                Objects.equals(material, product.material) &&
                Objects.equals(warrantyPeriod, product.warrantyPeriod) &&
                Objects.equals(stringMaterial, product.stringMaterial) &&
                Objects.equals(createdTime, product.createdTime) &&
                Objects.equals(idCategory, product.idCategory) &&
                Objects.equals(idManufacturer, product.idManufacturer) &&
                Objects.equals(metadata, product.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, discountAmount, averageRate, imageThumbnail, status, modelNumber, description, style, material, warrantyPeriod, stringMaterial, createdTime, idCategory, idManufacturer, metadata);
    }

    @OneToMany(mappedBy = "productByIdProduct")
    public Collection<InvoiceDetail> getInvoiceDetailsById() {
        return invoiceDetailsById;
    }

    public void setInvoiceDetailsById(Collection<InvoiceDetail> invoiceDetailsById) {
        this.invoiceDetailsById = invoiceDetailsById;
    }

    @ManyToOne
    @JoinColumn(name = "Id_Category", referencedColumnName = "Id", insertable = false, updatable = false)
    public Category getCategoryByIdCategory() {
        return categoryByIdCategory;
    }

    public void setCategoryByIdCategory(Category categoryByIdCategory) {
        this.categoryByIdCategory = categoryByIdCategory;
    }

    @ManyToOne
    @JoinColumn(name = "Id_Manufacturer", referencedColumnName = "Id", insertable = false, updatable = false)
    public Manufacturer getManufacturerByIdManufacturer() {
        return manufacturerByIdManufacturer;
    }

    public void setManufacturerByIdManufacturer(Manufacturer manufacturerByIdManufacturer) {
        this.manufacturerByIdManufacturer = manufacturerByIdManufacturer;
    }

    @OneToMany(mappedBy = "productByIdProduct")
    public Collection<ProductImage> getProductImagesById() {
        return productImagesById;
    }

    public void setProductImagesById(Collection<ProductImage> productImagesById) {
        this.productImagesById = productImagesById;
    }

    @OneToMany(mappedBy = "productByIdProduct")
    public Collection<Rate> getRatesById() {
        return ratesById;
    }

    public void setRatesById(Collection<Rate> ratesById) {
        this.ratesById = ratesById;
    }
}
