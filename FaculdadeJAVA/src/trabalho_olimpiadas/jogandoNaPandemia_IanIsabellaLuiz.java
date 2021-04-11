package trabalho_olimpiadas;
import java.util.Scanner;

public class jogandoNaPandemia_IanIsabellaLuiz {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		// RECEBE TAMANHO DO TABULEIRO
		int tamanho = in.nextInt();

		int tabuleiro[][] = new int [tamanho][tamanho];
		
		// RECEBE PEÇAS
		for(int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				tabuleiro[i][j] = in.nextInt();
			}
		} 
		in.close();
	
		// VERIFICAÇÃO
		for (int i = 1; i < tamanho; i++) {
			for (int j = 1; j < tamanho; j++) {
				
				// VERIFICA SOMA DAS PEÇAS.
				 int soma = (tabuleiro[i-1][j-1]) + (tabuleiro[i-1][j]) + (tabuleiro[i][j-1]); 
				 
				 if(soma == 0 || soma == 1) { // 0 E 1 PEÇA PRETA
					 tabuleiro[i][j] = 1; 
				
				 } else if(soma == 2 || soma == 3) { // 2 E 3 PEÇA BRANCA
					 tabuleiro[i][j] = 0;
				 }
			}
		}
	
	System.out.println(tabuleiro[tamanho-1][tamanho-1]);
	
	
	}
}
