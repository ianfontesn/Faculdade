package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_13 {

	public static void main(String[] args) {

		int tamanhoVetorNa = 0, tamanhoVetorNb = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de elementos do conjunto A: ");
		tamanhoVetorNa = in.nextInt();

		System.out.println("Digite a quantidade de elementos do conjunto B: ");
		tamanhoVetorNb = in.nextInt();

		int vetorNa[] = new int[tamanhoVetorNa];
		int vetorNb[] = new int[tamanhoVetorNb];

		// RECEBE A
		System.out.println("Entre com os [" + tamanhoVetorNa + "] elementos de A, apenas inteiros.");
		for (int i = 0; i < tamanhoVetorNa; i++) {
			System.out.print("Valor [" + (i + 1) + "]: ");
			vetorNa[i] = in.nextInt();
		}

		// RECEBE B
		System.out.println("Entre com os [" + tamanhoVetorNb + "] elementos de B, apenas inteiros.");
		for (int i = 0; i < tamanhoVetorNb; i++) {
			System.out.print("Valor [" + (i + 1) + "]: ");
			vetorNb[i] = in.nextInt();

		}
		in.close(); // ENCERRA SCANNER

		// ORDENA CRESCENTE A
		int aux = 0;
		for (int i = 0; i < tamanhoVetorNa; i++) {
			for (int j = 0; j < (tamanhoVetorNa - 1); j++) {
				if (vetorNa[j] > vetorNa[j + 1]) {
					aux = vetorNa[j];
					vetorNa[j] = vetorNa[j + 1];
					vetorNa[j + 1] = aux;
				}
			}
		}

		// ORDENA CRESCENTE B
		aux = 0;
		for (int i = 0; i < tamanhoVetorNb; i++) {
			for (int j = 0; j < (tamanhoVetorNb - 1); j++) {
				if (vetorNb[j] > vetorNb[j + 1]) {
					aux = vetorNb[j];
					vetorNb[j] = vetorNb[j + 1];
					vetorNb[j + 1] = aux;
				}
			}
		}

		// INTERCALAÇÃO ENTRE A E B
		int tamanhoVetorResultante = tamanhoVetorNa + tamanhoVetorNb;
		int vetorResultante[] = new int[tamanhoVetorResultante];
		int indice = 0;

		for (int i = 0; i < tamanhoVetorResultante; i++) {

			vetorResultante[i] = vetorNa[indice];
			i++;
			vetorResultante[i] = vetorNb[indice];
			indice++;

		}
		// IMPRIME VETOR RESULTANTE DA INTERCALAÇAO
		System.out.println("VETOR RESULTANTE: ");
		for (int resultante : vetorResultante) {
			System.out.print(resultante + ", ");

		}
	}
}
