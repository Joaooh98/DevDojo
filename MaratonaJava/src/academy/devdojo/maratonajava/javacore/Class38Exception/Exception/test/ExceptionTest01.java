package academy.devdojo.maratonajava.javacore.Class38Exception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("/home/joao/Documentos/DevDojo/MaratonaJava/arquivo/test1.txt"); /// caso ja tenha um
                                                                                              /// arquivo com o mesmo
                                                                                              /// nome retorna false
        try {
            Boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
