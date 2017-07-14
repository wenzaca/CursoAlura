package br.com.alura.orientacaoObejto.conta.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.Conta;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;
import br.com.alura.orientacaoObejto.conta.entidades.ContaPoupanca;


public class TestaOrdenação {
	public static void main(String[] args) {
		List<Conta> contas = new LinkedList<>();
		Cliente c0 = new Cliente("Luke","123");
		Random random = new Random();
		for(int i=0;i<6;i++){
			contas.add(new ContaPoupanca(random.nextInt(1000),c0));
		}
		
		contas.add(new ContaPoupanca(400, new Cliente("Aliana","123")));
		contas.add(new ContaPoupanca(100, new Cliente("Lori","124")));
		System.out.println(contas);
		contas.sort(null);
		Iterator<Conta> i = contas.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
