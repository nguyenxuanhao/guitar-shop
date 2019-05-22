package org.group02.guitarshop.service;

import java.util.ArrayList;
import java.util.List;

import org.group02.guitarshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.group02.guitarshop.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class ProductServiceImpl implements ProductService {

    @PersistenceContext
    EntityManager entityManager;

    // Implementing Constructor based DI
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        List list = new ArrayList();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Product getProductById(Integer id) {
        Product product = repository.findById(id).get();
        return product;
    }

    @Override
    public Integer addProduct(Product product) {
        try {
            repository.save(product);
            return product.getId();
        } catch (Exception ex) {
            return 0;
        }
    }

    @Override
    public boolean removeProduct(Integer id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public List<Product> getMostDiscountProducts() {
        Query query = entityManager.createNativeQuery("SELECT TOP(8) * FROM PRODUCT as pd ORDER BY pd.Discount_Amount DESC", Product.class);
        return query.getResultList();
    }

    @Override
    public List<Product> getNewestProducts() {
        Query query = entityManager.createNativeQuery("SELECT TOP(8) * FROM PRODUCT as pd ORDER BY pd.Created_Time DESC", Product.class);
        return query.getResultList();
    }
}
