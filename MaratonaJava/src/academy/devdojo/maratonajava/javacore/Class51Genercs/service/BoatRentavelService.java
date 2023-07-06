package academy.devdojo.maratonajava.javacore.Class51Genercs.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class51Genercs.domain.Boat;

public class BoatRentavelService {
    private List<Boat> boatAvailable = new ArrayList<>(List.of(new Boat("lancha"), new Boat("canoa")));

    public Boat findBoatAvailable(){
        System.out.println("Buscando Boatro disponivel");
        Boat boat = boatAvailable.remove(0);
        System.out.println("alugando: "+ boat);
        System.out.println("Boatros disponiveis para alugar");
        System.out.println(boatAvailable);
        return boat;
    }

    public void returnRentalBoat(Boat boat){
        System.out.println("devolvendo Boatro "+boat);
        boatAvailable.add(boat);
        System.out.println("Boatros disponiveis para alugar: ");
        System.out.println(boatAvailable);
    }
}
