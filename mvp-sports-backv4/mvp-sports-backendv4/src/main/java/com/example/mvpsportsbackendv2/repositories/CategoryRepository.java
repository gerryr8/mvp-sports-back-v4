package com.example.mvpsportsbackendv2.repositories;

import com.example.mvpsportsbackendv2.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

}
