package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("digite o tamanho da matriz quadrada: ");
		int tamanho = in.nextInt();

		int matriz[][] = new int[tamanho][tamanho];

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {

				System.out.print("L[" + (i + 1) + "]  C[" + (j + 1) + "]:");
				matriz[i][j] = in.nextInt();

			}
		}
		in.close();

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {

				if (matriz[i][j] == matriz[j][i]) {
					continue;
				} else {
					System.err.println("NÃO É SIMÉTRICA");
					System.exit(1);
				}

			}
		}
		System.out.println("É SIMÉTRICA.");
	}
}