package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_15 {

	public static void main(String[] args) {

		double numeros[] = new double[5];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com 5 valores quaisquer para o vetor: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("[" + (i+1) +"]: " );
			numeros[i] = in.nextDouble();
			
		} in.close(); //ENCERRA SCANNER
		
		double somatorio = 0, produto = numeros[0];
		for(int i = 0; i < 5; i++) {
			somatorio += numeros[i];
			produto *= numeros[i];
			
		}
		
		System.out.println("Somatório: " + somatorio);
		System.out.println("Produto: " + produto);

	}
	
}
