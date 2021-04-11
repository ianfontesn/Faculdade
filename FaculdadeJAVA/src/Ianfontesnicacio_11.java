import java.util.Scanner;
public class Ianfontesnicacio_11 {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double conta1, conta2, salario, salarioRestante;
		
			System.out.println("Digite o valor do salario: ");
				salario = in.nextDouble();
				
			System.out.println("digite o valor da conta 1 e posteriormente a conta 2 :");
				conta1 = in.nextDouble();
				conta2 = in.nextDouble();
	
			
					salarioRestante = (salario - ((conta1*1.02) + (conta2*1.02)));
			
			System.out.printf("Salario restante: %.2f", salarioRestante);
			
	in.close();
	}
}
