package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Category;

import java.util.List;

public interface CategoryService {

    Category getCategoryById(Integer id);
    List<Category> getAllCategories();

}