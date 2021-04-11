package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_1 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				
				double numero;
				
					System.out.println("Digite um numero real qualquer:");
					
					numero = in.nextDouble();
					
				if (numero == 0) {
					System.out.println("Zero.");
				} else if (numero > 0) {
					System.out.println("Positivo");
				} else {
					System.out.println("Negativo");
				}
				
			in.close();		
				
		}
	}

