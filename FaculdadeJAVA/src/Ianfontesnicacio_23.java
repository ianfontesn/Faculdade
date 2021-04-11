public class Ianfontesnicacio_23 {

	public static void main(String[] args) {
				
		int a = 1450, b = 1150, c = 900, ab = 350, bc = 300, ac = 400, abc = 100, universo = 3000;
		int resultado = 0;
		
				ab = ab-abc;
				bc = bc-abc;
				ac = ac-abc;
				a = a - (ab+ac+abc);
				b = b - (ab+bc+abc);
				c = c - (ac+bc+abc);
				resultado = universo - (a+b+c+ab+bc+ac+abc);
				
		System.out.println(resultado);
		
		//resultado é 450 no papel! =D
	}

}
