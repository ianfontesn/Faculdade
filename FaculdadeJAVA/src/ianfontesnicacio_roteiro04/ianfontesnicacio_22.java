package ianfontesnicacio_roteiro04;

import java.util.Scanner;

public class ianfontesnicacio_22 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int tamanhoFita = 0;
		int gotasReagente = 0;

		System.out.println("Entre com o tamanho da fita: ");
		tamanhoFita = in.nextInt();

		System.out.println("Entre com a quantidade de gotas de reagente: ");
		gotasReagente = in.nextInt();

		int posReagente = 0;
		int dias = 0;
		int auxPosInicial = 0;

		for (int i = 0; i < gotasReagente; i++) {
			System.out.println("Posição Gota [" + (i + 1) + "]: ");
			posReagente = in.nextInt();

			if (i == 0 && posReagente == 1) { //PRIMEIRA GOTA E A PSIÇÃO DA GOTA É A PRIMEIRA FITA?

				auxPosInicial = 1; // ADD POSIÇAO INICIAL COMO SENDO A PRIMEIRA
			
			} else {

				if (auxPosInicial == 0) { //VERIFICA SE NÃO FOI INICIADO OS TESTES 
					auxPosInicial = posReagente; //SE FOR A PRIMEIRA, SALVA PRA COMPARAR COM A PROXIMA
					
				} else if((i == gotasReagente - 1) && posReagente == 2) {// SEQUENCIA VERIFICA SE A POS SAO 1 E 2
					dias = tamanhoFita - 2; 
				} else if ((i == gotasReagente - 1 ) && auxPosInicial == 1) { //VERIFICA SE SÓ TEM 1 GOTA NA FITA DEPOIS DE TODAS
					dias = tamanhoFita - 1;
					
				} else if (dias < ((posReagente - auxPosInicial) / 2)) { //MAIOR SEQUENCIA DE DIAS

					dias = ((posReagente - auxPosInicial) / 2);
					auxPosInicial = posReagente;
				}

			}
			if (posReagente == tamanhoFita) { // VERIFICA GOTAS NA ULTIMA POS, OU SE A ULTIMA E ANTE-PENULTIMA APENAS 

				if ((i == gotasReagente - 1) && auxPosInicial == (posReagente - 1))
					dias = (tamanhoFita - 2);

			} else if ((i == gotasReagente - 1) && auxPosInicial == posReagente) {
				dias = (tamanhoFita - 1);

			}

		}in.close();

		System.out.println(dias);
	}

}
