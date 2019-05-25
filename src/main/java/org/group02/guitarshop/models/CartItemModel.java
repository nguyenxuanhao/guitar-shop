package org.group02.guitarshop.models;

import org.group02.guitarshop.entity.Product;

public class CartItemModel {

    private Product product;
    private Integer quantity;

    public CartItemModel() {
    }

    public CartItemModel(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {

        return product;
    }

    public void setProduct(Product product) {

        this.product = product;
    }

    public Integer getQuantity() {

        return quantity;
    }

    public void setQuantity(Integer quantity) {

        this.quantity = quantity;
    }
}
