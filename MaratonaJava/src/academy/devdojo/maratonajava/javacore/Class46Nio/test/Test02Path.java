package academy.devdojo.maratonajava.javacore.Class46Nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test02Path {
    public static void main(String[] args) throws IOException{

        Path pasta = Paths.get("pasta"); // equivalente  a  (new File()pasta)
            if (Files.notExists(pasta)) { // para verificar se o arquivo ja foi criado
                Path pastaDirectory = Files.createDirectory(pasta);

        }
        Path subpastaPath =  Paths.get("pasta/subpasta/subsubpasta"); 
        Path ssubPastaDirectory = Files.createDirectories(subpastaPath); // criando as subpasta 
        Path filePath = Paths.get(subpastaPath.toString(), "file.txt");
        
            if (Files.notExists(pasta)) { // para verificar se o arquivo ja foi criado
        Path filePathCreated = Files.createFile(filePath);

        } // criando a o arquivo dentro das subpasta
        
        // copia os dados do arquivo criado e salva no mesmo diretorio 
        Path source = filePath;
        Path target =  Paths.get(filePath.getParent().toString(), "file_renamed");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
