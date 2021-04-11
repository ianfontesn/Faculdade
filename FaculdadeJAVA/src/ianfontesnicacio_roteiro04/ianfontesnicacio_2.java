package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_2 {
	public static void main (String[] args) {
		
		//Vetores
		double vetorOriginal[] = new double[10];
		double vetorInvertido[] = new double[10];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com 10 valores numericos quaisquer: ");
		
		for (int i = 0; i < 10; i++ ) {
			vetorOriginal[i] = in.nextDouble();
			
		} in.close(); //encerra Scanner
		
		int j = 0; 
		for (int i = 10; i > 0; i--) {
			vetorInvertido[j] = vetorOriginal[i-1];
			j++;
			
		}
	
		System.out.print("Original:  ");

		for (int i = 0; i < 10; i++) {
			System.out.print(vetorOriginal[i] + ", ");
		}
		
		System.out.print("\nInvertido: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(vetorInvertido[i] + ", ");
		}

	}
}
