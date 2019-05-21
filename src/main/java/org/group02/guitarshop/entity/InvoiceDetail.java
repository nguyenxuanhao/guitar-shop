package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="INVOICE_DETAIL")
public class InvoiceDetail implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="Id_Invoice")
  private long idInvoice;

  @Column(name="Id_Product")
  private long idProduct;

  @Column(name="Quantity")
  private long quantity;


  public long getIdInvoice() {
    return idInvoice;
  }

  public void setIdInvoice(long idInvoice) {
    this.idInvoice = idInvoice;
  }


  public long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(long idProduct) {
    this.idProduct = idProduct;
  }


  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

}
