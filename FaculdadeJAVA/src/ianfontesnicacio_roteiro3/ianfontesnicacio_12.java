package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_12 {
public static void main (String[] args) {
		
int auxMediaMenos200Veic = 0;
double maior = -999999, menor = 999999, somaVeiculos = 0, mediaVeiculos = 0, mediaMenos200Veic = 0;
String nomeMaior = "", nomeMenor = "";

	Scanner in = new Scanner(System.in);
			
			double acidentes[] = new double[5];
			double veiculos[] = new double[5];
			double razaoCidVeic[] = new double[5];
			String cidades[] = new String[5];
						
			System.out.println("Entre com os valores: (nome da cidade, qtd acidentes e qtd veiculos)");
				for(int i = 0; i < 5; i++) { 								//recebendo valores e nomes nos vetores.
					System.out.printf("Cidade [%d]: ", i+1);
					cidades[i] = in.next();
					System.out.printf("Acidentes: ");
					acidentes[i] = in.nextDouble();
					System.out.printf("Veiculos: ");
					veiculos[i] = in.nextDouble();
					
					somaVeiculos += veiculos[i];    					// soma de todos os veiculos
									
						if (acidentes[i] > maior) {                      //maior e menor indice acidentes
							maior = acidentes[i];
							nomeMaior = cidades[i] + ", ";
						
						} else if (acidentes[i] == maior) {
							maior = acidentes[i];
							nomeMaior += cidades[i]+ ", ";
						
						}
						
						if (acidentes[i] < menor) {
							menor = acidentes[i];
							nomeMenor = cidades[i] + ", ";
						
						} else if (acidentes[i] == menor) {
							menor = acidentes[i];
							nomeMenor += cidades[i] + ", ";
							
						}
				}
				
							mediaVeiculos = somaVeiculos/5;  			 //media dos veiculos nas 5 cidades
							in.close();
				
				for (int i = 0; i < 5; i++) {							//razao cidade/veiculo de cada cidade
					razaoCidVeic[i] = acidentes[i] / veiculos[i];
					
				}
				
				for (int i = 0; i < 5; i++) {                          //iterando vetor procurando valor menor que 200
					if(veiculos[i] < 200) {
						auxMediaMenos200Veic++;							//auxiliar para media
						mediaMenos200Veic += acidentes[i];
					}	
				}
				
						mediaMenos200Veic = mediaMenos200Veic/auxMediaMenos200Veic; //media de acidentes
						
						
						
				System.out.println("Maior indice de acidentes: ");
				System.out.println("Cidade: " + nomeMaior + "[" + maior + " acidentes]");
				
				System.out.println("");

				
				System.out.println("Menor indice de acidentes: ");
				System.out.println("Cidade: " + nomeMenor + "[" + menor + " acidentes]");
				
				System.out.println("");

				
				System.out.println("Razão acidentes/veiculos das 5 cidades: ");
					for (int i = 0; i < 5; i++) {
					System.out.println("Cidade [" + i+1 + "] " + razaoCidVeic[i] + " acidentes");
					}
					
				System.out.println("");

				System.out.println("Media de veiculos nas 5 cidades " + mediaVeiculos + " veiculos.");
					
				System.out.println("");

				
				System.out.println("Media de acidentes nas cidades com menos de 200 veiculos: " + mediaMenos200Veic + " acidentes.");	
}			
}












