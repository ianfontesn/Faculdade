package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_21 {

	public static void main(String[] args) {

		int numeroDeEntradas = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Entre com o tamanho da sequência.");
		numeroDeEntradas = in.nextInt();
		int tamanhoMontanha[] = new int[numeroDeEntradas];

		// RECEBE VALORES DO TAMANHO DA MONTANHA
		for (int i = 0; i < (numeroDeEntradas); i++) {
			System.out.print("Tamanho[" + (i + 1) + "]: ");
			tamanhoMontanha[i] = in.nextInt();

		}
		in.close();

		// TESTE DO PICO
		int pico = 0;

		for (int i = 1; i < numeroDeEntradas - 1; i++) {
			if (tamanhoMontanha[i] > tamanhoMontanha[i - 1] && tamanhoMontanha[i] > tamanhoMontanha[i + 1]) {
				pico++;
			}

		}
		System.out.println();
		if (pico > 1) {
			System.out.println("| S | " + pico + " picos.");
		} else if (pico == 1) {
			System.out.println("| N |  Apenas um pico.");
		} else {
			System.out.println("INDEFINIDO.");
		}

	}

}
