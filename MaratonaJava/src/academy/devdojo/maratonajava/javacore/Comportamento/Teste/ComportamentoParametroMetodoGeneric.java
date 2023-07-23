package academy.devdojo.maratonajava.javacore.Comportamento.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import academy.devdojo.maratonajava.javacore.Comportamento.dominio.Car;

public class ComportamentoParametroMetodoGeneric {

    private static List<Car> cars = List.of(
            new Car("green", 2021),
            new Car("Black", 2022),
            new Car("green", 1998),
            new Car("green", 2000),
            new Car("Red", 2023));

    public static void main(String[] args) {
        // sintaxe lambda
        List<Car> carsLambdaFilter = filter(cars, car -> car.getColor().equals("green"));
        List<Car> carsLambdaFilterRed = filter(cars, car -> car.getColor().equals("green"));
        List<Car> carsLambdaFilterYear = filter(cars, car -> car.getYear() > 2015);
        System.out.println(carsLambdaFilter);
        System.out.println(carsLambdaFilterYear);
        System.out.println(carsLambdaFilterRed);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));

    }
                                    // objeto       logica a ser utilizada
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
