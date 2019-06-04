package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = true, columnDefinition="nvarchar(255)")
    private String name;

    @Column(name = "Price", nullable = true)
    private Double price;

    @Column(name = "Discount_Amount", nullable = true)
    private Integer discountAmount;

    @Column(name = "Average_Rate", nullable = true, precision = 0)
    private Double averageRate;

    @Lob
    @Column(name = "Image_Thumbnail", nullable = true)
    private String imageThumbnail;

    @Column(name = "Status", nullable = true, columnDefinition="nvarchar(255)")
    private String status;

    @Column(name = "Model_Number", nullable = true, length = 255)
    private String modelNumber;

    @Column(name = "Description", nullable = true, columnDefinition="nvarchar(1255)")
    private String description;

    @Column(name = "Style", nullable = true, columnDefinition="nvarchar(255)")
    private String style;

    @Column(name = "Material", nullable = true, columnDefinition="nvarchar(255)")
    private String material;

    @Column(name = "Warranty_Period", nullable = true, columnDefinition="nvarchar(255)")
    private String warrantyPeriod;

    @Column(name = "String_Material", nullable = true, columnDefinition="nvarchar(255)")
    private String stringMaterial;

    @Column(name = "Created_Time", nullable = true)
    private Timestamp createdTime;

    @Column(name = "Id_Category", nullable = true)
    private Integer idCategory;

    @Column(name = "Id_Manufacturer", nullable = true)
    private Integer idManufacturer;

    @Column(name = "Metadata", nullable = true, columnDefinition="nvarchar(255)")
    private String metadata;

    @OneToMany(mappedBy = "productByIdProduct")
    private Collection<InvoiceDetail> invoiceDetailsById;

    @ManyToOne
    @JoinColumn(name = "Id_Category", referencedColumnName = "Id", insertable = false, updatable = false)
    private Category categoryByIdCategory;

    @ManyToOne
    @JoinColumn(name = "Id_Manufacturer", referencedColumnName = "Id", insertable = false, updatable = false)
    private Manufacturer manufacturerByIdManufacturer;

    @OneToMany(mappedBy = "productByIdProduct")
    private Collection<ProductImage> productImagesById;

    @OneToMany(mappedBy = "productByIdProduct")
    private Collection<Rate> ratesById;

}
