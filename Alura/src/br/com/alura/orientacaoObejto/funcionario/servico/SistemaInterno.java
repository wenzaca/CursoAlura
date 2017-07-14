package br.com.alura.orientacaoObejto.funcionario.servico;

import br.com.alura.orientacaoObejto.funcionario.interfaces.Autentica;

public class SistemaInterno {
	/**
	 * @param f
	 */
	public void autentica(Autentica f) {
		int senha = 123;

		if (f.autentica(senha) == true) {
			System.out.println("Bem vindo ao sistema");
		} else {
			System.out.println("Senha incorreta");
		}
	}

	/**
	 * @param a
	 */
	public void login(Autentica a) {
			int senha=0; //
			boolean ok = a.autentica(senha);
		}

}
