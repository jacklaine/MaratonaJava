package org.acme.javacore.Kenum.test;

import org.acme.javacore.Kenum.domain.Cliente;
import org.acme.javacore.Kenum.domain.TipoCliente;
import org.acme.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("maria", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    Cliente cliente2 = new Cliente("maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
    Cliente cliente3 = new Cliente("maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
    Cliente cliente4 = new Cliente("maria", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    
    System.out.println(cliente1);
    System.out.println(cliente2);
    System.out.println(cliente3);
    System.out.println(cliente4);
    System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
    System.out.println(tipoCliente.getNomeRelatorio());
    TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
    System.out.println(tipoCliente2);

    }
}
