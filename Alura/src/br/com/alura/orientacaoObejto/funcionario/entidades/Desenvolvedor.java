package br.com.alura.orientacaoObejto.funcionario.entidades;

public class Desenvolvedor extends Funcionario {
	
	public double getBonus(){
		return this.salario * 0.25;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.2;
	}

}
