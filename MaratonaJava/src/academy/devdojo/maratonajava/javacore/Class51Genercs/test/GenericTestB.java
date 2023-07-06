package academy.devdojo.maratonajava.javacore.Class51Genercs.test;

import academy.devdojo.maratonajava.javacore.Class51Genercs.service.BoatRentavelService;

public class GenericTestB {
    public static void main(String[] args) {
        var boatRentavelService = new BoatRentavelService();
        var boat = boatRentavelService.findBoatAvailable();
        System.out.println("usando o Boatro por mes...");
        boatRentavelService.returnRentalBoat(boat);;
    }
}
