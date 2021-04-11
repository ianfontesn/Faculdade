package roteiro_Matrizes;

import java.util.Scanner;
import java.util.Random;

public class ianfontesnicacio6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random gerador = new Random();

		int amostras = 0;
		int linhaDeProducao = 0;
		double somatorio = 0;

		System.out.println("Quantas amostras serão colhidas?");
		amostras = in.nextInt();

		System.out.println("De quantas linhas de produção?");
		linhaDeProducao = in.nextInt();

		in.close(); // ENCERRA SCANNER

		int amostra[][] = new int[linhaDeProducao][amostras];
		double medias[] = new double[linhaDeProducao];

		// CADASTRO DE AMOSTRAS
		for (int i = 0; i < linhaDeProducao; i++) {
			for (int j = 0; j < amostras; j++) {

				amostra[i][j] = gerador.nextInt(10) + 384; // ALTERAR O VALOR 10 DO RANDOM PARA TESTAR DESVIOS
															// DIFERENTES.

				medias[i] += amostra[i][j];

				if (j == (amostras - 1)) {
					medias[i] = medias[i] / amostras;
				}
			}
		}

		// ATUALIZA DESVIO
		double desvio[] = new double[amostras];

		for (int i = 0; i < linhaDeProducao; i++) {
			for (int j = 0; j < amostras; j++) {

				somatorio += Math.pow((medias[i] - amostra[i][j]), 2);

				if (j == (amostras - 1)) {
					desvio[i] = Math.sqrt((somatorio / (amostras - 1)));
				}
			}
		}

		// SE DESVIO FOR MAIOR QUE 5% DO PERMITIDO, SENÃO.
		for (int i = 0; i < linhaDeProducao; i++) {
			if (desvio[i] > (5)) {
				System.err.printf("REVISAR PROCESSO NA LINHA [%d] DESVIO DE APROXIMADAMENTE %.4f ml\n", (i + 1),
						desvio[i]);

			} else {
				System.out.printf("Tudo nos conformes. Desvio de aproximadamente %.4f ml\n", desvio[i]);
			}
		}
	}

}
