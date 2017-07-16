package br.com.calcirdespachante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.calcirdespachante.model.Cliente;
import br.com.calcirdespachante.repository.ClientesRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public void salvarCliente(Cliente cliente){
		clientesRepository.save(cliente);		
	}
	
	 public List<Cliente> findAll() {
	        return clientesRepository.findAll();
	    }
	
	


}
