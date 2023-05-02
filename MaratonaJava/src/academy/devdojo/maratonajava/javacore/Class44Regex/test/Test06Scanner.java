package academy.devdojo.maratonajava.javacore.Class44Regex.test;

public class Test06Scanner {
    public static void main(String[] args) {
        String texto ="Levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
