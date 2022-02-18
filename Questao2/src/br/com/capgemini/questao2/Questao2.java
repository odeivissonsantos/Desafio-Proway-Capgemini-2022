package br.com.capgemini.questao2;

/**
 * Classe responsável por criar as validações de senha e informar quantos
 * caracteres faltam para uma senha válida.
 * 
 * @author Deivisson Santos
 * @version 1.0
 */
public class Questao2 {

	// método responsável por fazer as validações REGEX
	public static boolean validaSenha(String senha) {
		return senha.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[A-Z]).{6,}");
	}

	public static void main(String[] args) {

		// array de objetos contendo senhas aleatórias
		String[] senhas = { "Ya3&ab", "asdfads89as89", " ", "asdf 98s", "!@#" };

		// percorre o array de senhas e valida se é uma senha forte ou se precisa passar
		// uma senha válida.
		for (String s : senhas) {
			String resultado = (validaSenha(s)) ? " é um senha forte, cadastro efetuado com sucesso!"
					: " Não é uma senha forte, tente novamente!";
			System.out.println("-------------------------------------------------");
			System.out.println("=> " + s + resultado);

			// informa quantos caracteres faltam para a senha ser válida caso a senha
			// informada contenha menos que 6 caracteres.
			if (s.length() < 6) {
				System.out.println("A senha não pode conter menos que 6 caracteres!!");
				System.out.println("Ainda faltam: " + (6 - s.trim().length()) + " caracteres para a senha ser forte");
			}

			// informa se a senha não foi preenchida mesmo digitando com espaço.
			if (s.trim().isEmpty()) {
				System.out.println("A senha não pode ser vazia");
			}
		}
	}

}
