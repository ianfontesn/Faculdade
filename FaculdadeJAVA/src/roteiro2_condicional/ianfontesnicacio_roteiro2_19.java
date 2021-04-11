package roteiro2_condicional;
import java.util.Scanner;
   public class ianfontesnicacio_roteiro2_19 {
      public static void main(String[] args) {
         
         int numero, decimal = 0;
         int auxiliar1[] = new int[4];
         int auxiliar2[] = new int[4];
         int auxiliarInteiro;
         
            Scanner in = new Scanner(System.in);
            
        		System.out.println("Digite um numero binário de até 4 bits: ");
        			numero = in.nextInt();
        			auxiliarInteiro = numero;
        			in.close();
        			
        				if (numero > 1111 || numero < 0) { //testando binario de 4 bits
        					System.out.println("Apenas binarios de 4 bits.");
        				} else {
        			
        				for (int i = 0; i < 4; i++) {      //add bit no vetor
        					auxiliar1[3-i] = auxiliarInteiro % 10;
        					
        					if(auxiliar1[3-i] < 0 || auxiliar1[3-i] > 1) { // testa se é 0 ou 1
        						System.out.println("Não é binario");
        						break;
        					} else {
        						auxiliarInteiro = auxiliarInteiro/10; // se for 0 ou 1, atualiza variavel com numero sem o bit testado
        							
        					}
        				
        				}
        					
        	// se for 1, add valor decimal correspondente ao bit no vetor para somar no final, poderia ter feito um for também kkk
        				if (auxiliar1[3] == 1) {
        					auxiliar2[3] = 1;
        				} else {
        					auxiliar2[3] = 0;
        				}
        				
        				if (auxiliar1[2] == 1) {
        					auxiliar2[2] = 2;
        				} else {
        					auxiliar2[2] = 0;
        				}
        				
        				if (auxiliar1[1] == 1) {
        					auxiliar2[1] = 4;
        				} else {
        					auxiliar2[1] = 0;
        				}
        				
        				if (auxiliar1[0] == 1) {
        					auxiliar2[0] = 8;
        				} else {
        					auxiliar2[0] = 0;
        				}
        				
        				
        					for (int i = 0; i < 4; i++) {  //itera pelo vetor auxiliar2 para somar os decimais referentes aos bits
        						decimal += auxiliar2[i];
        					}
        					
        					System.out.println("Binario: " + numero + "| Decimal correspondente: " + decimal);
        				
        				
        				} // fim if ( apenas binarios de 4 bits)
        		
  
                  
      
   }
   }