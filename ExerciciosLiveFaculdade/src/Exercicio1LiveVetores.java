import java.util.Scanner;

public class Exercicio1LiveVetores {

	public static void main(String[] args) {

		int idades[] = new int[5];
		
		int menorIgual16Anos = 0, maior16Anos = 0;
		int maisVelho = -999; 
		int maisNovo = 999;
		
		double mediaDasIdades = 0;
		
			System.out.println("Digite a idade dos 5 primeiros alunos:");
			
			Scanner recebe = new Scanner(System.in);
			
			for (int i = 0; i < 5; i++) {
				System.out.print("Idade aluno [" + (i+1) + "]: ");
				idades[i] = recebe.nextInt();
				mediaDasIdades = ((idades[i] + mediaDasIdades)/ idades.length);
				
					if (idades[i] <= 16) {
						menorIgual16Anos++;
					} else {
						maior16Anos++;
					}
					
						if (maisVelho < idades[i]) {
							maisVelho = idades[i];
							
						} else if (maisNovo > idades[i]) {
							maisNovo = idades[i];	
						}
					
				}
			recebe.close();
			
			System.out.println("Qtd alunos maiores que 16: " + maior16Anos);
			System.out.println("Qtd alunos menores ou iguais a 16: " + menorIgual16Anos);
			System.out.println("Aluno mais velho: " + maisVelho + " anos");
			System.out.println("Aluno mais novo: " + maisNovo + " anos");
			System.out.printf("Media de idade dos alunos: %.2f anos", mediaDasIdades);
			
	}

}
