package avaliacaoEstruturaRepeticao;
import java.util.Scanner;

public class ianfontesnicacio3 {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int irmao = 0;
		
		int numero = 0;
		
		System.out.println("Digite um numero inteiro positivo qualquer: ");
		numero = in.nextInt();
		in.close();
		for (int i = 1; i < numero+1; i++) {
		
			if(numero % i == 0) {
			irmao += i;
			
		}
		}
		if(irmao % 2 == 0) {
			System.out.println("Numero [" + numero + "] é irmão par. A soma é [" + irmao + "]");
		} else {
			System.out.println("Numero [" + numero + "] é irmão impar. A soma é [" + irmao + "]");

		}
		
		
	}
}
