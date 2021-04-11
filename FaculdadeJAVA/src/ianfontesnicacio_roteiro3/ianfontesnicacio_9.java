package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_9 {
public static void main (String[] args) {
		 
	double soma = 0, media = 0;
	int tamanhoVetor = 0;
	
	Scanner in = new Scanner(System.in);
		System.out.println("Digite quantos numeros deseja somar e tirar a média: ");
			tamanhoVetor = in.nextInt();
			
			double valores[] = new double[tamanhoVetor];
						
			System.out.println("Entre com os valores:");
				for(int i = 0; i < tamanhoVetor; i++) {
					System.out.printf("\nNumero [%d]: ", i+1);
					valores[i] = in.nextDouble();
								
				} in.close();
				
				for(int i = 0; i < tamanhoVetor; i++) {
					soma += valores[i];
				}
				
					media = soma/tamanhoVetor;
					System.out.println("Soma: " + soma + " | Media: " + media);
					
	}
}
