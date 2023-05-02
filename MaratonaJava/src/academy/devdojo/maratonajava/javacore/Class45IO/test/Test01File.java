package academy.devdojo.maratonajava.javacore.Class45IO.test;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;

public class Test01File {
    public static void main(String[] args) {
        File file = new File("file.txt");// caso queira salvar em um lugar especifico e necessario indicar o caminho
                                         // absoluto
        try {
             boolean isCretead = file.createNewFile();
             System.out.println(isCretead);
             System.out.println("path "+file.getPath());
             System.out.println("path absolute "+file.getAbsolutePath());
             System.out.println("is directory "+file.isDirectory());
             System.out.println("is file "+file.isFile());
             System.out.println("is hidden "+file.isHidden());
             System.out.println("last modified "+Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            
             boolean exists = file.exists(); // verifica se o arquivo existe 
             if (exists) {
                System.out.println("Deleted "+file.delete()); // deleta o arquivo criado 
             }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
