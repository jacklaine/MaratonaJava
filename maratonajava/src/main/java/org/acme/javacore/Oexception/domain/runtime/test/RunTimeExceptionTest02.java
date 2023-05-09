package org.acme.javacore.Oexception.domain.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Código finalizado");

    }

    private static int divisao(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Argumento não pode ser 0");

        }
        return a / b;

    }

}
