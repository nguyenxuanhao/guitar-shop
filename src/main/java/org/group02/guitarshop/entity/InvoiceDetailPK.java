package org.group02.guitarshop.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class InvoiceDetailPK implements Serializable {
    private int idInvoice;
    private int idProduct;

    @Column(name = "Id_Invoice", nullable = false)
    @Id
    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    @Column(name = "Id_Product", nullable = false)
    @Id
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceDetailPK that = (InvoiceDetailPK) o;
        return idInvoice == that.idInvoice &&
                idProduct == that.idProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInvoice, idProduct);
    }
}
