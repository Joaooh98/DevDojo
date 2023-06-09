package academy.devdojo.maratonajava.javacore.Class41Date.Test;

import java.time.Instant;

public class Test07Instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(
            "\n Com Instance e apresentado o Z no final significado: zulo time que e o horario neutro do mundo tem o mesmo sentido que UTC \n "+now);
        // System.out.println(LocalDateTime.now());

        // System.out.println(now.getEpochSecond()); // retonra um long 
        // System.out.println(now.getNano()); // retorna um inteiro 999.999.999 = 1 segundo
        System.out.println(Instant.ofEpochMilli(2));
        System.out.println(Instant.ofEpochSecond(2));

        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));

    }
}
