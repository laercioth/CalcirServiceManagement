package br.com.calcirdespachante.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "SERVICO")
public class Servico {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(length = 60, name = "descricao")
	private String descricao;

	@Column(name = "valor_taxa")
	private Double valorTaxa;

	@Column(name = "valor_cobrado")
	private Double valorCobrado;

	@Column(name = "lucro")
	private Double lucro;

	@Column(name = "status_servico")
	@Enumerated(EnumType.STRING)
	private StatusServico status;

	@Column(name = "data_registro")
	@DateTimeFormat(pattern = "mm/DD/yyyy")
	private Date dataRegistro;

	@Column(name = "data_finalizacao")
	@DateTimeFormat(pattern = "mm/DD/yyyy")
	private Date dataFinalizacao;

	@Column(name = "cpf_cliente")
	private String cpfCliente;

	@Column(name = "tipo_servico")
	@Enumerated(EnumType.STRING)
	private TipoServicos tipoServico;

	public TipoServicos getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServicos tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public StatusServico getStatus() {
		return status;
	}

	public void setStatus(StatusServico status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(Double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public Double getLucro() {
		return lucro;
	}

	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
