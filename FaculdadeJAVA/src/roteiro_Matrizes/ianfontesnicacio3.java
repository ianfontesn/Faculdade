package roteiro_Matrizes;

import java.util.Scanner;
import java.util.Random;

public class ianfontesnicacio3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random gerador = new Random();

		int matrizGerada[][] = new int[3][4];
		int linha = 0, coluna = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {

				matrizGerada[i][j] = gerador.nextInt(15)+1;

			}
		}

		while (linha == 0) { //PEDIR LINHA.

			System.out.println("Digite o tamanho de uma matriz: ");
			System.out.print("Linhas: ");
			linha = in.nextInt();

			if (linha == 4) {
				System.out.print("colunas: ");
				coluna = in.nextInt();

			} else {

				System.err.println("Multiplicação não é possivel.");
				linha = 0;
			}
		} // FECHA WHILE
		
		int matrizDigitada[][] = new int [linha][coluna];
		int resultante[][] = new int [3][coluna];
		
		System.out.println("Preencha a matriz com numeros inteiros: ");
		
		for (int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				
				System.out.print("Posição[" + (i+1) + "][" + (j+1) + "]: ");
				matrizDigitada[i][j] = in.nextInt();
			
			}
		}
		
		
		int resultAux = 0;
		
		
		// OPERAÇÃO

				
				
			
			
			
		
		
		
		
		
	}

}
