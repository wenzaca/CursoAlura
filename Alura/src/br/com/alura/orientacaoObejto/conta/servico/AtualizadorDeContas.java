package br.com.alura.orientacaoObejto.conta.servico;

import br.com.alura.orientacaoObejto.conta.entidades.Conta;

public class AtualizadorDeContas {
	private double selic;
	private double saldoResultado;
	
	public void atualiza(Conta c) {
		System.out.println(c.getSaldo());
		selic = 0.1;
		c.atualiza(selic);
		saldoResultado = c.getSaldo();
		System.out.println(saldoResultado);
		
	}

}
