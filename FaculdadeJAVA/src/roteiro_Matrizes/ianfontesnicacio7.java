package roteiro_Matrizes;

import java.util.Random;

public class ianfontesnicacio7 {

	public static void main(String[] args) {


		Random gerador = new Random();
		
		int menorElemento = 100; //STARTAR COM O VALOR QUE USAR NO GERADOR.
		int linhaDoMenor = 0;
		int colunaDoMaior = 0;
		int minMax = 0;
		
		int matriz[][] = new int[4][7];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				
				matriz[i][j] = gerador.nextInt(100);
				 if(matriz[i][j] < menorElemento) {
					 menorElemento = matriz[i][j];
					 linhaDoMenor = i;
				 }
			}
		}
		
		for (int i = 0; i < 7; i++) {
			if(matriz[linhaDoMenor][i] > minMax) {
				minMax = matriz[linhaDoMenor][i];
				colunaDoMaior = i;
			}
		}
		
		
		System.out.println("MINMAX " + minMax + " linha " + (linhaDoMenor+1) + " coluna " + (colunaDoMaior+1));
	
		for (int i = 0; i < 4; i++ ) {
			System.out.println();
			for (int j = 0; j < 7; j++) {
				System.out.print(matriz[i][j] + ", ");
			}
		}
	
	
	}

}