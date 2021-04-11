package ianfontesnicacio_roteiro3;

import java.util.Scanner;

public class ianfontesnicacio_31 {
	public static void main(String[] args) {
		
		int voto = 0, voto1 = 0 , voto2 = 0, voto3 = 0, voto4 = 0, voto5Branco = 0, votoNulo = 0;

		System.out.println("Vote consciente, vote 1, 2, 3 ou 4! ATENÇÃO: 5 é voto branco e 0 encerra votação: ");
		
		Scanner in = new Scanner(System.in);
		
		int repetir = 1;
		while (repetir == 1) {
			voto = in.nextInt();
			
			switch(voto) {
				
				case 1:
					voto1++;
					break;
				case 2:
					voto2++;
					break;
				case 3: 
					voto3++;
					break;	
				case 4:
					voto4++;
					break;
				case 5:
					voto5Branco++;
					break;
				case 0:
					System.out.println("Contando votos...");
					repetir = 0;
					break;
				default:
					votoNulo++;
					System.err.println("VOTO NULO.");
					break;
					
			}
		}
		in.close();
		System.out.println("Candidato 1: " + voto1 + " Votos | Candidato 2: " + voto2 + " Votos | Candidato 3: " + voto3 + " Votos | Candidato 4: " + voto4 + " Votos" );
		System.out.println("Votos em Branco: " + voto5Branco + " Votos | VOTOS NULOS: " + votoNulo + " Votos");
		
	}

}
