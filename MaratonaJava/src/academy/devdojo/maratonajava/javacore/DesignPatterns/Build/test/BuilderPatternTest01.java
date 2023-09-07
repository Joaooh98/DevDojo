package academy.devdojo.maratonajava.javacore.DesignPatterns.Build.test;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Build.domain.Person;

// https://refactoring.guru/pt-br/design-patterns/builder
public class BuilderPatternTest01 {
    public static void main(String[] args) {
        var personBuild = new Person.PersonBuilder()
                .firstName("Joao")
                .lastName("Carlos")
                .userName("JoaoCP")
                .email("joao@gmail.com")
                .build();

        System.out.println(personBuild);
    }
}
