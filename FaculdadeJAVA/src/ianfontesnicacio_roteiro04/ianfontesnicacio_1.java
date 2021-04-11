package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_1 {
	public static void main(String[] args) {
		// vetores
		String nome[] = new String[3];
		int idade[] = new int[3];

		// demais vars
		String nomeMaisVelho = "", nomeMaisNovo = "";
		int maisNovo = 999, maisVelho = -1;
		int maiorQue16Anos = 0, menorQue16Anos = 0;
		int quantidadeDeIteracoes = 3; // MUDAR PARA CADASTRAR MAIS ALUNOS.
		double mediaDasIdades = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o nome e idade dos 40 alunos: ");

		for (int i = 0; i < quantidadeDeIteracoes; i++) {
			System.out.println("Nome: ");
			nome[i] = in.next();
			System.out.println("Idade: ");
			idade[i] = in.nextInt();

			// mais velho e mais novo
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				nomeMaisVelho = nome[i];

			} else if (idade[i] < maisNovo) {
				maisNovo = idade[i];
				nomeMaisNovo = nome[i];

			}
			// contagem maior e menor que 16 anos
			if (idade[i] <= 16 && idade[i] >= 0) {
				menorQue16Anos++;

			} else if (idade[i] > 16 && idade[i] <= 118) { // 118 é a pessoa mais velha do mundo segundo o google (:
				maiorQue16Anos++;

			}

		}
		in.close(); // fecha Scanner

		System.out.println("Aluno mais novo: " + nomeMaisNovo + " [" + maisNovo + "] anos.");
		System.out.println("Aluno mais velho: " + nomeMaisVelho + " [" + maisVelho + "] anos.");

		// printa qtd alunos maiores e menores que 16
		System.out.println("Existem " + maiorQue16Anos + " Alunos com mais de 16 anos. ");
		System.out.println("Existem " + menorQue16Anos + " Alunos com 16 anos ou menos. ");

		// tira media das idades e printa os maiores que a media
		for (int i = 0; i < quantidadeDeIteracoes; i++) {
			mediaDasIdades += idade[i];

		}
		mediaDasIdades /= 3;
		System.out.printf("Media das idades: %.2f anos \n", mediaDasIdades); // printa media das idades

		System.out.println("Alunos com idade acima da média: ");
		for (int i = 0; i < quantidadeDeIteracoes; i++) {

			if (idade[i] > mediaDasIdades) {
				System.out.println("Aluno(a): " + nome[i] + " [" + idade[i] + " anos] ");

			}
		}

	}

}
