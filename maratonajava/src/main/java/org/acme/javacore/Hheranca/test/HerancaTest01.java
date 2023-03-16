package org.acme.javacore.Hheranca.test;

import org.acme.javacore.Hheranca.domain.Endereco;
import org.acme.javacore.Hheranca.domain.Funcionario;
import org.acme.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("85815570");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setCpf("11111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ana");
        funcionario.setCpf("11111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();

    }

}
