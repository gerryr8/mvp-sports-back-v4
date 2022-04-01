package com.example.mvpsportsbackendv2.services;

import com.example.mvpsportsbackendv2.models.ProductModel;

import java.util.List;

public interface ProductService {

    public ProductModel save(ProductModel productModel);

    public ProductModel findById(Long product_number);

    public List<ProductModel> findAll();

    public void delete(Long product_number);
}
