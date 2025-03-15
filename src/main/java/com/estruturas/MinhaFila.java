package com.estruturas;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Classe para demonstrar o uso de filas (Queue).
 */
public class MinhaFila {
    /**
     * Exemplo de fila de inteiros.
     */
    public void tipoFila(){
        Queue<Integer> fila = new LinkedList<>();
        fila.add(10);
        fila.add(20);
        fila.add(30);
        fila.add(40);
        fila.add(50);

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
