package br.com.capgemini.questao2;

/**
 * Classe respons�vel por criar as valida��es de senha e informar quantos
 * caracteres faltam para uma senha v�lida.
 * 
 * @author Deivisson Santos
 * @version 1.0
 */
public class Questao2 {

	// m�todo respons�vel por fazer as valida��es REGEX
	public static boolean validaSenha(String senha) {
		return senha.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[A-Z]).{6,}");
	}

	public static void main(String[] args) {

		// array de objetos contendo senhas aleat�rias
		String[] senhas = { "Ya3&ab", "asdfads89as89", " ", "asdf 98s", "!@#" };

		// percorre o array de senhas e valida se � uma senha forte ou se precisa passar
		// uma senha v�lida.
		for (String s : senhas) {
			String resultado = (validaSenha(s)) ? " � um senha forte, cadastro efetuado com sucesso!"
					: " N�o � uma senha forte, tente novamente!";
			System.out.println("-------------------------------------------------");
			System.out.println("=> " + s + resultado);

			// informa quantos caracteres faltam para a senha ser v�lida caso a senha
			// informada contenha menos que 6 caracteres.
			if (s.length() < 6) {
				System.out.println("A senha n�o pode conter menos que 6 caracteres!!");
				System.out.println("Ainda faltam: " + (6 - s.trim().length()) + " caracteres para a senha ser forte");
			}

			// informa se a senha n�o foi preenchida mesmo digitando com espa�o.
			if (s.trim().isEmpty()) {
				System.out.println("A senha n�o pode ser vazia");
			}
		}
	}

}
