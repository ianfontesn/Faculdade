package roteiro2_condicional;
import java.util.Scanner;
   public class ianfontesnicacio_roteiro2_22 {
      public static void main(String[] args) {
         
    	  double numero[] = new double[3];
    	  
    	  	Scanner in = new Scanner(System.in);
    	  	
	    	  System.out.println("Digite 3 numeros quaisquer para ficarem em ordem crescente e decrescente ");
	    	  	System.out.print("n1 = ");
	    	  	numero[0] = in.nextDouble();
	    	  	
	    	  	System.out.print("n2 = ");
	    	  	numero[1] = in.nextDouble();
	    	  	
	    	  	System.out.print("n3 = ");
	    	  	numero[2] = in.nextDouble();
	    	  	
	    	  	in.close();
	    	  	
	    	  		for (int i = 0; i < 2; i++) { // troca de posições no array
	    	  			if (numero[i] > numero[i+1]) {
	    	  				double aux = numero[i];  
	    	  				numero[i] = numero[i+1];
	    	  				numero[i+1] = aux;
	    	  				i=0; //reinicia testes desde o inicio
	    	  			}
	    	  		}
	    	  		
	    	  		System.out.println("Crescente: " + numero[0] + ", " + numero[1] + ", " + numero[2]);
	    	  		System.out.println("Decrescente: " + numero[2] + ", " + numero[1] + ", " + numero[0]);
	    	  	
	    	  	
	    	  		

   
      }
  }