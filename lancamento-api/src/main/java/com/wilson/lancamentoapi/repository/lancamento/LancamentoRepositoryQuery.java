package com.wilson.lancamentoapi.repository.lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wilson.lancamentoapi.dto.LancamentoEstatisticaCategoria;
import com.wilson.lancamentoapi.dto.LancamentoEstatisticaDia;
import com.wilson.lancamentoapi.dto.LancamentoEstatisticaPessoa;
import com.wilson.lancamentoapi.dto.LancamentoEstatisticaSoma;
import com.wilson.lancamentoapi.model.Lancamento;
import com.wilson.lancamentoapi.repository.filter.LancamentoFilter;
import com.wilson.lancamentoapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	
	public List<LancamentoEstatisticaPessoa> porPessoa(LocalDate inicio, LocalDate fim);
	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);
	public List<LancamentoEstatisticaSoma> somaTipo(BigDecimal soma);
	
	public Page<Lancamento> filtra(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
