package com.estruturas;

import java.util.Stack;

/**
 * Classe para demonstrar o usp de Pilhas (Stack).
 */
public class MinhaPilha {
    /**
     * Exemplo de uma pilha de strings.
     */
    public void tipoPilha() {
        Stack<String> pilha = new Stack<>();
        pilha.add("A");
        pilha.add("B");
        pilha.add("C");
        pilha.add("D");
        pilha.add("E");

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}

