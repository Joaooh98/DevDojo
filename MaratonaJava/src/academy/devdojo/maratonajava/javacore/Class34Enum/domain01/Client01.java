package academy.devdojo.maratonajava.javacore.Class34Enum.domain01;


public class Client01 {
    
    private String name;
    private CustomerType01 customerType;
    private TypeOfPayment01 typeOfPayment;
    
    public Client01(String name, CustomerType01 customerTtype, TypeOfPayment01 typeOfPayment) {
        this.name = name;
        this.customerType = customerTtype;
        this.typeOfPayment = typeOfPayment;
    }

    @Override
    public String toString() {
        return "Client{" + 
                " name ='" + name + '\'' +
                ", customer Type="+customerType.getNomeRelatorio()+
                ", customer TypeInt="+customerType.getValor()+
                ", Type Of Pagyment="+typeOfPayment+'}';
    }  

}
