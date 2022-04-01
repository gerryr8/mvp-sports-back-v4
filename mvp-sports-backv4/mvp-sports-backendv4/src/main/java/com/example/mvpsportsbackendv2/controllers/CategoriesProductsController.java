package com.example.mvpsportsbackendv2.controllers;

import com.example.mvpsportsbackendv2.models.CategoryModel;
import com.example.mvpsportsbackendv2.models.ProductModel;
import com.example.mvpsportsbackendv2.repositories.CategoriesProductRepository;
import com.example.mvpsportsbackendv2.services.CategoriesProductService;
import com.example.mvpsportsbackendv2.services.CategoryService;
import com.example.mvpsportsbackendv2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("api/v1/catpro")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriesProductsController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoriesProductService categoriesProductService;

     @Autowired
    CategoriesProductRepository categoriesProductRepository;


    @GetMapping("/categorieslist")
    public ResponseEntity<List<com.example.mvpsportsbackendv2.models.CategoriesProductsModel>> listAllCategories(){
        return new ResponseEntity<>(categoriesProductService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findcategory")
    public Iterable<com.example.mvpsportsbackendv2.models.CategoriesProductsModel> listAllByCategories
            (@RequestParam("id_category") Long id_category){
        return categoriesProductService.getUserBy(id_category);
    }

    /*@GetMapping("/findbycategory")
    public List<com.example.mvpsportsbackendv2.models.CategoriesProductsModel> findpByCategory(
            @RequestParam("category") String category, Pageable pageable) {
        if (category == null) {
            return categoriesProductService.findAll(pageable);
        } else {
            return categoriesProductService.findByCategories(category, pageable);

        }
    }*/
}
