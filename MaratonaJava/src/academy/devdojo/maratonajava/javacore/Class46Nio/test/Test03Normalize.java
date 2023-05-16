package academy.devdojo.maratonajava.javacore.Class46Nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03Normalize {
    public static void main(String[] args) {
        
        String diritorioProjeto ="home/joao/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path01 = Paths.get(diritorioProjeto, arquivoTxt);
        System.out.println(path01);
        System.out.println(path01.normalize());
        Path path02 = Paths.get("home/./joao/./dev");
        System.out.println(path02);
        System.out.println(path02.normalize());
    }
}
