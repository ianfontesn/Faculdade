package ianfontesnicacio_roteiro3;

import java.util.Scanner;
import java.util.ArrayList;

public class ianfontesnicacio_24 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		ArrayList<Integer> codigoDoCliente = new ArrayList<Integer>();
		ArrayList<Double> consumoPorCliente = new ArrayList<Double>();
		ArrayList<Double> precoPorCliente = new ArrayList<Double>();
		ArrayList<Integer> tipoDeConsumidor = new ArrayList<Integer>();
	

		double consumidor1Consumo = 0, consumidor2Consumo = 0, consumidor3Consumo = 0;
		

		int repetir = 1;
		while (repetir == 1) { //CADASTRO DE DADOS

			System.out.println("Digite o numero referente ao cliente: ");
			int controleCliente = in.nextInt();
			
			if (codigoDoCliente.contains(controleCliente)) { //VERIFICA SE CLIENTE JÁ CADASTRADO
				System.err.println("Cliente já cadastrado.");

			} else if (controleCliente == 0) {
				System.out.println("Finalizando cadastro..."); //FINALIZA AO DIGITAR 0
				repetir = 0;
			} else {  											//PROCESSO DE CADASTRO
				codigoDoCliente.add(controleCliente);

				System.out.println("Digite agora o consumo em KWh/mês: ex: 20,5 ou  99 ");
				consumoPorCliente.add(in.nextDouble());

				int repetir2 = 1;
				while (repetir2 == 1) {
					
				int codigoConsumidorControle;
				System.out.println("Digite qual o codigo do consumidor: ");

				codigoConsumidorControle = in.nextInt();


					switch (codigoConsumidorControle) { //VALIDANDO E ADICIONANDO CODIGO DE CONSUMIDOR

					case 1:
						tipoDeConsumidor.add(codigoConsumidorControle);
						repetir2 = 0;
						break;

					case 2:
						tipoDeConsumidor.add(codigoConsumidorControle);
						repetir2 = 0;
						break;

					case 3:
						tipoDeConsumidor.add(codigoConsumidorControle);
						repetir2 = 0;
						break;

					default:
						System.err.println("Codigo invalido, apenas 1, 2 ou 3.");
					}
				}

			}
		} //WHILE FECHANDO LOOP GERAL CADASTRO
	in.close();
		
		//CALCULOS E PRINTANDO CLIENTE POR CLIENTE COM SEU PREÇO DE CONSUMO
		for (int i = 0; i < codigoDoCliente.size(); i++) {
			
			
			if (codigoDoCliente.get(i) == 1) {
				precoPorCliente.add(consumoPorCliente.get(i)*0.3);
				consumidor1Consumo += consumoPorCliente.get(i);
				System.out.println("Cliente [" + codigoDoCliente.get(i) + "]: " + precoPorCliente.get(i) + " Reais");
				
			} else if(codigoDoCliente.get(i) == 2) {
				precoPorCliente.add(consumoPorCliente.get(i)*0.5);
				consumidor2Consumo += consumoPorCliente.get(i);
				System.out.println("Cliente [" + codigoDoCliente.get(i) + "]: " + precoPorCliente.get(i) + " Reais");
				
			} else if(codigoDoCliente.get(i) == 3) {
				precoPorCliente.add(consumoPorCliente.get(i)*0.7);	
				consumidor3Consumo += consumoPorCliente.get(i);
				System.out.println("Cliente [" + codigoDoCliente.get(i) + "]: " + precoPorCliente.get(i) + " Reais");
				
			}
		}
	
		
		//TIRA MÉDIA E PRINTA VALORES SOLICITADOS
		double mediaEntre1E2 = (consumidor1Consumo + consumidor2Consumo)/2;
		System.out.println("Media de consumo entre 1 e 2: " + mediaEntre1E2 + " Kwh");
		System.out.println("Consumidor 1: " + consumidor1Consumo + " Kwh | Consumidor 2: " + consumidor2Consumo + " Kwh | Consumidor 3: " + consumidor3Consumo + " Kwh");
	
	}
}
