package ianfontesnicacio_roteiro3;



public class ianfontesnicacio_25 {
	public static void main(String[] args) {

		Double S = 0.0;
		
		int x = 3;
		for (int i = 0; i < 25; i++) {

			S += 1 / (Math.pow(x, 3));
			x += 2;

			S -= 1 / (Math.pow(x, 3));
			x += 2;
		}
		
		S = 1 - S;
	
		double pi = Math.cbrt((S * 32));
		System.out.println("PI Formula: " + pi);
		System.out.println("PI Classe MATH: "+Math.PI);
	}

}
