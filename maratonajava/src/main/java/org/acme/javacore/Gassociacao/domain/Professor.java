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

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.seminarios);
        System.out.println(this.especialidade);
    }
    
}
