package org.group02.guitarshop.service;

import java.util.List;

import org.group02.guitarshop.entity.Product;
import org.group02.guitarshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class ProductServiceImpl implements ProductService {
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private ProductRepository repository;

    @Override
    public Product getProductById(Integer id) {
        Product product = repository.findById(id).get();
        return product;
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
