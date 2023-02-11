package org.acme.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // numeros pares de 1 a 10000
        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
