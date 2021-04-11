package roteiro2_condicional;
import java.util.Scanner;
   public class ianfontesnicacio_roteiro2_17 {
      public static void main(String[] args) {
         
         double a, b, c; 
         int repetir = 1;
            Scanner in = new Scanner(System.in);
            
   while(repetir == 1) {      
         //ENTRA COM VALORES DOS LADOS DO TRIANGULO. A, B, C         
            System.out.printf("Entre com o valor de cada lado do seu triangulo: \n");
               a = in.nextDouble();
               b = in.nextDouble();
               c = in.nextDouble();
               
         ////////VERIFICA SE Ã‰ POSSIVEL UM TRIANGULO////////
               
               if ( (a > (b-c) && a < (b+c)) && (b > (a-c) && b < (a+c)) && (c > (a-b) && c < (a+b)) ) {
               
               
               //SE POSSIVEL TRIANGULO, VERIRIFICA TIPO DE TRIANGULO (ISOCELES, ESCALENO OU EQUILATERO
               
                  if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) { 
                        System.out.printf("Triangulo Isoceles \nNova consulta..\n");
                  
                  } else if (a == b && a == c) {
                           System.out.printf("Triangulo EQUILATERO \nNova consulta..\n");
                       
                  } else if (a != b &&  b != c && c != a) {
                           System.out.printf("Triangulo ESCALENO \nNova consulta..\n");
                  
                  } else {
                     
                        return;
                        }
                  
               } else {
               
                   System.out.printf("O triangulo não é possivel. Digite outro valor.");
               } in.close();
               }   
      }
   }