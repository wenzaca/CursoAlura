package br.com.alura.orientacaoObejto.conta.entidades;

import br.com.alura.orientacaoObejto.conta.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	public ContaCorrente(double saldo, Cliente cliente) {
		super(saldo, cliente);
		this.saldo=saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	public ContaCorrente(int numero,double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
		this.saldo=saldo;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(Conta conta) {
		if(this.saldo<conta.saldo) return -1;
		if(this.saldo>conta.saldo) return 1;
		return 0;
	}

}
