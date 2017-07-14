package br.com.alura.orientacaoObejto.funcionario.entidades;

public abstract class Funcionario {
	private String name;
	protected double salario;
	private int senha;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonus();

	public abstract double getBonificacao();

	public boolean autentica(int senha) {
		return this.senha==senha;
	}
}
