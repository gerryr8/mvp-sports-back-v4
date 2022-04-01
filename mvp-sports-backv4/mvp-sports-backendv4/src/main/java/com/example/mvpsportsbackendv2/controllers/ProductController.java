package com.example.mvpsportsbackendv2.controllers;

import com.example.mvpsportsbackendv2.models.CategoriesProductsModel;
import com.example.mvpsportsbackendv2.models.CategoryModel;
import com.example.mvpsportsbackendv2.models.ProductModel;
import com.example.mvpsportsbackendv2.repositories.ProductRepository;
import com.example.mvpsportsbackendv2.services.CategoriesProductService;
import com.example.mvpsportsbackendv2.services.CategoryService;
import com.example.mvpsportsbackendv2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
@CrossOrigin(origins = "http://localhost:4200")

public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoriesProductService categoriesProductService;

    @GetMapping("/list")
    public ResponseEntity<List<ProductModel>> listProducts(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryModel>> listCategories(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/categorieslist")
    public ResponseEntity<List<CategoriesProductsModel>> listAllCategories(){
        return new ResponseEntity<>(categoriesProductService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findcategory")
    public Iterable<CategoriesProductsModel> listAllByCategories
            (@RequestParam("id_category") Long id_category){
        return categoriesProductService.getUserBy(id_category);
    }
/*
    @GetMapping("/findbycategory")
    public Page<CategoriesProductsModel> findpProductsByCategory(
            @RequestParam("category") String category, Pageable pageable) {
        if (category == null) {
            return categoriesProductService.findAll(pageable);
        } else {
            return categoriesProductService.findByCategories(category, pageable);

        }
    }
*/


//
  //  @GetMapping("/findByCategory")
    ////  return new ResponseEntity<>(categoriesProductService.findByCategory(category), HttpStatus.OK);
  //  }




   // @GetMapping("/getusersby")
   // public Iterable<UserModel> findById(@RequestParam("id") int id){
   //     return userService.getUserBy(id);
    //}



    @PostMapping("/add")
    public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel productModel){
        return new ResponseEntity<>(productService.save(productModel), HttpStatus.CREATED);
    }

    @PostMapping("/new")
    public ResponseEntity<CategoriesProductsModel> addAll(@RequestBody CategoriesProductsModel categoriesProductsModel){
        return new ResponseEntity<>(categoriesProductService.save(categoriesProductsModel), HttpStatus.CREATED);
    }


    @PutMapping("/update/{product_number}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable Long product_number, @RequestBody ProductModel productModel){
        ProductModel productFound = productService.findById(product_number);

        if (productFound == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            productFound.setName(productModel.getName());
            productFound.setDescription(productModel.getDescription());
            productFound.setPrice(productModel.getPrice());
            productFound.setImage(productFound.getImage());
            productFound.setThumbnail(productModel.getThumbnail());
            productFound.setWeight(productModel.getWeight());
            productFound.setStock(productModel.getStock());
            return new ResponseEntity<>(productService.save(productFound), HttpStatus.CREATED);
        }catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}
