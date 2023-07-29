package TestJobs.problems.Object;

import java.math.BigDecimal;

public class Titulo {
    private Integer Id;

    private Parcela IdParcela;

    private Filial IdFilial;

    private BigDecimal valor;

    private Integer QuatidadeParcela;

    public Titulo(Integer id, Parcela idParcela, Filial idFilial, BigDecimal valor, Integer quatidadeParcela) {
        Id = id;
        IdParcela = idParcela;
        IdFilial = idFilial;
        this.valor = valor;
        QuatidadeParcela = quatidadeParcela;
    }

    @Override
    public String toString() {
        return "Titulo [Id=" + Id + ", IdParcela=" + IdParcela + ", IdFilial=" + IdFilial + ", valor=" + valor
                + ", QuatidadeParcela=" + QuatidadeParcela + "]";
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Parcela getIdParcela() {
        return IdParcela;
    }

    public void setIdParcela(Parcela idParcela) {
        IdParcela = idParcela;
    }

    public Filial getIdFilial() {
        return IdFilial;
    }

    public void setIdFilial(Filial idFilial) {
        IdFilial = idFilial;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQuatidadeParcela() {
        return QuatidadeParcela;
    }

    public void setQuatidadeParcela(Integer quatidadeParcela) {
        QuatidadeParcela = quatidadeParcela;
    }

}
