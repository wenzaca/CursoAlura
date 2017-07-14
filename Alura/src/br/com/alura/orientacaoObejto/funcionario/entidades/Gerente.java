package br.com.alura.orientacaoObejto.funcionario.entidades;

import br.com.alura.orientacaoObejto.funcionario.interfaces.Autentica;

public class Gerente extends Funcionario implements Autentica {
	
	public double getBonus() {
		return this.salario *0.3;
	}
	
	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.5;
	}

}
