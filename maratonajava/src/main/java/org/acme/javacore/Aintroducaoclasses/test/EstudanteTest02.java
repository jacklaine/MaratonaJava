package org.acme.javacore.Aintroducaoclasses.test;

import org.acme.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name = "Josefina";
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);

        System.out.println("-------------");
        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.gender);
    }
    
}
