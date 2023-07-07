package academy.devdojo.maratonajava.javacore.Class51Genercs.test;

import java.util.List;

import academy.devdojo.maratonajava.javacore.Class51Genercs.domain.Boat;

public class GenericMethod {
    public static void main(String[] args) {
        createdWithObject(new Boat("canoa marota"));
        
        List <Boat> boatList = createdWithObjectAndReturn(new Boat("canoa marotaa"));
        System.out.println(boatList);
    }

    private static <T> void createdWithObject(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

    private static <T> List<T> createdWithObjectAndReturn(T t) {
        List<T> list = List.of(t);
        
        return list;
    }
}
