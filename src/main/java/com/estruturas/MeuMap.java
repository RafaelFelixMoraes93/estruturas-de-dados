package com.estruturas;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe para demonstração do uso de Mapas(Map).
 */
public class MeuMap {
    /**
     * Exemplo de um mapa de Strings
     */
    public void tipoMap() {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Java", 1995);
        mapa.put("Python", 1991);
        mapa.put("C++", 1985);

        for (Map.Entry<String, Integer > entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
