package org.acme;

public class Aula07Array02 {
    public static void main(String[] args) {
        //string : null   
        //boolean : false
        //char : '\u0000' ' '
        //byte, short, int, long, flat e double : 0
        
        String [] nomes = new String[3];
        boolean[] idade = new boolean[3];
        char[] livros = new char[3];
        byte[] cadeiras = new byte[3];

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);


        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);

        System.out.println(livros[0]);
        System.out.println(livros[1]);
        System.out.println(livros[2]);

        System.out.println(cadeiras[0]);
        System.out.println(cadeiras[1]);
        System.out.println(cadeiras[2]);
    }
    
}
