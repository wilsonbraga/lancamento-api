package com.wilson.lancamentoapi.dto;

import java.math.BigDecimal;

import com.wilson.lancamentoapi.model.TipoLancamento;

public class LancamentoEstatisticaSoma {

	private TipoLancamento tipo;
	private BigDecimal total;

	public LancamentoEstatisticaSoma(TipoLancamento tipo, BigDecimal total) {

		this.tipo = tipo;
		this.total = total;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
