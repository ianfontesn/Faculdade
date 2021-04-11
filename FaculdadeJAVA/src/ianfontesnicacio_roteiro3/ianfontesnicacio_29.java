package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_29 {
	public static void main(String[] args) {

		double dividendo = 0, divisor = 0, divisorAux = 0, resto = 0, quociente = 1;

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o dividendo: ");
		dividendo = in.nextDouble();

		System.out.println("Digite o divisor: ");
		divisor = in.nextDouble();
		in.close();
		divisorAux = divisor;

		while (dividendo > divisor) {
			divisor += divisorAux;
			quociente++;
		}

		if (dividendo == divisor) {
			resto = 0;
		} else if (dividendo < divisor) {
			quociente--;
			divisor -= divisorAux;
			resto = dividendo - divisor;

		}

		System.out.println("Quociente> "+ (int)quociente + " | Resto: " + (int)resto);
		System.out.println("Prova: Inteiro> " + (int)(dividendo/divisorAux) + " | resto > " + (dividendo % divisorAux));
	}

}
