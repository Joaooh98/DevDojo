package academy.devdojo.maratonajava.javacore.Class46Nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException{

        Path pasta = Paths.get("pasta");
            if (Files.notExists(pasta)) {
                Path pastaDirectory = Files.createDirectory(pasta);

        }
        Path subpastaPath =  Paths.get("pasta/subpasta/subsubpasta");
        Path ssubPastaDirectory = Files.createDirectories(subpastaPath);
        Path filePath = Paths.get(subpastaPath.toString(), "file.txt");
    }
}
