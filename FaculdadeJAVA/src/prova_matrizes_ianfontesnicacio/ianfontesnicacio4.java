package prova_matrizes_ianfontesnicacio;


import java.util.Random;
import java.util.Scanner;

public class ianfontesnicacio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random generator = new Random();
		int m [][] = new int[9][9];
		int aux = 0;
		for(int i = 0; i < 9 ; i++){
			System.out.println();
			for(int j = 0; j < 9 ; j++){
				aux = generator.nextInt(9);
		        m[i][j] = aux;
				System.out.print(m[i][j]); 
			
				}
	    }
         boolean achou = false;
         aux = 0;
		
		for(int x = 0; x < 9 ; x++){
			for(int y = 0; y < 9 ; y++){
				for (int i = 0; i < 9 && achou == false; i++)
				{
					for (int j = 0; j < 9; j++) 
					{
						if(m[x][y] == m[i][j])
						{
							achou = true;
						}
					}
				}
				if(achou)
				{
					aux++;
					 
				}
			
			       }
	    }
		if(aux>0) {
			System.out.println("nao sudoku");
		}
		else {
			System.out.println("Sudoku");
		}
		
		
		
		 
	
	}
	
	}

