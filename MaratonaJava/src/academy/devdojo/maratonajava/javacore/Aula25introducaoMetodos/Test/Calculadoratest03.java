package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Calculadora;
// aula 46 e 47
public class Calculadoratest03 {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        // O tipo esta declarado dentro do objeto temos que declarar uma variavel para armazernar o resultado do mesmo tipo que esta no objeto ou utillizar o typecast
        
        double resultado = calcular.divideDoisNumerosComReturno0(11, 10);
        System.out.println(resultado);
        // visto que no objeto temos o comando de (return 0) quando mandamos imprimir o nosso resultado e 0,
        //  pq nao esta sendo solicitado para realizar nada dentro do objeto 
        double resultadoC = calcular.divideDoisNumerosComResultadoMeu(22, 10);
        System.out.println(resultadoC);

        double resultadoC1 = calcular.divideDoisNumerosComResultado1(33, 10);
        System.out.println(resultadoC1);

        double resultadoC2 = calcular.divideDoisNumerosComResultado2(44, 10);
        System.out.println(resultadoC2);

        calcular.divideDoisNumerosComResultado3(55, 10); // Exemplo com o void 
    }
}
