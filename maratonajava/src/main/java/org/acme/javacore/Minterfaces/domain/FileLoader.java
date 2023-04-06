package org.acme.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }
    
}
