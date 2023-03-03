package org.acme.javacore.Dconstrutores.test;

import org.acme.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 12, "Ação", "Walt");
        anime.imprime();
    }
    
}
