package fixacao2;

import java.util.Scanner;

public class ex0 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.printf("Selecione a opção \n" + "1 - PERMUTAÇÃO \n" + "2 - ARRANJOS \n" + "3 - COMBINAÇÕES \n\n");

		int opcao = in.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Formula Pn = n! - Escolha o valor de n.");

			float n = -1;
			while (n < 0) {
				System.out.println("n >= 0: ");
				n = in.nextFloat();
			}

			float permutation = isFactorial(n);
			System.out.println(permutation);
			break;

		case 2:
			System.out.println("Formula Pn,k = n! / (n-k)!  - Escolha o valor de n e k.");

			float n1 = -1;
			while (n1 < 0) {
				System.out.println("n >= 0: ");
				n1 = in.nextFloat();
			}

			float k1 = -1;
			while (k1 < 0) {
				System.out.println("k >= 0: ");
				k1 = in.nextFloat();
			}

			float arrangements = isArrangements(n1, k1);

			System.out.println(arrangements);
			break;

		case 3:
			System.out.println("Formula Cn,k = n! / [k! * (n-k)]!  - Escolha o valor de n e k.");

			float n2 = -1;
			while (n2 < 0) {
				System.out.println("n >= 0: ");
				n2 = in.nextFloat();
			}

			float k2 = -1;
			while (k2 < 0) {
				System.out.println("k >= 0: ");
				k2 = in.nextFloat();
			}

			float combinations = isCombinations(n2, k2);
			System.out.println(combinations);
			break;

		default:
			System.err.println("Opção inválida.");

		}// TERMINO SWITCH(OPÇÃO)

		in.close();

	} // TERMINO METODO MAIN

	// METODO FATORIAL
	static float isFactorial(float n) {

		if (n == 0) {
			return 1;
		} else {
			return n * isFactorial(n - 1);
		}
	}

	// METODO ARRANJOS
	static float isArrangements(float n1, float k1) {
		
		float aux = n1-k1;
		if (aux < 0) {
			System.err.println("n - k resulta em negativo, escolha outro valor. ");
			return 0;
		} else {
		
		float n = isFactorial(n1);
		float k = isFactorial((n1 - k1));

		float arrangements = n / k;
		return arrangements;
		}
	}
	// METODO COMBINAÇÕES

	static float isCombinations(float n2, float k2) {
		// Cn,k = n! / [k! * (n-k)]!

		float aux = n2-k2;
		if (aux < 0) {
			System.err.println("n - k resulta em negativo, escolha outro valor.");
			return 0;
		} else {
	
		float n = isFactorial(n2);
		float k = isFactorial(k2);
		float nk = isFactorial((n2 - k2));

		float combinations = n / (k * (nk));
		return combinations;
	}
	}
}