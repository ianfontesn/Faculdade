package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_2 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				
				double numero;
				
					System.out.println("Digite um numero real qualquer:");
					
					numero = in.nextDouble();
					
				if (numero % 2 == 0) {
					System.out.println("Par");
				} else {
					System.out.println("impar");
				}
				
			in.close();		
				
		}
	}

