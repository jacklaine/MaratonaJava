package org.acme.javacore.Bintroducaometodos.test;

import org.acme.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando 01");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando 02");
    }
    
}
