package org.acme.javacore.Npolimorfismo.domain;

import org.acme.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
