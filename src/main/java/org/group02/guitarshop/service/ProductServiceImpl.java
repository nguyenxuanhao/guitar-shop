package org.group02.guitarshop.service;

import java.util.ArrayList;
import java.util.List;

import org.group02.guitarshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.group02.guitarshop.entity.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    // Implementing Constructor based DI
    private ProductRepository repository;

    public ProductServiceImpl() { }

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        List list = new ArrayList();
        repository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Product getProductById(Long id) {
        Product product = repository.findById(id).get();
        return product;
    }

    @Override
    public boolean addProduct(Product product) {
        try {
            repository.save(product);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean removeProduct(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
