import java.util.Scanner;
public class Ianfontesnicacio_3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
			double num1, num2, num3, resultado = 0;
			int repetir = 1;
			
				System.out.println("Digite 2 numeros reais para multiplicar: ");
					
					num1 = in.nextDouble();
					num2 = in.nextDouble();
			
		while(repetir == 1) {
			System.out.println("Digite um número real para dividir pelo resultado dos dois anteriores: ");
				
				num3 = in.nextDouble();
				
			if(num3 == 0) {
				System.out.println("Não é possível dividir por zero!");
			} else {
				
				repetir = 0;
				resultado = (num1*num2)/num3;
				
			}
			
		}
			
			System.out.println("O resultado é: " + resultado);
			
		in.close();
	}	

}
