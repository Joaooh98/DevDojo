package academy.devdojo.maratonajava.javacore.Class29StaticModifiers.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    /*
     * 0 - Bloco de inicialização e executado quando a jvm carregar a classe Anime
     * 1 - Alocado espaço em memoria pro objeto
     * 2 - Cada atributo de classe e criado e inicializado com valores default ou o que for passada
     * 3 - Bloco de inicialização e executado
     * 4 - Constrututor e executado
     */

    static {// inicio do bloco de inicalização
        System.out.println("dentro do bloco de inicialização");
        episodes = new int[20];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    } // fim

    public Anime(String name) { // construtor
        this.name = name;
    }

    public Anime() { // Construtor
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        Anime.episodes = episodes;
    }
}
