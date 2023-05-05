package academy.devdojo.maratonajava.javacore.Class45IO.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test05BufferedReader {
    public static void main(String[] args) {
        File file = new File("exemploTest05BufferedReader.txt");
    //    try {
    //     boolean isCretead = file.createNewFile();
    //     System.out.println(isCretead);
    //    } catch (Exception e) {
        
    //    } 
        
                    /////// Utilizado para realizar a leitura do que contem no arquivo. 
        try       
        (FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
