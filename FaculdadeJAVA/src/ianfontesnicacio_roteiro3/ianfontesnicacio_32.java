package ianfontesnicacio_roteiro3;

public class ianfontesnicacio_32 {
	public static void main(String[] args) {
		long numero = 2;
		long divisores = 0, perfeito = 0;
		String numerosPerfeitos = "";
	
		while (perfeito != 5) {
			divisores = 0;
		for (int i = 1; i < numero; i++) {
		
			if (numero % i == 0) {
				divisores += i;
			} 
		}
		 if (divisores == numero) {
			 perfeito++;
			 numerosPerfeitos = numero + " | ";
			 System.out.println(numerosPerfeitos);
		 }
		 	numero++;
		}
		
	}

}
