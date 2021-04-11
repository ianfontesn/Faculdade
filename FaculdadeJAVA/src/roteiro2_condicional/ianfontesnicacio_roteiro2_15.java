package roteiro2_condicional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ianfontesnicacio_roteiro2_15 {

		public static void main (String[] args) throws ParseException {
			
			Scanner in = new Scanner(System.in);
					
				String dia1, dia2, mes1, mes2, ano1, ano2, comparacao1, comparacao2;
				
					System.out.println("Digite o dia: EX, 04");
					dia1 = in.next();
					System.out.println("Digite o mês: EX: 02");
					mes1 = in.next();
					System.out.println("Digite o ano: EX: 2020");
					ano1 = in.next();
					
					System.out.println("AGORA A DATA PARA COMPARAR");
					
					System.out.println("Digite o dia: EX, 04");
					dia2 = in.next();
					System.out.println("Digite o mês: EX: 02");
					mes2 = in.next();
					System.out.println("Digite o ano: EX: 2020");
					ano2 = in.next();

					
					comparacao1 = dia1+ "/" +mes1+ "/" +ano1;
					comparacao2 = dia2+ "/" + mes2 + "/" +ano2;
					
						SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy"); 
					
							Date data1Formatada = new Date (formatarData.parse(comparacao1).getTime()); 
							Date data2Formatada = new Date (formatarData.parse(comparacao2).getTime());
							
					
					
					
							if (data1Formatada.after(data2Formatada)) {
								System.out.println("Data: " + formatarData.format(data1Formatada) + " é posterior à " + formatarData.format(data2Formatada));
							
							} else if (data1Formatada.before(data2Formatada)){
								System.out.println("Data: " + formatarData.format(data1Formatada) + " é anterior à " + formatarData.format(data2Formatada));
							
							} else {
								System.out.println("Data: " + formatarData.format(data1Formatada) + " é igual à " + formatarData.format(data2Formatada));
							}
						
					 in.close();		   
	}				
}
	

