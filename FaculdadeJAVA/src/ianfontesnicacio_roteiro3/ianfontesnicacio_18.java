package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_18 {
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		double resultado1 = 0;
		double resultado2 = 0;
		int operador = 0;
		
		Scanner in = new Scanner(System.in);
	
		
		while (operador != 5) {
			System.out.println("==========================");
			System.out.println("CALCULADORA DO IAN");
			System.out.println("==========================");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - MULTIPLICAÇÃO");
			System.out.println("4 - DIVISÃO");
			System.out.println("5 - SAIR");
			System.out.println("==========================");

			
			operador = in.nextInt();
			
			if(operador == 5) {
				System.out.println("Finalizado.");
				System.exit(0);
			}
			
			
			System.out.println("Digite os dois numeros que deseja operar: ");
			
			num1 = in.nextDouble();
			num2 = in.nextDouble();
			

		switch(operador) {
		
		case 4 :
			
			//TRATANDO AS VARIAVEIS COM A REGRA DA DIVISÃO E MOSTRANDO OS RESULTADOS.
			if(num2 == 0) {
				System.err.printf("Não é possivel dividir por zero.\n\n");
				
			} else if((num1%num2) == 0) {
				resultado1 = (num1)/(num2);
				System.out.printf("Resultado:\n %.2f \n\n", resultado1);
				resultado1 = 0;
				
			} else {
				resultado1 = (num1)/(num2);
				resultado2 = (num1)%(num2);
				System.out.printf("Resultado:\nQuociente: %.8f \nResto: %.0f\n\n", resultado1, resultado2);
				resultado1 = 0;
				resultado2 = 0;
			}
			break;
		
		case 3 :
			
			resultado1 = num1*num2;
			System.out.printf("Resultado:\n %.2f\n\n", resultado1);
			resultado1 = 0;
			
				break;
		
		case 1 : //SOMA
			resultado1 = num1+num2;
			System.out.printf("Resultado:\n %.2f\n\n", resultado1);
			resultado1 = 0;

				break;

		case 2 : //SUBTRAÇÃO
			resultado1 = (num1)-(num2);
			System.out.printf("Resultado:\n %.2f\n\n", resultado1);
			resultado1 = 0;
				
				break;		
				
		
		case 5: 
			

			break;
		} 

		}
in.close();
	}
}