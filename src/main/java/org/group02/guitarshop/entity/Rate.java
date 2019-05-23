package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "RATE", schema = "dbo", catalog = "GUITARSHOP")
public class Rate {
    private int id;
    private Double numberOfStars;
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
    @Column(name = "Number_Of_Stars", nullable = true, precision = 0)
    public Double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(Double numberOfStars) {
        this.numberOfStars = numberOfStars;
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
        Rate rate = (Rate) o;
        return id == rate.id &&
                Objects.equals(numberOfStars, rate.numberOfStars) &&
                Objects.equals(idProduct, rate.idProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfStars, idProduct);
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
