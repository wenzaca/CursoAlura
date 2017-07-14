package br.com.alura.orientacaoObejto.area.entity;

import br.com.alura.orientacaoObejto.area.interfaces.AreaCalculavel;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	public Circulo(double raio) {
		this.raio=raio;
	}
	
	@Override
	public double calculaArea() {
		return raio*raio*Math.PI;
	}
	
}
