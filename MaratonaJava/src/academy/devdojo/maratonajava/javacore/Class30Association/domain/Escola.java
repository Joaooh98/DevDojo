package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return; {
            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }
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

    /**
     * @return Professor[] return the professores
     */
    public Professor[] getProfessores() {
        return professores;
    }

    /**
     * @param professors the professors to set
     */
    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

}
