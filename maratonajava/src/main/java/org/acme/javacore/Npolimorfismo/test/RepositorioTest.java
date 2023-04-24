package org.acme.javacore.Npolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import org.acme.javacore.Npolimorfismo.domain.RepositorioBancoDeDados;
import org.acme.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
    
}
