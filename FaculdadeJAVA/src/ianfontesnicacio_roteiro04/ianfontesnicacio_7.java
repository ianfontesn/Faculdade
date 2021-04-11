package ianfontesnicacio_roteiro04;
import java.util.Scanner;


public class ianfontesnicacio_7 {
public static void main (String[] args) {
	
	double notas[] = new double[11];
	double totalDeNotas = 0;		
	
	
	Scanner in = new Scanner(System.in);

	System.out.println("Digite as notas dos alunos com inteiros de 0 a 10. A nota -1 ENCERRA o cadastro.");
	
	int cadastrar = 0;
	int nota;
	while(cadastrar != -1) {
		nota = in.nextInt();
		if(nota >= 0 && nota <= 10) {
		
			totalDeNotas++;
		
		switch(nota) {
		
		case 0: 
			notas[0]++;
			break;
			
		case 1: 
			notas[1]++;
			break;
			
		case 2: 
			notas[2]++;
			break;
			
		case 3: 
			notas[3]++;
			break;
			
		case 4: 
			notas[4]++;
			break;
			
		case 5: 
			notas[5]++;
			break;
			
		case 6: 
			notas[6]++;
			break;
			
		case 7: 
			notas[7]++;
			break;
			
		case 8: 
			notas[8]++;
			break;
			
		case 9: 
			notas[9]++;
			break;
			
		case 10: 
			notas[10]++;
			break;
		}
		} else if(nota == -1) {
			cadastrar = -1;
			System.out.println("Finalizando...");
		} else if (nota > 10 || (nota < 0 && nota != -1)) {
			System.err.println("NOTA INVALIDA. APENAS 0 A 10.");
		}
	} in.close(); // FINALIZA CADASTRO
	
	System.out.println("Nota   Abstoluta   Relativa(%)");

	for(int i = 0; i < 11; i++) {
		System.out.printf("[%d]     %d         %.2f\n", i, (int)notas[i], ((notas[i]/totalDeNotas)*100.0));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
