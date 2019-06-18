package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "INVOICE_DETAIL")
public class InvoiceDetail implements Serializable {
    @EmbeddedId
    private InvoiceDetailIdentity invoiceDetailIdentity;

    @Column(name = "Quantity", nullable = true)
    private Integer quantity;

    public InvoiceDetail() { }

    public InvoiceDetail(InvoiceDetailIdentity invoiceDetailIdentity, Integer quantity) {
        this.invoiceDetailIdentity = invoiceDetailIdentity;
        this.quantity = quantity;
    }

    public InvoiceDetail(int idInvoice, int idProduct, Integer quantity) {
        InvoiceDetailIdentity invoiceDetailIdentity = new InvoiceDetailIdentity(idInvoice, idProduct);
        this.invoiceDetailIdentity = invoiceDetailIdentity;
        this.quantity = quantity;
    }

    @MapsId("idInvoice")
    @ManyToOne
    @JoinColumn(name = "Id_Invoice", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    private Invoice invoiceByIdInvoice;

    @MapsId("idProduct")
    @ManyToOne
    @JoinColumn(name = "Id_Product", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    private Product productByIdProduct;
}
