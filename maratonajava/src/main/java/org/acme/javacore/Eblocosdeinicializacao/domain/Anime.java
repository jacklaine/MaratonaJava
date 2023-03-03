package org.acme.javacore.Eblocosdeinicializacao.domain;

public class Anime {

    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criada e inicializado com valores default ou o
    // que for passado
    // 3 - O bloco de inicialização é executado
    // 4 - Contrutor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
