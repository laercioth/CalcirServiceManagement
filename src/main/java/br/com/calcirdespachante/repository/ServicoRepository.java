package br.com.calcirdespachante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.calcirdespachante.model.Servico;
import br.com.calcirdespachante.dto.ServicoSomado;
import br.com.calcirdespachante.model.TipoServicos;

public interface ServicoRepository extends JpaRepository<Servico, Long> {


    Long countBytipoServico(TipoServicos tipoServico);

    @Query(value = "SELECT new br.com.calcirdespachante.dto.ServicoSomado(" +
            "	s.id, " +
            "   s.tipoServico, " +
            "	sum(s.valorCobrado), " +
            "	sum(s.valorTaxa),	" +
            "	sum(s.lucro))" +
            " 	from Servico s " +
            " 	GROUP BY s.id, s.tipoServico")
    List<ServicoSomado> findServicoSomado();

}
