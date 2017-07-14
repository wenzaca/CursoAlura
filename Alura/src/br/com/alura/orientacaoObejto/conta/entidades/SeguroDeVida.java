package br.com.alura.orientacaoObejto.conta.entidades;

import br.com.alura.orientacaoObejto.conta.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double calculaTributos() {
		return 42;
	}

}
