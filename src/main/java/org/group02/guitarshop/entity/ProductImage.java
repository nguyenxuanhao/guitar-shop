package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT_IMAGE", schema = "dbo", catalog = "GUITARSHOP")
public class ProductImage {
    private int id;
    private String data;
    private Integer idProduct;
    private Product productByIdProduct;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Data", nullable = true, length = 2147483647)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Id_Product", nullable = true)
    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductImage that = (ProductImage) o;
        return id == that.id &&
                Objects.equals(data, that.data) &&
                Objects.equals(idProduct, that.idProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, idProduct);
    }

    @ManyToOne
    @JoinColumn(name = "Id_Product", referencedColumnName = "Id", insertable = false, updatable = false)
    public Product getProductByIdProduct() {
        return productByIdProduct;
    }

    public void setProductByIdProduct(Product productByIdProduct) {
        this.productByIdProduct = productByIdProduct;
    }
}
