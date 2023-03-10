package org.acme.javacore.Gassociacao.domain;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void imprime() {
        System.out.println(this.titulo);
        System.out.println(this.alunos);
        System.out.println(this.local);
    }

}
