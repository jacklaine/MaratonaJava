package org.acme.javacore.Oexception.domain.exception.test;

import java.util.Scanner;

import org.acme.javacore.Oexception.domain.exception.domain.LoginInvalidoException;


public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(userNameDigitado)) {
            throw new LoginInvalidoException();
        }
    }
    
}
