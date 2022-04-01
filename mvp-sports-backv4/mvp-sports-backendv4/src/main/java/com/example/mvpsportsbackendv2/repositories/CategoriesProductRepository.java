package com.example.mvpsportsbackendv2.repositories;

import com.example.mvpsportsbackendv2.models.CategoriesProductsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface CategoriesProductRepository extends JpaRepository<CategoriesProductsModel, String> {


}
