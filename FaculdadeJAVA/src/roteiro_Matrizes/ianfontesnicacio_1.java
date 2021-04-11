package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Preencha a matriz 2x2 com valores aleatórios: ");

		double matriz[][] = new double[2][2];
		double maior = 0;
		;

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.print("valor L[" + (i + 1) + "] C[" + (j + 1) + "]: ");

				matriz[i][j] = in.nextDouble();
				if (maior == 0) {
					maior = matriz[i][j];
				} else if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		in.close();

		//IMPRIME TABELA
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(); // QUEBRA DE LINHA

			for (int j = 0; j < matriz.length; j++) {
				System.out.print((matriz[i][j] * maior) + ", ");

			}
		}
	}
}
