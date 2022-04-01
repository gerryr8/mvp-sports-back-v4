package com.example.mvpsportsbackendv2.models;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.RowId;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "customers")

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    int customer_id;

    //@Size(min = 8, max = 50, message=" Introduce tu nombre completo")
    //@NotEmpty(message="Este campo es obligatorio")
    String full_name;

    //@Email
    //@NotEmpty(message="Este campo es obligatorio")
    String email;


    String password;

    //@NotEmpty(message="Este campo es obligatorio")
    String username;

   // @Size(min = 10, max = 12)
   // @Digits(fraction = 0, integer = 12)
   // @NotEmpty(message="Este campo es obligatorio")

    String phone;

   // @NotEmpty(message="Este campo es obligatorio")
    String country;

    //@NotEmpty(message="Este campo es obligatorio")
    //@Size(min = 10, max = 200, message=" Introduce tu direccion correctamente")
    String shipping_address;

    @NotEmpty
    String role;

    public UsuarioModel() {
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }
    
}