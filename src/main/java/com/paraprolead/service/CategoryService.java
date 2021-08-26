package com.paraprolead.service;



import com.paraprolead.model.Category;

import java.util.List;

public interface CategoryService {

    Category getCategoryById(Long cid);
    List<Category> getAllCategories();
    void deleteCategory(Long cid);
    Category createCategory(Category cat);
    Category updateCategory(Category cat);
}
