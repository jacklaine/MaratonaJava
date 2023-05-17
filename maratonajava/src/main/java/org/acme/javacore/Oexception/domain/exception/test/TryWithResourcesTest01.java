package org.acme.javacore.Oexception.domain.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.acme.javacore.Oexception.domain.exception.domain.Leitor01;
import org.acme.javacore.Oexception.domain.exception.domain.Leitor02;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
        
    }
    
    public static void lerArquivo() {
        try (Leitor01 leitor01 = new Leitor01();
        Leitor02 leitor02 = new Leitor02();) {
        } catch (IOException e) {
            
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
    
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
    
}
