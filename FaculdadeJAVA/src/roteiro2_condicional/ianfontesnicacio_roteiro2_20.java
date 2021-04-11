package roteiro2_condicional;
import java.util.Scanner;
   public class ianfontesnicacio_roteiro2_20 {
      public static void main(String[] args) {
         
    	  int n1, n2;
    	  	Scanner in = new Scanner(System.in);
    	  	
	    	  System.out.println("Digite um numero inteiro qualquer: ");
	    	  	n1 = in.nextInt();
	    	  System.out.println("Digite outro numero inteiro qualquer: ");
	    	  	n2 = in.nextInt();
	    	  	
	    	  	in.close();
	    	  	
	    	  		if((n1%n2) == 0) {
	    	  			System.out.println("n1 é multiplo de n2");
	    	  		} else {
	    	  			System.out.println("n1 não é multiplo de n2");
	    	  		}
	    	 
   }
  }