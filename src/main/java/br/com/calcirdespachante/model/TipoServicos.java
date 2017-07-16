package br.com.calcirdespachante.model;

public enum TipoServicos {

	EMPLACAMENTO(100.00), 
	DOCUMENTACAO_DE_FROTAS(100.00), 
	TRANSFERENCIAS(100.00), 
	TRANSFERENCIA_DE_PRONTUARIO(100.00), 
	RENOVACAO_DE_CNH(100.00), 
	LICENCIAMENTO(100.00), 
	TRANSFERENCIA_DE_UF(100.00), 
	SUBSTITUICAO_DE_LACRE_DANIFICADO(100.00), 
	CADASTRO_CHASSI_E_MOTOR(100.00);

	private Double taxa;

	private TipoServicos(Double taxa) {
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

}
