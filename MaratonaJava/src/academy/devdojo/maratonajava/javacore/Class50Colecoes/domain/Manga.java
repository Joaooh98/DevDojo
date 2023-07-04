package academy.devdojo.maratonajava.javacore.Class50Colecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double preco;
    private int quantidade;

    public Manga(Long id, String name, double preco) {
        Objects.requireNonNull(id, "identificador nao pode ser null");
        Objects.requireNonNull(name, "nome nao pode ser null");
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    public Manga(Long id, String name, double preco, int quantidade) {
        this(id, name, preco); 
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga [id=" + id + ", name=" + name + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantidade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        if (quantidade != other.quantidade)
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga referenc) {

        // if (this.id < referenc.getId()) { // negativo se o this < referenc
        // return -1;
        // }
        // else if (this.id.equals(referenc.getId())) {// se this == referenc, return 0
        // return 0;
        // }
        // else {// positivo se this > referenc
        // return 1;
        // }
        return this.name.compareTo(referenc.getName());
        // return Double.compare(preco, referenc.getPreco());
        // return Double.valueOf(preco).compareTo(referenc.getPreco());
        // return this.id.compareTo(referenc.getId()); /// executa o mesmo resultada do
        // codigo comentado acima
        
        // nao e possivel utilizar esse metodo caso seja um tipo primitivo lembrando que
        // o 'id' e o wapper
    }
}
