package fixacao;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor de a, b e c para DELTA: ");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		in.close();
		
		float delta = isDelta(a, b, c);
		
		System.out.println(delta);
		
	}

	static float isDelta (float a, float b, float c) {
		
		float delta = (float)(Math.pow(b, 2)) - 4 * a * c;
		
		return delta;
		
	}
	
}
