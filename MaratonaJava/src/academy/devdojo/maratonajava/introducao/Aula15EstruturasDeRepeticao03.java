package academy.devdojo.maratonajava.introducao;

public class Aula15EstruturasDeRepeticao03 {
// Imprima os primeiros 25 numeros da variavel valorMax 
    public static void main(String[] args) {
        
        int valorMax = 50;
        
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
