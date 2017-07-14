package br.com.alura.orientacaoObejto.conta.entidades;

import br.com.alura.orientacaoObejto.conta.excessao.SaldoInsuficienteException;
import br.com.alura.orientacaoObejto.conta.excessao.ValorInvalidoException;

public abstract class Conta implements Comparable<Conta>  {	
	public double saldo;
	private int numero;
	public Cliente cliente;

	public Conta(double saldo, Cliente cliente) {
		this.cliente = cliente;
		if(saldo>=0) {
		this.saldo = saldo;
		} else {
			throw new ValorInvalidoException(saldo);
		}
	}
	
	/**
	 * @param numero
	 * @param saldo
	 * @param cliente
	 */
	public Conta(int numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
		if(saldo>=0) {
		this.saldo = saldo;
		} else {
			throw new ValorInvalidoException(saldo);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			throw new ValorInvalidoException(valor);
		}
	}

	public void saca(double valor) throws Exception {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	@Override
	public String toString() {
		return "Essa conta é do(a) "+this.cliente.getNome()+" com saldo R$" + this.saldo;
	}
	
	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + numero;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Conta other = (Conta) obj;
//		if (numero != other.numero)
//			return false;
//		return true;
//	}

	public abstract void atualiza(double taxa);

}
