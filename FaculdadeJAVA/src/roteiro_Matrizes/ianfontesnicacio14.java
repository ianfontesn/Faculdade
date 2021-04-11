package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int cadeiras[][] = new int[12][4];

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 4; j++) {

				cadeiras[i][j] = 0;
			}
		}

		int continuar = 1;
		while (continuar == 1) {
			System.out.printf("========================================\n" 
							+ "             MARIAS UNIDAS\n"
							+ "========================================\n" 
							+ "a - VENDER PASSAGEM\n"
							+ "b - MOSTRAR MAPA DE OCUPAÇÃO\n" 
							+ "c - ENCERRAR\n\n");

			String opcao = in.next();
			switch (opcao) {

			case "a":

				// VERIFICA POLTRONAS VAZIAS NO ONIBUS
				boolean cadeiraDisponivel = false;

				for (int i = 0; i < 12; i++) {
					if (cadeiraDisponivel == true) {
						break;
					}
					for (int j = 0; j < 4; j++) {
						if (cadeiras[i][j] == 0) {
							cadeiraDisponivel = true;
							break;
						} else if (i == 11 && j == 3 && cadeiraDisponivel == false) {
							System.err.println("ONIBUS LOTADO.");
						}
					}
				}

				// PEDIR CADEIRA
				if (cadeiraDisponivel == true) {

					System.out.println("Selecione sua cadeira: ");
					System.out.println("[1]Janela  [2]Corredor");
					int janelaCorredor = in.nextInt();

					if (janelaCorredor == 1) { // ESCOLHEU JANELA

						System.out.println("Vagas da janela de 1 a 12 lado esquerdo, e de 13 a 24 lado direito");
						int cadeiraEscolhida = in.nextInt();

						if (cadeiraEscolhida > 0 && cadeiraEscolhida <= 12) { // LADO ESQUERDO 1 A 12
							if (cadeiras[(cadeiraEscolhida - 1)][0] == 0) {
								cadeiras[cadeiraEscolhida - 1][0] = 1;
								janelaCorredor = 0;
								System.out.println("VENDA EFETUADA COM SUCESSO.");
								break;

							} else {
								System.err.println(
										"Cadeira já ocupada ou poltrona inválida. Opção B para verificar disponibilidade.");
								janelaCorredor = 0;
							}
						} else {// CADEIRA ESCOLHIDA INVÁLIDA.

							System.err.println("CADEIRA INVÁLIDA");
							break;
						}

						if (cadeiraEscolhida >= 13 && cadeiraEscolhida < 25) { 		// LADO DIREITO 13 A 24
							if (cadeiras[(cadeiraEscolhida - 13)][3] == 0) { 		// OBS> O VALOR ESCOLHIDO, MENOS 13, É A
																					// POSIÇÃO DA CADEIRA NO VETOR
								cadeiras[(cadeiraEscolhida - 13)][3] = 1; 			// EX CADEIRA 24, -13 = POSIÇÃO 11, QUE
																					// EQUIVALE A CADEIRA 12
								janelaCorredor = 0;
								System.out.println("VENDA EFETUADA COM SUCESSO.");
								break;

							} else {
								System.err.println(
										"Cadeira já ocupada ou poltrona inválida. Opção B para verificar disponibilidade.");
								janelaCorredor = 0;
							}
						} else {// CADEIRA ESCOLHIDA INVÁLIDA.

							System.err.println("CADEIRA INVÁLIDA");
							break;
						}

					} else if (janelaCorredor == 2) { // ESCOLHEU CORREDOR

						System.out.println("Vagas do corredor de 1 a 12 lado esquerdo, e de 13 a 24 lado direito");
						int cadeiraEscolhida = in.nextInt();

						if (cadeiraEscolhida > 0 && cadeiraEscolhida <= 12) { // LADO ESQUERDO 1 A 12
							if (cadeiras[(cadeiraEscolhida - 1)][1] == 0) {
								cadeiras[cadeiraEscolhida - 1][1] = 1;
								janelaCorredor = 0;
								System.out.println("VENDA EFETUADA COM SUCESSO.");
								break;

							} else {
								System.err.println("Cadeira já ocupada. Opção B para verificar disponibilidade.");
								janelaCorredor = 0;
							}

						} else {// CADEIRA ESCOLHIDA INVÁLIDA.

							System.err.println("CADEIRA INVÁLIDA");
							break;
						}

						if (cadeiraEscolhida >= 13 && cadeiraEscolhida < 25) { 	// LADO DIREITO 13 A 24
							if (cadeiras[(cadeiraEscolhida - 13)][2] == 0) {	 // OBS> O VALOR ESCOLHIDO, MENOS 13, É A
																				// POSIÇÃO DA CADEIRA NO VETOR
								cadeiras[(cadeiraEscolhida - 13)][2] = 1; 		// EX CADEIRA 24, -13 = POSIÇÃO 11, QUE
								janelaCorredor = 0; 							// EQUIVALE A CADEIRA 12
								System.out.println("VENDA EFETUADA COM SUCESSO.");
								break;

							} else {
								System.err.println(
										"Cadeira já ocupada ou poltrona inválida. Opção B para verificar disponibilidade.");
								janelaCorredor = 0;
							}
						} else {// CADEIRA ESCOLHIDA INVÁLIDA.

							System.err.println("CADEIRA INVÁLIDA");
							break;
						}

					} else { // JANELA OU CORREDOR INVÁLIDO
						System.err.println("OPÇÃO INVÁLIDA.");
					}

				} // IF CADEIRA DISPONIVEL
				break; // BREAK CASE "A"

			case "b":

				System.out.println("VAGAS DISPONIVEIS = 0. VAGAS OCUPADAS = 1.");
				System.out.println();
				System.err.println("FRENTE DO ONIBUS");
				System.out.print("JE  CE  CD  JD");
				for (int i = 0; i < 12; i++) {
					System.out.println();
					for (int j = 0; j < 4; j++) {
						System.out.print(cadeiras[i][j] + " - ");

					}
				}
				System.out.println();
				break; // BREAK CASE B

			case "c":

				System.out.println("OBRIGADO POR UTILIZAR A VIAÇÃO MARIAS UNIDAS (CRUZEIRENSE PROVAVELMENTE KKKKK).. ");
				System.exit(1);

			default:
				System.err.println("OPÇÃO INVÁLIDA.");
				break;
			} // SWITCH OPÇÃO
		} // WHILE CONTINUAR == 1 REPETIR CODIGO ATÉ CASE C PARA ENCERRAR
		in.close();
	}
}