import java.util.Scanner;
public class Ianfontesnicacio_4 {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, peso1, peso2, peso3, pesoTotal, mediaComum, mediaPonderada = 0;
		
			System.out.println("Digite a nota e em seguida o peso da nota para calcular a média ponderada | Apenas 3 notas |");
				
			nota1 = in.nextDouble();
			peso1 = in.nextDouble();
			nota2 = in.nextDouble();
			peso2 = in.nextDouble();
			nota3 = in.nextDouble();
			peso3 = in.nextDouble();
			
			pesoTotal = peso1+peso2+peso3;
			
		if(pesoTotal == 0) {
			
			mediaComum = ((nota1+nota2+nota3)/3);
			System.out.printf("Média: %.2f ",  mediaComum);
			
		} else {
			
			mediaPonderada = (((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/ (peso1+peso2+peso3));
			System.out.printf("Média: %.2f ",  mediaPonderada);
		
	
		}
		in.close();
	}
}
