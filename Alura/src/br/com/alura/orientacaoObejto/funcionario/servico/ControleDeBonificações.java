package br.com.alura.orientacaoObejto.funcionario.servico;

import br.com.alura.orientacaoObejto.funcionario.entidades.Funcionario;

public class ControleDeBonifica��es {

	 private double totalDeBonificacoes = 0;

     public void registra(Funcionario f) {
         System.out.println("Adicionando bonifica��o do funcionario: " + f);
         this.totalDeBonificacoes += f.getBonificacao();
     }

     public double getTotalDeBonificacoes() {
         return this.totalDeBonificacoes;
     }
}
