package org.acme.javacore.Gassociacao.domain;

public class Aluno {

    private String nome;
    private Seminario seminario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println(nome);
        System.out.println(seminario);
    }

}
