import java.util.Scanner;
public class Ianfontesnicacio_5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			double salarioBase = 0, salarioReceber = 0; 
			double gratificacao = 1.1,  /*(10%)*/ desconto = 0.95; //(5%)
				
				System.out.println("Digite o salario base para saber quanto vai receber (ex: 1000,32)");
				
				
					salarioBase = in.nextDouble();
					
					salarioReceber = (salarioBase*gratificacao)*desconto;
					
				System.out.println("Salario a receber: R$" +salarioReceber);	
	
	in.close();
	
	}

}
