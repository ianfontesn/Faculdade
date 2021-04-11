package trabalho_olimpiadas;

import java.util.Scanner;

public class sortenosorteio_Ian_Isabella_Luiz {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int recebeDados[] = new int[16];
		int oitavas[] = new int[8];
		int quartas[] = new int[4];
		int semi[] = new int[2];

		// RECEBE VALORES INICIAIS
		for (int i = 0; i < recebeDados.length; i++) {
			recebeDados[i] = in.nextInt();
		} 
		in.close();

		// VERIFICA E PREENCHE OITAVAS
		int indiceOitavas = 0;
		while (indiceOitavas < 8) {
			for (int i = 0; i < recebeDados.length; i++) {
				if ((recebeDados[i] == 9 && recebeDados[i + 1] == 1)
						|| (recebeDados[i] == 1 && recebeDados[i + 1] == 9)) {
					System.out.println("Oitavas");
					System.exit(1);

				} else {

					if (recebeDados[i] == 9 || recebeDados[i] == 1) { // CONSIDERA SE FOR 9 OU 1 COMO VENCEDOR SEMPRE
						oitavas[indiceOitavas] = recebeDados[i];
						i++;
						indiceOitavas++;

					} else if (recebeDados[i + 1] == 9 || recebeDados[i + 1] == 1) { // CONSIDERA 9 OU 1 VENCEDOR SEMPRE
						oitavas[indiceOitavas] = recebeDados[i + 1];
						i++;
						indiceOitavas++;

					} else {

						if (recebeDados[i] < recebeDados[i + 1]) {
							oitavas[indiceOitavas] = recebeDados[i];
							i++;
							indiceOitavas++;

						} else {

							oitavas[indiceOitavas] = recebeDados[i + 1];
							i++;
							indiceOitavas++;
						}
					}
				}
			}
		} // WHILE PREENCHIMENTO OITAVAS

		// VERIFICA E PREENCHE QUARTAS
		int indiceQuartas = 0;
		while (indiceQuartas < 4) {
			for (int i = 0; i < oitavas.length; i++) {
				if ((oitavas[i] == 9 && oitavas[i + 1] == 1) || (oitavas[i] == 1 && oitavas[i + 1] == 9)) { // VERIFICA
																											// 1 E 9, OU
																											// 9 E 1
					System.out.println("Quartas");
					System.exit(1);

				} else {

					if (oitavas[i] == 9 || oitavas[i] == 1) { // CONSIDERA SE FOR 9 OU 1 COMO VENCEDOR SEMPRE
						quartas[indiceQuartas] = oitavas[i];
						i++;
						indiceQuartas++;

					} else if (recebeDados[i + 1] == 9 || recebeDados[i + 1] == 1) { // CONSIDERA 9 OU 1 VENCEDOR SEMPRE

						quartas[indiceQuartas] = oitavas[i + 1];
						i++;
						indiceQuartas++;

					} else {

						if (oitavas[i] < oitavas[i + 1]) {
							quartas[indiceQuartas] = oitavas[i];
							i++;
							indiceQuartas++;

						} else {

							quartas[indiceQuartas] = oitavas[i + 1];
							i++;
							indiceQuartas++;
						}
					}
				}
			}
		} // WHILE PREENCIMENDO QUARTAS

		// VERIFICA E PREENCHE SEMI
		int indiceSemi = 0;
		while (indiceSemi < 2) {
			for (int i = 0; i < quartas.length; i++) {
				if ((quartas[i] == 9 && quartas[i + 1] == 1) || (quartas[i] == 1 && quartas[i + 1] == 9)) { // VERIFICA
																											// 1 E 9, OU
																											// 9 E 1
					System.out.println("Semifinal");
					System.exit(1);

				} else {

					if (quartas[i] == 9 || quartas[i] == 1) { // CONSIDERA SE FOR 9 OU 1 COMO VENCEDOR SEMPRE
						semi[indiceSemi] = quartas[i];
						i++;
						indiceSemi++;

					} else if (quartas[i + 1] == 9 || quartas[i + 1] == 1) { // CONSIDERA 9 OU 1 VENCEDOR SEMPRE

						semi[indiceSemi] = quartas[i + 1];
						i++;
						indiceSemi++;

					} else {

						if ((quartas[i] < quartas[i + 1])) {
							semi[indiceSemi] = quartas[i];
							i++;
							indiceSemi++;

						} else {

							semi[indiceSemi] = quartas[i + 1];
							i++;
							indiceSemi++;
						}
					}
				}
			}
		} // WHILE PREENCHIMENTO SEMI

		// VERIFICA E PREENCHE FINAL
		int indiceFinal = 0;
		while (indiceFinal < 1) {
			for (int i = 0; i < semi.length; i++) {
				if ((semi[i] == 9 && semi[i + 1] == 1) || (semi[i] == 1 && semi[i + 1] == 9)) { // VERIFICA 1 E 9, OU 9
																								// E 1
					System.out.println("Final");
					System.exit(1);
				}
			}
		}
	}
}
