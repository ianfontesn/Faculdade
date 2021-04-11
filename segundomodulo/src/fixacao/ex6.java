package fixacao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o valor de a, b e c para DELTA: ");

		float a = 0;
		while (a == 0) {
			a = in.nextFloat();
			if (a == 0) {
				System.out.println(" O [a] precisa ser diferente de zero.");
			}
		}

		float b = in.nextFloat();
		float c = in.nextFloat();
		in.close();

		float delta = isDelta(a, b, c);

		if (Math.sqrt(delta) % 1 == 0 && delta > 0) {

			isDeltaReal(delta, a, b);

		} else if ((Math.sqrt((-1 * (delta))) % 1 == 0) && delta < 0) {

			isDeltaImag(((-1 * delta)), a, b);

		} else {
			System.err.println("O valor de delta resulta em um numero decimal.");
			isDeltaReal(delta, a, b);

		}

	}

	static float isDelta(float a, float b, float c) {

		float delta = (float) (Math.pow(b, 2)) - 4 * a * c;

		return delta;

	}

	static void isDeltaReal(float delta, float a, float b) {

		float x1 = (float) (-b + Math.sqrt(delta)) / 2 * a;
		float x2 = (float) (-b - Math.sqrt(delta)) / 2 * a;

		System.out.println("x1: " + x1 + "  x2: " + x2);

	}

	static void isDeltaImag(float delta, float a, float b) {

		float calcDelta = (float) Math.sqrt(delta);
		float aux1 = -b / (2 * a);
		float calcDeltaPosit = (calcDelta / (2 * a));
		float calcDeltaNegat = (-calcDelta / (2 * a));

		if (calcDeltaPosit > 0) {

			System.out.println("x1: " + aux1 + "+" + calcDeltaPosit + "i");
			System.out.println("x2: " + aux1 + "" + calcDeltaNegat + "i");

		} else {

			System.out.println("x1: " + aux1 + "" + calcDeltaPosit + "i");
			System.out.println("x2: " + aux1 + "+" + calcDeltaNegat + "i");

		}

	}

}
