package ianfontesnicacio_prova1;
import java.util.Scanner;

public class ianfontesnicacio_03 {
	public static void main (String[] args) {
			
		
			double anguloA, anguloB, anguloC;
			
				Scanner in = new Scanner(System.in);
					
					System.out.println("Digite o valor de 3 angulos para verificar o tipo e a possibilidade de um TRIANGULO.");
					System.out.println("Primeiro: ");
						anguloA = in.nextDouble();
					System.out.println("Segundo: ");	
						anguloB = in.nextDouble();
					System.out.println("Terceiro: ");
					    anguloC = in.nextDouble();
					    
					    in.close();
					    
					    if ((anguloA + anguloB + anguloC) != 180) {
					    	System.out.println("N�o � triangulo");
					    	
					    } else if((anguloA == anguloB) && anguloC == anguloA) {
					    	System.out.println("EQUIL�TERO");
					    	
					    } else if (anguloA > 90 || anguloB > 90 || anguloC > 90) {
					    	System.out.println("Obtus�ngulo");
					    } else if ((anguloA == 90) ^ (anguloB == 90) ^ (anguloC == 90)) {
					    	
					    }
	
	}	
}
