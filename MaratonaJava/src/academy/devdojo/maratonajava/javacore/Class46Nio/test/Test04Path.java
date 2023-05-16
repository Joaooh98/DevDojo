package academy.devdojo.maratonajava.javacore.Class46Nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test04Path {
    public static void main(String[] args) {
        Path dir = Paths.get("home/joao");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/joao");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1"+absoluto.resolve(relativo));
        System.out.println("2"+absoluto.resolve(file));
        System.out.println("3"+absoluto.resolve(absoluto));
        System.out.println("4"+absoluto.resolve(file));
        System.out.println("5"+absoluto.resolve(absoluto));
        System.out.println("6"+absoluto.resolve(relativo));


    }
}
