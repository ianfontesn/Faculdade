package roteiro_Matrizes;

import java.util.Scanner;
import java.util.Random;

public class ianfontesnicacio4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random gerador = new Random();

		int semanasLinhas = 0;
		System.out.println("Digite a quantidade de semanas do relatório: ");
		semanasLinhas = in.nextInt();
		in.close();

		int matrizProducao[][] = new int[semanasLinhas][7]; // 7 DIAS DA SEMANA
		double media = 0;
		double totalDiasParaMedia = (semanasLinhas * 7);
		int QtdDiasAcimaDaMedia = 0;
		String diasAbaixoDaMedia = "";

		// GERA VALORES ALEATORIOS DE PRODUÇÃO POR DIA ATÉ 200 PEÇAS
		for (int i = 0; i < semanasLinhas; i++) {
			for (int j = 0; j < 7; j++) {

				matrizProducao[i][j] = gerador.nextInt(200);
				media += matrizProducao[i][j];
			}
		}

		// TIRA MÉDIA E VERIFICA VALORES DE PRODUÇÃO SOLICITADOS
		media = (media / totalDiasParaMedia);

		for (int i = 0; i < semanasLinhas; i++) {
			for (int j = 0; j < 7; j++) {

				if (matrizProducao[i][j] >= media) {
					QtdDiasAcimaDaMedia++;

				} else {

					diasAbaixoDaMedia += "Semana[" + (i + 1) + "] dia: " + (j + 1) + "\n";

				}
			}
		}

		// GERAÇÃO DO RELATORIO
		System.out.println("====================================================");
		System.err.println("VALORES RELATADOS");
		System.out.print("====================================================");

		// IMPRIME VALORES DA TABELA
		for (int i = 0; i < semanasLinhas; i++) {
			System.out.println();
			System.out.print("SEMANA [" + (i + 1) + "]: ");
			for (int j = 0; j < 7; j++) {

				System.out.print(matrizProducao[i][j] + ", ");

			}
		}

		// GERA RELATORIO
		System.out.println();
		System.out.println("====================================================");
		System.err.println("RELATÓRIO DE PRODUÇÃO RELATIVO A " + semanasLinhas + " SEMANAS ");
		System.out.println("====================================================");
		System.out.printf("PRODUÇÃO MÉDIA: %.2f\n", media);
		System.out.printf("NUMERO DE DIAS COM PRODUÇÃO ACIMA DA MÉDIA: %d\n", QtdDiasAcimaDaMedia);
		System.out.println("====================================================");
		System.err.println("INDICAÇÃO DOS DIAS DE MINIMA PRODUÇÃO");
		System.out.println("====================================================");
		System.out.println(diasAbaixoDaMedia);
	}

}