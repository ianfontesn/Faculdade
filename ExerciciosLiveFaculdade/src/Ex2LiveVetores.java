import java.util.Scanner;

public class Ex2LiveVetores {

	public static void main(String[] args) {
		
		double vetorOriginal[] = new double[10];
		//double vetorInverso[] = new double[10];
		
		Scanner recebe = new Scanner(System.in);
		
		System.out.println("Digite 10 números: ");
		
			for (int i = 0; i < 10; i++) {
				System.out.print("[" + (i+1) +"º] Número: ");
				vetorOriginal[i] = recebe.nextDouble();
			}
			
			for (int i = 0; i < vetorOriginal.length; i++) {
				System.out.print("|" + vetorOriginal[i] + "|");
				
			}
			
			System.out.println("");
			
			for (int i = vetorOriginal.length; i > 0 ; i--) {
				System.out.print("|" + vetorOriginal[i-1] + "|");
			}
		
		recebe.close();
		
	}

}
