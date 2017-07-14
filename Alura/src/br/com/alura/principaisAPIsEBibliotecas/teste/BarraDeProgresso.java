package br.com.alura.principaisAPIsEBibliotecas.teste;

public class BarraDeProgresso implements Runnable {
		public void run() {
			for(int i=0;i<1001;i++){
				System.out.println("Barra de Progresso");
			}
		}
}
