import java.util.Scanner;
public class Ianfontesnicacio_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numeroInteiro, sucessor, antecessor;
		
			System.out.println("Digite um número inteiro qualquer: ");
			
				numeroInteiro = in.nextInt();
				sucessor = numeroInteiro+1;
				antecessor = numeroInteiro-1;
				
			System.out.println("Sucessor: " + sucessor + "| Antecessor: " + antecessor);
		
		in.close();
		

	}

}
