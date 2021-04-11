package ianfontesnicacio_roteiro3;
import java.util.Scanner;

public class ianfontesnicacio_21 {
public static void main (String[] args) {
	
	int numero;
	
	String numeroInvertido = "", numeroOriginal = "";
	
	System.out.println("Digite um numero inteiro qualquer para saber se é palindromo: ");
		
	Scanner in = new Scanner(System.in);
	
	numero = in.nextInt();
	numeroOriginal = Integer.toString(numero); // converte int pra string
	in.close();
	
	while (numero > 0) {
		numeroInvertido += numero % 10;
		numero /= 10;
	}
	
	System.out.println("O numero é palindromo?  ");
	System.out.println("TRUE = SIM, FALSE = NÃO:");
	System.err.println(numeroInvertido.equals(numeroOriginal));
	
			
	
	
	
	
	
}

}
