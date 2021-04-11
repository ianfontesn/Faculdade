import java.util.Scanner;

public class Ianfontesnicacio_20 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
			
			double salarioMinimo, horasTrabalhadas, horasExtrasTrabalhadas, valorHoraTrabalhada, valorHoraExtra, salarioBruto, salarioExtra, salarioReceber;
				
				System.out.println("Digite o valor do salario minimo: EX (800,00 | 972,43");
					
					salarioMinimo = in.nextDouble();
				
				System.out.println("Digite a quantidade de horas trabalhadas, sem os minutos: ");
					
					horasTrabalhadas = in.nextDouble();
				
				System.out.println("Digite a quantidade de horas extras trabalhadas, sem os minutos: ");
				
					horasExtrasTrabalhadas = in.nextDouble();
				
						valorHoraTrabalhada = salarioMinimo*0.125;
						valorHoraExtra = salarioMinimo*0.25;
						
						salarioBruto = valorHoraTrabalhada*horasTrabalhadas;
						salarioExtra = valorHoraExtra*horasExtrasTrabalhadas;
						
						salarioReceber = salarioBruto+salarioExtra;
						
							System.out.println("Salario a receber: R$" + salarioReceber );
						
						
		in.close();
	}	
}