import java.util.Scanner;

public class Ianfontesnicacio_21 {
	
	public static void main (String[] args) {
	
		Scanner in = new Scanner (System.in);
			
			double anguloEscada, alturaParede, tamanhoEscada;
			
				System.out.println("Digite o angulo da escada: ");
					anguloEscada = in.nextDouble();
					
				System.out.println("Digite a altura da parede em metros: ");
					alturaParede = in.nextDouble();
					
						tamanhoEscada = (Math.sin(anguloEscada))*alturaParede;
						
				System.out.printf("Sua escada precisa ter %.2f metros para encostar no topo da parede.", tamanhoEscada);
		
		
		in.close();
	}	
}