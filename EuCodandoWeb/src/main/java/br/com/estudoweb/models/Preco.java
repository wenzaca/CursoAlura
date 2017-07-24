package br.com.estudoweb.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Preco {
	
	private BigDecimal valor;
	private TipoPreco tipo;
	
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoPreco getType() {
		return tipo;
	}
	public void setType(TipoPreco tipo) {
		this.tipo = tipo;
	}

}
