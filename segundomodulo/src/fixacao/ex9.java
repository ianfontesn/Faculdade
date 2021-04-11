package fixacao;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero para tirar o fatorial: ");
		
		float num = in.nextFloat();
		in.close();
		
		float fatorial = isFatorial(num);

		System.out.println(fatorial);
		
	}
	
	// METODO
	static float isFatorial(float num) {
		
		float x = num;
		float f = num;
		
		
		if(num == 0) {
			return 1;
		} else {
			
		
		while(x > 1) {
			
			f = f*(x-1);
			x--;
		}
			
		return f;
	}

	}
}