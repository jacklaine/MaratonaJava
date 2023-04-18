package org.acme.javacore.Npolimorfismo.test;

import org.acme.javacore.Npolimorfismo.domain.Computador;
import org.acme.javacore.Npolimorfismo.domain.Produto;
import org.acme.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzer", 3000);
        Tomate tomate = new Tomate("Americano", 2000);
    }
    
}
