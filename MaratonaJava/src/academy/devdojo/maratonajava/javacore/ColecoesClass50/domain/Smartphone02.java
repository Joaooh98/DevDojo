package academy.devdojo.maratonajava.javacore.ColecoesClass50.domain;

public class Smartphone02 {
    private String serialNumber;
    private String marca;

    public Smartphone02(String serialNumber, String marca) {
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
    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        Smartphone02 smartphone = (Smartphone02) obj;

        return (serialNumber != null && serialNumber.equals(smartphone.serialNumber)) // define a quantidade de
        && (marca != null && marca.equals(smartphone.marca));                         // paramentros que deve ser
                                                                                      // verificado pelo equals
                
    }
    
    // se x. equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode == x.hashCode() não e necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode != x.hashCode() x.equals(y) devera ser false.

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
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
