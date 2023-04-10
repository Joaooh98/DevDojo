package academy.devdojo.maratonajava.javacore.Class34Enum.domain;


public class Client {
    private String name;
    private CustomerTtype customerTtype;
    
    public Client(String name, CustomerTtype customerTtype) {
        this.name = name;
        this.customerTtype = customerTtype;
    }
    
    @Override
    public String toString() {
        return "Client [name=" + name + ", customerTtype=" + customerTtype + "]";
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
     * @return CustomerTtype return the customerTtype
     */
    public CustomerTtype getCustomerTtype() {
        return customerTtype;
    }

    /**
     * @param customerTtype the customerTtype to set
     */
    public void setCustomerTtype(CustomerTtype customerTtype) {
        this.customerTtype = customerTtype;
    }

}
