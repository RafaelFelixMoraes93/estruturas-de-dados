package com.estruturas;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe para demonstrar o uso de Conjutos (Set).
 */
public class MeuConjunto {
    
    /**
     * Exemplo de um conjunto de inteiros.
     */
    public void tipoConjunto() {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        conjunto.add(10);

        for (int numero : conjunto) {
            System.out.println(numero);
            
        }
    }
}
