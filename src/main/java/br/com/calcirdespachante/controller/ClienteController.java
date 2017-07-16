package br.com.calcirdespachante.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.calcirdespachante.model.Cliente;
import br.com.calcirdespachante.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@RequestMapping("/CadastroCliente")
	public ModelAndView cadastroCliente(Cliente cliente) {
		ModelAndView mv = new ModelAndView("cadastroclientes");

		return mv;

	}

	@PostMapping("/CadastroCliente")
	public ModelAndView salvarCadastroCliente(@Valid Cliente cliente, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return cadastroCliente(cliente);
		}

		clienteService.salvarCliente(cliente);
		attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
		return new ModelAndView("redirect:/CadastroCliente");
	}
	
	@GetMapping("/ListarClientes")
	public ModelAndView listarClientes() {
		ModelAndView mv = new ModelAndView("listaclientes");
		mv.addObject("clientes", clienteService.findAll());
		return mv;
				
	}

}
