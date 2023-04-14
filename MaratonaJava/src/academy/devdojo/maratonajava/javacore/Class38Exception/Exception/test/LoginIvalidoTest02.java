package academy.devdojo.maratonajava.javacore.Class38Exception.Exception.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Class38Exception.Exception.Domain.LoginInvalidoException;

public class LoginIvalidoTest02 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    
    private static void logar() throws LoginInvalidoException{
        try (Scanner teclado = new Scanner(System.in)) {
            String userDB = "joao";
            String senha = "1234";
            System.out.println("digite usuario: ");
            String userNameT = teclado.nextLine();
            System.out.println("digite sua senha: ");
            String userSenha = teclado.nextLine();

            if (!userDB.equals(userNameT) || !senha.equals(userSenha)) {
               throw new LoginInvalidoException("Usuario ou senha invalidos");
            } 
        } System.out.println("usuario logado com sucesso");
    }
}
