package roteiro_Matrizes;

import java.util.Random;

public class ianfontesnicacio15 {

	public static void main(String[] args) {

		Random gerador = new Random();

		int servicos[][] = new int[5][3];

		System.out.println("U-M, U-P, PD");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				servicos[i][j] = gerador.nextInt(30); // GERANDO QUANTIDADE DE SERVIÇOS DE CADA FEITOS.
				System.out.printf(servicos[i][j] + " - ");
			}
		}
		
		System.out.println();

		double somatorio = 0;
		for (int i = 0; i < 5; i++) {
			
			System.out.println();
			System.out.printf("Funcionaria %d receberá: \n", (i+1));
			
			for (int j = 0; j < 3; j++) {

				if (j == 0) {
					somatorio = ((servicos[i][j] * 10) * 0.5); // UNHA DA MÃO R$10,00
					System.out.printf("- R$%.2f pelo serviço (UNHA DA MÂO R$10,00).\n", somatorio);
					somatorio = 0;

				} else if (j == 1) {
					somatorio = ((servicos[i][j] * 15) * 0.5); // UNHA DO R$15,00
					System.out.printf("- R$%.2f pelo serviço (UNHA DO PÉ R$15,00).\n", somatorio);
					somatorio = 0;

				} else if (j == 2) {
					somatorio = ((servicos[i][j] * 30) * 0.5); // UNHA DA MÃO R$30,00
					System.out.printf("- R$%.2f pelo serviço (PODOLOGIA R$30,00).\n", somatorio);
					somatorio = 0;

				} 
			}
		}
	}
}
