package org.acme.javacore.Kenum.test;

import org.acme.javacore.Kenum.domain.Cliente;
import org.acme.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        

    Cliente cliente1 = new Cliente("maria", TipoCliente.PESSOA_FISICA);
    Cliente cliente2 = new Cliente("maria", TipoCliente.PESSOA_JURIDICA);
    Cliente cliente3 = new Cliente("maria", TipoCliente.PESSOA_JURIDICA);
    Cliente cliente4 = new Cliente("maria", TipoCliente.PESSOA_FISICA);
    
    System.out.println(cliente1);
    System.out.println(cliente2);
    System.out.println(cliente3);
    System.out.println(cliente4);
    
    }
}
