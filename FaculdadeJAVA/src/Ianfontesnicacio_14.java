import java.util.Scanner;
public class Ianfontesnicacio_14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
			double area1, area2, areaTotal, potenciaTotal;
				
			System.out.println("Digite a largura da area em metros: ");
				area1 = in.nextDouble();
				
			System.out.println("Digite a altura em metros:");
				area2 = in.nextDouble();
				
				
				//calculo area
				areaTotal = area1*area2;
				
				potenciaTotal = areaTotal*18;
				
					System.out.println("Area total: " + areaTotal + "m². Potencia de iluminação total: " + potenciaTotal + "W.");
			
			in.close();
			
			
	}

}
