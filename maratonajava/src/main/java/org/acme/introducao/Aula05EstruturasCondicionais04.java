package org.acme.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 7000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double taxValue;

        if (annualSalary <= 30000) {
            taxValue = annualSalary * firstTrack;
        } else if (annualSalary >= 3000 && annualSalary <= 7000) {
            taxValue = annualSalary * secondTrack;
        } else {
            taxValue = annualSalary * thirdTrack;
        }

        System.out.println(taxValue);
    }
}
