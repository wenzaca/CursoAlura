package br.com.alura.orientacaoObejto.conta.main;

import java.io.PrintStream;

import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.Conta;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;

public class TesteInteger {
	static String s = "12";
	 public static void main(String[] args) {
		System.out.println(Integer.parseInt(s));
		
		PrintStream saida = System.out;
		Conta c = new ContaCorrente(100, new Cliente("jose","123"));
		Conta c1 = new ContaCorrente(100, new Cliente("jose","123"));
		Conta c2 = new ContaCorrente(100, new Cliente("luca","123"));
		if(c.equals(c2)) System.out.println("Mesma conta, do sr."+c.cliente.getNome());
		else System.out.println("Conta diferente");
		
		if(c.equals(c1)) System.out.println("Mesma conta, do sr."+c.cliente.getNome());
		else System.out.println("Conta diferente");
		System.out.println(c);
	}
}
