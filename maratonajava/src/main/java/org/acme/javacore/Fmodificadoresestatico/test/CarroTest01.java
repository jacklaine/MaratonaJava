package org.acme.javacore.Fmodificadoresestatico.test;

import org.acme.javacore.Fmodificadoresestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 200);
        Carro c2 = new Carro("Mercedes", 240);
        Carro c3 = new Carro("Audi", 300);

        c1.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
    
}
