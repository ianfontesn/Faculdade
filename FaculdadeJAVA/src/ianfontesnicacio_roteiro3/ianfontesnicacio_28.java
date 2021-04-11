package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_28 {
	public static void main(String[] args) {

		System.out.println("Digite até qual valor será impresso sua tabuada: ");
		
		Scanner in = new Scanner(System.in);
		
		int tamanhoTabuada = in.nextInt();
		in.close();

		int resultado = 0;
		for (int i = 1; i < tamanhoTabuada + 1; i++) {
			for (int j = 1; j < 11; j++) {
				resultado = i*j;
			
			System.out.println(i + " x " + j + " = " + resultado);
			}
			System.out.println("######################");
			
		}
	}

}
