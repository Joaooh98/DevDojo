package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

public class MyCalculator {
    
    private Double resultado;

    public Double somar(Double numberOne, Double numbertwo) {
        resultado = numberOne + numbertwo;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
