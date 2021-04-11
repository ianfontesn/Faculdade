import java.util.*;
public class ex9vetores {

	public static void main(String[] args) {
		
		int quantidadeDeContas = 0;
		int codigoMenu = 0;
		int controleCodigoConta = 0;
		int conta = 0;
		boolean contaEncontrada = false;
		int indiceDoVetorDaConta = 0;
		double controleSaque = 0.00;
		
		
//DEFININDO QUANTIDADE DE CONTAS A SER CADASTRADA.
		System.out.println("Digite a quantidade de contas a ser cadastrada: ");
		Scanner recebe = new Scanner(System.in);
		quantidadeDeContas = recebe.nextInt();
		
		
		int codigosDasContas[] = new int[quantidadeDeContas];
		double saldoDasContas[] = new double[quantidadeDeContas];

//CADASTRO DAS CONTAS
			System.out.println("Cadastre as " + quantidadeDeContas + " contas.");

			for (int i = 0; i < quantidadeDeContas; i++) {
				System.out.println("Codigo da conta: ");
				controleCodigoConta = recebe.nextInt();
				
//VERIFICA��O SE CONTA J� EXISTE				
				for (int j = 0; j < quantidadeDeContas; j++) {
					if (codigosDasContas[j] == controleCodigoConta) {
						System.err.println("Esta conta j� existe.");
						System.out.println("Codigo da conta: ");
						recebe.nextLine();
						controleCodigoConta = recebe.nextInt();
						j = -1;					//j -1 PORQUE EST� EXECUTANDO O LOOP J�
					} 							//ENT�O QUANDO DER ERRO, VAI RETORNAR J A -1, E COME�AR O LOOP ZERO!
				}
				
//ATUALIZANDO INDICE DA CONTA, CASO ELA N�O EXISTA				
				codigosDasContas[i] = controleCodigoConta;
				System.out.println("Saldo da conta: ");
				saldoDasContas[i] = recebe.nextDouble();
			}
				System.out.println("Contas cadastradas.");
				
//IMPRIMINDO MENU	
		while (codigoMenu != 4) { // REPETI��O DO CODIGO AT� OP��O 4 SER DIGITADA PARA FINALIZAR
			
			System.out.println("\nMENU");
			System.out.println("[1] EFETUAR DEP�SITO");
			System.out.println("[2] EFETUAR SAQUE");
			System.out.println("[3] CONSULTAR SALDO EM CONTA");
			System.out.println("[4] FINALIZAR CONSULTA");

//VALIDANDO OP��O DO MENU
			codigoMenu = recebe.nextInt();
			if (codigoMenu < 1 || codigoMenu > 4) {
				System.out.println("Codigo inv�lido, tente novamente");
			}
			
			
			switch(codigoMenu) {
				case 1: 
					System.out.println("Digite o codigo da conta a ser dep�sitado o valor: ");
					conta = recebe.nextInt();

//VALIDANDO CONTA PARA DEP�SITO, CASO TRUE, PEGA O INDICE DE ONDE FOI ENCONTRADO A CONTA
					for (int i = 0; i < quantidadeDeContas; i++) {
						if (conta == codigosDasContas[i]) {
							contaEncontrada = true;
							indiceDoVetorDaConta = i;
						}
					}	

//REALIZANDO DEP�SITO					
						if (contaEncontrada == true) {	
						System.out.println("Digite o valor a ser depositado utilizando virgula: (ex: 1200,00) ");
							saldoDasContas[indiceDoVetorDaConta] = recebe.nextDouble() + (saldoDasContas[indiceDoVetorDaConta]);
							System.out.printf("Dep�sito efetuado, saldo atual: R$%.2f %n", saldoDasContas[indiceDoVetorDaConta]);	
							codigoMenu = 0;
							
						} else if (contaEncontrada == false) {
							System.err.println("\nConta n�o cadastrada!");
							codigoMenu = 0;
						}
						
					contaEncontrada = false;
					break;

//VALIDANDO CONTA PARA SAQUE,  CASO TRUE, PEGA O INDICE DE ONDE FOI ENCONTRADO A CONTA
				case 2:
					System.out.println("Digite o codigo da conta a ser retirado o valor: ");
					conta = recebe.nextInt();
					
					for (int i = 0; i < quantidadeDeContas; i++) {
						if (conta == codigosDasContas[i]) {
							contaEncontrada = true;
							indiceDoVetorDaConta = i;
							
						}
					}	
					
						if (contaEncontrada == true) {	
						System.out.println("Digite o valor a ser retirado utilizando virgula: (ex: 1200,00) ");
							controleSaque = recebe.nextDouble();
						}

//VERIFICANDO SE SALDO � SUFICIENTE PARA SAQUE E REALIZANDO SAQUE.
						if(saldoDasContas[indiceDoVetorDaConta] >= controleSaque) {
							saldoDasContas[indiceDoVetorDaConta] = (saldoDasContas[indiceDoVetorDaConta]) - controleSaque;
							System.out.printf("Saque efetuado, saldo atual: R$%.2f %n", saldoDasContas[indiceDoVetorDaConta]);					
							codigoMenu = 0;
							
						} else if (contaEncontrada == false || saldoDasContas[indiceDoVetorDaConta] < controleSaque) {
							System.err.println("\nConta n�o cadastrada ou saldo insuficiente.");
							codigoMenu = 0;
						}
						
					contaEncontrada = false;
					break;

//VALIDANDO CONTA PARA CONSULTAR SALDO
				case 3:
					System.out.println("Digite o codigo da conta a ser verificado o saldo: ");
					conta = recebe.nextInt();
					
					for (int i = 0; i < quantidadeDeContas; i++) {
						if (conta == codigosDasContas[i]) {
							contaEncontrada = true;
							indiceDoVetorDaConta = i;
							
						}
					}

//IMPRIMINDO SALDO
					if (contaEncontrada == true) {	
						System.out.printf("Saldo atual: R$%.2f %n", saldoDasContas[indiceDoVetorDaConta]);	
						codigoMenu = 0;
						
					} else if (contaEncontrada == false) {
						System.err.println("\nConta n�o cadastrada!");
						codigoMenu = 0;
					}
					
				contaEncontrada = false;
				break;

//FINALIZA PROGRAMA COM O WHILE = 4
				case 4:
					System.out.println("Obrigado por utilizar nosso sistema. Criado por Ian Fontes.");
					break;
							
		}
	}			recebe.close();		
}
}