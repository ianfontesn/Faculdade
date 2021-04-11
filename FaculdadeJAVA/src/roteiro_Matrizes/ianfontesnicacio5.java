package roteiro_Matrizes;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ianfontesnicacio5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("#.##");
		
		int provasColunas = 0;
		int alunosLinhas = 0;
		double media = 0;
		double auxNota = 0;

		System.out.println("Quantos alunos? ");
		alunosLinhas = in.nextInt();
		System.out.println("Quantas provas? ");
		provasColunas = in.nextInt();

		double matrizNotas[][] = new double[alunosLinhas][provasColunas];
		String nomes[] = new String[alunosLinhas];

		// CADASTRA NOMES
		for (int i = 0; i < nomes.length; i++) {

			System.out.println("Cadastre o nome do[" + (i + 1) + "º] aluno: ");
			nomes[i] = in.next();

		}

		// CADASTRA NOTAS
		for (int i = 0; i < alunosLinhas; i++) {
			for (int j = 0; j < provasColunas; j++) {

				System.out.println(nomes[i] + "| Nota prova[" + (j + 1) + "]: ");
				matrizNotas[i][j] = in.nextDouble();
				media += matrizNotas[i][j];

				// QUANDO ULTIMA PROVA, TIRA MÉDIA E VERIFICA SITUAÇÃO, AO FINAL ATUALIZA A
				// SITUAÇÃO NO VETOR DE NOMES.
				if (j == (provasColunas - 1)) {

					auxNota = (media / provasColunas);
					String notaFormatada = formatar.format(auxNota); // APENAS PARA FICAR BONITO RSRSRS
					
					
					if (auxNota >= 7) {
						
						nomes[i] += " | MEDIA: " + notaFormatada + " | SITUAÇÃO: APROVADO\n";

					} else if (auxNota > 4 && auxNota < 7) {

						nomes[i] += " | MEDIA: " +  notaFormatada + " | SITUAÇÃO: EXAME ESPECIAL\n";

					} else {

						nomes[i] += " | MEDIA: " + notaFormatada + " | SITUAÇÃO: REPROVADO\n";

					}
					// ZERA AUXILIARES PRA NOVA MEDIA
					auxNota = 0;
					media = 0;

				}
			}
		}
		in.close();

		for (int i = 0; i < nomes.length; i++) {

			System.out.printf(nomes[i]);

		}

	}

}
