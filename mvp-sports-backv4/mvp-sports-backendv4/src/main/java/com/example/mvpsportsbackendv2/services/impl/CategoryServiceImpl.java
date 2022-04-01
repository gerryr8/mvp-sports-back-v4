package com.example.mvpsportsbackendv2.services.impl;

import com.example.mvpsportsbackendv2.models.CategoriesProductsModel;
import com.example.mvpsportsbackendv2.models.CategoryModel;
import com.example.mvpsportsbackendv2.models.ProductModel;
import com.example.mvpsportsbackendv2.repositories.CategoriesProductRepository;
import com.example.mvpsportsbackendv2.repositories.CategoryRepository;
import com.example.mvpsportsbackendv2.services.CategoriesProductService;
import com.example.mvpsportsbackendv2.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {

@Autowired
private CategoryRepository categoryRepository;

    @Override
    public CategoryModel save(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    @Override
    public CategoryModel findById(Long id_category) {
        return categoryRepository.findById(id_category).orElse(null);
    }

    @Override
    public List<CategoryModel> findAll() {
        return categoryRepository.findAll();
    }
}
