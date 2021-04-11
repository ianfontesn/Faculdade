package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_11 {
public static void main (String[] args) {
		
int tamanhoVetor = 0;
double maior = -999, menor = 999, soma = 0, media = 0;
String nomeMaior = "", nomeMenor = "";

	Scanner in = new Scanner(System.in);
		System.out.println("Digite quantos numeros deseja testar para saber qual é maior e menor: ");
			tamanhoVetor = in.nextInt();
			
			double notas[] = new double[tamanhoVetor];
			String nomes[] = new String[tamanhoVetor];
						
			System.out.println("Entre com os valores:");
				for(int i = 0; i < tamanhoVetor; i++) { //recebendo valores e nomes nos vetores.
					System.out.printf("Nota [%d]: ", i+1);
					notas[i] = in.nextDouble(); 
					System.out.printf("Nome: ");
					nomes[i] = in.next();
					
						if (notas[i] > maior) {
							maior = notas[i];
							nomeMaior = nomes[i];
						} 
						
						if (notas[i] < menor) {
							menor = notas[i];
							nomeMenor = nomes[i];
						}
						
							soma += notas[i];
													
						
				} in.close();
						
							media = soma/tamanhoVetor;
				
				
						
					System.out.println("Menor " + nomeMenor + " [" + menor + " ponto(s)]   |   Maior: " + nomeMaior +  " [" + maior + " ponto(s)]");
					System.out.println("Soma: " + soma + " | Média: " + media);
}
}