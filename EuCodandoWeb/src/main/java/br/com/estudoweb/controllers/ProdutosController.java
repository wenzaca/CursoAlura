package br.com.estudoweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.estudoweb.DAO.ProdutoDAO;
import br.com.estudoweb.models.Produto;
import br.com.estudoweb.models.TipoPreco;

@Controller
public class ProdutosController {

	// Serve para que nós não nos preocupemos em criar manualmente o ProdutoDAO
	// no Controller. pedimos para o Spring uma instância do objeto que foi
	// anotado. Esse recurso é chamado de injeção de dependência e está
	// disponível para qualquer Bean do Spring.
	@Autowired
	private ProdutoDAO produtoDAO;

	@RequestMapping("/produtos/form")
	public ModelAndView form() {

		// Quando utilizamos o ModelAndView, além de retornarmos as páginas,
		// temos a possibilidade de enviar objetos de qualquer classe para a
		// página caso seja necessário, e então, exibir suas informações.
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}

	@RequestMapping(value="/produtos", method=RequestMethod.POST)
	public String gravar(Produto produto) {
		System.out.println(produto);
		produtoDAO.gravar(produto);
		return "produtos/ok";

	}

	@RequestMapping(value="/produtos", method=RequestMethod.GET)
	public ModelAndView listar() {
		List<Produto> produtos = produtoDAO.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}

}
