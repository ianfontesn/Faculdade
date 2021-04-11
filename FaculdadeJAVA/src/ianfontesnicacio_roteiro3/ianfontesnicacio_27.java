package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_27 {
	public static void main(String[] args) {

		System.out.println("Digite a altura do triangulo ( apenas numeros inteiros positivos): ");
		
		Scanner in = new Scanner(System.in);
		
		int tamanhoTriangulo = in.nextInt();
		in.close();
		
		String triangulo = "";
		
		for (int i = 0; i < tamanhoTriangulo; i++) {
			triangulo += "#";
			System.out.println(triangulo);
		}
				
		
		
	}

}
