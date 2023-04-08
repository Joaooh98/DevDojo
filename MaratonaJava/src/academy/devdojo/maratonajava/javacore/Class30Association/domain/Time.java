package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class Time {
    private String nome;
    private Jogador[]jogadors; 

    public Time(String nome) {
        this.nome = nome;
    }
    
    public Time(String nome, Jogador[] jogadors) {
        this.nome = nome;
        this.jogadors = jogadors;
    }
    public void imprime() {
        System.out.println(this.nome);
        if (jogadors == null) return;
        for (Jogador jogador : jogadors) {
            System.out.println(jogador.getNome());   
        }         
    }
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadors() {
        return jogadors;
    }

    public void setJogadors(Jogador[] jogadors) {
        this.jogadors = jogadors;
    }

}
