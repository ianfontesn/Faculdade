/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_olimpiadas;

/**
 *
 * @author beeel
 */
public class Semrepeticao_IanIsabellaLuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Le os parametros
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        // Contador de numeros sem repeticao
        int contador = 0;
        // Resultado da verificacao se o numero possui digitos iguais
        boolean ehIgual = false;
        // Vetor de numeros do intervalo
        String[] intervalo = new String[((m - n) + 1)];

        // Adiciona numeros do intervalo no vetor
        for(int i = 0; i < intervalo.length; i++) {
            intervalo[i] = Integer.toString((n + i));
        }


        // Percorre o vetor de numeros do intervalo
        for(int i = 0; i < intervalo.length; i++) {

            // Percorre os digitos do numero
            for(int j = 0; j < intervalo[i].length(); j++) {
                // Proximo digito a ser comparado
                for(int k = j+1; k < intervalo[i].length(); k++) {
                    if(intervalo[i].charAt(j) == intervalo[i].charAt(k)) {
                        // ehIgual passa a ser true indicando que possui algum digito igual
                        ehIgual = true;
                        // como existe um digito igual, o numero ja pode ser descartado
                        break;
                    }
                }
                if(ehIgual) {
                    // como ja existe um nuemro igual, o numero pode ser descartado
                    break;
                }
            }

            if(!ehIgual) {
                // como nao foi encontrado nenhum nuemro com digito igual, o contador Ã© incrementado
                contador++;
            } else {
                // como foi encontrado um digito ifual, retorna o valor de ehIgual para analisar o proximo numero
                ehIgual = false;
            }

        }

        System.out.println(contador);
        
        // TODO code application logic here
    }
    
}
