package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_9 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				int ano;
				double valorVeiculo, valorImposto;
					
					System.out.println("Digite o ano do seu veiculo:  ");
						ano = in.nextInt();
					System.out.println("Digite o valor do veiculo: ");
						valorVeiculo = in.nextDouble();
							
							if (ano < 1990) {
								valorImposto = valorVeiculo*1.01 - valorVeiculo;
								System.out.printf("Imposto a ser pago: R$%.2f", valorImposto);
								
							} else {
								valorImposto = valorVeiculo*1.015 - valorVeiculo;
								System.out.printf("Imposto a ser pago: R$%.2f", valorImposto);
							}
					
			in.close();		
				
		}
	}

