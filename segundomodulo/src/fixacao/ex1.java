package fixacao;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero correspondente ao m�s: ");
		int mes = in.nextInt();
		in.close();
		
		isMes(mes);

	}


	public static void isMes(int mes) {
		
		String nomeMes[] = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		if (mes < 1 || mes > 12) {
		
			System.err.println("M�s inv�lido.");
		
		} else {
			
			System.out.println(nomeMes[mes-1]);
		
		}
		
	}
	
}

