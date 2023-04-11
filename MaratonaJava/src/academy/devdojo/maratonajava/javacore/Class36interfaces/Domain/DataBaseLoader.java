package academy.devdojo.maratonajava.javacore.Class36interfaces.Domain;

public class DataBaseLoader implements DateLoader, DataRemove{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("carrega os dados do banco de dados DataBaseLoader");
    }
    @Override
    public void remove() {
        System.out.println("removendo os dados do banco de dados DataBaseLoader");
    }
    
    @Override
    public void checkPermission() {
        System.out.println(
                "dentro da Class DataBaseLoader executando o metodo checkPermission\n Default void checkPermission() --- declarando dessa forma nao e obrigatorio sobrescrever esse metodo nas classe em que ela esta implementada");
    
    }
    
    public static void retrieveMaxDataSiza() {
        System.out.println("dentro do metodo retrieveMaxDataSiza na class DataBaseLoader");
    }
}
