package academy.devdojo.maratonajava.javacore.ColecoesClass50.domain;

import java.util.Objects;

public class A01Sort implements Comparable<A01Sort>{
    private Long id;
    private String name;
    private double preco;
    

    public A01Sort(Long id, String name, double preco) {
        Objects.requireNonNull(id, "identificador nao pode ser null");
        Objects.requireNonNull(name, "nome nao pode ser null");
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "A01Sort [id=" + id + ", name=" + name + ", preco=" + preco + "]";
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
        A01Sort manga = (A01Sort) obj;
        if (id == null) {
            if (manga.id != null)
                return false;
        } else if (!id.equals(manga.id))
            return false;
        if (name == null) {
            if (manga.name != null)
                return false;
        } else if (!name.equals(manga.name))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(manga.preco))
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

    @Override
    public int compareTo(A01Sort referenc) {

        if (this.id < referenc.getId()) { // negativo se o this < referenc
            return -1;
        }
        else if (this.id.equals(referenc.getId())) {// se this == referenc, return 0
            return 0;
        }
        else {// positivo se this > referenc
            return 1;
        }
    }
}
