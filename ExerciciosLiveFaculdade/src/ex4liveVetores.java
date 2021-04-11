import java.util.Scanner;

public class ex4liveVetores { // NOTAS ABSOLUTAS E RELATIVAS, DE 0 A 10

	public static void main(String[] args) {

		int notasAlunos[] = new int[10]; // quantidade de notas dos alunos
		int quantidadeDeNotas[] = new int[6]; // valor das notas aceitas
		double valorRelativo[] = new double[6];

		System.out.println("Digite 10 notas para os alunos, valores de 0 a 5: ");

		Scanner recebe = new Scanner(System.in);

		for (int i = 0; i < notasAlunos.length; i++) {
			notasAlunos[i] = recebe.nextInt();

			if (notasAlunos[i] < 0 || notasAlunos[i] > 5) { // define valor de notas de 0 a 5
				System.out.println("A nota precisa ser de 0 a 5! Tente novamente.");
				i--;
			} else {
				quantidadeDeNotas[notasAlunos[i]]++; // contagem de notas
			}
		}
		recebe.close();

		for (int i = 0; i < valorRelativo.length; i++) {
			valorRelativo[i] = (double) quantidadeDeNotas[i] / notasAlunos.length; // quantas vezes a nota aparece,
																					// dividido pelo total de notas
		}

		System.out.println("Nota \t Abs \t Rel");

		for (int i = 0; i < quantidadeDeNotas.length; i++) {
			System.out.println(i + "\t" + quantidadeDeNotas[i] + "\t" + (valorRelativo[i] * 100) + "%");
		}

	}

}
