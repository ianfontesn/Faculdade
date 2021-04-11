package prova_Vetores_ianfontesnicacio;

import java.util.Scanner;

public class ianfontesnicacio3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String aluno[] = new String[10];
		double nota[] = new double[10];

		double notaAux = 0;
		double maior = 0;
		double menor = 0;
		double media = 0;

		String nomeMaior = "";
		String nomeMenor = "";

		for (int i = 0; i < aluno.length; i++) {

			System.out.println("Digite o nome do aluno[" + (i + 1) + "]: ");
			aluno[i] = in.next();

			int notaInvalida = 1;
			while (notaInvalida == 1) {

				System.out.println("Digite a nota do aluno[" + (i + 1) + "]: ");
				notaAux = in.nextDouble();

				if (notaAux < 0) {
					System.err.println("Nota Inválida.");

				} else {
					notaInvalida = 0;
					nota[i] = notaAux;
					media += notaAux;
				}
			}

			if (notaAux > maior) {
				maior = notaAux;
				nomeMaior = aluno[i] + ", ";

			} else if (notaAux == maior) {
				nomeMaior += aluno[i] + ", ";
			}

			if (notaAux < menor) {
				menor = notaAux;
				nomeMenor = aluno[i] + ", ";

			} else if (notaAux == menor) {
				nomeMenor = aluno[i] + ", ";
			}

		}
		in.close();

		media = media / aluno.length;

		String nomeIgualOuAcimaMedia = "";

		for (int i = 0; i < aluno.length; i++) {
			if (nota[i] >= media) {
				nomeIgualOuAcimaMedia += aluno[i] + ", ";
			}
		}

		System.out.printf("Maior nota: %.2f\n", maior);
		System.out.println(nomeMaior);
		System.out.println();// QUEBRA

		System.out.printf("menor nota: %.2f\n", menor);
		System.out.println(nomeMenor);
		System.out.println(); // QUEBRA

		System.out.printf("Média de notas: %.2f\n", media);

		System.out.println("Alunos Acima da média: " + nomeIgualOuAcimaMedia);

	}
}