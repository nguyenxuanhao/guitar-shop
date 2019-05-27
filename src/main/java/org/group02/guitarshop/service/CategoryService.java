package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Category;
import org.group02.guitarshop.entity.Product;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public interface CategoryService {

    Category getCategoryById(int id);
    Category getCategoryByMetadata(String metadata);
    int getQuantityByIdCategory(int id);
    List<Category> getAllCategories();
    List<Product> getListProduct(int id, String manufacturer, String style, int minPrice, int maxPrice);
    Map<String, Integer> getListOfManufacturerNamesAndQuantity(int id);
    Map<String, Integer> getListOfStylesAndQuantity(int id);
}