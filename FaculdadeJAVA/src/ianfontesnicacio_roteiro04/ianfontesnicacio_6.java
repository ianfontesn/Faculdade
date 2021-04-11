package ianfontesnicacio_roteiro04;

import java.util.Scanner;
import java.util.ArrayList;

public class ianfontesnicacio_6 {
	public static void main(String[] args) {

		ArrayList<Integer> positivosEPares = new ArrayList<Integer>();
		ArrayList<Integer> imparesENegativos = new ArrayList<Integer>();

		System.out.println("Digite quantos numeros quer separar nos conjuntos: (maximo de 100) ");
		int numeroDeIteracoes = 0;

		Scanner in = new Scanner(System.in);

		int repetir = 1;
		while (repetir == 1) { // REPETIR CASO NUMERO INVALIDO DE ITERAÇÕES

			numeroDeIteracoes = in.nextInt();
			if (numeroDeIteracoes <= 0) {
				System.err.println("Sua lista não pode estar vazia ou ter um valor negativo.");
			} else {
				repetir = 0; // FINALIZA LOOP DE ITERAÇÃO INVALIDA

				System.out.println("Digite numeros inteiros aleatóriamente até a quantidade desejada: ");

				// CADASTRANDO E SEPARANDO OS VALORES NOS VETORES
				int numero = 0;
				for (int i = 0; i < numeroDeIteracoes; i++) {
					numero = in.nextInt();

					if (numero >= 0 && numero % 2 == 0) {
						positivosEPares.add(numero);

					} else if (numero < 0 || numero % 2 != 0) {
						imparesENegativos.add(numero);
					}
				} in.close(); // ENCERRA SCANNER

				System.out.println("Pares Maiores que 0.");

				for (Integer listagemPar : positivosEPares) {
					System.out.printf(" %d, ", listagemPar);

				}
				System.out.println();// pula uma linha.

				System.out.println("Impares e/ou menores que 0: ");
				for (Integer listagemImpar : imparesENegativos) {
					System.out.printf("%d, ", listagemImpar);
				}

			}
		}
	}
}
