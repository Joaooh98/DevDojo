package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Funcionario;

public class FuncionarioTest08 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        
        funcionario01.setNome("joao Carlos de Paiva ");
        funcionario01.setIdade(25);
        funcionario01.setSalarios(new double[]{1500, 1850, 2000});

        funcionario01.imptrimirDados();
        
    }
}
