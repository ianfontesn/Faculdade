package fixacao;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite dois numeros para ver qual é o maior: ");
		float num1 = in.nextFloat();
		float num2 = in.nextFloat();
		in.close();
		
		float maior = isBigger(num1, num2);
		
		System.out.println(maior);
		
	}

	static float isBigger (float num1, float num2) {
		
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
		
	}
	
}
