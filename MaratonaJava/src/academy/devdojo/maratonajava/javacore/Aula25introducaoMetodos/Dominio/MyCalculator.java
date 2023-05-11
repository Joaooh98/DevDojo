package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

public class MyCalculator {
    
    private Double numberOne;

    private Double numbertwo;

    private Double resultado;

    public Double somar(Double numberOne, Double numbertwo) {
        resultado = this.numberOne + this.numbertwo;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumbertwo() {
        return numbertwo;
    }

    public void setNumbertwo(Double numbertwo) {
        this.numbertwo = numbertwo;
    }

}
