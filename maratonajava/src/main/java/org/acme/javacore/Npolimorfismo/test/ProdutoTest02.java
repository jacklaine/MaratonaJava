package org.acme.javacore.Npolimorfismo.test;

import org.acme.javacore.Npolimorfismo.domain.Computador;
import org.acme.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
    
}
