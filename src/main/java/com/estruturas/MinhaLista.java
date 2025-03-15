package com.estruturas;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para demonstrar o uso de Listas.
 */
public class MinhaLista {

    /**
     * Exemplo de lista com Strings.
     */
    public void tipoLista(){
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("JavaScript");
        lista.add("C");
        lista.add("C++");

        for (String item : lista) {
            System.out.println(item);
        }
    }
}
