package prova_Vetores_ianfontesnicacio;

import java.util.Scanner;

public class ianfontesnicacio1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int carro[] = new int[20];
		int codigo = -1;
		int opcao = 0;
		boolean temVaga = false;
		boolean existeCodigo = false;

		int repetirPrograma = 1;
		while (repetirPrograma == 1) {
			System.out.println("==================");
			System.out.println("      MENU");
			System.out.println("==================");
			System.out.println("1 - CADASTRAR VEÍCULO");
			System.out.println("2 - CONSULTAR VEÍCULO");
			System.out.println("3 - SAIR ");

			opcao = in.nextInt();
//CADASTRO
			switch (opcao) {

			case 1:

				for (int i = 0; i < carro.length; i++) {
					if (carro[i] == 0) {
						temVaga = true;
						break;
					}
				}

				int repetirCodigo = 1;
				while (repetirCodigo == 1) {

					System.out.println("Codigo: ");
					codigo = in.nextInt();

					for (int i = 0; i < carro.length; i++) { // VERIFICA CODIGO EXISTENTE
						if (carro[i] == codigo) {
							existeCodigo = true;
							System.err.println("CODIGO JÁ CADASTRADO");
							break;
						} else {
							repetirCodigo = 0;
							existeCodigo = false;
						
						}

					}
				} // WHILE REPETIR CODIGO
				for (int i = 0; i < 20; i++) {
					if (carro[i] == 0 && temVaga == true && existeCodigo == false) { // SE NAO TEM CARRO, COLOCAR NESTA
																						// VAGA
						carro[i] = codigo;
						break;
					}
				}
				break;

			case 2:
				boolean carroEncontrado = false;

				System.out.println("Digite o codigo para consulta: ");
				codigo = in.nextInt();

				for (int i = 0; i < carro.length; i++) {
					if (carro[i] == codigo) {
						System.out.println("Carro de codigo[" + codigo + "] está na vaga [" + (i + 1) + "]");
						carroEncontrado = true;
						break;
					}
				}
				if (!carroEncontrado) {
					System.err.println("CARRO NÃO CADASTRADO.");
				}

				break;

			case 3:
				System.out.println("PROGRAMA ENCERRADO");
				System.exit(1);

			default:
				System.err.println("Opção inválida.");
				
			}// switch
		} // REPETIR PROGRAMA
		in.close();

	}

}
