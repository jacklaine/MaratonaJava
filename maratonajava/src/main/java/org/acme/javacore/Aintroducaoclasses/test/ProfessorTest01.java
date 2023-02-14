package org.acme.javacore.Aintroducaoclasses.test;

import org.acme.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Professor Linguiça";
        professor.age = 77;
        professor.gender = 'M';

        System.out.println("Nome: "+ professor.name + " idade: " + professor.age + " sexo: " + professor.gender);
    }
}
