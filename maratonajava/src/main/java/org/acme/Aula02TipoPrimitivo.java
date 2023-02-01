package org.acme;

public class Aula02TipoPrimitivo {
    public static void main(String[] args) {

        int age = (int)10000000000L;
        long numberLong = (long) 155.23;
        double salaryDouble = 2000.0;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean truee = true;
        boolean falsee = false;
        char caractere = 65;
        String text = "ornitorrincos são fofos";

        System.out.println(age);
        System.out.println(truee);
        System.out.println(caractere);
        System.out.println("Mano, "+text);
        System.out.println(numberLong);
        System.out.println(salaryDouble);
        System.out.println(salaryFloat);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(falsee);
        
    }
    
}
