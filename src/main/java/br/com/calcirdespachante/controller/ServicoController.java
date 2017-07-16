package br.com.calcirdespachante.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.calcirdespachante.model.Servico;
import br.com.calcirdespachante.model.StatusServico;
import br.com.calcirdespachante.model.TipoServicos;
import br.com.calcirdespachante.service.ServicoService;

@Controller
public class ServicoController {

	@Autowired
	private ServicoService servicoService;

	@GetMapping(value = "/SolicitarServicos")
	public ModelAndView cadastroServico(Servico servico) {
		ModelAndView mv = new ModelAndView("solicitarservicos");
		mv.addObject("tipoServicos", TipoServicos.values());
		mv.addObject("statusServico", StatusServico.values());
		mv.addObject(servico);
		return mv;

	}

	@PostMapping("/SolicitarServicos/novo")
	public ModelAndView salvarServico(@Valid Servico servico, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return cadastroServico(servico);
		}

		servicoService.salvarServico(servico);
		attributes.addFlashAttribute("mensagem", "Serviço registrado com sucesso!");
		return new ModelAndView("redirect:/SolicitarServicos");

	}

	@RequestMapping(value = "/ListarServicos")
	public ModelAndView listarServicos() {
		ModelAndView mv = new ModelAndView("listaservicos");
		mv.addObject("statusServico", StatusServico.values());
		mv.addObject("servicos", servicoService.findAll());
		return mv;

	}

	@GetMapping("/AtualizarServico/{id}")
	public ModelAndView atualizarServico(@PathVariable Long id) {
		Servico servico = servicoService.findOne(id);
		return atualizarServico(servico);

	}

	@RequestMapping(value = "/SolicitarServicos")
	public ModelAndView atualizarServico(Servico servico) {
		ModelAndView mv = new ModelAndView("atualizarservico");
		mv.addObject("tipoServicos", TipoServicos.values());
		mv.addObject("statusServico", StatusServico.values());
		mv.addObject("servicos", servicoService.findAll());
		mv.addObject(servico);
		return mv;

	}
	

	@RequestMapping(value="/ServicosFinanceiro")
	public ModelAndView listarServicosFinanceiro() {
		ModelAndView mv = new ModelAndView("financeiro");
		mv.addObject("statusServico", StatusServico.values());
		mv.addObject("tipoServicos", TipoServicos.values());
		mv.addObject("servicosSomado", servicoService.sumServico());
		return mv;
				
	}

}
