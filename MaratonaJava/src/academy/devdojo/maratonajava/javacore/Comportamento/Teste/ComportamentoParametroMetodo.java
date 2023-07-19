package academy.devdojo.maratonajava.javacore.Comportamento.Teste;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Comportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.Comportamento.interfaces.CarPredicate;

public class ComportamentoParametroMetodo {
    
    private static List<Car> cars = List.of(
            new Car("green", 2021),
            new Car("Black", 2022),
            new Car("green", 1998),
            new Car("green", 2000),
            new Car("Red", 2023));

    public static void main(String[] args) {

        List<Car> carsFilter = filterMetodo(cars, new CarPredicate() {
            @Override
            public boolean test(Car car){
                return car.getColor().equals("green");
            }
        });
        System.out.println(carsFilter);
    }

    private static List<Car> filterMetodo(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
