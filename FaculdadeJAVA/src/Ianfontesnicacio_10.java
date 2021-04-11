import java.util.Scanner;
public class Ianfontesnicacio_10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
			double taxaFixa = 0.05, capitalInicial, montanteFinal;
			int periodo = 24;
			
				System.out.println("Digite o valor a ser aplicado: (ex: 1000,53)");
					capitalInicial = in.nextDouble();
				
					
				double aux = (double)Math.pow((1+taxaFixa), periodo); 
				montanteFinal = capitalInicial*aux;
				
					System.out.printf("Valor a receber em %d mes(es): R$%.2f", periodo, montanteFinal);
		
	in.close();
	}

}
