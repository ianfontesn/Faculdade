package ianfontesnicacio_roteiro3;


public class ianfontesnicacio_23 {
public static void main (String[] args) {
	
	double locomotivaA = 0, locomotivaB = 400000; //Metros/s
	int tempo = 0; //(segundos)
	
	while(locomotivaA < locomotivaB) {
		locomotivaA += 30;
		locomotivaB -= 40;
		tempo++; 
		
	}
	
	System.out.println("Tempo: " + tempo + " segundos | " + (tempo/3600) + "h" + ((tempo % 3600)/60) + "m");
	System.out.println(" LOC A: " + (locomotivaA/1000) + "km");
	System.out.println(" LOC B: " + ((400000 - locomotivaB )/1000) + "km");
	
}
}
