package academy.devdojo.maratonajava.javacore.Heritage.domainPro;


public class PersonP {
    // protected declado o atributo dessa forma qualquer classe ou subclasse vai ter acesso aos atibutos desse objeto
    protected String name;
    protected String cpf;
    protected AddressP address;
    static{
        System.out.println("dentro do bloco estatico estatico pessoa00");
    }
    {
        System.out.println("dentro do bloco  estatico pessoa01");
    }
    {
        System.out.println("dentro do bloco  estatico pessoa02");
    }

    public PersonP(String name){
        this.name = name;
    }

    public PersonP(String name, String cpf){
        this(name);
        this.cpf = cpf;
    }
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

    public AddressP getAddress() {
        return address;
    }

    public void setAddress(AddressP address) {
        this.address = address;
    }

}
