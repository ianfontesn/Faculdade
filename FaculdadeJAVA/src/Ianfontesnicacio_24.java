import java.util.Scanner;

public class Ianfontesnicacio_24 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
			
			double a, b, c, raiz1, raiz2, delta;
				
				System.out.println("Entre com A, B e C da equação (ax² + bx + c)");
					
					a = in.nextDouble();
					b = in.nextDouble();
					c = in.nextDouble();
					
					delta = ((b*b) - (4*a*c));
						
					//caso delta negativo, não há raizes reais. (problema que o exercicio pede solução)
					
						if (delta < 0 ) {
							
							System.err.println("DELTA " + delta);
							System.err.println("Delta negativo, não há raizes reais");
						
						} else {
						
							raiz1 = (-b + (Math.sqrt(delta)))/(2*a);
							raiz2 = (-b - (Math.sqrt(delta)))/(2*a);
							System.out.println("raiz 1: " + raiz1 + " Raiz 2: " + raiz2);
							
						}
				
		in.close();
	}	
}