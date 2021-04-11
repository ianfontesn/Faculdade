import java.util.Scanner;

public class live3exercicio4 {

	public static void main(String[] args) {
		
		Scanner recebe = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro qualquer: ");
		
		//digitando numero inteiro
		
			int num1 = recebe.nextInt();
			int resultadoDaSoma = 0;
			double resultadoMedia = 0;
			
			for (int i = 0; i <= num1; i++) {
				resultadoDaSoma = resultadoDaSoma + i;
			}
			resultadoMedia = resultadoDaSoma/num1;
			System.out.println(resultadoDaSoma);
			System.out.println(resultadoMedia);
	
	}
}
