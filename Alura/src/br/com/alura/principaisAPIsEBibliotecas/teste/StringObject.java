package br.com.alura.principaisAPIsEBibliotecas.teste;

public class StringObject {
	public static void main(String[] args) {
		String texto = "Socorram-me, subi no ônibus em Marrocos";
		String texto2 = "anotaram a data da maratona";
		for (int i = texto.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));
		}
		System.out.println("");

		for (int i = texto2.length() - 1; i >= 0; i--) {
			System.out.print(texto2.charAt(i));
		}
		System.out.println("");

		String[] textoSplit = texto.split(" ");
		for (int i = textoSplit.length - 1; i >= 0; i--) {
			System.out.print(textoSplit[i] + " ");
		}

		String s = "72";
		int value = 0;
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (j > 0) {
				value = value * 10;
			}
			value += Character.getNumericValue(c);

		}
		System.out.println(value);

	}
}
