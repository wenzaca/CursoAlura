package br.com.alura.orientacaoObejto.funcionario.servico;

import br.com.alura.orientacaoObejto.funcionario.entidades.Funcionario;

public class TotalizadoDeBonus {
	private double total = 0;
	
	public void adiciona(Funcionario f) {
		total+= f.getBonus();
	}
	
	public double getTotal() {
		return this.total;
	}

}
