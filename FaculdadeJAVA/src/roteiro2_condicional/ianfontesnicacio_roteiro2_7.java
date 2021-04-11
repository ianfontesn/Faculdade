package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_7 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
			
				String caracter = "";
					
					System.out.println("Digite uma letra para saber se é vogal");
					caracter = in.next();
							
						switch (caracter) {
							
							case "a":
								System.out.println("Vogal");
								break;
						
							case "e":
								System.out.println("Vogal");
								break;
								
							case "i":
								System.out.println("Vogal");
								break;	
							
							case "o":
								System.out.println("Vogal");
								break;
								
							case "u":
								System.out.println("Vogal");
								break;
								
							default:
								System.out.println("Consoante, numero ou acento.");
								break;

						}	
				
			in.close();		
				
		}
	}

