package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_8 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				double salario, salarioNovo;
					
					System.out.println("Digite seu salario para saber o valor a receber com o reajuste: ");
						
						salario = in.nextDouble();
							
							if (salario < 700) {
								salarioNovo = salario*1.3; //+30%
								System.out.println("Novo salario: R$" + salarioNovo);
							} else {
								salarioNovo = salario*1.1; // +10%
								System.out.println("Novo salario: R$" + salarioNovo);

							}
			in.close();		
				
		}
	}

