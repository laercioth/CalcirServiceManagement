package br.com.calcirdespachante.dto;

import java.util.Date;

import br.com.calcirdespachante.model.TipoServicos;


public class ServicoSomado {

	
	private Long id;

	private TipoServicos tipoServico;

	private Double sumValorCobrado;

	private Double sumValorTaxa;

	private Double sumLucro;


	public ServicoSomado(){
		super();
	}



	public ServicoSomado(Long id, TipoServicos tipoServico, Double sumValorCobrado, Double sumValorTaxa, Double sumLucro) {
		super();
		this.id = id;
		this.tipoServico = tipoServico;
		this.sumValorCobrado = sumValorCobrado;
		this.sumValorTaxa = sumValorTaxa;
		this.sumLucro = sumLucro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoServicos getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServicos tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Double getSumValorCobrado() {
		return sumValorCobrado;
	}

	public void setSumValorCobrado(Double sumValorCobrado) {
		this.sumValorCobrado = sumValorCobrado;
	}

	public Double getSumValorTaxa() {
		return sumValorTaxa;
	}

	public void setSumValorTaxa(Double sumValorTaxa) {
		this.sumValorTaxa = sumValorTaxa;
	}

	public Double getSumLucro() {
		return sumLucro;
	}

	public void setSumLucro(Double sumLucro) {
		this.sumLucro = sumLucro;
	}
}
