import java.util.Scanner;
public class Ianfontesnicacio_8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
			double baseMaior, baseMenor, altura, areaTotal, valorMetroQuad, valorTotal; 
				
				System.out.println("Digite o valor do lado maior do trap�zio: ");
					baseMaior = in.nextDouble();
				
				System.out.println("Digite o valor do lado menor do trap�zio: ");
					baseMenor = in.nextDouble();
	
				System.out.println("Digite o valor da altura do trap�zio: ");
					altura = in.nextDouble();
					
						areaTotal = (((baseMaior+baseMenor)*altura)/2);
				
				System.out.println("Qual o valor do metro quadrado do terreno? ");	
					valorMetroQuad = in.nextDouble();
					
						valorTotal = areaTotal*valorMetroQuad;
				
					System.out.println("Area do terreno: " + areaTotal + "m�. Valor do terreno: R$" + valorTotal);
	
	
	in.close();
	}

}
