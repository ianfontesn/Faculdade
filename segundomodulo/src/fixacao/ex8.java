package fixacao;
import java.util.Random;
public class ex8 {

	public static void main(String[] args) {

		Random gerador = new Random();
		
		int aleatorio[] = new int[10];
		
		for (int i = 0; i < aleatorio.length; i++) {
		
			aleatorio[i] = gerador.nextInt(20);
			System.out.print(aleatorio[i] + ", ");
		}
		
		System.out.println();
		
		double media = isAverage(aleatorio);
		
		System.out.printf("media: %.2f", media);
	}

	static double isAverage (int aleatorio[]) {
	
		double media = 0;
		for (int i = 0; i < aleatorio.length; i++) {
			media += aleatorio[i];
		}
		
		media = media/aleatorio.length;
		
		return media;
	}
}
