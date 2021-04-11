package roteiro_Matrizes;

import java.util.Scanner;
import java.util.Random;

public class ianfontesnicacio12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Random gerador = new Random();
		
		
		double estoque[][] = new double[5][3];
		int maiorProd2 = 0; int armazemProd2 = -1; 
		int menorEstoque = Integer.MAX_VALUE; int armazemMenorEstoque = -1;
		
		for(int i = 0; i < 5; i ++) {
			for (int j = 0; j < 3; j++) {
				if (i == 4) {														 // ULTIMA LINHA COM PREÇO DE ESTOQUE POR UNIDADE
					System.out.print("Preço unidade produto [" + (j+1) + "]: ");
					estoque[i][j] = in.nextDouble(); 
				} else {
					estoque[i][j] = gerador.nextInt(40); 									// 40 UNIDADES DO PRODUTO
				}
			}
		}
		System.out.println();
		in.close();
		
		// CALCULOS
		int estoqueTotal = 0;
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) { 
				
				estoqueTotal += estoque[i][j];

				if(j == 1 && estoque[i][j] > maiorProd2) { // MAIOR ESTOQUE PROD 2
					maiorProd2 = (int)estoque[i][j];
					armazemProd2 = (i+1);
				}
			
				if(j == 2 && estoqueTotal < menorEstoque) { // MENOR ESTOQUE TOTAL
					menorEstoque = estoqueTotal;
					armazemMenorEstoque = (i+1);
				}
				
			}

			System.out.println("Estoque armazem [" + (i+1) + "]: " + estoqueTotal); // PRINTA ESTOQUE TOTAL DE CADA ARMAZEM
			estoqueTotal = 0;
		}
		
		// VERIFICANDO COLUNAS PARA CALCULO DE VALOR
		
		double maiorCusto = 0;
		double aux = 0;
		int armazemMaiorCustoTotal  = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				
				if(j == 4) {
					
					aux = aux*estoque[j][i];
					
					if(maiorCusto < aux) {		// MAIOR CUSTO DE ESTOCAGEM.
						maiorCusto = aux;
						armazemMaiorCustoTotal = (i+1);
					}
					
				} else {
					aux += estoque[j][i];
				}
			}
		}
		
		// EXIBINDO RESULTADOS
	System.out.println();
	System.out.println("Armazem maior estoque produto 2: Armazem[" + armazemProd2 + "]   " + maiorProd2 + " unidades.");
	System.out.println("Armazem menor estoque total: Armazem[" + armazemMenorEstoque + "]   " + menorEstoque + " unidades");
	System.out.printf("Armazem maior custo de estocagem: Armazem[%d] -   R$%.2f\n" ,armazemMaiorCustoTotal, maiorCusto );
	
	// EXIBE TABELA GERADA AUTOMATICAMENTE COM RANDOM PARA CONFERENCIA DE RESULTADOS.
	for (int i = 0; i < 5; i++) {
		System.out.println();
		for (int j = 0; j < 3; j++) {
			System.out.print(estoque[i][j] + " - ");
		}
	}
	
	
	
	
	}
}