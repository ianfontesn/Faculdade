/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_olimpiadas;

/**
 *
 * @author Luiz Felipe
 */
public class Smurf_IanIsabellaLuiz {
    public static void main(String[] args){
        int n=6, contador = 0;
        String []L={"40 D","38 E","39 E","40 D","38 D","40 D","37 E"};
        String proximo = null;
        String lado = null;
        //"40 D","38 E","39 E","40 D","38 D","40 D","37 E"
        for(int i=0; i<L.length;i++){
            
            if(L[i].substring(0,1).equals(proximo)){
                proximo=L[i].substring(0,1);
                
                if( !L[i].substring(4).equals(lado) ){
                    //L[i].substring(3) == null ? lado != null : !L[i].substring(3).equals(lado)
                    lado=L[i].substring(3,4);
                    contador++;
                    
                }else{
                    lado=L[i].substring(3,4);
                    
                }
            }else{
                proximo=L[i].substring(0,1);
                
            }
        }
        
        System.out.println(contador);
        
        
        
    }

    
}
