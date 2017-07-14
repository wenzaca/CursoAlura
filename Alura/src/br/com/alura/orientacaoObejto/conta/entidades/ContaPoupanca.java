package br.com.alura.orientacaoObejto.conta.entidades;

public class ContaPoupanca extends Conta {


	public ContaPoupanca(double saldo, Cliente cliente) {
		super(saldo, cliente);
		this.saldo=saldo;
	}

	public ContaPoupanca(int numero,double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
		this.saldo=saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
		
	}
	
	
	/* Compare contas pelo nome do cliente.
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Conta conta) {
		return this.cliente.getNome().compareTo(conta.cliente.getNome());
	}

}
