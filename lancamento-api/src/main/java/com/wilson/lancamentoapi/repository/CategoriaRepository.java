package com.wilson.lancamentoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilson.lancamentoapi.model.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
