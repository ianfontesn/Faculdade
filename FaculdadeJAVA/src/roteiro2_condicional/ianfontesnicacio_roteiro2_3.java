package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_3 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				
				double numero1, numero2, quadrado = 0, raiz;
				
					System.out.println("Digite dois numeros: ");
					
					numero1 = in.nextDouble();
					numero2 = in.nextDouble();
					
						if (numero1 == numero2) {
							System.out.println("Numeros iguais");
							
						} else if (numero1 > numero2) {
							if (numero1 > 0) {
								raiz = Math.sqrt(numero1);
								quadrado = Math.pow(numero2, 2);
								System.out.println("Raiz: " + raiz + "| Quadrado: " + quadrado);
								
							} else {
								System.out.println("NUMERO IMAGINARIO");
							}
							
						} else if (numero1 < numero2) {
							if (numero2 > 0) { 
								raiz = Math.sqrt(numero2);
								quadrado = Math.pow(numero1, 2);
								System.out.println("Raiz: " + raiz + "| Quadrado: " + quadrado);
								
							} else {
								System.out.println("NUMERO IMAGINARIO");
							}
						}
					
					in.close();		
				
		}
	}

