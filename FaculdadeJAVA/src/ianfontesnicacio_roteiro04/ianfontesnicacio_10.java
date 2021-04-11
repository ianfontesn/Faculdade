package ianfontesnicacio_roteiro04;
import java.util.Scanner;

public class ianfontesnicacio_10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double numeros[] = new double[10];
		double S = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Numero [" + (i+1) + "]: ");
			numeros[i] = in.nextDouble();
			
		} in.close();
		
		double sAux = 0;
		for (int i = 0; i < 5; i++) {
			S = (numeros[i] - numeros[9-i]); //SUBTRAI 
			S = Math.pow(S, 2); // ELEVA AO QUADRADO
			
			sAux += S;   //ARMAZENA EM S AUXILIAR, REPETE O LOOP 
						//E SOMA O VALOR QUE SERÁ O ANTERIOR + O LOOP SEGUINTE  (:

		}
		
		System.out.println(sAux);
		
		
		
		
		
		
		
		
		
		
		

	}

}
