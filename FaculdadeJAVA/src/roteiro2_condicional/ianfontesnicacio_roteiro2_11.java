package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_11 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				
				double x = 0, fx;
					
					System.out.println("Digite o valor de X: ");
						
						x = in.nextDouble();
						
							if (x <= 1) {
								fx = 1;
								System.out.println("F(x) = " +fx);
							
							} else if (x > 1 && x <=2) {
								fx = 2;
								System.out.println("F(x) = " +fx);

							} else if (x > 2 && x <= 3) {
								fx = Math.pow(x, 2);
								System.out.println("F(x) = " +fx);		
								
							} else {
								fx = Math.pow(x, 3);
								System.out.println("F(x) = " +fx);
							}
							
			in.close();		
				
		}
	}

