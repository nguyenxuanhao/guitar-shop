package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Manufacturer;
import org.group02.guitarshop.entity.Product;

import java.util.List;

public interface ProductService {

    Integer addProduct(Product p);
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    boolean removeProduct(Integer id);
    List<Manufacturer> getAllManufacturers();

//    List<Product> getMostDiscountProducts();
//    List<Product> getNewestDiscountProducts();

}