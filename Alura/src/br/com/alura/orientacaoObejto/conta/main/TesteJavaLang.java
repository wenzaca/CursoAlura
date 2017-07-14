package br.com.alura.orientacaoObejto.conta.main;

import br.com.alura.orientacaoObejto.conta.entidades.Banco;
import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.Conta;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;
import br.com.alura.orientacaoObejto.conta.entidades.ContaPoupanca;
import br.com.alura.orientacaoObejto.conta.excessao.ValorInvalidoException;

public class TesteJavaLang {
	public static void main(String[] args) {
		Conta cc = null;
		Conta cp = null;
		try {
			cc = new ContaCorrente(100,new Cliente("Carlos", "123"));
			cp = new ContaPoupanca(200,new Cliente("Ana", "123"));
		} catch (ValorInvalidoException e) {
			e.getMessage();
		}
		Banco gDContas = new Banco();

		if (cc != null && cp != null) {
			gDContas.adiciona(cc);
			gDContas.adiciona(cp);
//			((Conta) gDContas.pegaConta(1)).deposita(100);
//			System.out.println("A conta tem: R$" + ((Conta) gDContas.pegaConta(1)).getSaldo());
		}
	}
}
