import java.util.Scanner;

public class Ianfontesnicacio_12 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
		
			double kmFixoPorDia, rua1, rua2, ruaTotal, ruaHipotenusa, qtdVoltas;
		
				System.out.println("digite o tamanho da rua A, em metros: ");
					rua1 = in.nextDouble();
					
				System.out.println("digite o tamanho da rua B, em metros: ");
					rua2 = in.nextDouble();
					//calcular rua C (metros)
					
					ruaHipotenusa = Math.sqrt(((Math.pow(rua1, 2)) + (Math.pow(rua2, 2))));
							
				System.out.println("Quantos KM pretende correr diariamente?");
					kmFixoPorDia = in.nextDouble();
			
					ruaTotal = (rua1+rua2+ruaHipotenusa)/1000; //soma perimetro e converte pra kilometros.
					
				
					qtdVoltas = kmFixoPorDia/ruaTotal;
					
					
					System.out.printf("Voltas: %.2f",qtdVoltas);
					
					
					
					
			
			
	in.close();
}	
}