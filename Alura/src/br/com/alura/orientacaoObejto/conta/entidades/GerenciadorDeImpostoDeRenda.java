package br.com.alura.orientacaoObejto.conta.entidades;

import br.com.alura.orientacaoObejto.conta.interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double total;

    /** Adiciona tributáveis
     * @param t recebe uma entidade tributável
     */
    public void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);

        this.total +=  t.calculaTributos();
    }

    /**
     * @return total retorna o valor total de tributos recebidos
     */
    public double getTotal() {
        return this.total;
    }
}
