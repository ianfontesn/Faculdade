package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_10 {
public static void main (String[] args) {
		
int tamanhoVetor = 0;
double maior = -999, menor = 999;

	Scanner in = new Scanner(System.in);
		System.out.println("Digite quantos numeros deseja testar para saber qual é maior e menor: ");
			tamanhoVetor = in.nextInt();
			
			double valores[] = new double[tamanhoVetor];
						
				for(int i = 0; i < tamanhoVetor; i++) { //recebendo valores no vetor.
					System.out.println("Entre com os valores:");
					System.out.printf("\nNumero [%d]: ", i+1);
					valores[i] = in.nextDouble(); 
					
					 	if (valores[i] > maior) {  //testanto maior e menor
					 		maior = valores[i];
					 	} else if (valores[i] < menor) {
					 		menor = valores[i];
					 	}
					
				}		in.close();
						
					System.out.println("Menor " + menor + "| Maior " + maior);
	
}
}