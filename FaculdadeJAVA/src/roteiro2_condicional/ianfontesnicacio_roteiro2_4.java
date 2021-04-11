package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_4 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				
				double a, b, c, r, delta, raiz1 = 0, raiz2 = 0; // ax²+bx+c
				
					System.out.println("Digite os coeficientes abc da equação de segundo grau ax²+bx+c");
					
						a = in.nextDouble();
						b = in.nextDouble();
						c = in.nextDouble();
						
							if (a != 0) {
								delta = (b*b) - (4 * a * c);
								if (delta < 0) {
									System.out.println("Não há raizes reais.");
								} else {
									raiz1 = (-b + (Math.sqrt(delta)) / (2*a));
									raiz2 = (-b - (Math.sqrt(delta)) / (2*a));
									
										System.out.println("Raiz' = " + raiz1 + "| Raiz'' = " + raiz2);
								}
								
							} else if (a == 0 && b != 0) {
								
								System.out.println("Não é uma equação do segundo grau.");
								
									r = -(c)/(b);
									System.out.println("Resultado: " + r);
								
							} else {
								System.out.println("Não é uma equação do primeiro grau nem do segundo.");
							}
				
								
								
			in.close();		
				
		}
	}

