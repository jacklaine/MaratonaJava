package org.acme.javacore.Bintroducaometodos.test;

import org.acme.javacore.Bintroducaometodos.dominio.Estudante;
import org.acme.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Aladin";
        estudante01.idade = 88;
        estudante01.genero = 'F';

        estudante02.nome = "Catiuça";
        estudante02.idade = 77;
        estudante02.genero = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
