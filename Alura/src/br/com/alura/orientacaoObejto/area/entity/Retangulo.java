package br.com.alura.orientacaoObejto.area.entity;

import br.com.alura.orientacaoObejto.area.interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return base*altura;
	}

}
