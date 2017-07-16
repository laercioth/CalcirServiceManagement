package br.com.calcirdespachante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.calcirdespachante.model.Servico;
import br.com.calcirdespachante.model.ServicoSomado;
import br.com.calcirdespachante.model.StatusServico;
import br.com.calcirdespachante.model.TipoServicos;
import br.com.calcirdespachante.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;

	public void salvarServico(Servico servico) {

		if (servico.getStatus().toString().isEmpty()) {
			servico.setStatus(StatusServico.MONTAGEM);
		}

		try {
			if (!servico.getValorTaxa().isNaN()) {
				System.out.println("e numero " + servico.getValorTaxa());
				double valor = servico.getValorTaxa();
				servico.setValorTaxa(valor);
			}
		} catch (NullPointerException e) {

			System.out.println("NullPointerException e");
			Double taxaFixa = servico.getTipoServico().getTaxa();
			servico.setValorTaxa(taxaFixa);

		}

		double lucro = servico.getValorCobrado() - servico.getValorTaxa();
		servico.setLucro(lucro);

		servicoRepository.save(servico);
		
		
	}

	public List<Servico> findAll() {
		return servicoRepository.findAll();
	}

	public Long countTipoServico(TipoServicos tipoServico) {
		return servicoRepository.countBytipoServico(tipoServico);
	}

	public Servico findOne(Long id) {
		return servicoRepository.findOne(id);
	}

	public List<ServicoSomado> sumServico() {
		return servicoRepository.findServicoSomado();
	}

}
