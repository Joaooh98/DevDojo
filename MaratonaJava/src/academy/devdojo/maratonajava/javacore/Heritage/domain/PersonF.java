package academy.devdojo.maratonajava.javacore.Heritage.domain;

public class PersonF {
    private String name;
    private String cpf;
    private Address address;
   
    
    public void show() {
        System.out.println("Nome: "+this.getName());
        System.out.println("CPF: " +this.getCpf());
        System.out.println("Endereço: "+this.address.getRoad()+" cep:"+this.address.getZipCode());
    }
     /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
