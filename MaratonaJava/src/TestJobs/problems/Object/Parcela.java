package TestJobs.problems.Object;

import java.math.BigDecimal;

public class Parcela {
    
    private Integer Id;

    private Titulo Titulo;

    private Carteira IdCarteira;

    private BigDecimal valor;

    private Integer Parcela;

    public Parcela(Integer id, TestJobs.problems.Object.Titulo titulo, Carteira idCarteira, BigDecimal valor,
            Integer parcela) {
        Id = id;
        Titulo = titulo;
        IdCarteira = idCarteira;
        this.valor = valor;
        Parcela = parcela;
    }

    @Override
    public String toString() {
        return "Parcela [Id=" + Id + ", Titulo=" + Titulo + ", IdCarteira=" + IdCarteira + ", valor=" + valor
                + ", Parcela=" + Parcela + "]";
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Titulo getTitulo() {
        return Titulo;
    }

    public void setTitulo(Titulo titulo) {
        Titulo = titulo;
    }

    public Carteira getIdCarteira() {
        return IdCarteira;
    }

    public void setIdCarteira(Carteira idCarteira) {
        IdCarteira = idCarteira;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getParcela() {
        return Parcela;
    }

    public void setParcela(Integer parcela) {
        Parcela = parcela;
    }
}
