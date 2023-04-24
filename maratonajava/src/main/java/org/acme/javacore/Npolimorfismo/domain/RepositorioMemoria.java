package org.acme.javacore.Npolimorfismo.domain;

import org.acme.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("");
    }
}
