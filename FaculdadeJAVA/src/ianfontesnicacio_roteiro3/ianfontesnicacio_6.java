package ianfontesnicacio_roteiro3;
import java.util.Scanner;

public class ianfontesnicacio_6 {
public static void main (String[] args) {
		
	double soma = 0, media = 0;
		Scanner in = new Scanner(System.in);
			System.out.println("Digite até qual numero inteiro positivo deseja somar e tirar a média: ");
				
				int inteiro = in.nextInt();
				
					in.close();
	
		for(int i = 1; i < inteiro+1; i++) {
			
			soma += i ;			
		}
		
		media = soma/inteiro;
		System.out.println("Soma: " + soma + " | Media: " + media);

}
}
