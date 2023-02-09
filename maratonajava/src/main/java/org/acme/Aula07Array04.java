package org.acme;

public class Aula07Array04 {
    public static void main(String[] args) {
        // As 3 formas fazem a mesma coisa
        int[] numeros = new int[2];
        numeros[0] = 0;
        numeros[1] = 11;
        int[] numeros2 = { 1, 2, 3, 4, 5 };
        int[] numeros3 = new int[] { 6, 7, 8, 9, 10 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for(int num : numeros3) {
            System.out.println(num);
        }

    }

}
