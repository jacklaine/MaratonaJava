package org.acme.javacore.Npolimorfismo.domain;

public class Televisao extends Produto {
    public Televisao(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
    
}
