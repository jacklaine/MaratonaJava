package org.acme.javacore.Bintroducaometodos.test;

import org.acme.javacore.Aintroducaoclasses.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
        
    }
    
}
