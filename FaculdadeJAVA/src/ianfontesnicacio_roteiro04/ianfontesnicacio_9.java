package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Quantas fichas serão cadastradas?");
		int tamanhoDoVetor = in.nextInt();

		// VETORES PARA CADASTRO DE FICHAS
		String nome[] = new String[tamanhoDoVetor];
		int altura[] = new int[tamanhoDoVetor];
		int sexo[] = new int[tamanhoDoVetor];

		// CADASTRO DE FICHAS
		String nomeMaiorAlturaGeral = "", nomeMenorAlturaGeral = "";
		int maiorAltura = 0, menorAltura = 999;
		double mediaAlturas = 0;

		for (int i = 0; i < tamanhoDoVetor; i++) {

			System.out.println("Nome do aluno: [" + (i + 1) + "]:");
			nome[i] = in.next();

			System.out.println("Altura em CENTIMETROS: (1,80 metros = 180 centimetros):");
			altura[i] = in.nextInt();

			// VALIDA ALTURA
			int repetir1 = 1;
			while (repetir1 == 1) {
				if (altura[i] < 0) {
					System.err.println("Altura invalida.");
				} else {
					repetir1 = 0;
				}
			}

			// SOMA DE TODAS AS ALTURAS
			mediaAlturas += altura[i];

			// TESTE MAIOR E MENOR ALTURA
			// MAIOR

			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
				nomeMaiorAlturaGeral = nome[i];

			} else if (altura[i] == maiorAltura) {
				nomeMaiorAlturaGeral += nome[i] + ", ";

			}

			// MENOR

			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
				nomeMenorAlturaGeral = nome[i];

			} else if (altura[i] == menorAltura) {
				nomeMenorAlturaGeral += nome[i] + ", ";
			}

			// RECEBE SEXO

			int repetir2 = 1;
			while (repetir2 == 1) {
				System.out.println("SEXO: Masculino = 1,  Feminino = 2");
				sexo[i] = in.nextInt();

				// VALIDA SEXO
				if (sexo[i] < 1 || sexo[i] > 2) {
					System.err.println("Sexo inválido.");
				} else {
					repetir2 = 0;
				}
			}
		}
		in.close();

		// CALCULO MÉDIA DE ALTURA

		mediaAlturas /= tamanhoDoVetor; // TAMANHO DO VETOR = QUANTIDADE DE FICHAS CADASTRADAS

		// MEDIA ENTRE HOMENS E MEDIA ENTRE MULHERES

		double mediaHomens = 0, mediaMulheres = 0;
		int qtdHomens = 0, qtdMulheres = 0;
		String mulherAcimaDaMediaDosHomens = "", homemAbaixoDaMediaDasMullheres = "";

		for (int i = 0; i < tamanhoDoVetor; i++) {
			if (sexo[i] == 1) {
				mediaHomens += altura[i];
				qtdHomens++;

			} else {
				mediaMulheres += altura[i];
				qtdMulheres++;

			}
		}

		// TIRANDO MEDIAS

		mediaHomens = mediaHomens / qtdHomens;
		mediaMulheres = mediaMulheres / qtdMulheres;

		// VERIFICA MULHER ACIMA DA MEDIA DOS HOMENS E HOMENS ABAIXO DA MEDIA DAS
		// MULHERES

		for (int i = 0; i < tamanhoDoVetor; i++) {
			if (sexo[i] == 1 && altura[i] < mediaMulheres) {
				homemAbaixoDaMediaDasMullheres += nome[i] + ", ";
			} else if (sexo[i] == 2 && altura[i] > mediaHomens) {
				mulherAcimaDaMediaDosHomens += nome[i] + ", ";
			}

		}

		// PESSOAS COM MEDIA ABAIXO DA MEDIA GERAL DA TURMA.

		String alunoAbaixoDaMediaGeralDeAltura = "";

		for (int i = 0; i < tamanhoDoVetor; i++) {
			if (altura[i] < mediaAlturas) {
				alunoAbaixoDaMediaGeralDeAltura += nome[i] + ", ";
			}
		}

		// MOSTRANDO RESULTADOS

		System.out.printf("Maior altura geral: %.2f metros para: %s \n", (maiorAltura/100.0), nomeMaiorAlturaGeral);
		System.out.printf("Menor altura geral: %.2f metros para: %s \n", (menorAltura/100.0), nomeMenorAlturaGeral);
		System.out.printf("Media das alturas no geral: %.2f \n", (mediaAlturas/100.0));
		System.out.printf("Mulheres com altura acima da media dos homens (%.2f metros): %s \n", (mediaHomens/100.0), mulherAcimaDaMediaDosHomens);
		System.out.printf("Homens com altura abaixo da media das mulheres (%.2f metros): %s \n", (mediaMulheres/100.0), homemAbaixoDaMediaDasMullheres);
		System.out.printf("Alunos com média de altura abaixo da media da sala: %s", alunoAbaixoDaMediaGeralDeAltura);
		
	}

}
