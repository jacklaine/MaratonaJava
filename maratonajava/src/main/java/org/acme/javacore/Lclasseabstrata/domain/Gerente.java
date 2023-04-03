package org.acme.javacore.Lclasseabstrata.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
    }

    public void calculaBonus() {
        this.salario = salario + salario * 0.1;
    }

    @Override
    public String toString() {
        return "Gerente{" +
        "nome='" + nome + '\'' +
        ", salario=" + salario + '}';
    }
    
}
