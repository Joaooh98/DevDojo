package academy.devdojo.maratonajava.javacore.Class28InitiationBlocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

/* 1 - Alocado espaço em memoria pro objeto
 * 2 - Cada atributo de classe e criado e inicializado com valores default ou que for passada 
 * 3 - Bloco de inicialização e executado 
 * 4 - Constrututor e executado
 */

 {// inicio do bloco de inicalização
    System.out.println("dentro do bloco de inicialização");
    episodes = new int [20];
    for (int i = 0; i < episodes.length; i++) {
        episodes[i] = i+1;
    }
 } // fim 

public Anime(String name) { // construtor 
        this.name = name;
    }


public Anime() { // Construtor 
    for (int episode : this.episodes) {
        System.out.print(episode+" ");
    }    
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
    this.episodes = episodes;
}

}