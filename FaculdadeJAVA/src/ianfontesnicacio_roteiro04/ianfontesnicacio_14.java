package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double vetor1[] = new double[10];
		double vetor2[] = new double[10];
		double vetorSoma[] = new double[10];
		
		//RECEBE VETOR 1
		System.out.println("Entre com 10 valores para o vetor 1: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + (i+1) + "]");
			vetor1[i] = in.nextDouble();
			
		}
		
		//RECEBE VETOR 2
		System.out.println("Entre com 10 valores para o vetor 2: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + (i+1) + "]");
			vetor2[i] = in.nextDouble();
			
		}	in.close();	//ENCERRA SCANNER
		
		// SOMA VALOR DE INDICE DE 1, COM INDICE DE 2
		for (int i = 0; i < 10; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
			
		}
		
		//PRINTA VALOR RESULTANTE
		System.out.println("VETOR RESULTANTE: ");
		for(double result : vetorSoma) {
			System.out.print(result + ", ");
		}
	}

}
