package avaliacaoEstruturaRepeticao;
import java.util.Scanner;

public class ianfontesnicacio4 {
public static void main (String[] args) {
	int lampadaA = 0, lampadaB = 0;
	int numeroDeApertos = 0;
	int aperto = 0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Digite quantas vezes vai apertar os interruptores: ");
	numeroDeApertos = in.nextInt();
	
	for (int i = 0; i < numeroDeApertos; i++) {
		System.out.println("Interruptor lampada A = 1, interruptor lampada B = 2");
		aperto = in.nextInt();
		
		switch(aperto) {
		
		case 1:
			if (lampadaA == 0) {
				lampadaA = 1;
			} else {
				lampadaA = 0;
			}
		
		case 2:
			if(lampadaB == 0) {
				lampadaB = 1;
			} else {
				lampadaB = 0;
			}	
			
			if (lampadaA == 0) {
				lampadaA = 1;
			} else {
				lampadaA = 0;
			}
		

		}
		
	} in.close();
	
	if(lampadaA == 1) {
		System.out.println("Lampada A está acesa");
	} else {
		System.out.println("Lampada A está apagada");
	}
	
	if(lampadaB == 1) {
		System.out.println("Lampada B está acesa");
	} else {
		System.out.println("Lampada B está apagada");
	}
}
}

