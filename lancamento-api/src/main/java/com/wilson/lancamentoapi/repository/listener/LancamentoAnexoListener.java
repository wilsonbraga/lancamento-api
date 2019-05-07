package com.wilson.lancamentoapi.repository.listener;

import javax.persistence.PostLoad;

import org.springframework.util.StringUtils;

import com.wilson.lancamentoapi.LancamentoApiApplication;
import com.wilson.lancamentoapi.model.Lancamento;
import com.wilson.lancamentoapi.storage.S3;

public class LancamentoAnexoListener {
	
	@PostLoad
	public void postLoad(Lancamento lancamento) {
		if(StringUtils.hasText(lancamento.getAnexo())) {
			S3 s3 = LancamentoApiApplication.getBean(S3.class);
			lancamento.setUrlAnexo(s3.configurarUrl(lancamento.getAnexo()));
		}
	}
}
