package roteiro2_condicional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_16 {

		public static void main (String[] args) throws ParseException {
			
			Scanner in = new Scanner(System.in);
					
				String dataNasc = "a", dataVot = "b";
				int diaNasc, mesNasc, anoNasc, diaVot, mesVot, anoVot, idade;
				
				
					
						System.out.println("Digite sua data de nascimento neste formato, considerando as barras : dd/MM/aaaa ");
							dataNasc = in.next();
						System.out.println("Digite a data da votação neste formato, considerando as barras: dd/MM/aaaa");
							dataVot = in.next();
							
							
							
							SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
							
							Date data1Nasc = formatar.parse(dataNasc);
							Date data1Vot = formatar.parse(dataVot);
						
							Calendar votacao = Calendar.getInstance();
							Calendar nascimento = Calendar.getInstance();
							
								votacao.setTime(data1Vot);
								nascimento.setTime(data1Nasc);
							
								diaNasc = nascimento.get(Calendar.DAY_OF_MONTH);
								mesNasc = nascimento.get(Calendar.MONTH)+1;
								anoNasc = nascimento.get(Calendar.YEAR);
								
								diaVot = votacao.get(Calendar.DAY_OF_MONTH);
								mesVot = votacao.get(Calendar.MONTH)+1;
								anoVot = votacao.get(Calendar.YEAR);
							
									if(mesNasc > mesVot || ((mesNasc == mesVot) && (diaNasc <= diaVot))) {
									
										idade = (anoVot - anoNasc) - 1 ;
									} else {
										idade = anoVot - anoNasc;
									}
										
									System.out.println("idade " + idade);
									
									if(idade < 16 ) {
										System.out.println("Não vota");
										
									} else if (idade >= 16 && idade < 18) {
										System.out.println("Voto Facultativo");
									
									} else if (idade >= 18) {
										System.out.println("Voto Obrigatório");
									} else {
										System.out.println("Indefinido");
									}
							
						
						
					
						 in.close();		   
	}				
}
	

