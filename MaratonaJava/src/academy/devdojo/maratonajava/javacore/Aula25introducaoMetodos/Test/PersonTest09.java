package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Person;

public class PersonTest09 {
    public static void main(String[] args) {
        Person pes = new Person();

        pes.setName("joao carlos de paiva"); // definir o valor para o atributo dentro do objeto pessoa (define the value for the attribute within the person object)
        System.out.println(pes.getName()); // pega o valor setado dentro do objeto pessoa (Take the Set Value within the Person Object)
        
        pes.setAge(25);
        System.out.println(pes.getAge());

    }   
}
