package org.acme.javacore.Jmodificadorfinal.test;

import org.acme.javacore.Jmodificadorfinal.dominio.Carro;
import org.acme.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("teste");
        ferrari.imprime();
    }
    
}
