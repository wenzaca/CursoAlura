package br.com.alura.orientacaoObejto.conta.main;

import br.com.alura.orientacaoObejto.conta.entidades.Cliente;
import br.com.alura.orientacaoObejto.conta.entidades.ContaCorrente;
import br.com.alura.orientacaoObejto.conta.entidades.GerenciadorDeImpostoDeRenda;
import br.com.alura.orientacaoObejto.conta.entidades.SeguroDeVida;

public class TesteGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = 
                    new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente(1000,new Cliente("Matt", "123"));
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
    }
}
