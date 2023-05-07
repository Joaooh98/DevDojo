package academy.devdojo.maratonajava.javacore.Class46Nio.test;

import java.nio.file.Paths;

public class Teste01 {
    public static void main(String[] args) {
        var p1 = Paths.get("/home/joao/Documentos/DevDojo/textClass46NIO.txt");
        var p2 = Paths.get("/home/joao/Documentos/DevDojo","textClass46NIO.txt");
        var p3 = Paths.get("/home","joao/Documentos/DevDojo/textClass46NIO.txt");
        var p4 = Paths.get("home","joao","Documentos","DevDojo","textClass46NIO.txt");

                                                                                // so e permitido passar esse formato
      System.out.println(p1.getFileName());                                      // de "/" para o caminho pq o sistema
      System.out.println(p1.toFile());                                           // operacional e linux caso seja
      System.out.println(p1.isAbsolute());                                       // windows deveria utilizar dessa forma "//"

      System.out.println(p2.getFileName());
      System.out.println(p3.getFileName());
      System.out.println(p4.getFileName());
        }                                                                                                                                              
    }
