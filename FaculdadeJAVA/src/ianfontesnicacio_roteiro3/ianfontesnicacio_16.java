package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_16 {
	public static void main(String[] args) {

		int tamanhoVetor, decimal = 0, octalAux;
		long binario;
		String binarioAux = "", octalInverso = "", octal = "", hexadecimalInverso = ""; // aux para gerar o vetor do
																						// tamanho correto.

		Scanner in = new Scanner(System.in);

		System.out.println("Digite um numero binário qualquer para ver suas conversões: ");
		binario = in.nextLong();
		in.close();

		binarioAux = Long.toString(binario); // converte para string para pegar o tamanho do vetor
		tamanhoVetor = binarioAux.length();

		long vetorBinarios[] = new long[tamanhoVetor];

		for (int i = tamanhoVetor; i > 0; i--) { // separando binario no vetor (retorna resto da divisão)
			vetorBinarios[i - 1] = binario % 10;

			if (vetorBinarios[i - 1] < 0 || vetorBinarios[i - 1] > 1) {
				System.err.println("O NUMERO DIGITADO NÃO É BINÁRIO");  //testando binário
				System.exit(0); // FINALIZA PROGRAMA
			} else {
				binario = binario / 10;
			}
		}

		// Decimal

		int indice = 0;
		for (int i = tamanhoVetor; i > 0; i--) {
			decimal += vetorBinarios[i - 1] * Math.pow(2, indice);
			indice++;
		}

		System.out.println("Decimal: " + decimal);

		// octal

		int dividendoParaOctal = decimal;
		int dividendoParaHexadecimal = decimal;

		while (dividendoParaOctal > 7) {
			octalInverso += dividendoParaOctal % 8;
			dividendoParaOctal = dividendoParaOctal / 8;

		}
		octalInverso += dividendoParaOctal;
		octalAux = Integer.parseInt(octalInverso); // convertendo string pra int

		while (octalAux > 0) {
			octal += octalAux % 10;
			octalAux /= 10;
		}

		System.out.println("Octal: " + octal);

		// hexadecimal

		while (dividendoParaHexadecimal >= 15) {

			if (dividendoParaHexadecimal % 16 == 10) {
				hexadecimalInverso += "A";
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;

			} else if (dividendoParaHexadecimal % 16 == 11) {
				hexadecimalInverso += "B";
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;

			} else if (dividendoParaHexadecimal % 16 == 12) {
				hexadecimalInverso += "C";
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;
			} else if (dividendoParaHexadecimal % 16 == 13) {
				hexadecimalInverso += "D";
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;

			} else if (dividendoParaHexadecimal % 16 == 14) {
				hexadecimalInverso += "E";
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;

			} else if (dividendoParaHexadecimal % 16 == 15) {
				hexadecimalInverso += "F";
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;

			} else {
				hexadecimalInverso += dividendoParaHexadecimal % 16;
				dividendoParaHexadecimal = dividendoParaHexadecimal / 16;
			}
		}

		hexadecimalInverso += dividendoParaHexadecimal; // add ultimo numero

		StringBuffer hexadecimal = new StringBuffer(hexadecimalInverso);
		hexadecimal.reverse(); // invertendo a string para mostrar resultado correto

		System.out.println("Hexadecimal: " + hexadecimal);

	}
}