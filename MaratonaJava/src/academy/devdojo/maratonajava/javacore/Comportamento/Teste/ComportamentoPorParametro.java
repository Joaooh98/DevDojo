package academy.devdojo.maratonajava.javacore.Comportamento.Teste;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Comportamento.dominio.Car;

public class ComportamentoPorParametro {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("green", 2021),
                new Car("Black", 2022),
                new Car("green", 1998),
                new Car("green", 2000),
                new Car("Red", 2023));
                
                System.out.println(filterCarByColor(cars, "Red"));
    }
    
    
    private static List<Car>filterCarByColor(List<Car> cars, String color){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;
   
    }

    /// inserir filtro com data
}
