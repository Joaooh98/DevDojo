package academy.devdojo.maratonajava.javacore.Class36interfaces.Domain;

public class DataBaseLoader implements DateLoader{
    @Override
    public void load() {
        System.out.println("carrega os dados do banco de dados");
    }
    
}
