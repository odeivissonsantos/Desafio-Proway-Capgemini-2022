package br.com.capgemini.questao1;

/**
 * Classe respons�vel por criar e imprimir uma escada atrav�s da quantidade de
 * degraus declarado no vetor "sa�da"
 * 
 * @author Deivisson Santos
 * @version 1.0
 */
public class Questao1 {

	// Respons�vel pela quantidade de degraus que deve haver na escada.
	String[] saida = new String[6];

	// M�todo respons�vel por realizar a constru��o da escada.
	public void metodoConstruirEscada() {
		System.out.println("Construindo a escada...");
		saida[0] = "*";
		for (int i = 1; i < saida.length; i++) {
			saida[i] = saida[i - 1] + "*";
		}
	}

	// M�todo respons�vel por imprimir a escada com os degraus informados no vetor.
	public void metodoImprimeEscada() {
		System.out.println("Imprimindo a escada em 3, 2, 1 ...");
		System.out.println("");
		for (int i = 0; i < saida.length; i++) {
			System.out.println(saida[i]);
		}
	}

	public static void main(String args[]) {

		// Instaciando a class.
		Questao1 exec = new Questao1();

		// chamando o metodo para construir.
		exec.metodoConstruirEscada();

		// chamando o metodo para imprimir.
		exec.metodoImprimeEscada();
	}
}
