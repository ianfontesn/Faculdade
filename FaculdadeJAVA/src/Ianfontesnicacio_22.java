import java.util.Scanner;

public class Ianfontesnicacio_22 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
			
			double a, b, aux = 0;
			
				System.out.println("digite 1 valor para A e um para B: ");
				
					a = in.nextDouble();
					b = in.nextDouble();
				
				System.out.println("A: " + a + " | B: " + b);
				
					aux = a;
					a = b; 
					b = aux;
					
				System.out.println("A: " + a + " | B: " + b);

				
		
		in.close();
	}	
}