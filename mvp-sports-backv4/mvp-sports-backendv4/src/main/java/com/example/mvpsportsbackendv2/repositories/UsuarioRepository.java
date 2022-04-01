package com.example.mvpsportsbackendv2.repositories;

import java.util.ArrayList;

import com.example.mvpsportsbackendv2.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}