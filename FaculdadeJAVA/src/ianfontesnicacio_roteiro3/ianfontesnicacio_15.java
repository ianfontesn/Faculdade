package ianfontesnicacio_roteiro3;
import java.util.Scanner;
public class ianfontesnicacio_15 {
public static void main (String[] args) {
		
	int termos = 0;
	int primeiroTermo = 1;
	int segundoTermo = 0;
	int resultado = 0;
	
	Scanner in = new Scanner(System.in);
		System.out.println("Digite quantos termos deseja na serie de fibonacci:  ");
			
			termos = in.nextInt();
			
			in.close();
				
				for (int i = 0; i < termos; i++) {
					
					resultado = primeiroTermo + segundoTermo;
					primeiroTermo = segundoTermo;
					segundoTermo = resultado;
					
					System.out.print(resultado + ", ");	
				}
			
			

}
}