package academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.dominioo.Carro;

public class CarroTest02ReferenciaDeObjeto {
    public static void main(String[] args) {
        Carro carrolocal01 = new Carro();

        carrolocal01.nome = "Shelby Mustang GT500";
        carrolocal01.marca = "Ford";
        carrolocal01.ano = 1968;

        Carro carrolocal02 = new Carro();

        carrolocal02.nome = "Dodge charger SRT";
        carrolocal02.marca = "Dodge";
        carrolocal02.ano = 2015;

        carrolocal02 = carrolocal01; // nao e possivel fazer referencia caso as variaveis nao seja do mesmo tipo, nao
                                     // podemos fazer carrolocal01 = Professor.

        System.out.println("MODELO: " + carrolocal01.nome + ", MARCA: " + carrolocal01.marca + " ANO DE FABRICAÇÃO: "
                + carrolocal01.ano);
        System.out.println("MODELO: " + carrolocal02.nome + ", MARCA: " + carrolocal02.marca + " ANO DE FABRICAÇÃO: "
                + carrolocal02.ano);
    }
}