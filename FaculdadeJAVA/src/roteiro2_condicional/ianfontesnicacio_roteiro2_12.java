package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_12 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
					
					System.out.println("Digite o valor de X: ");
					
					 int idade;				   
					        
					             System.out.printf("Digite o numero da idade do nadador para saber sua categoria.\n");
					               idade = in.nextInt();
					                       
					                if (idade >= 0 && idade < 5) {
					                     System.out.println("Não está disponivel categoria de 0 a 4 anos");
					                     
					                } else if (idade >=5 && idade <= 7) {
					                     System.out.println("Categoria INFANTIL (5 A 7 ANOS)");
					                     
					                } else if (idade >= 8 && idade <= 10) {
					                     System.out.println("Categoria JUVENIL (8 A 10 ANOS)");
					                    
					                } else if (idade >= 11 && idade <= 15) {
					                     System.out.println("Categoria ADOLESCENTE (11 A 15 ANOS)");
					                     
					                } else if (idade >= 16 && idade <= 40) {
					                     System.out.println("Categoria ADULTO (16 A 40 ANOS)");
					                     
					                } else if (idade > 40 && idade <= 110) {
					                     System.out.println("Não está disponivel cateria para idades acima dos 40 anos.");
					                
					                } else if (idade > 110) {
					                     System.out.printf("AHAM, QUERO VER VOCÊ NADAR COM %d ANOS \n", idade);
					              
					                } else if (idade < 0) {
					                     System.out.printf("E essa idade negativa ai ? como faz? Benjamin Button?\n");
					                
					                }
			in.close();		   
		}				
		}
	

