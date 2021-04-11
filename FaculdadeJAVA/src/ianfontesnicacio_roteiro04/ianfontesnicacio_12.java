package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Entre com 10 numeros reais: ");

		double original[] = new double[10];
		double crescente[] = new double[10];
		double decrescente[] = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Valor [" + (i + 1) + "]: ");
			original[i] = in.nextDouble();
			crescente[i] = original[i];
			decrescente[i] = original[i];
			
		} in.close();
		
		System.err.println("ORDEM ORIGINAL");
		for (double result1 : original) {
			System.out.print(result1 + ", ");
		}
		
		
		// CRESCENTE
		double aux = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				if (crescente[j] > crescente[j + 1]) {
					aux = crescente[j];
					crescente[j] = crescente[j + 1];
					crescente[j + 1] = aux;
				}
			}
		}

		// PRINTA RESULTADO
		System.out.println(); //QUEBRA LINHA
		System.err.println("ORDEM CRESCENTE");
		for (double result1 : crescente) {
			System.out.print(result1 + ", ");
			
		}

		System.out.println(); // QUEBRA LINHA
		
		// DECRESCENTE
		aux = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				if (decrescente[j] < decrescente[j + 1]) {
					aux = decrescente[j];
					decrescente[j] = decrescente[j + 1];
					decrescente[j + 1] = aux;
				}
			}
		}

		// PRINTA RESULTADO
		System.err.println("ORDEM DECRESCENTE");
		for (double result1 : decrescente) {
			System.out.print(result1 + ", ");
			
		}
	}
}
