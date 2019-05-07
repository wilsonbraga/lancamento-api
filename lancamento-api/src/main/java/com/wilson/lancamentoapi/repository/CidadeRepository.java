package com.wilson.lancamentoapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilson.lancamentoapi.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	List<Cidade> findByEstadoCodigo(Long estadoCodigo);
}
