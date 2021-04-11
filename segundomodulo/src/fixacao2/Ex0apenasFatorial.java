package fixacao2;
import java.util.Scanner;
public class Ex0apenasFatorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero para tirar o fatorial: ");
		
		float num = in.nextFloat();
		in.close();
		
		float fatorial = isFactorial(num);

		System.out.println(fatorial);
		
	}
	
	// METODO
	static float isFactorial(float n) {

		if (n == 0) {
			return 1;
		} else {
			return n * isFactorial(n - 1);
		}
	

	}
}