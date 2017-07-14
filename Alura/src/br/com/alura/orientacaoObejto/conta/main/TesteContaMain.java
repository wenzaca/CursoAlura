package br.com.alura.orientacaoObejto.conta.main;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.Conta;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;
import br.com.alura.orientacaoObejto.conta.entidades.ContaPoupanca;
import br.com.alura.orientacaoObejto.conta.excessao.ValorInvalidoException;

public class TesteContaMain {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(1000,new Cliente("Tales", "123"));
		ContaCorrente cc = new ContaCorrente(-1000,new Cliente("Leandro", "123"));
		ContaPoupanca cp = new ContaPoupanca(1000,new Cliente("Jonas", "123"));

		try {
			c.deposita(1000);
			cc.deposita(-1000);
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		Map<String, ContaCorrente> hashMapCOntas = new HashMap<String, ContaCorrente>();
		hashMapCOntas.put(cc.cliente.getNome(), cc);
		

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		// System.out.println(c.getSaldo());
		// System.out.println(cc.getSaldo());
		// System.out.println(cp.getSaldo());
		try {
			c.saca(1200);
			System.out.println("Novo saldo de: R$" + c.saldo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
