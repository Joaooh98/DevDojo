package academy.devdojo.maratonajava.javacore.Class46Nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Teste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/joao/Documentos/DevDojo/textClass46NIO.txt"); // so e permitido passar esse formato
      System.out.println(p1.getFileName());                                      // de "/" para o caminho pq o sistema
                                                                                 // operacional e linux caso seja
        }                                                                        // windows deveria utilizar dessa forma "//"
                                                                                
    }
