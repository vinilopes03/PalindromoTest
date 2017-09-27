/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palin;

/**
 *
 * @author vinic
 */
public class Palindromo {

    public Palindromo(){
        
    }
    
    /**
     * O erro se encontrava na linha 26 na qual faltava o -1 em (fraseFiltrada.lenght() - i). Ficando (fraseFiltrada.lenght() - i)-1
     * @param frase
     * @return 
     */
    public boolean ehPalindromo(String frase) {
        String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
        for (int i = 0; i < fraseFiltrada.length(); i++) {
            if (fraseFiltrada.charAt(i) != fraseFiltrada.charAt((fraseFiltrada.length() - i)-1)) {
                return false;
            }
        }
        return true;
    }
}
