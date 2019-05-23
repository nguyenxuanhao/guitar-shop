package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "INVOICE_DETAIL", schema = "dbo", catalog = "GUITARSHOP")
@IdClass(InvoiceDetailPK.class)
public class InvoiceDetail {
    private int idInvoice;
    private int idProduct;
    private Integer quantity;
    private Invoice invoiceByIdInvoice;
    private Product productByIdProduct;

    @Id
    @Column(name = "Id_Invoice", nullable = false)
    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    @Id
    @Column(name = "Id_Product", nullable = false)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "Quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceDetail that = (InvoiceDetail) o;
        return idInvoice == that.idInvoice &&
                idProduct == that.idProduct &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvoice, idProduct, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "Id_Invoice", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public Invoice getInvoiceByIdInvoice() {
        return invoiceByIdInvoice;
    }

    public void setInvoiceByIdInvoice(Invoice invoiceByIdInvoice) {
        this.invoiceByIdInvoice = invoiceByIdInvoice;
    }

    @ManyToOne
    @JoinColumn(name = "Id_Product", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public Product getProductByIdProduct() {
        return productByIdProduct;
    }

    public void setProductByIdProduct(Product productByIdProduct) {
        this.productByIdProduct = productByIdProduct;
    }
}
