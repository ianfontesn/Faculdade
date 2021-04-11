package prova_matrizes_ianfontesnicacio;
import java.util.Random;
import java.util.Scanner;

public class ianfontesnicacio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da sua imagem. Apenas inteiros ");
		int tamanho = in.nextInt();
		
		in.close();
		
		Random gerador = new Random();
		
		int vermelho[][] = new int[tamanho][tamanho];
		int verde[][] = new int[tamanho][tamanho];
		int azul[][] = new int[tamanho][tamanho];
		int cinza[][] = new int[tamanho][tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				vermelho[i][j] = gerador.nextInt(255);
				verde[i][j] = gerador.nextInt(255);
				azul[i][j] = gerador.nextInt(255);
				}
				}

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				
				cinza[i][j] = ((vermelho[i][j] + verde[i][j] + azul[i][j])/3);
				
				}
				}
		System.err.printf("CINZA\n");
		for ( int i = 0; i < 10; i++) {
			System.out.println();
			for(int j = 0; j < 10; j++) {
				System.out.print(cinza[i][j] + ", ");
				
				}
				}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				cinza[i][j] = (255 - cinza[i][j] );
			
				}
				}
		System.out.printf("\n");
		System.err.printf("NEGATIVA\n");
		for ( int i = 0; i < 10; i++) {
			System.out.println();
			for(int j = 0; j < 10; j++) {
				System.out.print(cinza[i][j] + ", ");
				
				}
				}
	
	}
}
