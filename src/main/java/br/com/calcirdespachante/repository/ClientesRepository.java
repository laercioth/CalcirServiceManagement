package br.com.calcirdespachante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.calcirdespachante.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {
	
	public Cliente findByCpf(String cpf);

}
