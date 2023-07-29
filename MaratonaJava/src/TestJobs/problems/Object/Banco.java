package TestJobs.problems.Object;

public class Banco {
    private Integer Id;

    private String nome;

    public Banco(Integer id, String nome) {
        Id = id;
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Banco [Id=" + Id + ", nome=" + nome + "]";
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
// Smaug