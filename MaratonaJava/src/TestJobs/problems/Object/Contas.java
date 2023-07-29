package TestJobs.problems.Object;

public class Contas {

    private Integer id;

    private Banco IdBanco;

    private Filial IdFilial;

    public Contas(Integer id, Banco idBanco, Filial idFilial) {
        this.id = id;
        IdBanco = idBanco;
        IdFilial = idFilial;
    }

    @Override
    public String toString() {
        return "Contas [id=" + id + ", IdBanco=" + IdBanco + ", IdFilial=" + IdFilial + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Banco getIdBanco() {
        return IdBanco;
    }

    public void setIdBanco(Banco idBanco) {
        IdBanco = idBanco;
    }

    public Filial getIdFilial() {
        return IdFilial;
    }

    public void setIdFilial(Filial idFilial) {
        IdFilial = idFilial;
    }

    
}
