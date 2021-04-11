package roteiro_Matrizes;

import java.util.Scanner;

public class ianfontesnicacio8 {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
	
		
		int tamanho = 0;
		int numero = 0;
		
		System.out.println("Digite o tamanho da matriz quadrada: ");
		tamanho = in.nextInt();
		
		int matriz[][] = new int[tamanho][tamanho];
		
		System.out.println("Preencha a matriz: ");
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.print("L[" + (i+1) + "]  C[" + (j+1) + "]:");
				numero = in.nextInt();
				
				if (numero == 0 || numero == 1) {
					matriz[i][j] = numero;
				} else {
					System.err.println("Matriz não é de permutação.");
					System.exit(1);
				}
	
			}
		}
		in.close();
		
		int qtdDeUns = 0;
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
		
				if(matriz[i][j] == 1 ) {
					qtdDeUns++;
				}
				if(j == (tamanho - 1) && qtdDeUns != 1) {
					System.err.println("Matriz não é de permutação.");
					System.exit(1);
				} else if(j == (tamanho - 1) && qtdDeUns == 1) {
					qtdDeUns = 0;
				}
		
			}
		}
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println();
			for (int j = 0; j < tamanho; j++) {
			System.out.print(matriz[i][j] + ", ");
			
			}
			}
		System.out.println();
		System.out.println("É MATRIZ DE PERMUTAÇÃO.");
		
	}

}