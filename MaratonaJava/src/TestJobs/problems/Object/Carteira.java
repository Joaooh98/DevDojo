package TestJobs.problems.Object;

public class Carteira {
    private Integer Id;

    private String tipoRecebimento;

    public Carteira(Integer id, String tipoRecebimento) {
        Id = id;
        this.tipoRecebimento = tipoRecebimento;
    }

    @Override
    public String toString() {
        return "Carteira [Id=" + Id + ", tipoRecebimento=" + tipoRecebimento + "]";
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTipoRecebimento() {
        return tipoRecebimento;
    }

    public void setTipoRecebimento(String tipoRecebimento) {
        this.tipoRecebimento = tipoRecebimento;
    }

}
