package academy.devdojo.maratonajava.javacore.Class34Enum.domain;


public class Client {
    public enum TypeOfPayment{
        DEBITO, CREDITO
    }

    private String name;
    private CustomerTtype customerType;
    private TypeOfPayment typeOfPayment;
    
    public Client(String name, CustomerTtype customerTtype, TypeOfPayment typeOfPayment) {
        this.name = name;
        this.customerType = customerTtype;
        this.typeOfPayment = typeOfPayment;
    }

    @Override
    public String toString() {
        return "Client{" + 
                " name ='" + name + '\'' +
                ", customer Type="+customerType.getNomeRelatorio()+
                ", customer TypeInt="+customerType.getVALOR()+
                ", Type Of Pagyment="+typeOfPayment+'}';
    }  

}
