package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String nomeCompleto = "";
		String auxNomeCompleto = "";
		String apelido = "";
		int caracteresNome = 0;

		System.out.println("Digite seu nome completo: ");
		auxNomeCompleto = in.nextLine();
		nomeCompleto = auxNomeCompleto;

		System.out.println("Digite seu apelido: ");
		apelido = in.nextLine();

		in.close();

		auxNomeCompleto = auxNomeCompleto.replaceAll(" ", ""); // REMOVE ESPAÇOS
		caracteresNome = auxNomeCompleto.length(); // CONTA CARACTERES

		if (nomeCompleto.equals(apelido)) {
			System.out.println("NOME IGUAL APELIDO!");
			System.out.println(nomeCompleto);
			System.out.println("Seu nome tem " + caracteresNome + " letras.");
		} else {

			nomeCompleto += " --- " + apelido; // CONCATENA
			System.out.println(nomeCompleto);
			System.out.println("Seu nome tem " + caracteresNome + " letras.");

		}

	}
}