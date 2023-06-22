package academy.devdojo.maratonajava.javacore.ColecoesClass50.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo x.equals(x) tem que ser true para tudo que for diferente de null
    // Simetrico para x e y diferentes de null, se x.equals(y) == true logo,
    // y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e
    // x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente null, x.equals(null) tem que retornar false

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        Smartphone smartphone = (Smartphone) obj;

        return (serialNumber != null && serialNumber.equals(smartphone.serialNumber)) // define a quantidade de
                && (marca != null && marca.equals(smartphone.marca)); // paramentros que deve ser
                                                                      // verificado pelo equals

    }
    
    @Override
    public String toString() {
        return "Smartphone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
