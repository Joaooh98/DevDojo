package academy.devdojo.maratonajava.introducao;

public class aula20ArraysStringComFor03 {
    public static void main(String[] args) {
        String [] nomes = new String[4];

        nomes[0] = "goku";
        nomes[1] = "Picolo";
        nomes[2] = "Gohan";
        nomes[3] = "Vegeta";
           // inicio          fim      condição 
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
