package br.com.estudoweb.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudoweb.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {

	// Note que não estamos realizando nenhuma instância para a interface
	// EntityManager, pois, já que estamos utilizando o Spring, faremos uso da
	// injeção de dependência. Já que o EntityManager trata-se de um recurso
	// persistente, precisamos utilizar a anotação @PersistenceContext para que
	// ele seja injetável,x ao invés da @AutoWired.
	@PersistenceContext
	private EntityManager manager;

	public void gravar(Produto produto) {
		manager.persist(produto);
	}
	
	public List<Produto> listar(){
		return manager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
		
	}

}
