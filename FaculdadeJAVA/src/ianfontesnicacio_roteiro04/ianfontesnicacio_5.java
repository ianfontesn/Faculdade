package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_5 {

	public static void main(String[] args) {

		int quantidadeDeInscricoes = 3; // controle do tamanho dos vetores por incrições.
		int altura[] = new int[quantidadeDeInscricoes];
		String nome[] = new String[quantidadeDeInscricoes];

		Scanner in = new Scanner(System.in);

		// Cadastro de atleta
		for (int i = 0; i < quantidadeDeInscricoes; i++) {
			System.out.println("Digite o nome do atleta: ");
			nome[i] = in.next();

			System.out.println("Digite a altura em CENTIMETROS do atleta: ex: (180 cm = 1,80 metros.) ");
			altura[i] = in.nextInt();
			
		} in.close(); // Encerra Scanner

		// media
		double mediaGeralAlturas = 0;
		for (int i = 0; i < quantidadeDeInscricoes; i++) {
			mediaGeralAlturas += altura[i];
		}

		mediaGeralAlturas /= quantidadeDeInscricoes;
		System.out.printf("Média das alturas %.2f metros \n", mediaGeralAlturas / 100);

		// verificar e printar atletas aptos
		String atletasQuePodemParticipar = "";
		System.out.println("Atlétas que poderão efetivamente participar: ");
		System.out.println();

		for (int i = 0; i < quantidadeDeInscricoes; i++) {
			if (altura[i] >= mediaGeralAlturas) {
				atletasQuePodemParticipar = nome[i] + " [" + (altura[i] / 100.0) + " metros]";
				System.out.println(atletasQuePodemParticipar);

			}
		}
	}

}
