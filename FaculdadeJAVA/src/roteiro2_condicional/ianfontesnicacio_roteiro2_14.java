package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_14 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
					
				double diametro, carga, tensao = 0 , n;
				
					System.out.println("Digite o dimetro da barra cilindrica");
						diametro = in.nextDouble();
						
					System.out.println("Digite a carga Q aplicada na barra");
					    carga = in.nextDouble();
					        
					    	if (diametro > 100) {
					    		n = 2;
					    	} else if (diametro < 50) {
					    		n = 6;
					    	} else {
					    		n = 4;
					    	}

					    		tensao = ((4*carga)/((Math.PI)*(Math.pow(diametro, 2))))*n;
					    		
					    			System.out.println("Tensão: " + tensao);
					 in.close();		   
	}				
}
	

