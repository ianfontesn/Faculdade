package avaliacaoEstruturaRepeticao;
import java.util.Scanner;

public class ianfontesnicacio2 {
public static void main (String[] args) {

	int numero = 0, digito = 0, maiorDigito = 0;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo qualquer: ");
		numero = in.nextInt();
		in.close();
		int auxNumero = numero;
		
		while(numero != 0) {
			digito = numero % 10;
			if (digito > maiorDigito ) {
				maiorDigito = digito;
			}
			
			numero = numero/10;
			
		}
			System.out.println("A menor base aceita para o numero [" + auxNumero + "] é [" + (maiorDigito + 1) + "]");
}
}
