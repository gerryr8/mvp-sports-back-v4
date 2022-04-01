package com.example.mvpsportsbackendv2.models;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_category;

    private String category;

    public CategoryModel() {
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }


    public String getCategory_name() {
        return category;
    }

    public void setCategory_name(String category_name) {
        this.category = category_name;
    }
}




