package prova_matrizes_ianfontesnicacio;

import java.util.Scanner;

public class ianfontesnicacio2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] nome = new String[30];
		int[][] notas = new int[30][15];
		int[] disciplinaSoma = new int[15];
		int[] disciplinaMedia = new int[15];
		int MaiorNota = 0;
		int notaAluno = 0;
		int MaiorMedia = 0, diciplina = 0, MenorNota = 0, AlunoMenorN = 0;
		int MenorMedia = 0, diciplina2 = 0;
		double[] soma = new double[30];
		double[] Media = new double[30];

		for (int i = 0; i < 30; i++) {
			System.out.println("Aluno " + (i + 1) + ": ");
			nome[i] = in.nextLine();
		}
		
		
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Agora digite a " + (j) + " nota do aluno " + nome[i]);
				notas[i][j] = j;
			}
			
			
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma[i] += notas[i][j];
			}
			
			
			Media[i] = soma[i] / 15;
			if (soma[i] > MaiorNota) {
				MaiorNota = (int) soma[i];
				notaAluno = i;
			}
			
			
			
			if (soma[i] < MenorNota) {
				MenorNota = (int) soma[i];
				AlunoMenorN = i;
			}
		}
		
		
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 30; j++) {
				disciplinaSoma[i] += notas[j][i];
			}
		}
		
		
		for (int i = 0; i < 15; i++) {
			disciplinaMedia[i] = disciplinaSoma[i] / 15;
			if (disciplinaMedia[i] > MaiorMedia) {
				diciplina = i;
			}
			
			
			
			if (disciplinaMedia[i] < MaiorMedia) {
				diciplina2 = i;
			}

		}
		
		
		in.close();
		for (int i = 0; i < 30; i++) {
			System.out.println("Media Auno " + nome[i] + " por disciplonas:" + Media[i]);
			System.out.println("Maior nota:" + nome[notaAluno] + " Menor Nota:"
					+ nome[AlunoMenorN]);
			System.out.println("Media maior Materia:" + diciplina
					+ " menor materia" + diciplina2);
		}

	}
}