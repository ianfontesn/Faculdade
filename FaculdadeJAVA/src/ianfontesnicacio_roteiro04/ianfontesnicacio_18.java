package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_18 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double amostra[] = new double[20];
		double media = 0;
		double somatorio = 0;

		// CADASTRO DE AMOSTRAS
		System.out.println("Entre com os valores das amostras que serão testadas em mililitros: ");
		for (int i = 0; i < 20; i++) {
			System.out.println("Amostra [" + (i + 1) + "]: ");
			amostra[i] = in.nextDouble();
			media += amostra[i];

		}
		in.close(); // ENCERRA SCANNER

		media = media / 20;

		// ATUALIZA DESVIO
		double desvio[] = new double[20];
		for (int i = 0; i < 20; i++) {
			desvio[i] = media - amostra[i];

		}

		// SOMATÓRIO DOS DESVIOS AO QUADRADO
		for (int i = 0; i < 20; i++) {
			somatorio += Math.pow(desvio[i], 2);

		}

		// QUADRADO DO SOMATÓRIO DO DESVIO PADRAO
		double desvioPadrao = Math.sqrt((somatorio / (20 - 1)));

		// SE DESVIO FOR MAIOR QUE 5% DO PERMITIDO, SENÃO.
		if (desvioPadrao > (390 * 0.005)) {
			System.err.printf("REVISE O PROCESSO. DESVIO DE APROXIMADAMENTE %.4f ml", desvioPadrao);

		} else {
			System.out.printf("Tudo nos conformes. Desvio de aproximadamente %.4f ml", desvioPadrao);
		}

	}

}
