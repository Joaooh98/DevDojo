package academy.devdojo.maratonajava.javacore.Class51Genercs.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class51Genercs.domain.Car;

public class CarRentavelService {
    private List<Car> carAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("FORD")));

    public Car findCarAvailable(){
        System.out.println("Buscando carro disponivel");
        Car car = carAvailable.remove(0);
        System.out.println("alugando: "+ car);
        System.out.println("carros disponiveis para alugar");
        System.out.println(carAvailable);
        return car;
    }

    public void returnRentalCar(Car car){
        System.out.println("devolvendo carro "+car);
        carAvailable.add(car);
        System.out.println("carros disponiveis para alugar: ");
        System.out.println(carAvailable);
    }
}
