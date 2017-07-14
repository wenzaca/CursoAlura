package br.com.alura.orientacaoObejto.conta.main;

import br.com.alura.orientacaoObejto.conta.entidades.Banco;
import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.Conta;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;

public class TesteHashCode {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(123, 100D, new Cliente("Lucas", "123"));
		Conta c2 = new ContaCorrente(123, 1000D, new Cliente("Leonardo", "143"));
		Conta c3 = new ContaCorrente(124, 0D, new Cliente("Lori", "113"));
		
		Banco banco = new Banco();
		banco.adiciona(c1);
		banco.adiciona(c2);
		banco.adiciona(c3);
		System.out.println(banco.pegaQuantidadeConta());

	}
}
