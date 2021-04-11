package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_8 {
public static void main (String[] args) {
	
	Scanner in = new Scanner (System.in);
	System.out.println("Digite quantas posições quer no seu vetor para testes: ");
	int tamanhoDoVetor = in.nextInt();
	
	double vetor1[] = new double[tamanhoDoVetor];
	double vetor2[] = new double[tamanhoDoVetor];
	double vetorResultante[] = new double[tamanhoDoVetor];
	
	System.out.println("Entre com os [" + tamanhoDoVetor + "] valores do vetor 1: ");
	for (int i = 0; i < tamanhoDoVetor; i++) {
		vetor1[i] = in.nextDouble();
	}
	
	System.out.println("Entre com os [" + tamanhoDoVetor + "] valores do vetor 2: ");
	for (int i = 0; i < tamanhoDoVetor; i++) {
		vetor2[i] = in.nextDouble();
		
	} in.close(); // ENCERRA SCANNER
	
	for (int i = 0; i < tamanhoDoVetor; i++) {
		if (vetor1[i] == vetor2[i]) {
			vetorResultante[i] = 1;
			System.out.println((int)vetorResultante[i] + ", ");
		} else {
			vetorResultante[i] = 0;
			System.out.println((int)vetorResultante[i] + ", ");
			
		}
	}
	
	
}
}
