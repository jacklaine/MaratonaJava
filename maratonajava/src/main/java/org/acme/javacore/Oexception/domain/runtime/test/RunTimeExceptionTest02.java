package org.acme.javacore.Oexception.domain.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    private static int divisao(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException e) {
            e.printStackTrace();

        }

        return 0;
    }

}
