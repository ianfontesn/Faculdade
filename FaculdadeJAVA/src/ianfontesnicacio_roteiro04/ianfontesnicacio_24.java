package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_24 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int distX = 0, distY = 0, QtdFlechas = 0, penalidadeTotal = 0;

		System.out.println("Digite a quantidade de flechas: ");
		QtdFlechas = in.nextInt();

		double distanciaFlechaPontoZero[] = new double[QtdFlechas];

		for (int i = 0; i < QtdFlechas; i++) {
			System.out.println("Posição Flecha [" + (i + 1) + "]: ");

			distX = in.nextInt();
			distY = in.nextInt();

			double aux = (Math.pow((distX), 2) + Math.pow(distY, 2));
			distanciaFlechaPontoZero[i] = Math.sqrt(aux);

			if (i == 0) {  //SE FOR PRIMEIRA FLECHA, 0 DE PENALIDADE
				penalidadeTotal = 0;

			} else {

				for (int j = i - 1; j > -1; j--) { // CADA FLECHA LANÇADA, TESTA COM SUAS ANTERIORES E ADICIONA 1 A CADA VEZ QUE
					int aux2 = i;					//ENCONTRA UMA FLECHA QUE ENTRE NA CONDIÇÃO DE PENALIDADE.

					if (distanciaFlechaPontoZero[aux2] >= distanciaFlechaPontoZero[j]) {
						penalidadeTotal++;
					}

				}
			}

		} in.close();
		System.out.println(penalidadeTotal);

	}
}