package academy.devdojo.maratonajava.javacore.Class38Exception.Exception.Domain;

import java.io.FileNotFoundException;

public class funcionario extends pessoa{
    
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando funcionario");
    }
}
