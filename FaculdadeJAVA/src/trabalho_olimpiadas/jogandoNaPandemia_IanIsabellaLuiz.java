package trabalho_olimpiadas;
import java.util.Scanner;

public class jogandoNaPandemia_IanIsabellaLuiz {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		// RECEBE TAMANHO DO TABULEIRO
		int tamanho = in.nextInt();

		int tabuleiro[][] = new int [tamanho][tamanho];
		
		// RECEBE PE�AS
		for(int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				tabuleiro[i][j] = in.nextInt();
			}
		} 
		in.close();
	
		// VERIFICA��O
		for (int i = 1; i < tamanho; i++) {
			for (int j = 1; j < tamanho; j++) {
				
				// VERIFICA SOMA DAS PE�AS.
				 int soma = (tabuleiro[i-1][j-1]) + (tabuleiro[i-1][j]) + (tabuleiro[i][j-1]); 
				 
				 if(soma == 0 || soma == 1) { // 0 E 1 PE�A PRETA
					 tabuleiro[i][j] = 1; 
				
				 } else if(soma == 2 || soma == 3) { // 2 E 3 PE�A BRANCA
					 tabuleiro[i][j] = 0;
				 }
			}
		}
	
	System.out.println(tabuleiro[tamanho-1][tamanho-1]);
	
	
	}
}
