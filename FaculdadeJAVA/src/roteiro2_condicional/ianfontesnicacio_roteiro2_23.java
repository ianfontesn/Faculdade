package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_23 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
	
				long cpf;
				long cpfComparacao;
				long vetorCpf[] = new long[11];				
				int somatorio = 0, digito1 = 0, digito2 = 0;
				
				
						System.out.println("Digite o numero do seu cpf para saber se é valido: (apenas numeros) ");
						cpf = in.nextLong();
						cpfComparacao = cpf;
						
						
							for (int i = 0; i < 10; i++ ) {
								vetorCpf[10-i] = cpf % 10;
								cpf = cpf/10;
									if(i==9) {
										vetorCpf[0] = cpf;
									}
							}
							
							
							for (int i =0; i < 9; i++) {
								somatorio += (vetorCpf[i]*(10-i));
									if (i == 8) {
										somatorio = somatorio % 11;
									}
										if (somatorio < 2 ) {
											digito1 = 0;
										} else {
											digito1 = 11 - somatorio;
										}
								
							}
							
							somatorio = 0;
							
							for (int i =0; i < 10; i++) {
								somatorio += (vetorCpf[i]*(11-i));
									if (i == 9) {
										somatorio = somatorio % 11;
									}
										if (somatorio < 2 ) {
											digito2 = 0;
										} else {
											digito2 = 11 - somatorio;
										}
								
							}
							
							somatorio = 0;
							
							if(vetorCpf[9] == digito1 && vetorCpf[10] == digito2) {
								System.out.println("CPF digitado: " + cpfComparacao);
								System.out.println("CPF VALIDO");
								System.out.println("Digitos verificadores encontrados: "+ digito1 + digito2);
							} else {
								System.err.println("CPF INVÁLIDO");
							}
							
								
					 in.close();		   
	}				
}
	

