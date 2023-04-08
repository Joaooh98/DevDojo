package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        int[] numeros = {1,2,3,4,5,6,7};
        calcular.somaArrays(numeros);
        calcular.somaVarArgs(numeros);
    }
}
