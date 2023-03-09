package org.acme.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituradoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software vidente");
        System.out.println("Digite sua pergunta e responderei SIM ou NÃO");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        input.close();
    }
    
}
