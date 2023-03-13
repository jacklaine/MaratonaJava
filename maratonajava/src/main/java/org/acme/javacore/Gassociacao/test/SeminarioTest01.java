package org.acme.javacore.Gassociacao.test;

import org.acme.javacore.Gassociacao.domain.Aluno;
import org.acme.javacore.Gassociacao.domain.Local;
import org.acme.javacore.Gassociacao.domain.Professor;
import org.acme.javacore.Gassociacao.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria");
        Aluno aluno2 = new Aluno("João");
        Aluno[] alunos = { aluno1, aluno2 };
        Seminario seminario1 = new Seminario("Campanha", alunos);
        Seminario[] seminarios = { seminario1 };
        Professor professor = new Professor("José", "Professor", seminarios);
        Local local = new Local("Rua vermelha");

        System.out.println("-------ALUNOS--------:");
        aluno1.imprime();
        aluno2.imprime();

        System.out.println("--------SEMINARIO------");
        seminario1.imprime();

        System.out.println("-------PROFESSOR--------");
        professor.imprime();

        System.out.println("-------LOCAL--------");
        local.imprime();

    }

}
