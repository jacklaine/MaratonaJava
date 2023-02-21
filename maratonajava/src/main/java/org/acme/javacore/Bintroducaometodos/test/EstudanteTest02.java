package org.acme.javacore.Bintroducaometodos.test;

import org.acme.javacore.Bintroducaometodos.dominio.Estudante;
import org.acme.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
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

        System.out.println("----------");
        impressora.imprime(estudante01);
        System.out.println("----------");
        impressora.imprime(estudante02);
        System.out.println("----------");

        //Função de imprimir está setada no objeto Estudante
        estudante01.imprime();
        estudante02.imprime();
    }
    
}
