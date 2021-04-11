import java.util.Scanner;
public class Ex3LiveVetores {													//SEQUENCIA DE FIBONACCI

	public static void main(String[] args) {

		Scanner recebe = new Scanner(System.in);
		
		int quantidadeDeNumerosNaSequencia = 0;
		int numeroAntecessor1 = 1;
		int  numeroAntecessor2 = 0;
		int resultado = 0;
		
			System.out.print("Digite quantos numeros deseja na sua sequencia de fibonnaci: ");
			quantidadeDeNumerosNaSequencia = recebe.nextInt();
			
		
		int sequenciaFibonnaci[] = new int[quantidadeDeNumerosNaSequencia];
		
			for (int i = 0; i < quantidadeDeNumerosNaSequencia; i++) {

				resultado = numeroAntecessor1+numeroAntecessor2;
				numeroAntecessor1 = numeroAntecessor2;
				numeroAntecessor2 = resultado;
				
				
				System.out.print("|" + resultado);
			}
		recebe.close();
	}

}
