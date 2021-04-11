import java.util.Scanner;
public class Ianfontesnicacio_9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			int lados = 0, numeroDiagonais = 0;
					
			System.out.println("Digite a quantidade de lado do seu poligono convexo regular: ");
		
				lados = in.nextInt();
				
				numeroDiagonais = (lados*(lados - 3))/2;
				
			System.out.println("Numero de diagonais: " + numeroDiagonais);
	in.close();
	}

}
