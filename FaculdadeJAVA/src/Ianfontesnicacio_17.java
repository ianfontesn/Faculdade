import java.util.Scanner;
public class Ianfontesnicacio_17 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero, inteiro, fracionario;
		
			System.out.println("Digite um numero real qualquer: ");
				
				numero = in.nextDouble();
	
					inteiro = (int)numero;
					fracionario = numero - inteiro;
					
					
					System.out.printf("Inteiro: %.0f | Fracionario: %2f" , inteiro, fracionario);
				
	
	in.close();
	}

}
