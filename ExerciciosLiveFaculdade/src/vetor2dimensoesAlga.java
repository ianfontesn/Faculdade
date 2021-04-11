import java.util.*;
public class vetor2dimensoesAlga {
public static void main(String[] args) {
	
	double[] semanaUm = new double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 }; 
	double[] semanaDois = new double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 }; 
	double[] semanaTres = new double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 }; 
	double[] semanaQuatro = new double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 }; 
	double[][] mes = new double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
	
	
	double[] controleValorFaturamentoMaior = new double[4];
	double semanaValorMaior = 0.0;
	int indiceDaSemana = 0;
	
		for (int i = 0; i < mes.length; i++) {
			
			double[] semanaQueEstaTestando = mes[i];
			
			for (int j = 0; j < semanaQueEstaTestando.length; j++) {
				controleValorFaturamentoMaior[i] += semanaQueEstaTestando[j];
			}
		}
		for (int i = 0; i < controleValorFaturamentoMaior.length; i++) {
			if(semanaValorMaior < controleValorFaturamentoMaior[i]) {
				semanaValorMaior = controleValorFaturamentoMaior[i];
				indiceDaSemana = i;
			}
		}
			
			System.out.println("A semana de maior faturamento foi a semana [" + (indiceDaSemana+1) + "] com um faturamento de R$" + semanaValorMaior );
	
}
}
