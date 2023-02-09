package org.acme;

public class Aula07Array03 {
    public static void main(String[] args) {

        //string : null   
        //boolean : false
        //char : '\u0000' ' '
        //byte, short, int, long, flat e double : 0
        
        String[] nomes = new String[3];

        nomes[0] = "Jacklaine";
        nomes[1] = "Cerli";
        nomes[2] = "Paulo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
    
}
