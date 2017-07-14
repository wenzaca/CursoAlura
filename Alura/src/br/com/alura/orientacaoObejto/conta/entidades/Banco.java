package br.com.alura.orientacaoObejto.conta.entidades;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Banco {
	static Set<Conta> contasList = new HashSet<>();
	Map<String, Conta> contasMap = new HashMap<String, Conta>();

	public void adiciona(Conta novaConta) {
		contasList.add(novaConta);
		contasMap.put(novaConta.cliente.getNome(),novaConta);
	}

//	public Conta pegaConta(int posicao) {
//		return contasList.get(posicao);
//	}
	
	public int pegaQuantidadeConta() {
		return contasList.size();
	}
	
	public Conta buscaPorNome(String nome){
//		Iterator<Conta> contasI = contasList.iterator();
//		while(contasI.hasNext()){
//			if(contasI.next().cliente.getNome() == nome){
//				return contasI.next();
//			}
//		}
//		return null;	
		return contasMap.get(nome);

	}

}
