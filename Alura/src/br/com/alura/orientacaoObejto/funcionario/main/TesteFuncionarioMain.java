package br.com.alura.orientacaoObejto.funcionario.main;

import br.com.alura.orientacaoObejto.funcionario.entidades.Desenvolvedor;
import br.com.alura.orientacaoObejto.funcionario.entidades.Funcionario;
import br.com.alura.orientacaoObejto.funcionario.entidades.Gerente;
import br.com.alura.orientacaoObejto.funcionario.servico.TotalizadoDeBonus;

public class TesteFuncionarioMain {
	public static void main(String[] args) {
		Funcionario joao = new Desenvolvedor();
		joao.setSalario(1000.0);

		System.out.println(joao.getBonus());

		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();

		System.out.println(joaquim.getBonus());

		TotalizadoDeBonus totalizador = new TotalizadoDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
	}
}
