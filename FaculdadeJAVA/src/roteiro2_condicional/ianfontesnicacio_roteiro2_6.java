package roteiro2_condicional;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_6 {

		public static void main (String[] args) {
			
			Scanner in = new Scanner(System.in);
			
				double num1, num2, resultado;	
				String operador;
					
					System.out.println("CALCULADORA, Digite dois numeros: ");
						num1 = in.nextDouble();
						num2 = in.nextDouble();
					
							System.out.println("ESCOLHA O OPERADOR: ");
							System.out.println("+  SOMA");
							System.out.println("- SUBTRAÇÃO");
							System.out.println("/ DIVISÃO");
							System.out.println("* MULTIPLICAÇÃO");
							
								operador = in.next();
							
								switch (operador) {
								case "+" :
									resultado = num1+num2;
									System.out.println("Resultado: " + resultado);
									break;

								case "-" :
									resultado = num1 - num2;
									System.out.println("Resultado: " + resultado);
									break;
								
								case "/" : 
									if(num2 == 0) {
										System.err.println("Divisão por zero.");
									} else {
										resultado = num1 / num2;
										System.out.println("Resultado: " + resultado);
									}
									break;
									
								case "*" : 
									resultado = num1 * num2;
									System.out.println("Resultado: " + resultado);
									break;

								default:
									System.out.println("Operador inválido");
									break;
								}					
					
				
			in.close();		
				
		}
	}

