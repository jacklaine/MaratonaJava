package org.acme.javacore.Npolimorfismo.test;

import org.acme.javacore.Npolimorfismo.domain.Computador;
import org.acme.javacore.Npolimorfismo.domain.Produto;
import org.acme.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------");

        Produto produto2 = new Tomate("Maçã", 2);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
    
}
