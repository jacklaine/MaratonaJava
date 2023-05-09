package org.acme.javacore.Oexception.domain.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");

    }
    /**
     * 
     * @param a
     * @param b - não pode ser zero
     * @return 
     * @throws IllegalArgumentException
     */

    private static int divisao(int a, int b) throws IllegalArgumentException {

        if (b == 0) {
            throw new IllegalArgumentException("Argumento não pode ser 0");

        }
        return a / b;

    }

}
