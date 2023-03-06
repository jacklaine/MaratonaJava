package org.acme.javacore.Gassociacao.test;

import org.acme.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romádio");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
    
        for(
        Jogador jogador:jogadores)
        {
            jogador.imprime();
        }
        
    }

}
