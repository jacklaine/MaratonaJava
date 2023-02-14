package org.acme.javacore.Aintroducaoclasses.test;

import org.acme.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro1.name = "Celtinha";
        carro1.model = "Super";
        carro1.year = 2004;

        carro2.name = "Corsinha";
        carro2.model = "Sedan";
        carro2.year = 1998;

        System.out.println("\nCarro 1:");
        System.out.println(carro1.name);
        System.out.println(carro1.model);
        System.out.println(carro1.year);

        System.out.println("\nCarro 2:");
        System.out.println(carro2.name);
        System.out.println(carro2.model);
        System.out.println(carro2.year);
    }
    
}
