package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_19 {
	
public static void main (String[] args) {
	
	System.out.println("Digite números aleatoriamente, a vontade, ao digitar -1 encerra! (: No final, teremos a média dos positivos apenas!");
		
	Scanner in = new Scanner(System.in);
	
	int contadorParaMedia = 0;
	double numero = 0, numeroPositivo = 0;
	
	while(numero != -1) {
		
		numero = in.nextDouble();
		
		if (numero >= 0) {
			numeroPositivo += numero;
			contadorParaMedia++; //incrementa para tirar media depois! (:
		} 
	}
	in.close();
	numeroPositivo /= contadorParaMedia;
	System.out.println(numeroPositivo);
	
}
}
