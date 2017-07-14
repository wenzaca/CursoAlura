package br.com.alura.orientacaoObejto.area.main;

import br.com.alura.orientacaoObejto.area.entity.Circulo;
import br.com.alura.orientacaoObejto.area.entity.Quadrado;
import br.com.alura.orientacaoObejto.area.entity.Retangulo;
import br.com.alura.orientacaoObejto.area.interfaces.AreaCalculavel;

public class TesteArea {
	public static void main(String[] args) {
		
	AreaCalculavel r = new Retangulo(10, 5);
	AreaCalculavel q = new Quadrado(10);
	AreaCalculavel c= new Circulo(2);
	
	
	System.out.println("Area do retangulo: "+r.calculaArea()+"\nArea do quadrado: "+q.calculaArea()+"\nArea do Circulo: "+c.calculaArea());
	}	


}
