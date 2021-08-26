package com.paraprolead.service;


import com.paraprolead.model.Category;
import com.paraprolead.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository cRepo;


    @Override
    public Category getCategoryById(Long cid) {
        return cRepo.getById(cid);
    }

    @Override
    public List<Category> getAllCategories() {
        return cRepo.findAll();
    }

    @Override
    public void deleteCategory(Long cid) {
            cRepo.deleteById(cid);
    }

    @Override
    public Category createCategory(Category cat) {
        return cRepo.save(cat);
    }

    @Override
    public Category updateCategory(Category cat) {
        return cRepo.save(cat);
    }

}
