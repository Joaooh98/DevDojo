package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.Arrays;
import java.util.List;
// import java.util.Optional:

public class StreamFindingAndMatching02 {
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 9, 10);

        // Verificando se há pelo menos um número par
        
        boolean hasEvenNumber = numbers.stream()
                .anyMatch(number -> number % 2 == 0);

        if (hasEvenNumber) {
            System.out.println("A lista contém pelo menos um número par.");
        } else {
            System.out.println("A lista não contém números pares.");
        }
    }

    //     public static void main(String[] args) {
    //     List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 9, 10);

    //     // Encontrando o primeiro número par 
    
    //     Optional<Integer> firstEvenNumber = numbers.stream()
    //             .filter(number -> number % 2 == 0)
    //             .findFirst();

    //     if (firstEvenNumber.isPresent()) {
    //         System.out.println("O primeiro número par encontrado é: " + firstEvenNumber.get());
    //     } else {
    //         System.out.println("Nenhum número par encontrado na lista.");
    //     }
    // }
}
