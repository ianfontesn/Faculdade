import java.util.Scanner;
public class Ianfontesnicacio_15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			double raio, area;
			final double pi = 3.1416;
	
				System.out.println("Digite o raio da circunfer�ncia: ");
				
				raio = in.nextDouble();
				area = 2*pi*raio;
				
				System.out.println("Area da circunfer�ncia: " + area);
				
	in.close(); 
	
	}

}
