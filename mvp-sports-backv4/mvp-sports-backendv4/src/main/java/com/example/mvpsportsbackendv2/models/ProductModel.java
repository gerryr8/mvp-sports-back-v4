package com.example.mvpsportsbackendv2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.jfr.Category;

import javax.persistence.*;

@Entity
@Table(name="products")

public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long product_number;

   // @Size(min = 4, max = 100)
   // @NotEmpty (message = "Completa este campo")
    private String name;

   // @NotEmpty (message = "Completa este campo")
   private Double price;

  //@NotEmpty (message = "Completa este campo")
    private String stock;

    //@Size(min = 8, max = 250, message = "No más de 250 caracteres")
    //@NotEmpty (message = "Completa este campo")
   private  String description;

    private  String thumbnail;


    private String image;

   // @NotEmpty (message = "Completa este campo")
   private Double weight;

   @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
  @JoinColumn(name = "id_category")
   private CategoryModel category;

    public Long getProduct_number() {
        return product_number;
    }

    public void setProduct_number(Long product_number) {
        this.product_number = product_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }
}
