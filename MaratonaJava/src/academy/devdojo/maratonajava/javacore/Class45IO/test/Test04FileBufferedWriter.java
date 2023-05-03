package academy.devdojo.maratonajava.javacore.Class45IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test04FileBufferedWriter {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)){
            br.write("Melhor curso de java do Brasil.\n");
            br.newLine();
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
