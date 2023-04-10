package academy.devdojo.maratonajava.javacore.Class34Enum.test01;

import academy.devdojo.maratonajava.javacore.Class34Enum.domain.Client;
import academy.devdojo.maratonajava.javacore.Class34Enum.domain.CustomerType;
import academy.devdojo.maratonajava.javacore.Class34Enum.domain01.TypeOfPayment01;

public class TestClient01 {
    public static void main(String[] args) {
        
    Client cli00 =  new Client("joao Carlos",CustomerType.PESSOA_JURIDICA, Client.TypeOfPayment.DEBITO);
    Client cli02 =  new Client("joao Carlos",CustomerType.PESSOA_FISICA,Client.TypeOfPayment.CREDITO);
 

    System.out.println(cli00);
    System.out.println(cli02);
        System.out.println(TypeOfPayment01.CREDITO.calculateDiscount(1000));
        System.out.println(TypeOfPayment01.DEBITO.calculateDiscount(1000));
        TypeOfPayment01 typeOfPayment01 = TypeOfPayment01.valueOf("PESSOA_JURIDICA");
        System.out.println(typeOfPayment01.getNomeRelatorio());
        TypeOfPayment01 typeOfPayment02 = TypeOfPayment01.TypeOfPayment01PorNomeRelatorio("pessoa fisica221");
        System.out.println(typeOfPayment02);
    }
}
