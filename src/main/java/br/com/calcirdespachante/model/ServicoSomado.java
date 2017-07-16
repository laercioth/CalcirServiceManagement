package br.com.calcirdespachante.model;

import java.util.Date;


public class ServicoSomado {

	
	private Long id;

	private String tipoServico;

	private double sumValorCobrado;

	private double sumValorTaxa;

	private double sumLucro;

	private Date mesAno;
	
	public ServicoSomado(){
		
	}



	public ServicoSomado(Long id, String tipoServico, double sumValorCobrado, double sumValorTaxa, double sumLucro,
			Date mesAno) {
		super();
		this.id = id;
		this.tipoServico = tipoServico;
		this.sumValorCobrado = sumValorCobrado;
		this.sumValorTaxa = sumValorTaxa;
		this.sumLucro = sumLucro;
		this.mesAno = mesAno;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public double getSumValorCobrado() {
		return sumValorCobrado;
	}

	public void setSumValorCobrado(double sumValorCobrado) {
		this.sumValorCobrado = sumValorCobrado;
	}

	public double getSumValorTaxa() {
		return sumValorTaxa;
	}

	public void setSumValorTaxa(double sumValorTaxa) {
		this.sumValorTaxa = sumValorTaxa;
	}

	public double getSumLucro() {
		return sumLucro;
	}

	public void setSumLucro(double sumLucro) {
		this.sumLucro = sumLucro;
	}

	public Date getMesAno() {
		return mesAno;
	}

	public void setMesAno(Date mesAno) {
		this.mesAno = mesAno;
	}
	
	
	

}
