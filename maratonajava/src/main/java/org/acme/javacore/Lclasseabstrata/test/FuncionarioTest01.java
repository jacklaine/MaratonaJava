package org.acme.javacore.Lclasseabstrata.test;

import org.acme.javacore.Lclasseabstrata.domain.Desenvolvedor;
import org.acme.javacore.Lclasseabstrata.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 1000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
    
}
