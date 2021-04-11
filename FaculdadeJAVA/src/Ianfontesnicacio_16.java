import java.util.Scanner;
public class Ianfontesnicacio_16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			int minutos, horas;
			
				System.out.println("Digite uma quantidade de minutos qualquer: ");
					
					minutos = in.nextInt(); //recebe minutos
					
					horas = minutos/60; //define as horas

					minutos = minutos%60; // atualiza minutos com o resto da divisão
					
					
				System.out.println("Horas: " + horas + "| Minutos: " + minutos);
					
	in.close();
	}

}
