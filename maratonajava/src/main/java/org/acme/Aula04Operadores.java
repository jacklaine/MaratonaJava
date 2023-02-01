package org.acme;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Aritméticos: + - / * %
        int number1 = 10;
        int number2 = 20;
        double resultDivision = number1 / number2;
        double resultMultiple = number1 * number2;
        int rest = 21 % 7;

        System.out.println("subtração: "+(number2-number1));
        System.out.println("soma: "+(number2+number1));
        System.out.println("concatenação:"+number2+number1);
        System.out.println("divisação: "+resultDivision);
        System.out.println("divisação: "+resultMultiple);
        System.out.println("resto: "+rest);

        // Relacionais: < > <= >= == !=

        boolean isTenBigger = 10 > 20;
        boolean isTwentyBigger = 10 < 20;
        boolean isTenEqualTwenty = 10 == 20;
        boolean isTenEqualTen = 10 == 10;
        boolean isTenDifferentTen = 10 != 10;

        System.out.println("isTenBigger:"+isTenBigger);
        System.out.println("isTwentyBigger: "+isTwentyBigger);
        System.out.println("isTenEqualTwenty: "+isTenEqualTwenty);
        System.out.println("isTenEqualTen: "+isTenEqualTen);
        System.out.println("isTenDifferentTen: "+isTenDifferentTen);


        // Lógicos: && (AND), || (OR) ! (NOT)

        int age = 24;
        float salary = 3500F;
        boolean isInTheLawOverThirty  = age > 30 && salary > 4612;
        boolean isInTheLessThenThirty  = age < 30 && salary > 3381;
        
        System.out.println("isInTheLawOverThirty: "+isInTheLawOverThirty);
        System.out.println("isInTheLessThenThirtssy "+isInTheLessThenThirty);

        double amountContaDafe = 200;
        double amountContaNubank = 1000;
        float amountEngineOfCelta = 5000;

        boolean isBuyEngineOfCelta = amountContaDafe > amountEngineOfCelta || amountContaNubank > amountEngineOfCelta;
        System.out.println("Comprar motor do celta? "+isBuyEngineOfCelta);

    
        //Atribuição: = += -= *= /= %=
        
        double bonus =  1800;
        bonus += 1000; //bonus = bonus + 1000
        bonus -= 1000; //bonus = bonus - 1000
        bonus *= 2; //bonus = bonus * 1000
        bonus /= 2; //bonus = bonus * 1000
        bonus %= 2; //bonus = bonus % 1000
        System.out.println("bonus: "+bonus);

        //Unários: ++ --

        int contador = 0;
        contador += 1;
        contador ++; //contador += 1; contador = contador + 1
        contador --; //contador -= 1; contador = contador - 1
        ++contador;
        --contador;
        System.out.println(contador);
        System.out.println(contador++); //resgata a variavel primeiro e soma depois
        System.out.println(++contador);
        
    }

}
