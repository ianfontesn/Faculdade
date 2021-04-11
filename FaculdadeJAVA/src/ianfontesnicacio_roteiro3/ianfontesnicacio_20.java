package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_20 {
	
public static void main (String[] args) {
	
		double numero = 0, numeroAuxPar = 0, numeroAuxImpar = 0, maior = -1, menor = 999999, mediaPar = 0, mediaImpar = 0;
		int contadorPar = 0, contadorImpar = 0;
		
		
		System.out.println("Digite numeros aleatórios, quando digitar um numero negativo, encerra: ");

		Scanner in = new Scanner(System.in); //scanner inicio
		
		while (numero >= 0) {
			
			numero = in.nextDouble();
		
			if (numero < 0) { //FINALIZAR OU SELECIONAR MAIOR E MENOR NUMERO
				System.out.println("Finalizando...");
			} else if (numero % 2 == 0 && numero > maior) {
				maior = numero;
			} else if (numero % 2 != 0 && numero < menor) {
				menor = numero;
			}
			
			if (numero % 2 == 0 && numero >= 0) { //MEDIA PAR E IMPAR
				numeroAuxPar += numero;
				contadorPar++;
				mediaPar = numeroAuxPar/contadorPar;
			} else if (numero % 2 != 0 && numero >= 0) {
				numeroAuxImpar += numero;
				contadorImpar++;
				mediaImpar = numeroAuxImpar/contadorImpar;
			}
		}
		
		
		if (contadorPar == 0) { //ZERANDO VARIAVEIS INICIAIS CASO NÃO DIGITE NENHUM NUMERO PAR OU IMPAR
			mediaPar = 0;
			maior = 0;
		} 
		
		if (contadorImpar == 0) {
			mediaImpar = 0;
			menor = 0;
					
		}

		System.out.printf("Media Pares: %.2f | Media Impares: %.2f \n", mediaPar, mediaImpar);
		System.out.printf("Maior Par: %.0f | Menor Impar: %.0f", maior, menor);

in.close();
}
}
