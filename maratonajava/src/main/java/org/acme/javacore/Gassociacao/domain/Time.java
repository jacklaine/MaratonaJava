package org.acme.javacore.Gassociacao.domain;

public class Time {

    private String nome;
    private Jogador jogador;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null)
        return;
        for(Jogador jogadorr : jogadores) {
            System.out.println(jogadorr.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

}
