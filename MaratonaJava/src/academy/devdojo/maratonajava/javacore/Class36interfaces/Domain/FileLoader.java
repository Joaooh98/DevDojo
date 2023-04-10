package academy.devdojo.maratonajava.javacore.Class36interfaces.Domain;

public class FileLoader implements DateLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
