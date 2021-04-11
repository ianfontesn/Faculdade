import java.util.Scanner;

public class Ianfontesnicacio_18 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
			
			double salarioMinimo, valorKwHora, kwConsumido, valorPagar, valorPagarDesconto;
			
				System.out.println("Digite o valor do salario minimo: ");
				
					salarioMinimo = in.nextDouble();
					valorKwHora = salarioMinimo/5;
				
				System.out.println("Digite quantos KW hora foram gastos pela residência: ");
					
					kwConsumido = in.nextDouble();
					
					valorPagar = valorKwHora*kwConsumido;
					valorPagarDesconto = valorPagar*0.85;
					
				System.out.println("Valor Kw/h: R$" + valorKwHora);
				System.out.println("Valor a total pagar: R$" + valorPagar);
				System.out.println("Valor total com desconto de 15%: R$" + valorPagarDesconto);
					
		
		
		
		
		
		in.close();
}	
}