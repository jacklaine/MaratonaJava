package org.acme.javacore.Gassociacao.test;

import org.acme.javacore.Gassociacao.domain.Aluno;
import org.acme.javacore.Gassociacao.domain.Local;
import org.acme.javacore.Gassociacao.domain.Professor;
import org.acme.javacore.Gassociacao.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno[] alunos = {aluno1, aluno2};
        Seminario seminario1 = new Seminario();
        Seminario seminario2 = new Seminario();
        Seminario[] seminarios = {seminario1, seminario2};
        Professor professor = new Professor();
        Local local = new Local();

        seminario1.setTitulo("Campanha");
        seminario1.setLocal(local);
        seminario1.setAlunos(alunos);
        seminario2.setTitulo("Arrecadação");
        seminario2.setLocal(local);

        aluno1.setNome("Maria");
        aluno1.setSeminario(seminario1);
        aluno2.setNome("João");
        aluno2.setSeminario(seminario1);

        local.setEndereco("Catedral");

        professor.setNome("Roberta");
        professor.setSeminarios(seminarios);
        professor.setEspecialidade("Biologia");

        System.out.println("-------ALUNOS--------:");
        aluno1.imprime();
        aluno2.imprime();

        System.out.println("--------SEMINARIO------");
        seminario1.imprime();
        seminario2.imprime();

        System.out.println("-------PROFESSOR--------");
        professor.imprime();

    }
    
}
