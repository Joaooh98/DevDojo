package academy.devdojo.maratonajava.javacore.Class51Genercs.service;

import java.util.List;

public class RentalService <T>{
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects){
        this.availableObjects = availableObjects;
    }

    public T findObjectAvailable(){
        System.out.println("Buscando Objeto disponivel");
        T t = availableObjects.remove(0);
        System.out.println("alugando: "+ t);
        System.out.println("Objeto disponiveis para alugar");
        System.out.println(availableObjects);
        return t;
    }

    public void returnRentalObject(T t){
        System.out.println("devolvendo Objeto "+t);
        availableObjects.add(t);
        System.out.println("Objeto disponiveis para alugar: ");
        System.out.println(availableObjects);
    }
}
