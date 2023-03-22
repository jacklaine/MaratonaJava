package org.acme.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Bloco inicialização 0");
    }
    {
        System.out.println("Bloco inicialização 1");
    }
    {
        System.out.println("Bloco inicialização 2");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void relatorioPagamento() {
        System.out.println("Eu "+this.nome+ "recebi o salário de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
