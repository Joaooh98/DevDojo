package TestJobs.problems.Object;

import java.math.BigDecimal;

public class ExtratoConta {
    
    private Integer id;

    private Parcela IdParcela;

    private BigDecimal valor;

    public ExtratoConta(Integer id, Parcela idParcela, BigDecimal valor) {
        this.id = id;
        IdParcela = idParcela;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ExtratoConta [id=" + id + ", IdParcela=" + IdParcela + ", valor=" + valor + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Parcela getIdParcela() {
        return IdParcela;
    }

    public void setIdParcela(Parcela idParcela) {
        IdParcela = idParcela;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
}
