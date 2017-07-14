package br.com.alura.principaisAPIsEBibliotecas.teste;

public class CopiadorDeArquivos implements Runnable {
	public void run() {
		for(int i=0;i<1001;i++){
			System.out.println("Copiador");
		}		
	}
}
