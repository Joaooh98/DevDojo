package academy.devdojo.maratonajava.javacore.Class51Genercs.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class51Genercs.domain.Boat;
import academy.devdojo.maratonajava.javacore.Class51Genercs.domain.Car;
import academy.devdojo.maratonajava.javacore.Class51Genercs.service.RentalService;

public class GenericTestC {
    public static void main(String[] args) {
        List<Boat> boatAvailable = new ArrayList<>(List.of(new Boat("lancha"), new Boat("canoa")));
        List<Car> carAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("FORD")));

        RentalService<Car> rentalService = new RentalService<>(carAvailable);
        Car car = rentalService.findObjectAvailable();
        System.out.println("usando o carro por 1 mes ...");
        rentalService.returnRentalObject(car);

        System.out.println("----------------------------");

        RentalService<Boat> rentalService2 = new RentalService<>(boatAvailable);
        Boat boat = rentalService2.findObjectAvailable();
        System.out.println("usando barco por 1 mes ...");
        rentalService2.returnRentalObject(boat);
    }
}
