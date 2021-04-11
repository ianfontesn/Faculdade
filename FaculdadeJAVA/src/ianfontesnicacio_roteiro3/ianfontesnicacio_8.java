package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_8 {
public static void main (String[] args) {
		
	double resultado = 0;
	int inteiro = 0;
			
			System.out.println("Digite um numero inteiro positivo qualquer: ");
				Scanner in = new Scanner(System.in);
				inteiro = in.nextInt();
				in.close();
				
					for(int i = 0; i < inteiro; i++) {
						
						resultado += (double) 1/(i+1);
						i++; //(AVANÇA 1 POSIÇÃO )
						
					if(i != inteiro) // VERIFICA SE JÁ ATINGIU A QUANTIDADE SOLICITADA
						resultado -= (double) 1/(i+1);				
					
					}
						
					System.out.printf("RESULTADO: %.2f ", resultado);
	}
}
