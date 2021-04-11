package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_26 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
	
				double salarioBase, salarioLiquido, imposto, gratificacao;
				int ano;
			
					System.out.println("Digite o salario: ");
						salarioBase = in.nextDouble();
					System.out.println("Digite os anos trabalhados: ");
						ano = in.nextInt();
						
						
						//calcula imposto
							if (salarioBase < 200 ) {
								imposto = 0;
								
							} else if (salarioBase >= 200 && salarioBase <= 450) {
								imposto = salarioBase*0.03;
								
							} else if (salarioBase > 450 && salarioBase < 700) {
								imposto = salarioBase*0.08;
							} else {
								imposto = salarioBase*0.12;
								
							}
							
							System.out.printf("Imposto: R$%.2f \n", imposto);
							
						//calcula gratificacao
							
							if (salarioBase <= 500 && ano <= 3 ) {
								gratificacao = salarioBase*0.23;
							} else if (salarioBase <= 500 && (ano > 3 && ano < 6)) {
								gratificacao = salarioBase*0.35;
							} else if (salarioBase <= 500 && ano >= 6) {
								gratificacao = salarioBase*0.33;
							
							} else if (salarioBase > 500 && ano <= 3) {
								gratificacao = salarioBase*0.20;
							} else {
								gratificacao = salarioBase*0.30;
							}
							
							System.out.printf("Gratificação: R$%.2f \n", gratificacao);

						//calcula salario liquido
							
								salarioLiquido = salarioBase + gratificacao - imposto;
								
								System.out.printf("Salario Liquido: R$%.2f \n", salarioLiquido);

						//verifica tabela de salario
								
								if (salarioLiquido <= 350) {
									System.out.println("Classificação (A)");
								} else if (salarioLiquido > 350 && salarioLiquido < 600) {
									System.out.println("Classificação (B)");
								} else {
									System.out.println("Classificação (C)");
								}
							
						
					 in.close();		   
	}				
}
	

