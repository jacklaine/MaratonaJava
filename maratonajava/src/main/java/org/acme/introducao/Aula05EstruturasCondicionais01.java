package org.acme.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int age = 15;
        boolean isBuyCorote = age >= 18;

        if (isBuyCorote) {
            System.out.println("Pode comprar uns corote");
        } else {
            System.out.println("Proibido comprar corote");
        }

        if (isBuyCorote == false) {
            System.out.println("Proibido comprar corote");
        }

        if (!isBuyCorote) {
            System.out.println("Proibido comprar corote");
        }

        System.out.println("Fora do if"); 
    }

}
