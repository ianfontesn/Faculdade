package ianfontesnicacio_roteiro3;

public class ianfontesnicacio_22 {
	public static void main (String[] args) {
		
		
		int cidadeA = 500000, cidadeB = 700000, ano = 2015;
	
		while(cidadeA < cidadeB) {
			cidadeA += cidadeA * 0.03;
			cidadeB += cidadeB * 0.02;
			ano++;
			
			
		}
		
		ano = ano - 2015;	
		System.out.println("Anos passados: " + ano + " | Cidade A: " + cidadeA + " Habt | Cidade B: " + cidadeB + " Habt");
	
	}

}
