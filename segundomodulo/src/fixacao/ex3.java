package fixacao;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero para verificar se é nulo: ");
		
		float num = in.nextFloat();
		in.close();
		
		boolean result = isZero(num);
		
		if (result) {
			System.out.println("Nulo");
		} else {
			System.out.println("Não nulo.");
		}
		
		
	}

	static boolean isZero(float num) {
		
		if(num == 0) {
			
			return true;
			
		} else {
			
			 return false;
			 
		}
		
	}
	
}
