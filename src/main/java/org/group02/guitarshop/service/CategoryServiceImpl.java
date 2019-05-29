package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Category;
import org.group02.guitarshop.entity.Product;
import org.group02.guitarshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Service
public class CategoryServiceImpl implements CategoryService {
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private CategoryRepository repository;

    @Override
    public Category getCategoryById(int id){
        return repository.findById(id).get();
    }

    @Override
    public Category getCategoryByMetadata(String metadata) {
        List<Category> categories = entityManager.createNativeQuery("SELECT * FROM CATEGORY WHERE Metadata = ?", Category.class)
                                    .setParameter(1, metadata)
                                    .getResultList();

        return categories.get(0);
    }

    @Override
    public int getQuantityByIdCategory(int idCategory) {
        List<Integer> quantities = entityManager.createNativeQuery("SELECT COUNT(Id_Category) FROM PRODUCT WHERE Id_Category = ?")
                                   .setParameter(1, idCategory)
                                   .getResultList();
        return quantities.get(0);
    }

    @Override
    public List<Category> getAllCategories(){
        return repository.findAll();
    }

    @Override
    public List<Product> getListProduct(int idCategory, String manufacturer, String style, int minPrice, int maxPrice) {
        List<Product> listProduct = entityManager.createNativeQuery("SELECT p.* FROM PRODUCT p INNER JOIN MANUFACTURER m ON p.Id_Manufacturer = m.Id " +
                "WHERE p.Id_Category = ?1 AND m.Name = IIF(?2 IS NULL, m.Name, ?2) AND p.Style = IIF(?3 IS NULL, p.Style, ?3) AND p.Price >= IIF(?4 = 0, 0, ?4) AND p.Price <= IIF(?5 = 10000000, 10000000, ?5)" +
                "ORDER BY p.Id", Product.class)
                .setParameter(1, idCategory)
                .setParameter(2, manufacturer.equals("All") ? null : manufacturer)
                .setParameter(3, style.equals("All") ? null : style)
                .setParameter(4, minPrice)
                .setParameter(5, maxPrice)
                .getResultList();

        return listProduct;
    }

    @Override
    public Map<String, Integer> getListOfManufacturerNamesAndQuantity(int idCategory) {
        List<Object[]> list = entityManager.createNativeQuery("SELECT m.Name, COUNT(m.Name) FROM PRODUCT p INNER JOIN MANUFACTURER m ON p.Id_Manufacturer = m.Id WHERE Id_Category = ? GROUP BY m.Name ORDER BY m.Name")
                              .setParameter(1, idCategory)
                              .getResultList();

        Map<String, Integer> ListOfManufacturerNamesAndQuantity = new HashMap<>();

        for (Object[] item : list) {
            ListOfManufacturerNamesAndQuantity.put((String) item[0], ((Number)item[1]).intValue());
        }

        return ListOfManufacturerNamesAndQuantity;
    }

    @Override
    public Map<String, Integer> getListOfStylesAndQuantity(int idCategory) {
        List<Object[]> list = entityManager.createNativeQuery("SELECT Style, COUNT(Style) FROM PRODUCT WHERE Id_Category = ? GROUP BY Style ORDER BY Style")
                              .setParameter(1, idCategory)
                              .getResultList();

        Map<String, Integer> ListOfStylesAndQuantity = new HashMap<>();

        for (Object[] item : list) {
            ListOfStylesAndQuantity.put((String) item[0], ((Number)item[1]).intValue());
        }

        return ListOfStylesAndQuantity;
    }
}
