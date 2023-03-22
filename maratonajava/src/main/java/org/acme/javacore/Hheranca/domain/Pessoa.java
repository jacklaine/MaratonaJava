package org.acme.javacore.Hheranca.domain;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Bloco inicialização 0");
    }
    {
        System.out.println("Bloco inicialização 1");
    }
    {
        System.out.println("Bloco inicialização 2");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor pessoa");
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
