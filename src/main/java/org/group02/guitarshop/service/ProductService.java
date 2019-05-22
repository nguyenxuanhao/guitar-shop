package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Manufacturer;
import org.group02.guitarshop.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Integer id);
    List<Product> getMostDiscountProducts();
    List<Product> getNewestProducts();

}