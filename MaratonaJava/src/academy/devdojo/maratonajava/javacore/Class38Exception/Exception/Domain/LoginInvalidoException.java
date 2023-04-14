package academy.devdojo.maratonajava.javacore.Class38Exception.Exception.Domain;

public class LoginInvalidoException extends Exception {
    
    public LoginInvalidoException(){
        super("Login invalido");
    }
    public LoginInvalidoException(String mensagem){
        super(mensagem);
    }
}
