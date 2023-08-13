package academy.devdojo.maratonajava.javacore.Stream.Test;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class Grouping {
    public static void main(String[] args) {
        List<Person> Persons = Arrays.asList(
            new Person("Alice", "São Paulo"),
            new Person("Bob", "Rio de Janeiro"),
            new Person("Carol", "São Paulo"),
            new Person("David", "Rio de Janeiro")
        );

        Map<String, List<Person>> peoplebycity = Persons.stream()
            .collect(Collectors.groupingBy(Person::getCity));

        System.out.println("people grouped by city");
        peoplebycity.forEach((city, listPerson) -> {
            System.out.println("city: " + city);
            listPerson.forEach(person -> System.out.println(" - " + person.getName()));
        });
    }
}