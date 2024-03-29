package org.acme.javacore.Lclasseabstrata.domain;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
        "nome='" + nome + '\'' +
        ", salario=" + salario + '}';
    }

    public void calculaBonus() {
        this.salario = salario + salario * 0.05;
    }
}
