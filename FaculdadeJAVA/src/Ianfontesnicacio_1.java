import java.util.Scanner;

public class Ianfontesnicacio_1 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
		
			double n1, n2, n3, soma, media;
				
				System.out.println("Digite 3 números para somar e tirar a média: ");
				
				n1 = in.nextDouble();
				n2 = in.nextDouble();
				n3 = in.nextDouble();
				
					soma = n1+n2+n3;
					media = soma/3;
					
				System.out.println("A soma: "+ soma + "| A média: "+ media);
		
		in.close();
}	
}