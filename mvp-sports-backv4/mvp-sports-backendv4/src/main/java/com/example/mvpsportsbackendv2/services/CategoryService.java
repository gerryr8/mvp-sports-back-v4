package com.example.mvpsportsbackendv2.services;

import com.example.mvpsportsbackendv2.models.CategoryModel;
import com.example.mvpsportsbackendv2.models.ProductModel;

import java.util.List;

public interface CategoryService {

    public CategoryModel save(CategoryModel categoryModel);

    public CategoryModel findById(Long id_category);

    public List<CategoryModel> findAll();


}
