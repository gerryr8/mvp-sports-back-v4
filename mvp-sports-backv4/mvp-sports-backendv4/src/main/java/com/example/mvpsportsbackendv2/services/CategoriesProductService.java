package com.example.mvpsportsbackendv2.services;

import com.example.mvpsportsbackendv2.models.CategoriesProductsModel;
import com.example.mvpsportsbackendv2.models.CategoryModel;
import com.example.mvpsportsbackendv2.models.ProductModel;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

public interface CategoriesProductService {

    public List<CategoriesProductsModel> findAll();

    public CategoriesProductsModel save(CategoriesProductsModel categoriesProductsModel);

    Iterable<CategoriesProductsModel> getUserBy(Long id_category);

    List<CategoriesProductsModel> findByCategories(String category, Pageable pageable);

    List<CategoriesProductsModel> findAll(Pageable pageable);
}
