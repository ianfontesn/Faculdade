import java.util.Scanner;

public class Ianfontesnicacio_19 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
			
			double numeroQualquer, quadrado, cubo, raizQuad, raizCub;
			
			int repetir = 1;
			
			while (repetir == 1) {
				
				System.out.println("Digite um numero positivo qualquer: ");
			
					numeroQualquer = in.nextDouble();
					
						if (numeroQualquer > 0) {

							quadrado = Math.pow(numeroQualquer, 2);
							cubo = Math.pow(numeroQualquer, 3);
							raizQuad = Math.sqrt(numeroQualquer);
							raizCub = Math.cbrt(numeroQualquer);
							
								repetir = 0;
							
							System.out.println("Ao quadrado: " + quadrado + " | Ao cubo:" + cubo );
							System.out.printf("Raiz quadrada: %.2f | Raiz Cubica: %.2f", raizQuad ,raizCub);
							
						} else {
							System.err.println("Apenas números positivos!");
						}
					}
		in.close();
	}	
}