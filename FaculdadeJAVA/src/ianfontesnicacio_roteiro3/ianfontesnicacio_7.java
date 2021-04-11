package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_7 {
public static void main (String[] args) {
		
	double soma = 0;
	int inteiro = 0;
			
			System.out.println("Digite um numero inteiro positivo qualquer: ");
				Scanner in = new Scanner(System.in);
				inteiro = in.nextInt();
				in.close();
				
					for(int i = 0; i < inteiro; i++) {
						soma += (double) 1/(i+1);
					}
						
					System.out.printf("soma: %.2f ", soma);
	}
}
