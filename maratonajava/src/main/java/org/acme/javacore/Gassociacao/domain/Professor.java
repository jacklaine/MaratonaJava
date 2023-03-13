package org.acme.javacore.Gassociacao.domain;

public class Professor {

    private String nome;
    private Seminario[] seminarios;
    private String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;

    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;

    }

    public void imprime() {

        System.out.println(nome);
        System.out.println(especialidade);

        for (Seminario seminario : seminarios) {
            System.out.println(seminario);

        }

    }

}
