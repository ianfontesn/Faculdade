package prova_Vetores_ianfontesnicacio;

import java.util.Random;

public class ianfontesnicacio4 {

	public static void main(String[] args) {

		Random numeros = new Random();
		
		
		
		int vetor1[] = new int [10];
		int vetor2[] = new int [10];
		int vetorSoma[] = new int[10];
		
		for (int i = 0; i < vetor1.length; i++) {
	
			vetor1[i] = numeros.nextInt(20);
			vetor2[i] = numeros.nextInt(20);
	
		}
		
		for (int i = 0; i < vetorSoma.length; i++) {
			
			if(((vetor1[i]+vetor2[i]) % 2) != 0) {
				vetorSoma[i] = 1;
			} else {
				vetorSoma[i] = 0;
			}
			
		}
		
		System.out.print("VETOR 1: ");
		for (int i = 0; i < vetor1.length; i++) {
			
			System.out.print(vetor1[i] + ", ");

		}
		
		System.out.println();// QUEBRA
		System.out.print("VETOR 2: ");
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + ", ");

		}
		
		System.out.println();// QUEBRA
		System.out.print("VETOR RESULTANTE: ");
		
		for (int i = 0; i < vetorSoma.length; i++) {
			
			System.out.print(vetorSoma[i] + ", ");

		}
		
		
		
		
		
	}
}