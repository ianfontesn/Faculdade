package trabalho_olimpiadas;

public class Entregas_IanIsabellaLuiz {
    public static void main(String[] args){
        //Entradas
        int numeroDeCasas= 3, ecnomendas= 4;//Primeira Linha
        int []numeroDasCasa= {50 , 80 , 100};//Segunda linha
        int []sequenciaPorNumeroDasCasas = {80,80,100,50};//Terceira linha
        int tempo = 0, inicio = 0;
        
         for(int i=0; i<sequenciaPorNumeroDasCasas.length;i++){
             for(int j=0;j<numeroDasCasa.length;j++){ 
                 if(sequenciaPorNumeroDasCasas[i]==numeroDasCasa[j]){
                     
                     tempo+=Math.abs((j+1)-inicio);
                     inicio=j+1;
                     
                 }
                 
             }
            
         }
        System.out.println(tempo-1);
        
    }
}
