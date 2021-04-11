package ianfontesnicacio_roteiro04;

import java.util.ArrayList;

public class ianfontesnicacio_17 {

	public static void main(String[] args) {
 
		long end = 0;
		
		//METODO SEM O METODO DE ERATÓSTENES
		int numero = 3;

		long start = System.nanoTime();
		ArrayList<Integer> primos = new ArrayList<Integer>();
		boolean isPrimo = true;

		while (numero < 100) {
			for (int i = 2; i < numero; i++) {

				if (numero % i == 0) {
					isPrimo = false;
					break;
				} 
			}
			if (isPrimo) {
				primos.add(numero);
				numero++;

			} else {
			numero++;
			isPrimo = true;
			}
		}
		end = System.nanoTime();
		
		System.out.print("2, "); // O DOIS É O UNICO PAR PRIMO.
		for (int resultante : primos) {
			System.out.print( resultante + ", ");
		}
		System.out.println();
		end = (end - start);
		System.out.println("Tempo em nanossegundos: " + end);
		
		//METODO NUTTELA (ERATÓSTENES)
		
		ArrayList<Integer> primosEratostenes = new ArrayList<Integer>();
		
		for (int i = 2; i < 101; i++ ) { // VETOR ALEAT DE 100 NUMEROS A PARTIR DO 2
			primosEratostenes.add(i); 
		}
	
		start = System.nanoTime();

		for (int i = 1; i < primosEratostenes.size(); i++) {
			if((primosEratostenes.get(i) % 2) == 0) {
				primosEratostenes.remove(i);
			}
		}
		for (int i = 2; i < primosEratostenes.size(); i++) {	
			if((primosEratostenes.get(i) % 3) == 0) {
				primosEratostenes.remove(i);
			}
		}
		for (int i = 3 ; i < primosEratostenes.size(); i++) {	
			if((primosEratostenes.get(i) % 5) == 0) {
				primosEratostenes.remove(i);
			}
		}
		for (int i = 4; i < primosEratostenes.size(); i++) {
			
			if((primosEratostenes.get(i) % 7) == 0) {
				primosEratostenes.remove(i);
				
			}
		}
		
		end = System.nanoTime();
		
		System.out.println();
		for(int resultNuttela : primosEratostenes) {
			System.out.print(resultNuttela + ", ");
		}
		System.out.println();
		end = (end - start);
		System.out.println("ERATÓSTENES. Tempo de execução em nanossegundos: " + end);
	}
}
