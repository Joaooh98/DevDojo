package academy.devdojo.maratonajava.javacore.Class38Exception.Exception.test;

import java.io.FileNotFoundException;

import academy.devdojo.maratonajava.javacore.Class38Exception.Exception.Domain.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Class38Exception.Exception.Domain.funcionario;
// import academy.devdojo.maratonajava.javacore.Class38Exception.Exception.Domain.pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        // pessoa pessoa = new pessoa();
        funcionario funcionario = new funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            
            e.printStackTrace();
        }
        
    }
}
