package academy.devdojo.maratonajava.javacore.Class36interfaces.Test;

import academy.devdojo.maratonajava.javacore.Class36interfaces.Domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Class36interfaces.Domain.DateLoader;
import academy.devdojo.maratonajava.javacore.Class36interfaces.Domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader base  = new DataBaseLoader();
        FileLoader file = new FileLoader();
        
        base.load();
        file.load();

        base.remove();
        file.remove();
        System.out.println("\nchamando direto do metodo main DataLoaderTest01 objeto-base.checkPermission();");
        base.checkPermission();
        System.out.println("\nchamando direto do metodo main DataLoaderTest01 objeto-file.checkPermission();");
        file.checkPermission();

        DateLoader.retrieveMaxDataSiza(); // chamada direta da interface
        DataBaseLoader.retrieveMaxDataSiza();
        
     }
}