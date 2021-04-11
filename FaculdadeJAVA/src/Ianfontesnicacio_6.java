import java.util.Scanner;
public class Ianfontesnicacio_6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			double salarioFixo = 0, valorVendas = 0, salarioReceber = 0;
			
				System.out.println("Digite o valor do salario fixo: ");
					salarioFixo = in.nextDouble();

				System.out.println("Divida o valor vendido: ");
					valorVendas = in.nextDouble();

			valorVendas = valorVendas*0.04;
			
			salarioReceber = valorVendas+salarioFixo;
				
				System.out.println("Salario a receber: R$" +salarioReceber);
	in.close();
	
	}

}
