package org.group02.guitarshop.model;

public class InvoiceDetail {

  private long idInvoice;
  private long idProduct;
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
