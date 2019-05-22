package org.group02.guitarshop.service;

import java.util.ArrayList;
import java.util.List;

import org.group02.guitarshop.entity.Manufacturer;
import org.group02.guitarshop.entity.Product;
import org.group02.guitarshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    private EntityManager entityManager;

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
    public List<Manufacturer> getAllManufacturers() {
        List list = new ArrayList();
        repository.findAll().forEach(e -> list.add(e.getManufacturerByIdManufacturer()));
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

//    @Override
//    public List<Product> getMostDiscountProducts() {
//        Query query = entityManager.createNativeQuery("SELECT * FROM GUITARSHOP.PRODUCT as pd  " +
//                "WHERE em.firstname LIKE ?", Employee.class);
//        query.setParameter(1, firstName + "%");
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Product> getNewestDiscountProducts() {
//        Query query = entityManager.createNativeQuery("SELECT * FROM GUITARSHOP.PRODUCT as pd  " +
//                "WHERE em.firstname LIKE ?", Employee.class);
//        query.setParameter(1, firstName + "%");
//        return query.getResultList();
//    }

}
