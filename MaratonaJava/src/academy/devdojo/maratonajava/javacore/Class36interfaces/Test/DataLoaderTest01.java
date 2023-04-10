package academy.devdojo.maratonajava.javacore.Class36interfaces.Test;

import academy.devdojo.maratonajava.javacore.Class36interfaces.Domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Class36interfaces.Domain.FileLoader;

public class DataLoaderTest01 {
     public static void main(String[] args) {
        DataBaseLoader base  = new DataBaseLoader();
        FileLoader file = new FileLoader();
        base.load();
        file.load();
     }
}
