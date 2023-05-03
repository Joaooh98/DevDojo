package academy.devdojo.maratonajava.javacore.Class45IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02FileWriter {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (FileWriter fw = new FileWriter(file)){ //  necessario passar (file, true) para adicionar o texto no arquivo 
            fw.write("Melhor curso de java do Brasil.\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
