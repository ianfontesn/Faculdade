package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double vetor1[] = new double[10];
		double vetor2[] = new double[10];
		double vetorResultante[] = new double[20];

		System.out.println("Entre com 10 valores para o vetor 1 e 10 para o vetor 2, qualquer numero real.");

		for (int i = 0; i < 10; i++) {
			System.out.print("Vetor 1: Valor [" + (i + 1) + "]: ");
			vetor1[i] = in.nextDouble();
			System.out.print("Vetor 2: Valor [" + (i + 1) + "]: ");
			vetor2[i] = in.nextDouble();

		}
		in.close();

		int indice = 0;
		for (int i = 0; i < 20; i++) {
			vetorResultante[i] = vetor1[indice];
			i++;
			vetorResultante[i] = vetor2[indice];
			indice++;

		}

		for (double intercal : vetorResultante) {
			System.out.print(intercal + ", ");
		}

	}

}
