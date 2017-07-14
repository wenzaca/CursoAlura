package br.com.alura.orientacaoObejto.area.entity;

import br.com.alura.orientacaoObejto.area.interfaces.AreaCalculavel;

public class Quadrado implements AreaCalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado*lado;
	}

}
