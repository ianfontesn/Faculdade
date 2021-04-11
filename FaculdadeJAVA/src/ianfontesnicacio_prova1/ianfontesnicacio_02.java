package ianfontesnicacio_prova1;
import java.util.Scanner;

public class ianfontesnicacio_02 {
	public static void main (String[] args) {
			
		
			int coordenadas[] = new int[2];
		
				Scanner in = new Scanner(System.in);
					
					System.out.println("Digite as coordenadas X e Y do toque da bola: (VALORES de -500 a 500");
					System.out.println("X = ");
						coordenadas[0] = in.nextInt();
					System.out.println("Y = ");
						coordenadas[1] = in.nextInt();
				
						in.close();
		
							if((coordenadas[0] < (-500) || coordenadas[0] > 500) || (coordenadas[1] < (-500) || coordenadas[1] > 500)) {
								System.out.println("Posição invalida.");
								
							} else if ((coordenadas[0] > 355 || coordenadas[0] < (-355)) || (coordenadas[1] > 355 || coordenadas[1] < 0)){
								System.out.println("FORA!");
								
							} else { 
								System.out.println("DENTRO!");
							}
						
	}
}
