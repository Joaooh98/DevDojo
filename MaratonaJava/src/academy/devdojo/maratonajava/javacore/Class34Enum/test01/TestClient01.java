package academy.devdojo.maratonajava.javacore.Class34Enum.test01;

import academy.devdojo.maratonajava.javacore.Class34Enum.domain.Client;
import academy.devdojo.maratonajava.javacore.Class34Enum.domain.CustomerType;
import academy.devdojo.maratonajava.javacore.Class34Enum.domain01.CustomerType01;
import academy.devdojo.maratonajava.javacore.Class34Enum.domain01.TypeOfPayment01;

public class TestClient01 {
    public static void main(String[] args) {
        
    Client cli00 =  new Client("joao Carlos",CustomerType.PESSOA_JURIDICA, Client.TypeOfPayment.DEBITO);
    Client cli02 =  new Client("joao Carlos",CustomerType.PESSOA_FISICA,Client.TypeOfPayment.CREDITO);
 

    System.out.println(cli00);
    System.out.println(cli02);
        System.out.println(TypeOfPayment01.CREDITO.calculateDiscount(1000));
        System.out.println(TypeOfPayment01.DEBITO.calculateDiscount(1000));
          CustomerType01 customerType01 = CustomerType01.valueOf("PESSOA_FISICA");
            System.out.println(customerType01.getNomeRelatorio());
          CustomerType01 customerType02 = CustomerType01.tipoClientePorNomeRelatorio("Pessoa fisica");  
            System.out.println(customerType02);
    }
}