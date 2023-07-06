package academy.devdojo.maratonajava.javacore.Class51Genercs.test;

import academy.devdojo.maratonajava.javacore.Class51Genercs.service.CarRentavelService;

public class GenericTestA {
    public static void main(String[] args) {
        var carRentavelService = new CarRentavelService();
        var car = carRentavelService.findCarAvailable();
        System.out.println("usando o carro por mes...");
        carRentavelService.returnRentalCar(car);;
    }
}
