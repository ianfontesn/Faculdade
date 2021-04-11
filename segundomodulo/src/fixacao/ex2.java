package fixacao;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero qualquer para positivo ou negativo: ");
		
		float num = in.nextFloat();
		in.close();
		
		boolean result = isPositive(num);
		
		if (result) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		
	}

	static boolean isPositive(float num) {
		
		if(num >= 0) {
			
			return true;
			
		} else {
			 return false;
		}
		
	}
	
}
