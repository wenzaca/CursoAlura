package br.com.alura.orientacaoObejto.funcionario.entidades;

public class DBA extends Funcionario{

	@Override
	public double getBonus() {
		return this.salario*0.1;
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
