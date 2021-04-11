package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_26 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println(" Digite o valor do X em graus ( 0 a 360)  para calcular o Seno: ");
		Double x = in.nextDouble();
		double xResultado = x;
		
		x = (x*3.14)/180;  // graus pra radianos
		
		Double expoenteEFatorial = 3.0;

		in.close();

		Double senoX = 0.0;
		Double dividendo = 0.0;
		Double fatorial = 3.0;
		Double auxiliarFatorial = 3.0;

		for (int i = 0; i < 7; i++) {

			dividendo = (Math.pow(x, expoenteEFatorial)); // calcula parte de cima da fraçao

			while (auxiliarFatorial > 1) { // calculando fatorial debaixo da equação
				fatorial *= (auxiliarFatorial - 1);
				auxiliarFatorial--;
			}

			senoX += dividendo / fatorial; // soma no resultado final
			expoenteEFatorial += 2;

			fatorial = expoenteEFatorial; // atualiza fatorial para novo valor
			auxiliarFatorial = expoenteEFatorial; // atualiza expoente na variavel auxiliar pro segundo calculo

			
			dividendo = (Math.pow(x, expoenteEFatorial)); // repete sequencia de cima

			while (auxiliarFatorial > 1) {
				fatorial *= (auxiliarFatorial - 1);
				auxiliarFatorial--;
			}

			senoX -= dividendo / fatorial; // subtrai no resultado final

			fatorial = expoenteEFatorial; // atualiza fatorial para novo valor
			auxiliarFatorial = expoenteEFatorial; // atualiza expoente na variavel auxiliar pro segundo calculo

		}

		senoX = (xResultado - senoX)/100; // angulo x digitado - valor encontrado na relação

		System.out.println(senoX);
		System.out.println(Math.sin(xResultado));
	}

}
