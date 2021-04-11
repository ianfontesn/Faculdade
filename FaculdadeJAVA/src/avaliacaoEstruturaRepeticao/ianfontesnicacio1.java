package avaliacaoEstruturaRepeticao;

import java.util.Scanner;

public class ianfontesnicacio1 {
	public static void main(String[] args) {

		int tamanhoPredio = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite quantos andares tem o prédio: ");
		tamanhoPredio = in.nextInt();

		int numeroDePessoasNoElevador = 0;
		int entrou = 0, saiu = 0;
		int andarComMaisPessoas = 0, numeroDoAndarComMaisPessoas = 0;

		for (int i = 0; i < tamanhoPredio; i++) { // CALCULANDO ENTRADA E SAIDA DE PESSOAS
			
				System.out.println("Você está no andar [" + i + "]. Quantas pessoas entraram? ");

				int repetir1 = 1;
				while (repetir1 == 1) { // REPETE ENTRADA
					entrou = in.nextInt();

					if (entrou < 0) {
						System.err.println("Numero inválido. Apenas positivos."); // VALIDA ENTRADA OU REPETE
					} else {
						numeroDePessoasNoElevador += entrou;
						repetir1 = 0;

					}
				}

				int repetir2 = 1;
				while (repetir2 == 1) {
					System.out.println("Quantas pessoas sairam? ");
					saiu = in.nextInt();

					if (saiu > numeroDePessoasNoElevador) { // VALIDA SAIDA DE PESSOAS OU REPETE
						System.err.println("Não tem como sair mais gente do que tem no elevador.");  
					} else {
						numeroDePessoasNoElevador -= saiu;
						repetir2 = 0;
					}
				}

				if (numeroDePessoasNoElevador > 15) { // VALIDA MAXIMO DE PESSOAS NO ELEVADOR E RETORNA QUANTOS DEVEM SAIR
					System.err.println("EXCESSO DE PASSAGEIROS, DEVEM SAIR [" + (numeroDePessoasNoElevador - 15) + "] PESSOAS.");
					i--;
					
				} else if(numeroDePessoasNoElevador > andarComMaisPessoas) {
					andarComMaisPessoas = numeroDePessoasNoElevador;
					numeroDoAndarComMaisPessoas = i;
				}
			} in.close(); // FECHA SCANNER
		
		System.out.println("O elevador vai descer com [" + numeroDePessoasNoElevador + "]");
		System.out.println("O andar com mais pessoas foi o [" + numeroDoAndarComMaisPessoas + "] andar com [" + andarComMaisPessoas + "] pessoas");
	}
}
