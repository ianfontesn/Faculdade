package ianfontesnicacio_roteiro04;

import java.util.Random;
import java.util.Scanner;

public class ianfontesnicacio_19 {

	public static void main(String[] args) {

		Random gerarInteirosAleatorios = new Random();

		int vetorComInteiros[] = new int[10];

		for (int i = 0; i < 10; i++) {
			vetorComInteiros[i] = gerarInteirosAleatorios.nextInt(30);
		}

		Scanner in = new Scanner(System.in);
		int repetir = 1;
		int numeroTeste = 0;

		while (repetir == 1) { //

			boolean naoFazParteDoVetor = true;
			System.out.println("Digite um numero inteiro positivo de 0 a 29 para saber se está no vetor. ");
			System.err.println("Numeros negativos ENCERRAM OS TESTES.");
			numeroTeste = in.nextInt();

			if (numeroTeste < 0) {
				System.out.println("FINALIZADO.");
				System.exit(1);
			} else {

				for (int i = 0; i < vetorComInteiros.length; i++) {
					if (numeroTeste == vetorComInteiros[i]) {
						System.out.println("O numero " + numeroTeste + " está na posição: " + i + "");
						naoFazParteDoVetor = false;
					}
				}

				if (naoFazParteDoVetor) {
					System.out.println("O numero " + numeroTeste + " não faz parte do vetor.");

				}

			}
		}
		in.close();
	}

}
