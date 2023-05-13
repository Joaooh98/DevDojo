package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

public class MyCalculator {

    private Double result;

    public void add(Double numberOne, Double numberTwo) {
        result = numberOne + numberTwo;
        System.out.println("\n Soma dos 2 numeros: "+result);
    }

    public void toDecrease(Double numberOne, Double numberTwo) {
        result = numberOne - numberTwo;
        System.out.println("\n Subtração dos 2 numeros: "+result);
    }

    public void multiply(Double numberOne, Double numberTwo) {
        result = numberOne * numberTwo;
        System.out.println("\n Multiplicação dos 2 numeros: "+result);
    }

    public void division(Double numberOne, Double numberTwo) {
        result = numberOne / numberTwo;
        System.out.println("\n Divisão dos 2 numeros: "+result);
    }

    public void squareRoot(Double numberOne) {
        result = Math.sqrt(numberOne);
        System.out.println(result);
    }

    public void power(Double numberOne, Double numberTwo) {
        result = Math.pow(numberOne, numberTwo);
        System.out.println("\n Valor  dos "+numberOne+" elevado a potencia dos "+numberTwo+" = "+result);
    }

    public void pi(Double numberOne) {
        result = (numberOne = Math.PI);
        System.out.println(result);
    }

    public void percentage(Double numberOne, Double numberTwo){
        var D = numberOne / 100;
        result = D * numberTwo;

        System.out.println("\n Valor em porcentagem dos "+numberOne+" do numero "+numberTwo+" = "+result);
    }

    public double getResult() {
        return result;
    }

    public void setResultado(double resultado) {
        this.result = resultado;
    }

}
