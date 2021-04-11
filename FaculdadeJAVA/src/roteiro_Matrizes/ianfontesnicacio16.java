package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite quantos cadastros suporta o sistema: ");
		int tamanhoCadastro = in.nextInt();

		int estoqueIdeal[] = new int[tamanhoCadastro];
		int estoqueAtual[] = new int[tamanhoCadastro];
		int codigo[] = new int[tamanhoCadastro];
		String nome[] = new String[tamanhoCadastro];

		int sair = 1;
		while (sair == 1) {
			System.out.printf("\n\n" 
							+ "=========================================\n" 
							+ "        FLORICULTURA MARIASFLOR\n"
							+ "=========================================\n" 
							+ "1. Cadastrar nova planta.\n"
							+ "2. Retirar planta.\n" 
							+ "3. Inserir planta.\n" 
							+ "4. Imprimir relatório.\n" 
							+ "5. Sair.\n"
							+ "=========================================\n\n");

			int opcao = in.nextInt();

			switch (opcao) {

			case 1: // CADASTRAR NOVA PLANTA
				boolean podeCadastrar = false;
				int indiceCadastro = 0;
				int auxCod = 0;
				
				// VERIFICA SE TEM ESPAÇO PARA CADASTRO
				for (int i = 0; i < tamanhoCadastro; i++) {
					if (codigo[i] == 0) {
						podeCadastrar = true;
						indiceCadastro = i;
						break;
					}
				}

				if (podeCadastrar) { // INICIO CADASTRO

					System.out.print("CÓDIGO: ");
					auxCod = in.nextInt();
					boolean codigoExiste = false;

					for (int i = 0; i < tamanhoCadastro; i++) {
						if (codigo[i] == auxCod) {

						} else {
							codigoExiste = false;
						}

					}

					if (codigoExiste == false) {

						if (auxCod > 0) {
							codigo[indiceCadastro] = auxCod;

							System.out.print("NOME DA PLANTA: ");
							nome[indiceCadastro] = in.next();

							System.out.print("ESTOQUE IDEAL: ");
							int auxEstoqueIdeal = 0;

							auxEstoqueIdeal = in.nextInt();

							if (auxEstoqueIdeal >= 0) {

								estoqueIdeal[indiceCadastro] = auxEstoqueIdeal;

								System.out.print("ESTOQUE ATUAL: ");
								int auxEstoqueAtual = 0;
								auxEstoqueAtual = in.nextInt();

								if (auxEstoqueAtual >= 0) {

									estoqueAtual[indiceCadastro] = auxEstoqueAtual;

									System.out.println("IEM CADASTRADO COM SUCESSO.");
									break;

								} else { // IF AUXESTOQUEATUAL
									System.err.println("ESTOQUE ATUAL NÃO PODE SER NEGATIVO.");
									break;
								}

							} else { // IF AUXESTOQUEIDEAL
								System.err.println("ESTOQUE IDEAL NÃO PODE SER NEGATIVO.");
								break;
							}

						} else { // IF AUXCOD > 0
							System.err.println("CÓDIGO INVÁLIDO.");
							break;
						}

					} else { // IF CODIGOEXISTE
						System.err.println("CODIGO JÁ CADASTRADO.");
					}

				} else { // podeCadastrar
					System.err.println("NÃO HÁ MAIS ESPAÇO NO CADASTRO.");
					break;
				}

				// ENCERRA CADASTRO

			case 2: // RETIRADA DE FLOR DO ESTOQUE
				boolean codigoEncontrado = false;

				System.out.print("CODIGO DA PLANTA A RETIRAR:  ");
				int auxCodiRetirar = in.nextInt();

				int indicePosicaoRetirar = 0;

				for (int i = 0; i < tamanhoCadastro; i++) {

					if (auxCodiRetirar == codigo[i]) {
						codigoEncontrado = true;
						indicePosicaoRetirar = i;
						break;
					} else if (i == tamanhoCadastro - 1 && codigoEncontrado == false) {
						System.err.println("CODIGO NÃO CADASTRADO.");
						break;
					}
				}

				if (codigoEncontrado == true) {

					System.out.print("QUANTIDADE RETIRADA: ");
					int auxQtdRetirar = in.nextInt();

					if (auxQtdRetirar <= estoqueAtual[indicePosicaoRetirar]) {

						estoqueAtual[indicePosicaoRetirar] -= auxQtdRetirar;
						System.out.println("RETIRADAS " + auxQtdRetirar + " FLORES COM SUCESSO.");
						break;

					} else {
						System.err.println("NÃO HÁ ESSA QUANTIDADE EM ESTOQUE.");
						break;
					}

				}
				break;

			case 3: // INSERIR FLOR NO ESTOQUE
				boolean codigoEncontrado2 = false;

				System.out.print("CODIGO DA PLANTA A INSERIR:  ");
				int auxCodInserir = in.nextInt();

				int indicePosicaoInserir = 0;

				for (int i = 0; i < tamanhoCadastro; i++) {

					if (auxCodInserir == codigo[i]) {
						codigoEncontrado2 = true;
						indicePosicaoInserir = i;
						break;
					} else if (i == tamanhoCadastro - 1 && codigoEncontrado2 == false) {
						System.err.println("CODIGO NÃO CADASTRADO.");
						break;
					}
				}

				if (codigoEncontrado2 == true) {

					System.out.print("QUANTIDADE INSERÇÃO: ");
					int auxQtdInserir = in.nextInt();

					if (auxQtdInserir > 0) {

						estoqueAtual[indicePosicaoInserir] += auxQtdInserir;
						System.out.println("FORAM ISERIDAS " + auxQtdInserir + " PLANTAS.");
						break;

					} else {
						System.err.println("APENAS VALORES MAIORES QUE 0");
						break;
					}

				}
				break;

			// RELATÓRIO DO SISTEMA.

			case 4:
				System.out.printf("==================================================\n"
								+ "             RELATÓRIO DE ESTOQUE\n"
								+ "==================================================\n");
				for (int i = 0; i < tamanhoCadastro; i++) {

					if (estoqueAtual[i] < estoqueIdeal[i]) {
						System.err.println(nome[i] + " -  Atual: " + estoqueAtual[i] + " | Ideal: " + estoqueIdeal[i]
								+ " | Comprar mais: " + (estoqueIdeal[i] - estoqueAtual[i]));
					} else {
						System.out.println(nome[i] + " -  Atual: " + estoqueAtual[i] + " | Ideal: " + estoqueIdeal[i]);
					}
				}
				break;
				
			case 5: 
				System.err.println("SISTEMA ENCERRADO");
				System.exit(1);

			} // SWITCH OPCAO

		} // WHILE SAIR
		in.close();
	}

}
