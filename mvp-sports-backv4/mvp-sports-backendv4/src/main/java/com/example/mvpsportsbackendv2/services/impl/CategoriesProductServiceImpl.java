package com.example.mvpsportsbackendv2.services.impl;


import com.example.mvpsportsbackendv2.models.CategoriesProductsModel;
import com.example.mvpsportsbackendv2.models.ProductModel;
import com.example.mvpsportsbackendv2.repositories.CategoriesProductRepository;
import com.example.mvpsportsbackendv2.services.CategoriesProductService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;
import java.util.Collections;

import java.util.Collections;
import java.util.List;


@Service public class CategoriesProductServiceImpl implements CategoriesProductService {

    @Autowired
    private CategoriesProductRepository categoriesProductRepository;

    @Autowired CategoriesProductService categoriesProductService;


    @Override
    public List<CategoriesProductsModel> findAll() {
        return categoriesProductRepository.findAll();
    }

    @Override
    public CategoriesProductsModel save(CategoriesProductsModel categoriesProductsModel) {
        return categoriesProductRepository.save(categoriesProductsModel);
    }

    @Override
    public Iterable<CategoriesProductsModel> getUserBy(Long id_category) {
        return null;
    }

    //@Override
   // public Iterable<CategoriesProductsModel> getUserBy(Long id_category) {
   //     return categoriesProductRepository.findAllById(Collections.singleton(id_category));
   // }

    @Override
    public List<CategoriesProductsModel> findByCategories(String category, Pageable pageable) {
        if (category == null) {
            return categoriesProductService.findAll(pageable);
        } else {
            return categoriesProductService.findByCategories(category, pageable);
        }
    }


    @Override
    public List<CategoriesProductsModel> findAll(Pageable pageable) {
        return categoriesProductService.findAll(pageable);
    }


    //  @Override
  //  public Iterable<CategoriesProductsModel> getUserBy(int id) {
   //     return categoriesProductRepository.findAllById(Collections.singleton(id));
   // }

   // @Override
    //public List<CategoriesProductsModel> findByCategory(CategoriesProductsModel category) {
      //  return categoriesProductRepository.findAll();
    //}


}
