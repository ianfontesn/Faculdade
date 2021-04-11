package roteiro2_condicional;
import java.util.Scanner;
   public class ianfontesnicacio_roteiro2_21 {
      public static void main(String[] args) {
         
    	  int ano;
    	  	Scanner in = new Scanner(System.in);
    	  	
	    	  System.out.println("Digite um ano qualquer para saber se é bissexto: ");
	    	  	ano = in.nextInt();
	    	  		
	    	 in.close();
	    	 			
	    	 	if((ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))) {
	    	 		System.out.println("Ano bissexto");
	    	 	} else {
	    	 		System.out.println("Ano não é bissexto");
	    	 	}
   
      }
  }