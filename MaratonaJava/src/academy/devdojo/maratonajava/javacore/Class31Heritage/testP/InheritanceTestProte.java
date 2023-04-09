package academy.devdojo.maratonajava.javacore.Class31Heritage.testP;

import academy.devdojo.maratonajava.javacore.Class31Heritage.domainPro.AddressP;
import academy.devdojo.maratonajava.javacore.Class31Heritage.domainPro.EmployeeP;
import academy.devdojo.maratonajava.javacore.Class31Heritage.domainPro.PersonP;

public class InheritanceTestProte {
    public static void main(String[] args) {
        AddressP address =  new AddressP();

        address.setRoad("Rua erechim");
        address.setZipCode("85-814480");
        
        PersonP person = new PersonP(" Josue ");
        
        person.setCpf("10240454963");
        person.setAddress(address);
               System.out.println("-------------person------------");
        person.show();

        EmployeeP employee = new EmployeeP(" May ");
               System.out.println("-------------Employee------------");
        
        employee.setCpf("10204869325");
        employee.setAddress(address);
        employee.setOffice("Advogada");
        employee.setWage(3000);


        employee.show();
    }
}
