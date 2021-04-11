package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_4 {
public static void main (String[] args) {
		
	double num = 0, resultado = 0;
	
		while (num != -999) {
			
			System.out.println("Digite um numero qualquer para saber seu triplo: (-999 encerra o programa)");
				Scanner in = new Scanner(System.in);
				num = in.nextDouble();
					
					if(num != -999) {
					resultado = num*3;
					System.out.println("RESULTADO: " + resultado);
					
					} else {
						System.err.println("-999, programa encerrado.");
						in.close();
					}
		}
	}
}
