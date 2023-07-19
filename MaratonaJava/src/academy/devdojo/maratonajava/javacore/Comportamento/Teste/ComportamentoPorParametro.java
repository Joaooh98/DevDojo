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
                System.out.println(filterCarByColor(cars, "Black"));
                System.out.println(filterCarByAge(cars, 2000));
    }
    
    
    private static List<Car>filterCarByColor(List<Car> cars, String color){
        List<Car> colorCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                colorCars.add(car);
            }
        }
        return colorCars;
   
    }

    private static List<Car>filterCarByAge(List<Car> cars,int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
   
    }

    /// inserir filtro com data
}
