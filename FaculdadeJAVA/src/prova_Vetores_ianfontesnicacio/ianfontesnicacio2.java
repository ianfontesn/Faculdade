package prova_Vetores_ianfontesnicacio;

import java.util.Scanner;
import java.util.Random;

public class ianfontesnicacio2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random sorteio = new Random();

		int apostado[] = new int[15];
		int sorteado[] = new int[15];
		int acertos = 0;

//SORTEIO DOS NUMEROS		
		for (int i = 0; i < sorteado.length; i++) {
			sorteado[i] = sorteio.nextInt(99);
			if (sorteado[i] == 0) {
				sorteado[i] += 1;
			}
		}

//NUMEROS APOSTADOS
		System.out.println("DIGITE OS NUMEROS DA APOSTA: ");

		int pedirNumero = 1;

		while (pedirNumero == 1) {

			int numero = 0;

			for (int i = 0; i < apostado.length; i++) {
				boolean numeroEscolhido = false;
				System.out.print("Numero[" + (i + 1) + "]: ");
				numero = in.nextInt();

				for (int k = 0; k < apostado.length; k++) {

					if (numero == apostado[k]) {

						System.err.println("Numero já escolhido.");
						numeroEscolhido = true;
						i--;
						break;
					}
				}

				if ((numero <= 0 || numero > 99) && numeroEscolhido == false) {

					System.err.println("ENTRE 1 E 99");
					pedirNumero = 1;
					i--;

				} else if (numeroEscolhido == false) {

					pedirNumero = 0;
					apostado[i] = numero;

					for (int j = 0; j < sorteado.length; j++) {
						if (apostado[i] == sorteado[j]) {
							acertos++;

						}
					}
				}
			}

			in.close();

			if (acertos == 13) {
				System.out.println("Azarento!");
			} else if (acertos == 14) {
				System.out.println("QuaseNada!");
			} else if (acertos == 15) {
				System.out.println("QuaseTudo!");
			} else if (acertos == 0) {
				System.out.println("NADA!");
			}

		}
	}
}