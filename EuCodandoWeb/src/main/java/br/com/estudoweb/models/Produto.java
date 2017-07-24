package br.com.estudoweb.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	// Opera como a primary key da classe. Nesse caso, faremos com que ele seja
	// auto incremental
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String titulo;

	private String descricao;

	private int paginas;

	// Adiciona o preço como parte do produto, criando uma tabela nova
	// relacionada a produtos
	@ElementCollection
	private List<Preco> preco;

	public long getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}

	public List<Preco> getPreco() {
		return preco;
	}

	public void setPreco(List<Preco> preco) {
		this.preco = preco;
	}
}
