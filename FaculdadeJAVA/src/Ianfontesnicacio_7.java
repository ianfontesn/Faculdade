import java.util.Scanner;
public class Ianfontesnicacio_7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
			double area = 0, ladoMaior = 0, ladoMenor = 0;
				
				System.out.println("Digite o valor do lado maior do retangulo: ");
					ladoMaior = in.nextDouble();
				
				System.out.println("Digite o valor do lado menor do retangulo: ");
					ladoMenor = in.nextDouble();
					
						area = ladoMaior*ladoMenor;
					
				System.out.println("Area do retangulo: " + area + "m²");
	in.close();
	}

}
