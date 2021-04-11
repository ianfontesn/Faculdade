package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_10 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
				int idade;
				double peso, gotas;
				
				
					System.out.println("Digite sua idade: ex: 12  ");
						idade = in.nextInt();
					System.out.println("Digite seu peso:  ");
						peso = in.nextDouble();
						
							if(idade >= 12 && peso >= 60) {
								gotas = (1000/500)*20;
								System.out.printf("Tomar %.2f gotas ", gotas);
							} else if (idade >= 12 && peso < 60) { 
								gotas = (875/500)*20;
								System.out.printf("Tomar %.2f gotas ", gotas);
							}
							
							if (idade < 12) {
								if (peso >= 5 && peso <= 9) {
									gotas = (125/500)*20;
									System.out.printf("Tomar %.2f gotas ", gotas);
									
								} else if (peso > 9 && peso <= 16) {
									gotas = (250/500)*20;
									System.out.printf("Tomar %.2f gotas ", gotas);									
									
								} else if (peso > 16 && peso <= 24) {
									gotas = (375/500)*20;
									System.out.printf("Tomar %.2f gotas ", gotas);									
									
								} else if (peso > 24 && peso <= 30) {
									gotas = (500/500)*20;
									System.out.printf("Tomar %.2f gotas ", gotas);									
									
								} else if (peso > 30) {
									gotas = (750/500)*20;
									System.out.printf("Tomar %.2f gotas ", gotas);									
									
								} else {
									System.out.println("Esse medicamento é contra-indicado em caso de suspeita de dengue.");
									System.err.println("E também não é indicado para pesos menores que 5kg. ");
								}
							}
							
							
			in.close();		
				
		}
	}

