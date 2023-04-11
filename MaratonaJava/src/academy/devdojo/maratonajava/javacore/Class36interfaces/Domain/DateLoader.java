package academy.devdojo.maratonajava.javacore.Class36interfaces.Domain;

public interface DateLoader {// todos os metodos de um interface são public abstract por padrao
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission() {
        System.out.println(
                "dentro da interface DateLoader executando o metodo checkPermission\n Default void checkPermission() --- declarando dessa forma nao e obrigatorio sobrescrever esse metodo nas classe em que ela esta implementada");
    }

    public static void retrieveMaxDataSiza(){
        System.out.println("dentro do metodo retrieveMaxDataSiza na interface");
    }
}