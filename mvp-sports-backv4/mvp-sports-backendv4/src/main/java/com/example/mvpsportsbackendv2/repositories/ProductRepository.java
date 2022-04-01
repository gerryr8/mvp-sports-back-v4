package com.example.mvpsportsbackendv2.repositories;

import com.example.mvpsportsbackendv2.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.io.DataInputStream;
import java.io.FileInputStream;

//public interface ProductRepository extends CrudRepository<ProductModel, Long> {

public interface ProductRepository extends JpaRepository<ProductModel, Long> {


}

  //  @Override
  //  Iterable<ProductModel> findAll();
