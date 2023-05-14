package org.acme.javacore.Oexception.domain.runtime.test;

public class RunTimeExceptionTest03 {

    public static void main(String[] args) {
        abreConexao();
    }
    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            return "conexão aberta";
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso 1");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso 2");
        }
    }
    
}
