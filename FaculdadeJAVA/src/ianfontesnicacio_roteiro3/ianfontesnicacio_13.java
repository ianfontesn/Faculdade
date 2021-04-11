package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_13 {
public static void main (String[] args) {
		
	double num = 0;
	int aux = 0;   //0 nã é primo, 1 é primo.
	
	Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero qualquer para saber se é primo: ");
			
			num = in.nextDouble();
			
			in.close();
			
			if(num == 2) {
				System.out.println("O numero 2 é o unico primo par!");
			
			} else {
			
			
				for (int i = 2; i < num; i++) {
					
					if (num%i == 0) {   // se o resto for 0, não é primo
						aux = 0;
						break;
						
					} else {
						aux = 1;
					}
				}
				
				if(aux == 1) {
					System.out.println("O numero " + num + " é primo.");
				
				} else {
				System.out.println("O numero " + num + " não é primo.");
		
				}
			}
}
}