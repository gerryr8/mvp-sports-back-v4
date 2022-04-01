package com.example.mvpsportsbackendv2.services.impl;

import com.example.mvpsportsbackendv2.models.ProductModel;
import com.example.mvpsportsbackendv2.repositories.ProductRepository;
import com.example.mvpsportsbackendv2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    @Override
    public ProductModel findById(Long product_number) {
        return productRepository.findById(product_number).orElse(null);
    }

    @Override
    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(Long product_number) {
        productRepository.deleteById(product_number);

    }
}
