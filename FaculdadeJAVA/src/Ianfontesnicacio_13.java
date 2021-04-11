import java.util.Scanner;
public class Ianfontesnicacio_13 {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			int anoAtual, copasRealizadas =  0;
			
				System.out.println("Digite o ano para verificar quantas copas foram realizadas: ");
				
				anoAtual = in.nextInt();
				
					if(anoAtual == 1946) {
						
						copasRealizadas = ((anoAtual - 1930) /4) -1;
	
					} else if (anoAtual < 1930) {
						
						System.err.println ("As copas começaram em 1930");

						
					} else if (anoAtual > 1930 && anoAtual < 1942) {
						
						copasRealizadas = ((anoAtual - 1930) / 4) ;
						System.out.println(copasRealizadas);
						
					} else {
						
						copasRealizadas = ((anoAtual - 1930) / 4 ) - 2;
						System.out.println(copasRealizadas);
							
								
					}
				in.close();		
		
	}
}
