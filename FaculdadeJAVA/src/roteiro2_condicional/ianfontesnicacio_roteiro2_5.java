package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_5 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				
				double custoDeFabrica, precoFinal;
				
					System.out.println("Digite o custo de fabrica do veiculo: ");
						custoDeFabrica = in.nextDouble();
						
							if(custoDeFabrica <= 28000 && custoDeFabrica > 0) {
								precoFinal = custoDeFabrica*1.05;
									System.out.println("Preço final: R$" + precoFinal);
								
							} else if (custoDeFabrica > 28000 && custoDeFabrica <= 45000 ) {
								precoFinal = custoDeFabrica*1.25;
									System.out.println("Preço final: R$" + precoFinal);

							} else if (custoDeFabrica > 45000) {
								precoFinal = custoDeFabrica*1.35;
									System.out.println("Preço final: R$" + precoFinal);

							} else {
									System.out.println("Custo de fabrica não pode ser 0 ou negativo.");
							}
								
								
			in.close();		
				
		}
	}

