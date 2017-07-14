package br.com.alura.orientacaoObejto.conta.main;

import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;
import br.com.alura.orientacaoObejto.conta.interfaces.Tributavel;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100, new Cliente("Lucas","123"));
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
	}

}
