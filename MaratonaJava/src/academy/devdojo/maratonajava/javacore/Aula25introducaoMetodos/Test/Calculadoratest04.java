package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Calculadora;

public class Calculadoratest04 {

    // Quando estamos  passando varialvel do tipo primitivo ele faz uma copia nao altera de fato o numero
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        // intependento da ação realizada o valor declarado dentro do metodo main nunca sera alterada 
        int num1 = 99;
        int num2 = 22;
        calcular.AlteraDoisNumeros(num1, num2);
        System.out.println("\nDentro do classe calculadoratest04");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
