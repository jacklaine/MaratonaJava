package org.acme.javacore.Npolimorfismo.test;

import org.acme.javacore.Npolimorfismo.domain.Computador;
import org.acme.javacore.Npolimorfismo.domain.Televisao;
import org.acme.javacore.Npolimorfismo.domain.Tomate;
import org.acme.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("XP", 1000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung", 43);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tv);
        
    }
    
}
