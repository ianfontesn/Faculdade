package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_3 {
	public static void main (String[] args) {
		
	int termos = 0;
	int primeiroTermo = 1;
	int segundoTermo = 0;
	int resultado = 0;
	
	Scanner in = new Scanner(System.in);
		System.out.println("Digite quantos termos deseja na serie de fibonacci:  ");
			
			termos = in.nextInt();
			
			in.close(); // Encerra Scaner
				
			int vetorResultado[] = new int[termos];

			for (int i = 0; i < termos; i++) {
					
					resultado = primeiroTermo + segundoTermo;
					primeiroTermo = segundoTermo;
					segundoTermo = resultado;
					
					vetorResultado[i] = resultado;
				}

			for (int i = 0; i < termos; i++) {
				System.out.print(vetorResultado[i] + ", ");
			}
}
}