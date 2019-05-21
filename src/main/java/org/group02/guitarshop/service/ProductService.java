package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Product;

import java.util.List;

public interface ProductService {

    boolean addProduct(Product p);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    boolean removeProduct(Long id);

}