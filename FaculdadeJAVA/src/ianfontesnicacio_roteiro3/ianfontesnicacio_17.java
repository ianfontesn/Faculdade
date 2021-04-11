package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_17 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite dois números inteiros para saber seu MDC: ");

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		in.close();
		int r1 = 0;

		do {

			r1 = n1 % n2;

			if (r1 == 0) {

				System.out.println("MDC: " + n2);

			} else {

				n1 = n2;
				n2 = r1;

			}

		} while (r1 != 0);

	}
}