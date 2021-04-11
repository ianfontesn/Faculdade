package roteiro_Matrizes;

import java.util.Scanner;
import java.util.Random;

public class ianfontesnicacio10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("Digite quantas cidades visitará:  ");
		int cidades = in.nextInt();

		int matrizDeCusto[][] = new int[cidades][cidades];
		
		//GERA MATRIZ DE CUSTO
		for (int i = 0; i < cidades; i++) {
			for (int j = 0; j < cidades; j++) {
				
				matrizDeCusto[i][j] = gerador.nextInt(20);

			}
		}
	
		// ROTA 
		int rota[] = new int[cidades];
		
		System.out.println("Digite a sequencia de cidades que irá visitar: ");
		
		for (int i = 0; i < cidades; i++) {
			System.out.print("Cidade [" + (i+1) + "]: ");
			rota[i] = in.nextInt();
		}
		in.close();
		
		int custoTotal = 0;
		
		for(int i = 0; i < (rota.length -1); i++) {
			
			custoTotal += matrizDeCusto[(rota[i] - 1)][(rota[i+1] - 1)];
		}
		
		System.out.println("Custo total: " + custoTotal);
		
		for (int i = 0; i < cidades; i++) {
			System.out.println();
			
			for (int j = 0; j < cidades; j++) {
				
				System.out.print(matrizDeCusto[i][j] + ", "); 
			}
		}

	}
}