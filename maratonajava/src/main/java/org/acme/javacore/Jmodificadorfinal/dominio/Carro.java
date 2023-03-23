package org.acme.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final double VELOCIDADE_LIMITE = 200; //final define a constante, ou seja, não permite que o valor seja alterado posteriormente
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
