package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_20 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int capacidadeDeArmazenamentoDoBanco = 0;
		System.out.println("Digite a capacidade de armazenamento do sistema: "); // FACILITA TESTES CADASTRANDO MENOS
																					// CONTAS
		capacidadeDeArmazenamentoDoBanco = in.nextInt();

		// CADASTRO.
		String nomeCliente[] = new String[capacidadeDeArmazenamentoDoBanco];
		int codigoDaConta[] = new int[capacidadeDeArmazenamentoDoBanco];
		float saldoDaConta[] = new float[capacidadeDeArmazenamentoDoBanco];
		int controleCodigoConta = 0;

		for (int i = 0; i < capacidadeDeArmazenamentoDoBanco; i++) {
			System.out.println("CLIENTE [" + (i + 1) + "]");
			System.out.print("Nome do cliente: ");
			nomeCliente[i] = in.next();

			int repetir1 = 1; // REPETIR1 LOOP CODIGO CONTA
			while (repetir1 == 1) {
				System.out.print("Codigo da conta: ");
				controleCodigoConta = in.nextInt();

				for (int j = 0; j < codigoDaConta.length; j++) { 				// SE O CODIGO EXISTE, RECOMEÇA, SENÃO CADASTRA E
																				// CONTINUA.
					if (controleCodigoConta == 0) {
						System.err.println("Codigo inválido.");
						break;
					} else if(controleCodigoConta == codigoDaConta[j]) {
						System.err.println("Cliente já cadastrado.");
						break;
					} else if (codigoDaConta[j] == 0){
						codigoDaConta[i] = controleCodigoConta;
						repetir1 = 0;
					}
				}
			}

			int repetir5 = 1;
			while(repetir5 == 1) {
			System.out.print("Saldo da conta: ");
			float controleSaldo = in.nextFloat();
			if (controleSaldo < 0) {
				System.err.println("Saldo não pode ser negativo.");
			} else {
				saldoDaConta[i] = controleSaldo;
				repetir5 = 0;
			}
		}
		} // FINALIZA CADASTRO
		
		int repetirMenu = 1;
		while(repetirMenu == 1) {
		System.out.println();
		System.out.println("MENU DE OPERAÇÕES");
		System.out.println("1. EFETUAR DEPÓSITO");
		System.out.println("2. EFETUAR SAQUE");
		System.out.println("3. CONSULTAR SALDO EM CONTA");
		System.out.println("4. FINALIZAR O PROGRAMA");

		int repetir2 = 1; // REPETIR2 LOOP DA OPÇÃO.
		while (repetir2 == 1) {
			System.out.println("Opção: ");
			int operacao = in.nextInt();
			if (operacao < 1 && operacao > 4) {
				System.err.println("Opção invalida.");
			} else {
				repetir2 = 0;
			}

			switch (operacao) {

			case 1: // DEPOSITO
				System.out.println("Digite o numero da conta: ");
				int testeCodigoConta = in.nextInt();
				for (int i = 0; i < codigoDaConta.length; i++) {
					if (testeCodigoConta == codigoDaConta[i]) {
						int repetir3 = 1; // REPETIR3 LOOP DEPOSITO INVALIDO
						while (repetir3 == 1) {
							System.out.println("Digite o valor a ser depositado: ");
							double valorDeposito = in.nextDouble();
							if (valorDeposito <= 0) {
								System.err.println("Deposito negativo ou 0.");
							} else {
								saldoDaConta[i] += valorDeposito;
								System.out.println("Saldo atual: R$" + saldoDaConta[i]);
								repetir3 = 0;
							}

						}
						break;

					} else {
						System.err.println("Conta inexistente.");
					}
				}
				break;

			case 2: // SAQUE
				System.out.println("Digite o numero da conta: ");
				testeCodigoConta = in.nextInt();
				for (int i = 0; i < codigoDaConta.length; i++) {
					if (testeCodigoConta == codigoDaConta[i]) {

						int repetir4 = 1;
						while (repetir4 == 1) {
							System.out.println("Digite o valor a ser sacado: ");
							double valorSaque = in.nextDouble();

							if (valorSaque > saldoDaConta[i] || valorSaque <= 0) {
								System.err.println("Saldo insuficiente ou quantidade inválida (negativo ou zero)");
								
							} else {
								saldoDaConta[i] -= valorSaque;
								System.out.println("Saldo atual: R$" + saldoDaConta[i]);
								repetir4 = 0;
							}

						}
						break;

					} else {
						System.err.println("Conta inexistente.");
					}
				}
				break;

			case 3: // SALDO

				System.out.println("Digite o numero da conta: ");
				testeCodigoConta = in.nextInt();
				for (int i = 0; i < codigoDaConta.length; i++) {
					if (testeCodigoConta == codigoDaConta[i]) {
						System.out.println(codigoDaConta[i] + " - " + nomeCliente[i] + " | Saldo atual: R$" + saldoDaConta[i]);
						break;
					} else {
						System.err.println("Conta Inexistente.");
					}
				}
				break;

			case 4:
				System.out.println("PROGRAMA FINALIZADO.");
				repetirMenu = 0;
				in.close();
			}
		}
	}
	}
}