package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_18 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
			
				int num = 0, novoNumero = 0, repetir = 1;
				double unidade = 0, dezena = 0, centena = 0;
				
		while (repetir == 1) {				 //loop infinito para testar outos valores			
			
			
					System.out.println("Digite um número inteiro de 3 digitos para verificar se é PALÍNDROMO");
					
					num = in.nextInt();
					
						if(((num > 999 || num < 100) && (num < -999 || num > -100))) {	//verificando se tem 3 digitos							
						
							System.err.println("O numero NÃO CONTEM 3 DIGITOS");
							
						} else { 
							
								unidade = num % 10; //pega o resto (ultimo digito)
								int aux1 = num/10; //pega o inteiro ( inteiro sem o digito
								dezena = aux1 % 10; // repete \/
								int aux2 = aux1/10;
								centena =  aux2; 
								
								novoNumero = (int)(unidade*100) + (int)(dezena*10) + (int)centena; //casting pra inteiro e posicionando em cada
																									// local 				
								if (num == novoNumero) { // verifica se é palindromo
									System.out.println("É palíndromo");
								} else {
									System.err.println("Não é palíndromo");
								}
							}
						
						
		} //FECHA LOOP INFINITO
			in.close();		
				
		}
	}

