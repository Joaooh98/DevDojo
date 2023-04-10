package academy.devdojo.maratonajava.javacore.Class34Enum.test;

import academy.devdojo.maratonajava.javacore.Class34Enum.domain.Client;
import academy.devdojo.maratonajava.javacore.Class34Enum.domain.CustomerTtype;

public class TestClient00 {
    public static void main(String[] args) {
        
    Client cli00 =  new Client("joao Carlos",CustomerTtype.PESSOA_JURIDICA, Client.TypeOfPayment.DEBITO);
    Client cli02 =  new Client("joao Carlos",CustomerTtype.PESSOA_FISICA,Client.TypeOfPayment.CREDITO);
 

    System.out.println(cli00);
    System.out.println(cli02);
  
    }
}
