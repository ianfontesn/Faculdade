package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_13 {
public static void main (String[] args) {
		
	double num = 0;
	int aux = 0;   //0 n� � primo, 1 � primo.
	
	Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero qualquer para saber se � primo: ");
			
			num = in.nextDouble();
			
			in.close();
			
			if(num == 2) {
				System.out.println("O numero 2 � o unico primo par!");
			
			} else {
			
			
				for (int i = 2; i < num; i++) {
					
					if (num%i == 0) {   // se o resto for 0, n�o � primo
						aux = 0;
						break;
						
					} else {
						aux = 1;
					}
				}
				
				if(aux == 1) {
					System.out.println("O numero " + num + " � primo.");
				
				} else {
				System.out.println("O numero " + num + " n�o � primo.");
		
				}
			}
}
}