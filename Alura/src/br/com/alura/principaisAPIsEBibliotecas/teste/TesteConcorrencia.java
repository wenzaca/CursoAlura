package br.com.alura.principaisAPIsEBibliotecas.teste;

public class TesteConcorrencia {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
//				barra.run();
				
							
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
		t2.start();	
//		copiador.run();
	}
	
//	FazDeposito

}
