package ianfontesnicacio_roteiro3;

public class ianfontesnicacio_30 {
	public static void main(String[] args) {

		double valorIngresso = 5;
		int quantidadeIngressosVendidos = 120;
		double lucro = 0, lucroMaximo = 0, valorIngressoLucroMaximo = 0, qtdIngressoLucroMaximo = 0;

		while (valorIngresso >= 1) {
			lucro = (-200) + (valorIngresso * quantidadeIngressosVendidos);
			System.out.println("Lucro [" + valorIngresso + " Reais] " + lucro + " Ingressos: " + quantidadeIngressosVendidos + " Unidades.");

			if (lucro > lucroMaximo) {
				lucroMaximo = lucro;
				valorIngressoLucroMaximo = valorIngresso;
				qtdIngressoLucroMaximo = quantidadeIngressosVendidos;
				
			}
				
				quantidadeIngressosVendidos += 26;
				valorIngresso -= 0.5;
		}
				System.out.println("Lucro MAXIMO esperado: " + lucroMaximo + " Reais | Quantidade vendida: " + qtdIngressoLucroMaximo + " | Valor ingresso: " + valorIngressoLucroMaximo + " Reais"  );
	}

}
