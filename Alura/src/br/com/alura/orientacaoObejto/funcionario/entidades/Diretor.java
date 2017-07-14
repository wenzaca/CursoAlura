package br.com.alura.orientacaoObejto.funcionario.entidades;

import br.com.alura.orientacaoObejto.funcionario.interfaces.Autentica;

public class Diretor extends Funcionario implements Autentica {

	@Override
	public double getBonus() {
		return this.salario*0.35;
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void cobraRelatorio() {
		System.out.println("Preciso dos relatórios");
	}


}
