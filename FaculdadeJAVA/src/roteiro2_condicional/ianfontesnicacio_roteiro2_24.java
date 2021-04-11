package roteiro2_condicional;
import java.util.Scanner;
   public class ianfontesnicacio_roteiro2_24 {
      public static void main(String[] args) {

    	  Scanner in = new Scanner(System.in);
    	  
    	  int cod, qtd;
    	  double precoTotal = 0, precoDesconto = 0, valorDesconto, valorUnidade = 0;
    	  
    	  		System.out.println("Digite o codigo do produto");
    	  			cod = in.nextInt();
    	  		System.out.println("Digite a quantidade: ");
    	  			qtd = in.nextInt();
    	  			
    	  		in.close();
    	  			
    	  				if(cod >= 1 && cod <=10) {
    	  					precoTotal = qtd*10;
    	  					valorUnidade = 10;
    	  				
    	  				} else if (cod >= 11 && cod <=20) {
    	  					precoTotal = qtd*20;
    	  					valorUnidade = 20;
    	  				
    	  				} else if (cod >= 21 && cod <=30) {
    	  					precoTotal = qtd*30;
    	  					valorUnidade = 30;
    	  				
    	  				} else if (cod >= 31 && cod <=40) {
    	  					precoTotal = qtd*20;
    	  					valorUnidade = 20;
    	  				
    	  				} else {
    	  					System.err.println("Produto inexistente");
    	  					System.exit(0);
    	  					
    	  				}
    	  					
    	  				
    	  				
    	  						if (precoTotal  > 0 && precoTotal <= 250) {
    	  							precoDesconto = precoTotal*0.95;
    	  							valorDesconto = precoTotal - precoDesconto;
    	  									
    	  						} else if (precoTotal  > 250 && precoTotal <= 500) {
    	  							precoDesconto = precoTotal*0.90;
    	  							valorDesconto = precoTotal - precoDesconto;
    	  						
    	  						} else {
    	  							precoDesconto = precoTotal*0.85;
    	  							valorDesconto = precoTotal - precoDesconto;
    	  						} 
    	  						
    	  				System.out.printf("Preço total: R$%.2f \n", precoTotal);
    	  				System.out.printf("Preço com desconto: R$%.2f \n", precoDesconto);
    	  				System.out.printf("Valor do desconto: R$%.2f \n", valorDesconto);
    	  				System.out.printf("Valor da unidade do produto: R$%.2f \n", valorUnidade);
    	
 
      
      
      
      
      
      
      
      
      
      
      
      
      }
  }