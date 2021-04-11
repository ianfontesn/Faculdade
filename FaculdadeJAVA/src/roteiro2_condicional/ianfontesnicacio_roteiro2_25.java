package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_25 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
	
			String sexo;
			double altura, peso;
			
				System.out.println("Digite M para masculino e F para feminino: ");
					sexo = in.next();
				System.out.println("Digite sua altura: Ex 1,68");
					altura = in.nextDouble();
					
					
					
					switch(sexo) {
					case "M" :
						peso = (72.7*altura) - 58;
						System.out.println("peso ideal: " + peso);
						break;
						
					case "m" :
						peso = (72.7*altura) - 58;
						System.out.println("peso ideal: " + peso);
						break;				
					
						
					case "F" : 
						peso = (62.1*altura) - 44.7;
						System.out.println("peso ideal: " + peso);
						
					case "f" : 
						peso = (62.1*altura) - 44.7;
						System.out.println("peso ideal: " + peso);
						
					default:
						System.out.println("Não foi identificado homem ou mulher. Digite apenas M ou F");
					}
					
					
					 in.close();		   
	}				
}
	

