package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_14 {
public static void main (String[] args) {
		
	int num = 0;

	
	Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero para calcular seu fatorial:  ");
			
			num = in.nextInt();
			
			in.close();
			
			for (int i = num; i > 1; i--) { // chega no 0 para execu��o
				num = num*(i-1);  //numero i-1 porque � o numero * 1 a menos!
				
			}
			
			System.out.println("resultado: " + num);
				
}
}