package academy.devdojo.maratonajava.javacore.Class45IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test03FileReader {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (FileReader fr = new FileReader(file)) {
            // System.out.println(fr.read()); // faz a leitura do primeiro caractere.
            char[] in = new char[30];
            fr.read(in);
            for (char c : in) {
                System.out.print(c);
            }
            System.out.println("\n");
            
            // int i;
            // while ((i = fr.read()) != -1) { // no READ quando chega no final do arquivo ele retorna -1
            //     System.out.print((char) i);
            // }
            // System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
