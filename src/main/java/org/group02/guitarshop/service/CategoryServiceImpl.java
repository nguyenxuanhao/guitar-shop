package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Category;
import org.group02.guitarshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private CategoryRepository repository;

    public Category getCategoryById(Integer id){
        return repository.findById(id).get();
    }
    public List<Category> getAllCategories(){
        return repository.findAll();
    }

}
