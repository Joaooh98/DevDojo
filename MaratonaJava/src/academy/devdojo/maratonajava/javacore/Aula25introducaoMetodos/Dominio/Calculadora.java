package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

public class Calculadora {
    
    public void somaDoisNumeros(){ // aula 44 calculadoratest01
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() { // aula 44 calculadoratest01
        System.out.println(21-2);
    }
    
    public void multipliqueDoisNumeros() { // aula 44 calculadoratest01
        System.out.println(21*2);
    }

    public void multipliqueDoisNumerosinp(Float num1, Float num2) { // aula 45 calculadoratest02
        System.out.println(num1*num2);        
    }

    // Quando o metodo ja esta sendo declarado o tipo 'double, int, float, etc...', e necessario colocar um retorno 

    public double divideDoisNumerosComReturno0(double num1, double num2){ // aula 46 e 47 calculadoratest03
        return 0;
    }
    public double divideDoisNumerosComResultadoMeu(double nume1,double nume2){ // aula 46 e 47 calculadoratest03
        double resultado = 0;
        if (nume1 == 0 || nume2 == 0) {
            System.out.println("nao e possivel realizar divisão por 0");
        } else {
           resultado = nume1/nume2;
        }
        return resultado;
    }
    public double divideDoisNumerosComResultado1(double nume1,double nume2){ // aula 46 e 47 calculadoratest03
        if (nume1 == 0 || nume2 == 0) {
            return 0;
        }
        return nume1/nume2;
        
    }
    public double divideDoisNumerosComResultado2(double nume1,double nume2){ // aula 46 e 47 calculadoratest03
        if (nume1 != 0 || nume2 != 0){
            return nume1/nume2;
        }
        return 0;
    }
    public void divideDoisNumerosComResultado3(double nume1,double nume2){ // aula 46 e 47 calculadoratest03
        if (nume1 == 0 || nume2 == 0){
            System.out.println("nao e possivel realizar divisão por 0");
            return;
        }
        System.out.println(nume1/nume2);
    }

    // 48 - Orientação Objetos - Métodos pt 05 - Parâmetros tipo primitivo

    public void AlteraDoisNumeros(int num1, int num2) { // aula 48 calculadoratest04
        num1 = 1;
        num2 = 2;
        System.out.println("dentro do metodo Calculadora");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    public void somaArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) { 
            soma += num;
        }        
        System.out.println(soma);
        // esse método soma todos os elementos do array de inteiros NUMEROS e exibe o resultado.
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num; 
        }
        System.out.println(soma);
    }
}







