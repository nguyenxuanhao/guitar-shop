package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUCT_IMAGE")
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Data", nullable = true)
    private String data;

    @Column(name = "Id_Product", nullable = true)
    private Integer idProduct;

    @ManyToOne
    @JoinColumn(name = "Id_Product", referencedColumnName = "Id", insertable = false, updatable = false)
    private Product productByIdProduct;

 }
