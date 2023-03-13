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

    public Seminario (String titulo) {
        this.titulo = titulo;
    }

    public Seminario (String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario (String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {
        System.out.println(titulo);
        System.out.println(local);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());

        }
    }

}
