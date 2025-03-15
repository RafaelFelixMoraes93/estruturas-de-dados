package com.estruturas;

/**
 * Classe principal.
 */
public class Main {
    /**
     * Método principal onde são executados os exemplos.
     */
    public static void main(String[] args) {
        System.out.println("Array");
        new MeuArray().tipoArray();
        System.out.println("----");

        System.out.println("ArrayList");
        new MinhaLista().tipoLista();
        System.out.println("----");

        System.out.println("Queue");
        new MinhaFila().tipoFila();
        System.out.println("----");

        System.out.println("Stack");
        new MinhaPilha().tipoPilha();
        System.out.println("----");

        System.out.println("Set");
        new MeuConjunto().tipoConjunto();
        System.out.println("----");

        System.out.println("Map");
        new MeuMap().tipoMap();
        System.out.println("----");
    }
}
