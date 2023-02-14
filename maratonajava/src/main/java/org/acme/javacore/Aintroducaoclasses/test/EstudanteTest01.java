package org.acme.javacore.Aintroducaoclasses.test;

import org.acme.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.name = "Jacklaine";
        estudante.age = 24;
        estudante.gender = 'F';
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }

    
}
