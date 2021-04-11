package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double matriz[][] = new double[3][6];
		double somatorio = 0;
		double maior = 0;
		int linha = 0;

		System.out.println("Preencha a matriz 3x5 com numeros reais: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {	
				if (j == 5) {					 		// ULTIMA COLUNA RECEBE O SOMATORIO DOS VALORES
					matriz[i][j] = somatorio;
					if (somatorio > maior) { 			// MAIOR VALOR DAS LINHAS
						maior = somatorio;
						somatorio = 0;
						linha = (i + 1); 				// MOSTRA QUAL LINHA TEM O MAIOR VALOR
					}
				} else {
					System.out.print("valor L[" + (i + 1) + "] C[" + (j + 1) + "]: ");
					matriz[i][j] = in.nextDouble();
					somatorio += matriz[i][j];
				}
			}
		}
		in.close();

		System.out.println("Linha [" + linha + "]:" + maior);

	}
}
