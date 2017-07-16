package br.com.calcirdespachante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.calcirdespachante.model.Servico;
import br.com.calcirdespachante.model.ServicoSomado;
import br.com.calcirdespachante.model.TipoServicos;

public interface ServicoRepository extends JpaRepository<Servico, Long>{

		
		Long countBytipoServico(TipoServicos tipoServico);
		
	
		@Query(value = "select new br.com.calcirdespachante.model.ServicoSomado(tipo_servico, sum(valor_cobrado) , "
				+ "	sum(valor_taxa) , sum(lucro)  , "
				+ "	to_char(data_registro, 'mm/yyyy') )"
				+ " from servico  "
				+ " group by tipo_servico, to_char(data_registro, 'mm/yyyy') " )
	    List<ServicoSomado> findServicoSomado();
		    
		    
}
