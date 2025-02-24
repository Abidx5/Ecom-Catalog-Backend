package com.crack.ecomcatalog.service;


import com.crack.ecomcatalog.model.Category;
import com.crack.ecomcatalog.repository.CategoryRespository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRespository categoryRespository;

    public CategoryService(CategoryRespository categoryRespository) {
        this.categoryRespository = categoryRespository;
    }


    public List<Category> getAllCategories() {
        return categoryRespository.findAll();
    }
}
