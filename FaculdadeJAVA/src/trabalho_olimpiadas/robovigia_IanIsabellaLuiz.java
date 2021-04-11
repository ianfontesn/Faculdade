package trabalho_olimpiadas;
import java.util.Scanner;

public class robovigia_IanIsabellaLuiz {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			int estacoes = 0;	
			int comandos = 0;
			int estacaoProxNinhoViolado = 0;
		
			while(estacoes < 2 || estacoes > 100) {
			estacoes = in.nextInt();
			}
			while(comandos < 1 || comandos > 1000) {
			comandos = in.nextInt();
			}
			while(estacaoProxNinhoViolado < 1) {
			estacaoProxNinhoViolado = in.nextInt();
			}
			
			
			int contagemEstacoes[] = new int[estacoes]; // INDICE É ESTAÇÃO, VALOR QUANTAS VEZES ESTEVE NA ESTAÇÃO
			contagemEstacoes[0] = 1; // O ROBÔ JA COMEÇA NA ESTAÇAO 1
			
			int listaComandos [] = new int [comandos]; // -1 ANTI-HORARIO, 1 HORARIO
			
			for (int i = 0; i < comandos; i++) {
				listaComandos[i] = in.nextInt();
			}
			
			in.close();
		
			int posicaoVetor = 0;
			
			for (int i = 0; i < listaComandos.length; i++) {
				
				//VETOR NO ZERO, VOLTA PRA POSIÇÃO FINAL.
				if(posicaoVetor == 0 && listaComandos[i] == -1) {
				posicaoVetor = ((listaComandos.length)-1);
				contagemEstacoes[posicaoVetor]++;
				
				//VETOR ULTIMA POS, VAI PRA PRIMEIRA (ZERO)
				} else if (posicaoVetor == (listaComandos.length) && listaComandos[i] == 1) {
					posicaoVetor = 0;
					contagemEstacoes[posicaoVetor]++;
					
				} else {
					
					//SE FOR 1 OU -1, ANDA 1 PRA FRENTE OU PRA TRAZ E CONTA A POSIÇÃO
					if(listaComandos[i] == 1) {
						posicaoVetor++;
						contagemEstacoes[posicaoVetor]++;
					} else if(listaComandos[i] == -1) {
						posicaoVetor--;
						contagemEstacoes[posicaoVetor]++;
					}	
				}
			}
			
			
			System.out.println(contagemEstacoes[(estacaoProxNinhoViolado)-1]);
			
			
		

	}

}
