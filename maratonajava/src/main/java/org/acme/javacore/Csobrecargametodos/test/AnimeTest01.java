package org.acme.javacore.Csobrecargametodos.test;

import org.acme.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");
        anime.imprime();
    }

}