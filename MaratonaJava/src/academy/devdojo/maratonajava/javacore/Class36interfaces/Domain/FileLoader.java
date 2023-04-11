package academy.devdojo.maratonajava.javacore.Class36interfaces.Domain;

public class FileLoader implements DateLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo FileLoader");
    }
    @Override
    public void remove() {
        System.out.println("removendo os dados do banco de dados FileLoader");
    }
    @Override
    public void checkPermission() {
        System.out.println(
                "dentro da Class FileLoader executando o metodo checkPermission\n Default void checkPermission() --- declarando dessa forma nao e obrigatorio sobrescrever esse metodo nas classe em que ela esta implementada");
    
    }
}
