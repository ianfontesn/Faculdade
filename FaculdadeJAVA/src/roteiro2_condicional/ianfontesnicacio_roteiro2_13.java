package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_13 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
					
				double peso, altura, imc;
				
					System.out.println("Digite seu peso: em kilos: Ex: 78,6.  ");
						peso = in.nextDouble();
						
					System.out.println("Digite sua altura em metros");
					    altura = in.nextDouble();
					        
					    	imc = peso/(Math.pow(altura, 2));
	
					    		if (imc < 18.5) {
					    			System.out.println("Abaixo do Peso");
					    			
					    		} else if (imc >= 18.5 && imc < 25) {
					    			System.out.println("Peso normal");
					    			
					    		} else if (imc >= 25 && imc < 30) {
					    			System.out.println("Acima do peso");
					    			
					    		} else {
					    			System.out.println("obeso");
					    		}
					 
					 in.close();		   
	}				
}
	

