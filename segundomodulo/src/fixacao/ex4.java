package fixacao;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero qualquer para par ou impar: ");
		
		float num = in.nextFloat();
		in.close();
		
		boolean result = isEven(num);
		
		if (result) {
			System.out.println("PAR");
		} else {
			System.out.println("Impar");
		}
		
		
	}

	static boolean isEven(float num) {
		
		if((num % 2) == 0) {
			
			return true;
			
		} else {
			
			 return false;
			 
		}
		
	}
	
}
