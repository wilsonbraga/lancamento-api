package com.wilson.lancamentoapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.lancamentoapi.model.Cidade;
import com.wilson.lancamentoapi.repository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
public class CidadeResorce {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public List<Cidade> pesquisar(@RequestParam Long estado){
		return cidadeRepository.findByEstadoCodigo(estado);
	}
	
}
